package typings.regjsparser.mod

import typings.regjsparser.regjsparserStrings.unicodePropertyEscape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnicodePropertyEscape
  extends StObject
     with Base[unicodePropertyEscape]
     with CharacterClassBody {
  
  var negative: Boolean
  
  var value: String
}
object UnicodePropertyEscape {
  
  inline def apply(negative: Boolean, range: js.Tuple2[Double, Double], raw: String, value: String): UnicodePropertyEscape = {
    val __obj = js.Dynamic.literal(negative = negative.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("unicodePropertyEscape")
    __obj.asInstanceOf[UnicodePropertyEscape]
  }
  
  extension [Self <: UnicodePropertyEscape](x: Self) {
    
    inline def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
