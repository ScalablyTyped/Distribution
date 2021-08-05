package typings.pulumiAws.inputMod.lex

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotTypeEnumerationValue extends StObject {
  
  /**
    * Additional values related to the slot type value. Each item must be less than or equal to 140 characters in length.
    */
  var synonyms: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * The value of the slot type. Must be less than or equal to 140 characters in length.
    */
  var value: Input[String]
}
object SlotTypeEnumerationValue {
  
  inline def apply(value: Input[String]): SlotTypeEnumerationValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotTypeEnumerationValue]
  }
  
  extension [Self <: SlotTypeEnumerationValue](x: Self) {
    
    inline def setSynonyms(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
    
    inline def setSynonymsUndefined: Self = StObject.set(x, "synonyms", js.undefined)
    
    inline def setSynonymsVarargs(value: Input[String]*): Self = StObject.set(x, "synonyms", js.Array(value :_*))
    
    inline def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
