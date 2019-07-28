package typings.samchon.libraryMod

import typings.tstl.tstlMod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/library", "StringUtil")
@js.native
class StringUtil ()
  extends typings.samchon.libraryUtilsStringUtilMod.StringUtil

/* static members */
@JSImport("samchon/library", "StringUtil")
@js.native
object StringUtil extends js.Object {
  /**
    * An array containing whitespaces.
    */
  var SPACE_ARRAY: js.Any = js.native
  /**
    * @hidden
    */
  var _Fetch_substitute_index: js.Any = js.native
  /**
    * @hidden
    */
  var _Substitute_sql_string: js.Any = js.native
  /**
    * Generate a substring.
    *
    * Extracts a substring consisting of the characters from specified start to end.
    * It's same with str.substring( ? = (str.find(start) + start.size()), str.find(end, ?) )
    *
    * ```typescript
    * let str: string = StringUtil.between("ABCD(EFGH)IJK", "(", ")");
    * console.log(str); // PRINTS "EFGH"
    * ```
    *
    * - If start is not specified, extracts from begin of the string to end. </li>
    * - If end is not specified, extracts from start to end of the string. </li>
    * - If start and end are all omitted, returns str, itself. </li>
    *
    * @param str Target string to be applied between.
    * @param start A string for separating substring at the front.
    * @param end A string for separating substring at the end.
    *
    * @return substring by specified terms.
    */
  def between(str: String): String = js.native
  def between(str: String, start: String): String = js.native
  def between(str: String, start: String, end: String): String = js.native
  /**
    * Fetch substrings.
    *
    * Splits a string into an array of substrings dividing by specified delimeters of start and end.
    * It's the array of substrings adjusted the between.
    *
    * <ul>
    *	<li> If startStr is omitted, it's same with the split by endStr not having last item. </li>
    *	<li> If endStr is omitted, it's same with the split by startStr not having first item. </li>
    *	<li> If startStr and endStar are all omitted, returns *str*. </li>
    * </ul>
    *
    * @param str Target string to split by between.
    * @param start A string for separating substring at the front.
    *				If omitted, it's same with split(end) not having last item.
    * @param end A string for separating substring at the end.
    *			  If omitted, it's same with split(start) not having first item.
    * @return An array of substrings.
    */
  def betweens(str: String): js.Array[String] = js.native
  def betweens(str: String, start: String): js.Array[String] = js.native
  def betweens(str: String, start: String, end: String): js.Array[String] = js.native
  /**
    * Remove all designated characters from the beginning of the specified string.
    *
    * @param str The string should be trimmed.
    * @param delims Designated character(s).
    *
    * @return Updated string where designated characters was removed from the beginning
    */
  def ltrim(str: String, args: String*): String = js.native
  /**
    * Number to formatted string with &quot;,&quot; sign.
    *
    * Returns a string converted from the number rounded off from specified precision with &quot;,&quot; symbols.
    *
    * @param val A number wants to convert to string.
    * @param precision Target precision of round off.
    *
    * @return A string who represents the number with roundoff and &quot;,&quot; symbols.
    */
  def numberFormat(`val`: Double): String = js.native
  def numberFormat(`val`: Double, precision: Double): String = js.native
  def percentFormat(`val`: Double): String = js.native
  def percentFormat(`val`: Double, precision: Double): String = js.native
  /**
    * Replace all HTML spaces to a literal space.
    *
    * @param str Target string to replace.
    */
  def removeHTMLSpaces(str: String): String = js.native
  /**
    * Repeat a string.
    *
    * Returns a string consisting of a specified string concatenated with itself a specified number of times.
    *
    * @param str The string to be repeated.
    * @param n The repeat count.
    *
    * @return The repeated string.
    */
  def repeat(str: String, n: Double): String = js.native
  /**
    * Returns a string specified word is replaced.
    *
    * @param str Target string to replace
    * @param before Specific word you want to be replaced
    * @param after Specific word you want to replace
    *
    * @return A string specified word is replaced
    */
  def replaceAll(str: String, before: String, after: String): String = js.native
  /**
    * Returns a string specified words are replaced.
    *
    * @param str Target string to replace
    * @param pairs A specific word's pairs you want to replace and to be replaced
    *
    * @return A string specified words are replaced
    */
  def replaceAll(str: String, pairs: (Pair[String, String])*): String = js.native
  /**
    * Remove all designated characters from the end of the specified string.
    *
    * @param str The string should be trimmed.
    * @param delims Designated character(s).
    *
    * @return Updated string where designated characters was removed from the end.
    */
  def rtrim(str: String, args: String*): String = js.native
  /**
    * Substitute `{n}` tokens within the specified string.
    *
    * @param format The string to make substitutions in. This string can contain special tokens of the form
    *				 `{n}`, where *n* is a zero based index, that will be replaced with the additional parameters
    *				 found at that index if specified.
    * @param args Additional parameters that can be substituted in the *format* parameter at each
    *			   `{n}` location, where *n* is an integer (zero based) index value into the array of values
    *			   specified.
    *
    * @return New string with all of the `{n}` tokens replaced with the respective arguments specified.
    */
  def substitute(format: String, args: js.Any*): String = js.native
  /**
    * Substitute `{n}` tokens within the specified SQL-string.
    *
    * @param format The string to make substitutions in. This string can contain special tokens of the form
    *				 `{n}`, where *n* is a zero based index, that will be replaced with the additional parameters
    *				 found at that index if specified.
    * @param args Additional parameters that can be substituted in the *format* parameter at each
    *			   `{n}` location, where *n* is an integer (zero based) index value into the array of values
    *			   specified.
    *
    * @return New SQL-string with all of the `{n}` tokens replaced with the respective arguments specified.
    */
  def substituteSQL(format: String, args: js.Any*): String = js.native
  /**
    * Remove all designated characters from the beginning and end of the specified string.
    *
    * @param str The string whose designated characters should be trimmed.
    * @param args Designated character(s).
    *
    * @return Updated string where designated characters was removed from the beginning and end.
    */
  def trim(str: String, args: String*): String = js.native
}

