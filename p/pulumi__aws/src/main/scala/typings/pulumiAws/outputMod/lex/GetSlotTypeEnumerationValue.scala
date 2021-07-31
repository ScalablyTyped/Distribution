package typings.pulumiAws.outputMod.lex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSlotTypeEnumerationValue extends StObject {
  
  var synonyms: js.Array[String]
  
  var value: String
}
object GetSlotTypeEnumerationValue {
  
  @scala.inline
  def apply(synonyms: js.Array[String], value: String): GetSlotTypeEnumerationValue = {
    val __obj = js.Dynamic.literal(synonyms = synonyms.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSlotTypeEnumerationValue]
  }
  
  @scala.inline
  implicit class GetSlotTypeEnumerationValueMutableBuilder[Self <: GetSlotTypeEnumerationValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSynonyms(value: js.Array[String]): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynonymsVarargs(value: String*): Self = StObject.set(x, "synonyms", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
