package typings.pulumiAws.outputMod.lex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotTypeEnumerationValue extends StObject {
  
  /**
    * Additional values related to the slot type value. Each item must be less than or equal to 140 characters in length.
    */
  var synonyms: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The value of the slot type. Must be less than or equal to 140 characters in length.
    */
  var value: String
}
object SlotTypeEnumerationValue {
  
  @scala.inline
  def apply(value: String): SlotTypeEnumerationValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotTypeEnumerationValue]
  }
  
  @scala.inline
  implicit class SlotTypeEnumerationValueMutableBuilder[Self <: SlotTypeEnumerationValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSynonyms(value: js.Array[String]): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynonymsUndefined: Self = StObject.set(x, "synonyms", js.undefined)
    
    @scala.inline
    def setSynonymsVarargs(value: String*): Self = StObject.set(x, "synonyms", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
