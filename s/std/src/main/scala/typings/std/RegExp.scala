package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegExp extends js.Object {
  /**
    * Returns a Boolean value indicating the state of the dotAll flag (s) used with a regular expression.
    * Default is false. Read-only.
    */
  val dotAll: scala.Boolean = js.native
  /**
    * Returns a string indicating the flags of the regular expression in question. This field is read-only.
    * The characters in this string are sequenced and concatenated in the following order:
    *
    *    - "g" for global
    *    - "i" for ignoreCase
    *    - "m" for multiline
    *    - "u" for unicode
    *    - "y" for sticky
    *
    * If no flags are set, the value is the empty string.
    */
  val flags: java.lang.String = js.native
  /** Returns a Boolean value indicating the state of the global flag (g) used with a regular expression. Default is false. Read-only. */
  val global: scala.Boolean = js.native
  /** Returns a Boolean value indicating the state of the ignoreCase flag (i) used with a regular expression. Default is false. Read-only. */
  val ignoreCase: scala.Boolean = js.native
  var lastIndex: Double = js.native
  /**
    * Matches a string with this regular expression, and returns an array containing the results of
    * that search.
    * @param string A string to search within.
    */
  @JSName(js.Symbol.`match`)
  var `match`: js.Function1[/* string */ java.lang.String, RegExpMatchArray | Null] = js.native
  /** Returns a Boolean value indicating the state of the multiline flag (m) used with a regular expression. Default is false. Read-only. */
  val multiline: scala.Boolean = js.native
  /**
    * Replaces text in a string, using this regular expression.
    * @param string A String object or string literal whose contents matching against
    *               this regular expression will be replaced
    * @param replaceValue A String object or string literal containing the text to replace for every
    *                     successful match of this regular expression.
    */
  /**
    * Replaces text in a string, using this regular expression.
    * @param string A String object or string literal whose contents matching against
    *               this regular expression will be replaced
    * @param replacer A function that returns the replacement text.
    */
  @JSName(js.Symbol.replace)
  var replace: (js.Function2[/* string */ java.lang.String, /* replaceValue */ java.lang.String, java.lang.String]) with (js.Function2[
    /* string */ java.lang.String, 
    /* replacer */ js.Function2[/* substring */ java.lang.String, /* repeated */ js.Any, java.lang.String], 
    java.lang.String
  ]) = js.native
  /**
    * Finds the position beginning first substring match in a regular expression search
    * using this regular expression.
    *
    * @param string The string to search within.
    */
  @JSName(js.Symbol.search)
  var search: js.Function1[/* string */ java.lang.String, Double] = js.native
  /** Returns a copy of the text of the regular expression pattern. Read-only. The regExp argument is a Regular expression object. It can be a variable name or a literal. */
  val source: java.lang.String = js.native
  /**
    * Returns an array of substrings that were delimited by strings in the original input that
    * match against this regular expression.
    *
    * If the regular expression contains capturing parentheses, then each time this
    * regular expression matches, the results (including any undefined results) of the
    * capturing parentheses are spliced.
    *
    * @param string string value to split
    * @param limit if not undefined, the output array is truncated so that it contains no more
    * than 'limit' elements.
    */
  @JSName(js.Symbol.split)
  var split: js.Function2[
    /* string */ java.lang.String, 
    /* limit */ js.UndefOr[Double], 
    js.Array[java.lang.String]
  ] = js.native
  /**
    * Returns a Boolean value indicating the state of the sticky flag (y) used with a regular
    * expression. Default is false. Read-only.
    */
  val sticky: scala.Boolean = js.native
  /**
    * Returns a Boolean value indicating the state of the Unicode flag (u) used with a regular
    * expression. Default is false. Read-only.
    */
  val unicode: scala.Boolean = js.native
  // Non-standard extensions
  def compile(): this.type = js.native
  /**
    * Executes a search on a string using a regular expression pattern, and returns an array containing the results of that search.
    * @param string The String object or string literal on which to perform the search.
    */
  def exec(string: java.lang.String): RegExpExecArray | Null = js.native
  /**
    * Returns a Boolean value that indicates whether or not a pattern exists in a searched string.
    * @param string String on which to perform the search.
    */
  def test(string: java.lang.String): scala.Boolean = js.native
}

