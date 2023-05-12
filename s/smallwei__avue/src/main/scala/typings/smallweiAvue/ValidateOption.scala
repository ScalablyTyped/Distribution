package typings.smallweiAvue

import typings.smallweiAvue.anon.PartialValidateMessages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateOption extends StObject {
  
  var error: js.UndefOr[js.Function2[/* rule */ InternalRuleItem, /* message */ String, ValidateError]] = js.undefined
  
  var first: js.UndefOr[Boolean] = js.undefined
  
  var firstFields: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  
  /** The name of rules need to be trigger. Will validate all rules if leave empty */
  var keys: js.UndefOr[js.Array[String]] = js.undefined
  
  var messages: js.UndefOr[PartialValidateMessages] = js.undefined
  
  var suppressValidatorError: js.UndefOr[Boolean] = js.undefined
  
  var suppressWarning: js.UndefOr[Boolean] = js.undefined
}
object ValidateOption {
  
  inline def apply(): ValidateOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidateOption] (val x: Self) extends AnyVal {
    
    inline def setError(value: (/* rule */ InternalRuleItem, /* message */ String) => ValidateError): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setFirstFields(value: Boolean | js.Array[String]): Self = StObject.set(x, "firstFields", value.asInstanceOf[js.Any])
    
    inline def setFirstFieldsUndefined: Self = StObject.set(x, "firstFields", js.undefined)
    
    inline def setFirstFieldsVarargs(value: String*): Self = StObject.set(x, "firstFields", js.Array(value*))
    
    inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
    
    inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setMessages(value: PartialValidateMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setSuppressValidatorError(value: Boolean): Self = StObject.set(x, "suppressValidatorError", value.asInstanceOf[js.Any])
    
    inline def setSuppressValidatorErrorUndefined: Self = StObject.set(x, "suppressValidatorError", js.undefined)
    
    inline def setSuppressWarning(value: Boolean): Self = StObject.set(x, "suppressWarning", value.asInstanceOf[js.Any])
    
    inline def setSuppressWarningUndefined: Self = StObject.set(x, "suppressWarning", js.undefined)
  }
}
