package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegExp extends js.Object {
  /**
    * Returns a Boolean value indicating the state of the dotAll flag (s) used with a regular expression.
    * Default is false. Read-only.
    */
  val dotAll: scala.Boolean
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
  val flags: java.lang.String
  /** Returns a Boolean value indicating the state of the global flag (g) used with a regular expression. Default is false. Read-only. */
  val global: scala.Boolean
  /** Returns a Boolean value indicating the state of the ignoreCase flag (i) used with a regular expression. Default is false. Read-only. */
  val ignoreCase: scala.Boolean
  var lastIndex: scala.Double
  /**
    * Matches a string with this regular expression, and returns an array containing the results of
    * that search.
    * @param string A string to search within.
    */
  @JSName(org.scalablytyped.runtime.Symbol.`match`)
  var `match`: js.Function1[/* string */ java.lang.String, RegExpMatchArray | scala.Null]
  /** Returns a Boolean value indicating the state of the multiline flag (m) used with a regular expression. Default is false. Read-only. */
  val multiline: scala.Boolean
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
  @JSName(org.scalablytyped.runtime.Symbol.replace)
  var replace: (js.Function2[/* string */ java.lang.String, /* replaceValue */ java.lang.String, java.lang.String]) with (js.Function2[
    /* string */ java.lang.String, 
    /* replacer */ js.Function2[/* substring */ java.lang.String, /* repeated */ js.Any, java.lang.String], 
    java.lang.String
  ])
  /**
    * Finds the position beginning first substring match in a regular expression search
    * using this regular expression.
    *
    * @param string The string to search within.
    */
  @JSName(org.scalablytyped.runtime.Symbol.search)
  var search: js.Function1[/* string */ java.lang.String, scala.Double]
  /** Returns a copy of the text of the regular expression pattern. Read-only. The regExp argument is a Regular expression object. It can be a variable name or a literal. */
  val source: java.lang.String
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
  @JSName(org.scalablytyped.runtime.Symbol.split)
  var split: js.Function2[
    /* string */ java.lang.String, 
    /* limit */ js.UndefOr[scala.Double], 
    js.Array[java.lang.String]
  ]
  /**
    * Returns a Boolean value indicating the state of the sticky flag (y) used with a regular
    * expression. Default is false. Read-only.
    */
  val sticky: scala.Boolean
  /**
    * Returns a Boolean value indicating the state of the Unicode flag (u) used with a regular
    * expression. Default is false. Read-only.
    */
  val unicode: scala.Boolean
  // Non-standard extensions
  def compile(): this.type
  /**
    * Executes a search on a string using a regular expression pattern, and returns an array containing the results of that search.
    * @param string The String object or string literal on which to perform the search.
    */
  def exec(string: java.lang.String): RegExpExecArray | scala.Null
  /**
    * Returns a Boolean value that indicates whether or not a pattern exists in a searched string.
    * @param string String on which to perform the search.
    */
  def test(string: java.lang.String): scala.Boolean
}

@JSGlobal("RegExp")
@js.native
class RegExpCls protected () extends RegExp {
  def this(pattern: java.lang.String) = this()
  def this(pattern: RegExp) = this()
  def this(pattern: java.lang.String, flags: java.lang.String) = this()
  def this(pattern: RegExp, flags: java.lang.String) = this()
  /**
    * Returns a Boolean value indicating the state of the dotAll flag (s) used with a regular expression.
    * Default is false. Read-only.
    */
  /* CompleteClass */
  override val dotAll: scala.Boolean = js.native
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
  /* CompleteClass */
  override val flags: java.lang.String = js.native
  /** Returns a Boolean value indicating the state of the global flag (g) used with a regular expression. Default is false. Read-only. */
  /* CompleteClass */
  override val global: scala.Boolean = js.native
  /** Returns a Boolean value indicating the state of the ignoreCase flag (i) used with a regular expression. Default is false. Read-only. */
  /* CompleteClass */
  override val ignoreCase: scala.Boolean = js.native
  /* CompleteClass */
  override var lastIndex: scala.Double = js.native
  /**
    * Matches a string with this regular expression, and returns an array containing the results of
    * that search.
    * @param string A string to search within.
    */
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.`match`)
  override var `match`: js.Function1[/* string */ java.lang.String, RegExpMatchArray | scala.Null] = js.native
  /** Returns a Boolean value indicating the state of the multiline flag (m) used with a regular expression. Default is false. Read-only. */
  /* CompleteClass */
  override val multiline: scala.Boolean = js.native
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
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.replace)
  override var replace: (js.Function2[/* string */ java.lang.String, /* replaceValue */ java.lang.String, java.lang.String]) with (js.Function2[
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
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.search)
  override var search: js.Function1[/* string */ java.lang.String, scala.Double] = js.native
  /** Returns a copy of the text of the regular expression pattern. Read-only. The regExp argument is a Regular expression object. It can be a variable name or a literal. */
  /* CompleteClass */
  override val source: java.lang.String = js.native
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
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.split)
  override var split: js.Function2[
    /* string */ java.lang.String, 
    /* limit */ js.UndefOr[scala.Double], 
    js.Array[java.lang.String]
  ] = js.native
  /**
    * Returns a Boolean value indicating the state of the sticky flag (y) used with a regular
    * expression. Default is false. Read-only.
    */
  /* CompleteClass */
  override val sticky: scala.Boolean = js.native
  /**
    * Returns a Boolean value indicating the state of the Unicode flag (u) used with a regular
    * expression. Default is false. Read-only.
    */
  /* CompleteClass */
  override val unicode: scala.Boolean = js.native
  // Non-standard extensions
  /* CompleteClass */
  override def compile(): this.type = js.native
  /**
    * Executes a search on a string using a regular expression pattern, and returns an array containing the results of that search.
    * @param string The String object or string literal on which to perform the search.
    */
  /* CompleteClass */
  override def exec(string: java.lang.String): RegExpExecArray | scala.Null = js.native
  /**
    * Returns a Boolean value that indicates whether or not a pattern exists in a searched string.
    * @param string String on which to perform the search.
    */
  /* CompleteClass */
  override def test(string: java.lang.String): scala.Boolean = js.native
}

object RegExp {
  @scala.inline
  def apply(
    compile: () => RegExp,
    dotAll: scala.Boolean,
    exec: java.lang.String => RegExpExecArray | scala.Null,
    flags: java.lang.String,
    global: scala.Boolean,
    ignoreCase: scala.Boolean,
    lastIndex: scala.Double,
    `match`: /* string */ java.lang.String => RegExpMatchArray | scala.Null,
    multiline: scala.Boolean,
    replace: (js.Function2[/* string */ java.lang.String, /* replaceValue */ java.lang.String, java.lang.String]) with (js.Function2[
      /* string */ java.lang.String, 
      /* replacer */ js.Function2[/* substring */ java.lang.String, /* repeated */ js.Any, java.lang.String], 
      java.lang.String
    ]),
    search: /* string */ java.lang.String => scala.Double,
    source: java.lang.String,
    split: (/* string */ java.lang.String, /* limit */ js.UndefOr[scala.Double]) => js.Array[java.lang.String],
    sticky: scala.Boolean,
    test: java.lang.String => scala.Boolean,
    unicode: scala.Boolean
  ): RegExp = {
    val __obj = js.Dynamic.literal(compile = js.Any.fromFunction0(compile), dotAll = dotAll, exec = js.Any.fromFunction1(exec), flags = flags, global = global, ignoreCase = ignoreCase, lastIndex = lastIndex, multiline = multiline, replace = replace, search = js.Any.fromFunction1(search), source = source, split = js.Any.fromFunction2(split), sticky = sticky, test = js.Any.fromFunction1(test), unicode = unicode)
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[RegExp]
  }
}

