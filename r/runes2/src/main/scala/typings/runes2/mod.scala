package typings.runes2

import typings.runes2.runes2Ints.`127462`
import typings.runes2.runes2Ints.`127487`
import typings.runes2.runes2Ints.`127988`
import typings.runes2.runes2Ints.`127995`
import typings.runes2.runes2Ints.`127999`
import typings.runes2.runes2Ints.`1`
import typings.runes2.runes2Ints.`2`
import typings.runes2.runes2Ints.`4`
import typings.runes2.runes2Ints.`55296`
import typings.runes2.runes2Ints.`56319`
import typings.runes2.runes2Ints.`56320`
import typings.runes2.runes2Ints.`65024`
import typings.runes2.runes2Ints.`65039`
import typings.runes2.runes2Ints.`8205`
import typings.runes2.runes2Ints.`8400`
import typings.runes2.runes2Ints.`8447`
import typings.runes2.runes2Ints.`917504`
import typings.runes2.runes2Ints.`917631`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("runes2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(string: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @JSImport("runes2", "GRAPHEMES")
  @js.native
  val GRAPHEMES: js.Array[Double] = js.native
  
  inline def betweenInclusive(value: Double, lower: Double, upper: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("betweenInclusive")(value.asInstanceOf[js.Any], lower.asInstanceOf[js.Any], upper.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def codePointFromSurrogatePair(pair: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("codePointFromSurrogatePair")(pair.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isDiacriticalMark(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDiacriticalMark")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFirstOfSurrogatePair(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFirstOfSurrogatePair")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFitzpatrickModifier(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFitzpatrickModifier")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isGrapheme(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGrapheme")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRegionalIndicator(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegionalIndicator")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSubdivisionFlag(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSubdivisionFlag")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSupplementarySpecialpurposePlane(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupplementarySpecialpurposePlane")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isVariationSelector(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVariationSelector")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isZeroWidthJoiner(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isZeroWidthJoiner")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def nextUnits(i: Double, string: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("nextUnits")(i.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def runes(string: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("runes")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def substr(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("substr")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def substr(string: String, start: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("substr")(string.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def substr(string: String, start: Double, width: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("substr")(string.asInstanceOf[js.Any], start.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def substr(string: String, start: Unit, width: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("substr")(string.asInstanceOf[js.Any], start.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def substring(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("substring")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def substring(string: String, start: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("substring")(string.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def substring(string: String, start: Double, width: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("substring")(string.asInstanceOf[js.Any], start.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def substring(string: String, start: Unit, width: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("substring")(string.asInstanceOf[js.Any], start.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.runes2.runes2Ints.`1`
    - typings.runes2.runes2Ints.`2`
    - typings.runes2.runes2Ints.`4`
  */
  trait EnumCodeUnits extends StObject
  object EnumCodeUnits {
    
    inline def unit_1: `1` = 1.asInstanceOf[`1`]
    
    inline def unit_2: `2` = 2.asInstanceOf[`2`]
    
    inline def unit_4: `4` = 4.asInstanceOf[`4`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.runes2.runes2Ints.`55296`
    - typings.runes2.runes2Ints.`56319`
    - typings.runes2.runes2Ints.`56320`
    - typings.runes2.runes2Ints.`127462`
    - typings.runes2.runes2Ints.`127487`
    - typings.runes2.runes2Ints.`127995`
    - typings.runes2.runes2Ints.`127999`
    - typings.runes2.runes2Ints.`65024`
    - typings.runes2.runes2Ints.`65039`
    - typings.runes2.runes2Ints.`8400`
    - typings.runes2.runes2Ints.`8447`
    - typings.runes2.runes2Ints.`127988`
    - typings.runes2.runes2Ints.`917504`
    - typings.runes2.runes2Ints.`917631`
    - typings.runes2.runes2Ints.`8205`
  */
  trait EnumRunesCode extends StObject
  object EnumRunesCode {
    
    inline def DIACRITICAL_MARKS_END: `8447` = 8447.asInstanceOf[`8447`]
    
    inline def DIACRITICAL_MARKS_START: `8400` = 8400.asInstanceOf[`8400`]
    
    inline def FITZPATRICK_MODIFIER_END: `127999` = 127999.asInstanceOf[`127999`]
    
    inline def FITZPATRICK_MODIFIER_START: `127995` = 127995.asInstanceOf[`127995`]
    
    inline def HIGH_SURROGATE_END: `56319` = 56319.asInstanceOf[`56319`]
    
    inline def HIGH_SURROGATE_START: `55296` = 55296.asInstanceOf[`55296`]
    
    inline def LOW_SURROGATE_START: `56320` = 56320.asInstanceOf[`56320`]
    
    inline def REGIONAL_INDICATOR_END: `127487` = 127487.asInstanceOf[`127487`]
    
    inline def REGIONAL_INDICATOR_START: `127462` = 127462.asInstanceOf[`127462`]
    
    inline def SUBDIVISION_INDICATOR_START: `127988` = 127988.asInstanceOf[`127988`]
    
    inline def TAGS_END: `917631` = 917631.asInstanceOf[`917631`]
    
    inline def TAGS_START: `917504` = 917504.asInstanceOf[`917504`]
    
    inline def VARIATION_MODIFIER_END: `65039` = 65039.asInstanceOf[`65039`]
    
    inline def VARIATION_MODIFIER_START: `65024` = 65024.asInstanceOf[`65024`]
    
    inline def ZWJ: `8205` = 8205.asInstanceOf[`8205`]
  }
}
