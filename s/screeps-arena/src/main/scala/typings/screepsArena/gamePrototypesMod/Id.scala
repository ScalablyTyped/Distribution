package typings.screepsArena.gamePrototypesMod

import typings.screepsArena.gamePrototypesMod.Tag.OpaqueTag
import typings.std.Intl.CollatorOptions
import typings.std.IterableIterator
import typings.std.RegExpMatchArray
import typings.std.anon.Match
import typings.std.anon.Replace
import typings.std.anon.Search
import typings.std.anon.Split
import typings.std.anon.`0`
import typings.std.stdStrings.NFC
import typings.std.stdStrings.NFD
import typings.std.stdStrings.NFKC
import typings.std.stdStrings.NFKD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- scala.Any because Inheritance from two classes. Inlined 
- scala.AnyRef because Inheritance from two classes. Inlined 
- scala.Any because Inheritance from two classes. Inlined 
- js.Any because Inheritance from two classes. Inlined 
- scala.AnyRef because Inheritance from two classes. Inlined 
- scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
- js.Object because Inheritance from two classes. Inlined 
- js.Any because Inheritance from two classes. Inlined 
- scala.AnyRef because Inheritance from two classes. Inlined 
- org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
- js.Object because Inheritance from two classes. Inlined 
- js.Any because Inheritance from two classes. Inlined 
- org.scalablytyped.runtime.NumberDictionary because Inheritance from two classes. Inlined 
- js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
- typings.std.String because Inheritance from two classes. Inlined length, iterator, anchor, at, big, blink, bold, charAt, charCodeAt, codePointAt, concat, endsWith, endsWith, fixed, fontcolor, fontsize, fontsize, includes, includes, indexOf, indexOf, italics, lastIndexOf, lastIndexOf, link, localeCompare, localeCompare, localeCompare, localeCompare, localeCompare, localeCompare, `match`, `match`, `match`, matchAll, normalize, normalize, normalize, padEnd, padEnd, padStart, padStart, repeat, replace, replace, replace, replace, replace, replace, replaceAll, replaceAll, replaceAll, replaceAll, search, search, search, slice, slice, slice, slice, small, split, split, split, split, split, split, startsWith, startsWith, strike, sub, substr, substr, substring, substring, sup, toLocaleLowerCase, toLocaleLowerCase, toLocaleLowerCase, toLocaleUpperCase, toLocaleUpperCase, toLocaleUpperCase, toLowerCase, toUpperCase, trim, trimEnd, trimLeft, trimRight, trimStart */ @js.native
trait Id[T] extends OpaqueTag[T] {
  
  /**
    * Returns an `<a>` HTML anchor element and sets the name attribute to the text value
    * @deprecated A legacy feature for browser compatibility
    * @param name
    */
  /* standard es2015.core */
  def anchor(name: String): String = js.native
  
  /**
    * Returns a new String consisting of the single UTF-16 code unit located at the specified index.
    * @param index The zero-based index of the desired code unit. A negative index will count back from the last item.
    */
  /* standard es2022.string */
  def at(index: Double): js.UndefOr[String] = js.native
  
  /**
    * Returns a `<big>` HTML element
    * @deprecated A legacy feature for browser compatibility
    */
  /* standard es2015.core */
  def big(): String = js.native
  
  /**
    * Returns a `<blink>` HTML element
    * @deprecated A legacy feature for browser compatibility
    */
  /* standard es2015.core */
  def blink(): String = js.native
  
  /**
    * Returns a `<b>` HTML element
    * @deprecated A legacy feature for browser compatibility
    */
  /* standard es2015.core */
  def bold(): String = js.native
  
  /**
    * Returns the character at the specified index.
    * @param pos The zero-based index of the desired character.
    */
  /* standard es5 */
  def charAt(pos: Double): String = js.native
  
  /**
    * Returns the Unicode value of the character at the specified location.
    * @param index The zero-based index of the desired character. If there is no character at the specified index, NaN is returned.
    */
  /* standard es5 */
  def charCodeAt(index: Double): Double = js.native
  
  /**
    * Returns a nonnegative integer Number less than 1114112 (0x110000) that is the code point
    * value of the UTF-16 encoded code point starting at the string element at position pos in
    * the String resulting from converting this object to a String.
    * If there is no element at that position, the result is undefined.
    * If a valid UTF-16 surrogate pair does not begin at pos, the result is the code unit at pos.
    */
  /* standard es2015.core */
  def codePointAt(pos: Double): js.UndefOr[Double] = js.native
  
  /**
    * Returns a string that contains the concatenation of two or more strings.
    * @param strings The strings to append to the end of the string.
    */
  /* standard es5 */
  def concat(strings: String*): String = js.native
  
  /**
    * Returns true if the sequence of elements of searchString converted to a String is the
    * same as the corresponding elements of this object (converted to a String) starting at
    * endPosition – length(this). Otherwise returns false.
    */
  /* standard es2015.core */
  def endsWith(searchString: String): Boolean = js.native
  def endsWith(searchString: String, endPosition: Double): Boolean = js.native
  
  /**
    * Returns a `<tt>` HTML element
    * @deprecated A legacy feature for browser compatibility
    */
  /* standard es2015.core */
  def fixed(): String = js.native
  
  /**
    * Returns a `<font>` HTML element and sets the color attribute value
    * @deprecated A legacy feature for browser compatibility
    */
  /* standard es2015.core */
  def fontcolor(color: String): String = js.native
  
  /**
    * Returns a `<font>` HTML element and sets the size attribute value
    * @deprecated A legacy feature for browser compatibility
    */
  /* standard es2015.core */
  def fontsize(size: String): String = js.native
  /**
    * Returns a `<font>` HTML element and sets the size attribute value
    * @deprecated A legacy feature for browser compatibility
    */
  /* standard es2015.core */
  def fontsize(size: Double): String = js.native
  
  /**
    * Returns true if searchString appears as a substring of the result of converting this
    * object to a String, at one or more positions that are
    * greater than or equal to position; otherwise, returns false.
    * @param searchString search string
    * @param position If position is undefined, 0 is assumed, so as to search all of the String.
    */
  /* standard es2015.core */
  def includes(searchString: String): Boolean = js.native
  def includes(searchString: String, position: Double): Boolean = js.native
  
  /**
    * Returns the position of the first occurrence of a substring.
    * @param searchString The substring to search for in the string
    * @param position The index at which to begin searching the String object. If omitted, search starts at the beginning of the string.
    */
  /* standard es5 */
  def indexOf(searchString: String): Double = js.native
  def indexOf(searchString: String, position: Double): Double = js.native
  
  /**
    * Returns an `<i>` HTML element
    * @deprecated A legacy feature for browser compatibility
    */
  /* standard es2015.core */
  def italics(): String = js.native
  
  /** Iterator */
  /* standard es2015.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[String]] = js.native
  
  /**
    * Returns the last occurrence of a substring in the string.
    * @param searchString The substring to search for.
    * @param position The index at which to begin searching. If omitted, the search begins at the end of the string.
    */
  /* standard es5 */
  def lastIndexOf(searchString: String): Double = js.native
  def lastIndexOf(searchString: String, position: Double): Double = js.native
  
  /** Returns the length of a String object. */
  /* standard es5 */
  val length: Double = js.native
  
  /**
    * Returns an `<a>` HTML element and sets the href attribute value
    * @deprecated A legacy feature for browser compatibility
    */
  /* standard es2015.core */
  def link(url: String): String = js.native
  
  /**
    * Determines whether two strings are equivalent in the current locale.
    * @param that String to compare to target string
    */
  /* standard es5 */
  def localeCompare(that: String): Double = js.native
  def localeCompare(that: String, locales: String): Double = js.native
  def localeCompare(that: String, locales: String, options: CollatorOptions): Double = js.native
  def localeCompare(that: String, locales: js.Array[String]): Double = js.native
  def localeCompare(that: String, locales: js.Array[String], options: CollatorOptions): Double = js.native
  def localeCompare(that: String, locales: Unit, options: CollatorOptions): Double = js.native
  
  /**
    * Matches a string or an object that supports being matched against, and returns an array
    * containing the results of that search, or null if no matches are found.
    * @param matcher An object that supports being matched against.
    */
  /* standard es2015.symbol.wellknown */
  def `match`(matcher: Match): RegExpMatchArray | Null = js.native
  /**
    * Matches a string with a regular expression, and returns an array containing the results of that search.
    * @param regexp A variable name or string literal containing the regular expression pattern and flags.
    */
  /* standard es5 */
  def `match`(regexp: String): RegExpMatchArray | Null = js.native
  def `match`(regexp: js.RegExp): RegExpMatchArray | Null = js.native
  
  /**
    * Matches a string with a regular expression, and returns an iterable of matches
    * containing the results of that search.
    * @param regexp A variable name or string literal containing the regular expression pattern and flags.
    */
  /* standard es2020.string */
  def matchAll(regexp: js.RegExp): IterableIterator[RegExpMatchArray] = js.native
  
  /**
    * Returns the String value result of normalizing the string into the normalization form
    * named by form as specified in Unicode Standard Annex #15, Unicode Normalization Forms.
    * @param form Applicable values: "NFC", "NFD", "NFKC", or "NFKD", If not specified default
    * is "NFC"
    */
  /* standard es2015.core */
  def normalize(): String = js.native
  /**
    * Returns the String value result of normalizing the string into the normalization form
    * named by form as specified in Unicode Standard Annex #15, Unicode Normalization Forms.
    * @param form Applicable values: "NFC", "NFD", "NFKC", or "NFKD", If not specified default
    * is "NFC"
    */
  /* standard es2015.core */
  def normalize(form: NFC | NFD | NFKC | NFKD): String = js.native
  def normalize(form: String): String = js.native
  
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
  /* standard es2017.string */
  def padEnd(maxLength: Double): String = js.native
  def padEnd(maxLength: Double, fillString: String): String = js.native
  
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
  /* standard es2017.string */
  def padStart(maxLength: Double): String = js.native
  def padStart(maxLength: Double, fillString: String): String = js.native
  
  /**
    * Returns a String value that is made from count copies appended together. If count is 0,
    * the empty string is returned.
    * @param count number of copies to append
    */
  /* standard es2015.core */
  def repeat(count: Double): String = js.native
  
  /**
    * Replaces text in a string, using a regular expression or search string.
    * @param searchValue A string to search for.
    * @param replaceValue A string containing the text to replace for every successful match of searchValue in this string.
    */
  /* standard es5 */
  def replace(searchValue: String, replaceValue: String): String = js.native
  /**
    * Replaces text in a string, using a regular expression or search string.
    * @param searchValue A string to search for.
    * @param replacer A function that returns the replacement text.
    */
  /* standard es5 */
  def replace(searchValue: String, replacer: js.Function2[/* substring */ String, /* repeated */ Any, String]): String = js.native
  def replace(searchValue: js.RegExp, replaceValue: String): String = js.native
  def replace(searchValue: js.RegExp, replacer: js.Function2[/* substring */ String, /* repeated */ Any, String]): String = js.native
  /**
    * Replaces first match with string or all matches with RegExp.
    * @param searchValue A string or RegExp search value.
    * @param replaceValue A string containing the text to replace for match.
    */
  /* standard es2015.symbol.wellknown */
  def replace(searchValue: Replace, replaceValue: String): String = js.native
  /**
    * Replaces text in a string, using an object that supports replacement within a string.
    * @param searchValue A object can search for and replace matches within a string.
    * @param replacer A function that returns the replacement text.
    */
  /* standard es2015.symbol.wellknown */
  def replace(searchValue: `0`, replacer: js.Function2[/* substring */ String, /* repeated */ Any, String]): String = js.native
  
  /**
    * Replace all instances of a substring in a string, using a regular expression or search string.
    * @param searchValue A string to search for.
    * @param replaceValue A string containing the text to replace for every successful match of searchValue in this string.
    */
  /* standard es2021.string */
  def replaceAll(searchValue: String, replaceValue: String): String = js.native
  /**
    * Replace all instances of a substring in a string, using a regular expression or search string.
    * @param searchValue A string to search for.
    * @param replacer A function that returns the replacement text.
    */
  /* standard es2021.string */
  def replaceAll(searchValue: String, replacer: js.Function2[/* substring */ String, /* repeated */ Any, String]): String = js.native
  def replaceAll(searchValue: js.RegExp, replaceValue: String): String = js.native
  def replaceAll(searchValue: js.RegExp, replacer: js.Function2[/* substring */ String, /* repeated */ Any, String]): String = js.native
  
  /**
    * Finds the first substring match in a regular expression search.
    * @param regexp The regular expression pattern and applicable flags.
    */
  /* standard es5 */
  def search(regexp: String): Double = js.native
  def search(regexp: js.RegExp): Double = js.native
  /**
    * Finds the first substring match in a regular expression search.
    * @param searcher An object which supports searching within a string.
    */
  /* standard es2015.symbol.wellknown */
  def search(searcher: Search): Double = js.native
  
  /**
    * Returns a section of a string.
    * @param start The index to the beginning of the specified portion of stringObj.
    * @param end The index to the end of the specified portion of stringObj. The substring includes the characters up to, but not including, the character indicated by end.
    * If this value is not specified, the substring continues to the end of stringObj.
    */
  /* standard es5 */
  def slice(): String = js.native
  def slice(start: Double): String = js.native
  def slice(start: Double, end: Double): String = js.native
  def slice(start: Unit, end: Double): String = js.native
  
  /**
    * Returns a `<small>` HTML element
    * @deprecated A legacy feature for browser compatibility
    */
  /* standard es2015.core */
  def small(): String = js.native
  
  /**
    * Split a string into substrings using the specified separator and return them as an array.
    * @param separator A string that identifies character or characters to use in separating the string. If omitted, a single-element array containing the entire string is returned.
    * @param limit A value used to limit the number of elements returned in the array.
    */
  /* standard es5 */
  def split(separator: String): js.Array[String] = js.native
  def split(separator: String, limit: Double): js.Array[String] = js.native
  def split(separator: js.RegExp): js.Array[String] = js.native
  def split(separator: js.RegExp, limit: Double): js.Array[String] = js.native
  /**
    * Split a string into substrings using the specified separator and return them as an array.
    * @param splitter An object that can split a string.
    * @param limit A value used to limit the number of elements returned in the array.
    */
  /* standard es2015.symbol.wellknown */
  def split(splitter: Split): js.Array[String] = js.native
  def split(splitter: Split, limit: Double): js.Array[String] = js.native
  
  /**
    * Returns true if the sequence of elements of searchString converted to a String is the
    * same as the corresponding elements of this object (converted to a String) starting at
    * position. Otherwise returns false.
    */
  /* standard es2015.core */
  def startsWith(searchString: String): Boolean = js.native
  def startsWith(searchString: String, position: Double): Boolean = js.native
  
  /**
    * Returns a `<strike>` HTML element
    * @deprecated A legacy feature for browser compatibility
    */
  /* standard es2015.core */
  def strike(): String = js.native
  
  /**
    * Returns a `<sub>` HTML element
    * @deprecated A legacy feature for browser compatibility
    */
  /* standard es2015.core */
  def sub(): String = js.native
  
  // IE extensions
  /**
    * Gets a substring beginning at the specified location and having the specified length.
    * @deprecated A legacy feature for browser compatibility
    * @param from The starting position of the desired substring. The index of the first character in the string is zero.
    * @param length The number of characters to include in the returned substring.
    */
  /* standard es5 */
  def substr(from: Double): String = js.native
  def substr(from: Double, length: Double): String = js.native
  
  /**
    * Returns the substring at the specified location within a String object.
    * @param start The zero-based index number indicating the beginning of the substring.
    * @param end Zero-based index number indicating the end of the substring. The substring includes the characters up to, but not including, the character indicated by end.
    * If end is omitted, the characters from start through the end of the original string are returned.
    */
  /* standard es5 */
  def substring(start: Double): String = js.native
  def substring(start: Double, end: Double): String = js.native
  
  /**
    * Returns a `<sup>` HTML element
    * @deprecated A legacy feature for browser compatibility
    */
  /* standard es2015.core */
  def sup(): String = js.native
  
  /** Converts all alphabetic characters to lowercase, taking into account the host environment's current locale. */
  /* standard es5 */
  def toLocaleLowerCase(): String = js.native
  def toLocaleLowerCase(locales: String): String = js.native
  def toLocaleLowerCase(locales: js.Array[String]): String = js.native
  
  /** Returns a string where all alphabetic characters have been converted to uppercase, taking into account the host environment's current locale. */
  /* standard es5 */
  def toLocaleUpperCase(): String = js.native
  def toLocaleUpperCase(locales: String): String = js.native
  def toLocaleUpperCase(locales: js.Array[String]): String = js.native
  
  /** Converts all the alphabetic characters in a string to lowercase. */
  /* standard es5 */
  def toLowerCase(): String = js.native
  
  /** Converts all the alphabetic characters in a string to uppercase. */
  /* standard es5 */
  def toUpperCase(): String = js.native
  
  /** Removes the leading and trailing white space and line terminator characters from a string. */
  /* standard es5 */
  def trim(): String = js.native
  
  /** Removes the trailing white space and line terminator characters from a string. */
  /* standard es2019.string */
  def trimEnd(): String = js.native
  
  /**
    * Removes the leading white space and line terminator characters from a string.
    * @deprecated A legacy feature for browser compatibility. Use `trimStart` instead
    */
  /* standard es2019.string */
  def trimLeft(): String = js.native
  
  /**
    * Removes the trailing white space and line terminator characters from a string.
    * @deprecated A legacy feature for browser compatibility. Use `trimEnd` instead
    */
  /* standard es2019.string */
  def trimRight(): String = js.native
  
  /** Removes the leading white space and line terminator characters from a string. */
  /* standard es2019.string */
  def trimStart(): String = js.native
}
