package typings.pulumiAws.outputMod.lex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSlotTypeEnumerationValue extends StObject {
  
  var synonyms: js.Array[String]
  
  var value: String
}
object GetSlotTypeEnumerationValue {
  
  inline def apply(synonyms: js.Array[String], value: String): GetSlotTypeEnumerationValue = {
    val __obj = js.Dynamic.literal(synonyms = synonyms.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSlotTypeEnumerationValue]
  }
  
  extension [Self <: GetSlotTypeEnumerationValue](x: Self) {
    
    inline def setSynonyms(value: js.Array[String]): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
    
    inline def setSynonymsVarargs(value: String*): Self = StObject.set(x, "synonyms", js.Array(value :_*))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
