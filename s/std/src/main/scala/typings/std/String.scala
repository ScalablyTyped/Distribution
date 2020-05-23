package typings.std

import org.scalablytyped.runtime.NumberDictionary
import typings.std.Intl.CollatorOptions
import typings.std.anon.Match
import typings.std.anon.Replace
import typings.std.anon.Search
import typings.std.anon.Split
import typings.std.anon.`0`
import typings.std.stdStrings.NFC
import typings.std.stdStrings.NFD
import typings.std.stdStrings.NFKC
import typings.std.stdStrings.NFKD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait String
  extends /* index */ NumberDictionary[java.lang.String] {
  /** Iterator */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[java.lang.String]] = js.native
  /** Returns the length of a String object. */
  val length: Double = js.native
  /**
    * Returns an <a> HTML anchor element and sets the name attribute to the text value
    * @param name
    */
  def anchor(name: java.lang.String): java.lang.String = js.native
  /** Returns a <big> HTML element */
  def big(): java.lang.String = js.native
  /** Returns a <blink> HTML element */
  def blink(): java.lang.String = js.native
  /** Returns a <b> HTML element */
  def bold(): java.lang.String = js.native
  /**
    * Returns the character at the specified index.
    * @param pos The zero-based index of the desired character.
    */
  def charAt(pos: Double): java.lang.String = js.native
  /**
    * Returns the Unicode value of the character at the specified location.
    * @param index The zero-based index of the desired character. If there is no character at the specified index, NaN is returned.
    */
  def charCodeAt(index: Double): Double = js.native
  /**
    * Returns a nonnegative integer Number less than 1114112 (0x110000) that is the code point
    * value of the UTF-16 encoded code point starting at the string element at position pos in
    * the String resulting from converting this object to a String.
    * If there is no element at that position, the result is undefined.
    * If a valid UTF-16 surrogate pair does not begin at pos, the result is the code unit at pos.
    */
  def codePointAt(pos: Double): js.UndefOr[Double] = js.native
  /**
    * Returns a string that contains the concatenation of two or more strings.
    * @param strings The strings to append to the end of the string.
    */
  def concat(strings: java.lang.String*): java.lang.String = js.native
  /**
    * Returns true if the sequence of elements of searchString converted to a String is the
    * same as the corresponding elements of this object (converted to a String) starting at
    * endPosition – length(this). Otherwise returns false.
    */
  def endsWith(searchString: java.lang.String): scala.Boolean = js.native
  def endsWith(searchString: java.lang.String, endPosition: Double): scala.Boolean = js.native
  /** Returns a <tt> HTML element */
  def fixed(): java.lang.String = js.native
  /** Returns a <font> HTML element and sets the color attribute value */
  def fontcolor(color: java.lang.String): java.lang.String = js.native
  /** Returns a <font> HTML element and sets the size attribute value */
  def fontsize(size: java.lang.String): java.lang.String = js.native
  /** Returns a <font> HTML element and sets the size attribute value */
  def fontsize(size: Double): java.lang.String = js.native
  /**
    * Returns true if searchString appears as a substring of the result of converting this
    * object to a String, at one or more positions that are
    * greater than or equal to position; otherwise, returns false.
    * @param searchString search string
    * @param position If position is undefined, 0 is assumed, so as to search all of the String.
    */
  def includes(searchString: java.lang.String): scala.Boolean = js.native
  def includes(searchString: java.lang.String, position: Double): scala.Boolean = js.native
  /**
    * Returns the position of the first occurrence of a substring.
    * @param searchString The substring to search for in the string
    * @param position The index at which to begin searching the String object. If omitted, search starts at the beginning of the string.
    */
  def indexOf(searchString: java.lang.String): Double = js.native
  def indexOf(searchString: java.lang.String, position: Double): Double = js.native
  /** Returns an <i> HTML element */
  def italics(): java.lang.String = js.native
  /**
    * Returns the last occurrence of a substring in the string.
    * @param searchString The substring to search for.
    * @param position The index at which to begin searching. If omitted, the search begins at the end of the string.
    */
  def lastIndexOf(searchString: java.lang.String): Double = js.native
  def lastIndexOf(searchString: java.lang.String, position: Double): Double = js.native
  /** Returns an <a> HTML element and sets the href attribute value */
  def link(url: java.lang.String): java.lang.String = js.native
  /**
    * Determines whether two strings are equivalent in the current locale.
    * @param that String to compare to target string
    */
  def localeCompare(that: java.lang.String): Double = js.native
  def localeCompare(that: java.lang.String, locales: java.lang.String): Double = js.native
  def localeCompare(that: java.lang.String, locales: java.lang.String, options: CollatorOptions): Double = js.native
  def localeCompare(that: java.lang.String, locales: js.Array[java.lang.String]): Double = js.native
  def localeCompare(that: java.lang.String, locales: js.Array[java.lang.String], options: CollatorOptions): Double = js.native
  /**
    * Matches a string or an object that supports being matched against, and returns an array
    * containing the results of that search, or null if no matches are found.
    * @param matcher An object that supports being matched against.
    */
  def `match`(matcher: Match): RegExpMatchArray | Null = js.native
  /**
    * Matches a string with a regular expression, and returns an array containing the results of that search.
    * @param regexp A variable name or string literal containing the regular expression pattern and flags.
    */
  def `match`(regexp: java.lang.String): RegExpMatchArray | Null = js.native
  def `match`(regexp: RegExp): RegExpMatchArray | Null = js.native
  /**
    * Matches a string with a regular expression, and returns an iterable of matches
    * containing the results of that search.
    * @param regexp A variable name or string literal containing the regular expression pattern and flags.
    */
  def matchAll(regexp: RegExp): IterableIterator[RegExpMatchArray] = js.native
  /**
    * Returns the String value result of normalizing the string into the normalization form
    * named by form as specified in Unicode Standard Annex #15, Unicode Normalization Forms.
    * @param form Applicable values: "NFC", "NFD", "NFKC", or "NFKD", If not specified default
    * is "NFC"
    */
  def normalize(): java.lang.String = js.native
  def normalize(form: java.lang.String): java.lang.String = js.native
  /**
    * Returns the String value result of normalizing the string into the normalization form
    * named by form as specified in Unicode Standard Annex #15, Unicode Normalization Forms.
    * @param form Applicable values: "NFC", "NFD", "NFKC", or "NFKD", If not specified default
    * is "NFC"
    */
  @JSName("normalize")
  def normalize_NFC(form: NFC): java.lang.String = js.native
  @JSName("normalize")
  def normalize_NFD(form: NFD): java.lang.String = js.native
  @JSName("normalize")
  def normalize_NFKC(form: NFKC): java.lang.String = js.native
  @JSName("normalize")
  def normalize_NFKD(form: NFKD): java.lang.String = js.native
  /**
    * Pads the current string with a given string (possibly repeated) so that the resulting string reaches a given length.
    * The padding is applied from the end (right) of the current string.
    *
    * @param maxLength The length of the resulting string once the current string has been padded.
    *        If this parameter is smaller than the current string's length, the current string will be returned as it is.
    *
    * @param fillString The string to pad the current string with.
    *        If this string is too long, it will be truncated and the left-most part will be applied.
    *        The default value for this parameter is " " (U+0020).
    */
  def padEnd(maxLength: Double): java.lang.String = js.native
  def padEnd(maxLength: Double, fillString: java.lang.String): java.lang.String = js.native
  /**
    * Pads the current string with a given string (possibly repeated) so that the resulting string reaches a given length.
    * The padding is applied from the start (left) of the current string.
    *
    * @param maxLength The length of the resulting string once the current string has been padded.
    *        If this parameter is smaller than the current string's length, the current string will be returned as it is.
    *
    * @param fillString The string to pad the current string with.
    *        If this string is too long, it will be truncated and the left-most part will be applied.
    *        The default value for this parameter is " " (U+0020).
    */
  def padStart(maxLength: Double): java.lang.String = js.native
  def padStart(maxLength: Double, fillString: java.lang.String): java.lang.String = js.native
  /**
    * Returns a String value that is made from count copies appended together. If count is 0,
    * the empty string is returned.
    * @param count number of copies to append
    */
  def repeat(count: Double): java.lang.String = js.native
  /**
    * Replaces text in a string, using a regular expression or search string.
    * @param searchValue A string to search for.
    * @param replaceValue A string containing the text to replace for every successful match of searchValue in this string.
    */
  def replace(searchValue: java.lang.String, replaceValue: java.lang.String): java.lang.String = js.native
  /**
    * Replaces text in a string, using a regular expression or search string.
    * @param searchValue A string to search for.
    * @param replacer A function that returns the replacement text.
    */
  def replace(
    searchValue: java.lang.String,
    replacer: js.Function2[/* substring */ java.lang.String, /* repeated */ js.Any, java.lang.String]
  ): java.lang.String = js.native
  def replace(searchValue: RegExp, replaceValue: java.lang.String): java.lang.String = js.native
  def replace(
    searchValue: RegExp,
    replacer: js.Function2[/* substring */ java.lang.String, /* repeated */ js.Any, java.lang.String]
  ): java.lang.String = js.native
  /**
    * Replaces text in a string, using an object that supports replacement within a string.
    * @param searchValue A object can search for and replace matches within a string.
    * @param replaceValue A string containing the text to replace for every successful match of searchValue in this string.
    */
  def replace(searchValue: Replace, replaceValue: java.lang.String): java.lang.String = js.native
  /**
    * Replaces text in a string, using an object that supports replacement within a string.
    * @param searchValue A object can search for and replace matches within a string.
    * @param replacer A function that returns the replacement text.
    */
  def replace(
    searchValue: `0`,
    replacer: js.Function2[/* substring */ java.lang.String, /* repeated */ js.Any, java.lang.String]
  ): java.lang.String = js.native
  /**
    * Replace all instances of a substring in a string, using a regular expression or search string.
    * @param searchValue A string to search for.
    * @param replaceValue A string containing the text to replace for every successful match of searchValue in this string.
    */
  def replaceAll(searchValue: java.lang.String, replaceValue: java.lang.String): java.lang.String = js.native
  /**
    * Replace all instances of a substring in a string, using a regular expression or search string.
    * @param searchValue A string to search for.
    * @param replacer A function that returns the replacement text.
    */
  def replaceAll(
    searchValue: java.lang.String,
    replacer: js.Function2[/* substring */ java.lang.String, /* repeated */ js.Any, java.lang.String]
  ): java.lang.String = js.native
  def replaceAll(searchValue: RegExp, replaceValue: java.lang.String): java.lang.String = js.native
  def replaceAll(
    searchValue: RegExp,
    replacer: js.Function2[/* substring */ java.lang.String, /* repeated */ js.Any, java.lang.String]
  ): java.lang.String = js.native
  /**
    * Finds the first substring match in a regular expression search.
    * @param regexp The regular expression pattern and applicable flags.
    */
  def search(regexp: java.lang.String): Double = js.native
  def search(regexp: RegExp): Double = js.native
  /**
    * Finds the first substring match in a regular expression search.
    * @param searcher An object which supports searching within a string.
    */
  def search(searcher: Search): Double = js.native
  /**
    * Returns a section of a string.
    * @param start The index to the beginning of the specified portion of stringObj.
    * @param end The index to the end of the specified portion of stringObj. The substring includes the characters up to, but not including, the character indicated by end.
    * If this value is not specified, the substring continues to the end of stringObj.
    */
  def slice(): java.lang.String = js.native
  def slice(start: Double): java.lang.String = js.native
  def slice(start: Double, end: Double): java.lang.String = js.native
  /** Returns a <small> HTML element */
  def small(): java.lang.String = js.native
  /**
    * Split a string into substrings using the specified separator and return them as an array.
    * @param separator A string that identifies character or characters to use in separating the string. If omitted, a single-element array containing the entire string is returned.
    * @param limit A value used to limit the number of elements returned in the array.
    */
  def split(separator: java.lang.String): js.Array[java.lang.String] = js.native
  def split(separator: java.lang.String, limit: Double): js.Array[java.lang.String] = js.native
  def split(separator: RegExp): js.Array[java.lang.String] = js.native
  def split(separator: RegExp, limit: Double): js.Array[java.lang.String] = js.native
  /**
    * Split a string into substrings using the specified separator and return them as an array.
    * @param splitter An object that can split a string.
    * @param limit A value used to limit the number of elements returned in the array.
    */
  def split(splitter: Split): js.Array[java.lang.String] = js.native
  def split(splitter: Split, limit: Double): js.Array[java.lang.String] = js.native
  /**
    * Returns true if the sequence of elements of searchString converted to a String is the
    * same as the corresponding elements of this object (converted to a String) starting at
    * position. Otherwise returns false.
    */
  def startsWith(searchString: java.lang.String): scala.Boolean = js.native
  def startsWith(searchString: java.lang.String, position: Double): scala.Boolean = js.native
  /** Returns a <strike> HTML element */
  def strike(): java.lang.String = js.native
  /** Returns a <sub> HTML element */
  def sub(): java.lang.String = js.native
  // IE extensions
  /**
    * Gets a substring beginning at the specified location and having the specified length.
    * @param from The starting position of the desired substring. The index of the first character in the string is zero.
    * @param length The number of characters to include in the returned substring.
    */
  def substr(from: Double): java.lang.String = js.native
  def substr(from: Double, length: Double): java.lang.String = js.native
  /**
    * Returns the substring at the specified location within a String object.
    * @param start The zero-based index number indicating the beginning of the substring.
    * @param end Zero-based index number indicating the end of the substring. The substring includes the characters up to, but not including, the character indicated by end.
    * If end is omitted, the characters from start through the end of the original string are returned.
    */
  def substring(start: Double): java.lang.String = js.native
  def substring(start: Double, end: Double): java.lang.String = js.native
  /** Returns a <sup> HTML element */
  def sup(): java.lang.String = js.native
  /** Converts all alphabetic characters to lowercase, taking into account the host environment's current locale. */
  def toLocaleLowerCase(): java.lang.String = js.native
  def toLocaleLowerCase(locales: java.lang.String): java.lang.String = js.native
  def toLocaleLowerCase(locales: js.Array[java.lang.String]): java.lang.String = js.native
  /** Returns a string where all alphabetic characters have been converted to uppercase, taking into account the host environment's current locale. */
  def toLocaleUpperCase(): java.lang.String = js.native
  def toLocaleUpperCase(locales: java.lang.String): java.lang.String = js.native
  def toLocaleUpperCase(locales: js.Array[java.lang.String]): java.lang.String = js.native
  /** Converts all the alphabetic characters in a string to lowercase. */
  def toLowerCase(): java.lang.String = js.native
  /** Converts all the alphabetic characters in a string to uppercase. */
  def toUpperCase(): java.lang.String = js.native
  /** Removes the leading and trailing white space and line terminator characters from a string. */
  def trim(): java.lang.String = js.native
  /** Removes the trailing white space and line terminator characters from a string. */
  def trimEnd(): java.lang.String = js.native
  /** Removes the leading white space and line terminator characters from a string. */
  def trimLeft(): java.lang.String = js.native
  /** Removes the trailing white space and line terminator characters from a string. */
  def trimRight(): java.lang.String = js.native
  /** Removes the leading white space and line terminator characters from a string. */
  def trimStart(): java.lang.String = js.native
}

