package typings.samchonFramework.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object library {
  
  @JSImport("samchon-framework", "library.CartesianProduct")
  @js.native
  open class CartesianProduct protected ()
    extends typings.samchon.mod.library.CartesianProduct {
    /**
      * Initializer Constructor.
      *
      * @param digits Max number (size) of each digit.
      */
    def this(digits: Double*) = this()
  }
  
  @JSImport("samchon-framework", "library.Factorial")
  @js.native
  open class Factorial protected ()
    extends typings.samchon.mod.library.Factorial {
    /**
      * Construct from factorial size N.
      *
      * @param n Factoria size N.
      */
    def this(n: Double) = this()
  }
  
  @JSImport("samchon-framework", "library.Permutation")
  @js.native
  open class Permutation protected ()
    extends typings.samchon.mod.library.Permutation {
    /**
      * Construct from size of N and R.
      *
      * @param n Size of candidates.
      * @param r Size of elements of each case.
      */
    def this(n: Double, r: Double) = this()
  }
  
  @JSImport("samchon-framework", "library.RepeatedPermutation")
  @js.native
  open class RepeatedPermutation protected ()
    extends typings.samchon.mod.library.RepeatedPermutation {
    /**
      * Construct from size of N and R.
      *
      * @param n Size of candidates.
      * @param r Size of elements of each case.
      */
    def this(n: Double, r: Double) = this()
  }
  
  @JSImport("samchon-framework", "library.StringUtil")
  @js.native
  open class StringUtil ()
    extends typings.samchon.mod.library.StringUtil
  /* static members */
  object StringUtil {
    
    @JSImport("samchon-framework", "library.StringUtil")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * An array containing whitespaces.
      */
    @JSImport("samchon-framework", "library.StringUtil.SPACE_ARRAY")
    @js.native
    def SPACE_ARRAY: Any = js.native
    inline def SPACE_ARRAY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPACE_ARRAY")(x.asInstanceOf[js.Any])
    
    /**
      * @hidden
      */
    @JSImport("samchon-framework", "library.StringUtil._Fetch_substitute_index")
    @js.native
    def _Fetch_substitute_index: Any = js.native
    inline def _Fetch_substitute_index_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Fetch_substitute_index")(x.asInstanceOf[js.Any])
    
    /**
      * @hidden
      */
    @JSImport("samchon-framework", "library.StringUtil._Substitute_sql_string")
    @js.native
    def _Substitute_sql_string: Any = js.native
    inline def _Substitute_sql_string_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Substitute_sql_string")(x.asInstanceOf[js.Any])
    
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
    inline def between(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("between")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def between(str: String, start: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(str.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def between(str: String, start: String, end: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(str.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def between(str: String, start: Unit, end: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(str.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
    
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
    inline def betweens(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("betweens")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def betweens(str: String, start: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("betweens")(str.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def betweens(str: String, start: String, end: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("betweens")(str.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def betweens(str: String, start: Unit, end: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("betweens")(str.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * Remove all designated characters from the beginning of the specified string.
      *
      * @param str The string should be trimmed.
      * @param delims Designated character(s).
      *
      * @return Updated string where designated characters was removed from the beginning
      */
    inline def ltrim(str: String, args: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ltrim")(List(str.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
    
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
    inline def numberFormat(`val`: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("numberFormat")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def numberFormat(`val`: Double, precision: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("numberFormat")(`val`.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def percentFormat(`val`: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("percentFormat")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def percentFormat(`val`: Double, precision: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("percentFormat")(`val`.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Replace all HTML spaces to a literal space.
      *
      * @param str Target string to replace.
      */
    inline def removeHTMLSpaces(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeHTMLSpaces")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
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
    inline def repeat(str: String, n: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(str.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Returns a string specified word is replaced.
      *
      * @param str Target string to replace
      * @param before Specific word you want to be replaced
      * @param after Specific word you want to replace
      *
      * @return A string specified word is replaced
      */
    inline def replaceAll(str: String, before: String, after: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceAll")(str.asInstanceOf[js.Any], before.asInstanceOf[js.Any], after.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * Returns a string specified words are replaced.
      *
      * @param str Target string to replace
      * @param pairs A specific word's pairs you want to replace and to be replaced
      *
      * @return A string specified words are replaced
      */
    inline def replaceAll(
      str: String,
      pairs: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.Pair<string, string> */ Any)*
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceAll")(List(str.asInstanceOf[js.Any]).`++`(pairs.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
    
    /**
      * Remove all designated characters from the end of the specified string.
      *
      * @param str The string should be trimmed.
      * @param delims Designated character(s).
      *
      * @return Updated string where designated characters was removed from the end.
      */
    inline def rtrim(str: String, args: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rtrim")(List(str.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
    
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
    inline def substitute(format: String, args: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("substitute")(List(format.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
    
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
    inline def substituteSQL(format: String, args: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("substituteSQL")(List(format.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
    
    /**
      * Remove all designated characters from the beginning and end of the specified string.
      *
      * @param str The string whose designated characters should be trimmed.
      * @param args Designated character(s).
      *
      * @return Updated string where designated characters was removed from the beginning and end.
      */
    inline def trim(str: String, args: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trim")(List(str.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  }
  
  @JSImport("samchon-framework", "library.URLVariables")
  @js.native
  /**
    * Default Constructor.
    */
  open class URLVariables ()
    extends typings.samchon.mod.library.URLVariables {
    /**
      * Construct from a URL-encoded string.
      *
      * The {@link decode decode()} method is automatically called to convert the string to properties of the {@link URLVariables} object.
      *
      * @param str A URL-encoded string containing name/value pairs.
      */
    def this(str: String) = this()
  }
  object URLVariables {
    
    @JSImport("samchon-framework", "library.URLVariables")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parse[T](str: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def parse[T](str: String, autoCase: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], autoCase.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def stringify[T](obj: T): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("samchon-framework", "library.XML")
  @js.native
  open class XML ()
    extends typings.samchon.mod.library.XML {
    def this(str: String) = this()
    def this(xml: typings.sxml.xmlMod.XML) = this()
  }
  /* static members */
  object XML {
    
    @JSImport("samchon-framework", "library.XML")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @hidden
      */
    @JSImport("samchon-framework", "library.XML._Compute_min_index")
    @js.native
    def _Compute_min_index: Any = js.native
    inline def _Compute_min_index_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Compute_min_index")(x.asInstanceOf[js.Any])
    
    /**
      * @hidden
      */
    @JSImport("samchon-framework", "library.XML._Repeat")
    @js.native
    def _Repeat: Any = js.native
    inline def _Repeat_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Repeat")(x.asInstanceOf[js.Any])
    
    inline def decodeProperty(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode_property")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def decodeValue(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode_value")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def encodeProperty(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode_property")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def encodeValue(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode_value")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def head(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("head")().asInstanceOf[String]
    inline def head(encoding: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(encoding.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("samchon-framework", "library.XMLList")
  @js.native
  open class XMLList ()
    extends typings.samchon.mod.library.XMLList
}
