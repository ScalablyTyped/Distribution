package typings.samchon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringUtilMod {
  
  @JSImport("samchon/library/utils/StringUtil", "StringUtil")
  @js.native
  class StringUtil () extends StObject
  /* static members */
  object StringUtil {
    
    @JSImport("samchon/library/utils/StringUtil", "StringUtil")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * An array containing whitespaces.
      */
    @JSImport("samchon/library/utils/StringUtil", "StringUtil.SPACE_ARRAY")
    @js.native
    def SPACE_ARRAY: js.Any = js.native
    @scala.inline
    def SPACE_ARRAY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPACE_ARRAY")(x.asInstanceOf[js.Any])
    
    /**
      * @hidden
      */
    @JSImport("samchon/library/utils/StringUtil", "StringUtil._Fetch_substitute_index")
    @js.native
    def _Fetch_substitute_index: js.Any = js.native
    @scala.inline
    def _Fetch_substitute_index_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Fetch_substitute_index")(x.asInstanceOf[js.Any])
    
    /**
      * @hidden
      */
    @JSImport("samchon/library/utils/StringUtil", "StringUtil._Substitute_sql_string")
    @js.native
    def _Substitute_sql_string: js.Any = js.native
    @scala.inline
    def _Substitute_sql_string_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Substitute_sql_string")(x.asInstanceOf[js.Any])
    
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
    @JSImport("samchon/library/utils/StringUtil", "StringUtil.between")
    @js.native
    def between(str: String): String = js.native
    @JSImport("samchon/library/utils/StringUtil", "StringUtil.between")
    @js.native
    def between(str: String, start: js.UndefOr[scala.Nothing], end: String): String = js.native
    @JSImport("samchon/library/utils/StringUtil", "StringUtil.between")
    @js.native
    def between(str: String, start: String): String = js.native
    @JSImport("samchon/library/utils/StringUtil", "StringUtil.between")
    @js.native
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
    @JSImport("samchon/library/utils/StringUtil", "StringUtil.betweens")
    @js.native
    def betweens(str: String): js.Array[String] = js.native
    @JSImport("samchon/library/utils/StringUtil", "StringUtil.betweens")
    @js.native
    def betweens(str: String, start: js.UndefOr[scala.Nothing], end: String): js.Array[String] = js.native
    @JSImport("samchon/library/utils/StringUtil", "StringUtil.betweens")
    @js.native
    def betweens(str: String, start: String): js.Array[String] = js.native
    @JSImport("samchon/library/utils/StringUtil", "StringUtil.betweens")
    @js.native
    def betweens(str: String, start: String, end: String): js.Array[String] = js.native
    
    /**
      * Remove all designated characters from the beginning of the specified string.
      *
      * @param str The string should be trimmed.
      * @param delims Designated character(s).
      *
      * @return Updated string where designated characters was removed from the beginning
      */
    @JSImport("samchon/library/utils/StringUtil", "StringUtil.ltrim")
    @js.native
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
    @JSImport("samchon/library/utils/StringUtil", "StringUtil.numberFormat")
    @js.native
    def numberFormat(`val`: Double): String = js.native
    @JSImport("samchon/library/utils/StringUtil", "StringUtil.numberFormat")
    @js.native
    def numberFormat(`val`: Double, precision: Double): String = js.native
    
    @JSImport("samchon/library/utils/StringUtil", "StringUtil.percentFormat")
    @js.native
    def percentFormat(`val`: Double): String = js.native
    @JSImport("samchon/library/utils/StringUtil", "StringUtil.percentFormat")
    @js.native
    def percentFormat(`val`: Double, precision: Double): String = js.native
    
    /**
      * Replace all HTML spaces to a literal space.
      *
      * @param str Target string to replace.
      */
    @JSImport("samchon/library/utils/StringUtil", "StringUtil.removeHTMLSpaces")
    @js.native
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
    @JSImport("samchon/library/utils/StringUtil", "StringUtil.repeat")
    @js.native
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
    @JSImport("samchon/library/utils/StringUtil", "StringUtil.replaceAll")
    @js.native
    def replaceAll(str: String, before: String, after: String): String = js.native
    /**
      * Returns a string specified words are replaced.
      *
      * @param str Target string to replace
      * @param pairs A specific word's pairs you want to replace and to be replaced
      *
      * @return A string specified words are replaced
      */
    @JSImport("samchon/library/utils/StringUtil", "StringUtil.replaceAll")
    @js.native
    def replaceAll(
      str: String,
      pairs: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.Pair<string, string> */ js.Any)*
    ): String = js.native
    
    /**
      * Remove all designated characters from the end of the specified string.
      *
      * @param str The string should be trimmed.
      * @param delims Designated character(s).
      *
      * @return Updated string where designated characters was removed from the end.
      */
    @JSImport("samchon/library/utils/StringUtil", "StringUtil.rtrim")
    @js.native
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
    @JSImport("samchon/library/utils/StringUtil", "StringUtil.substitute")
    @js.native
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
    @JSImport("samchon/library/utils/StringUtil", "StringUtil.substituteSQL")
    @js.native
    def substituteSQL(format: String, args: js.Any*): String = js.native
    
    /**
      * Remove all designated characters from the beginning and end of the specified string.
      *
      * @param str The string whose designated characters should be trimmed.
      * @param args Designated character(s).
      *
      * @return Updated string where designated characters was removed from the beginning and end.
      */
    @JSImport("samchon/library/utils/StringUtil", "StringUtil.trim")
    @js.native
    def trim(str: String, args: String*): String = js.native
  }
}
