package typings.rcFieldForm.esInterfaceMod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidatorRule extends StObject {
  
  var message: js.UndefOr[String | ReactElement] = js.undefined
  
  var validator: Validator
  
  var warningOnly: js.UndefOr[Boolean] = js.undefined
}
object ValidatorRule {
  
  inline def apply(
    validator: (/* rule */ RuleObject, /* value */ StoreValue, /* callback */ js.Function1[/* error */ js.UndefOr[String], Unit]) => (js.Promise[Unit | Any]) | Unit
  ): ValidatorRule = {
    val __obj = js.Dynamic.literal(validator = js.Any.fromFunction3(validator))
    __obj.asInstanceOf[ValidatorRule]
  }
  
  extension [Self <: ValidatorRule](x: Self) {
    
    inline def setMessage(value: String | ReactElement): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setValidator(
      value: (/* rule */ RuleObject, /* value */ StoreValue, /* callback */ js.Function1[/* error */ js.UndefOr[String], Unit]) => (js.Promise[Unit | Any]) | Unit
    ): Self = StObject.set(x, "validator", js.Any.fromFunction3(value))
    
    inline def setWarningOnly(value: Boolean): Self = StObject.set(x, "warningOnly", value.asInstanceOf[js.Any])
    
    inline def setWarningOnlyUndefined: Self = StObject.set(x, "warningOnly", js.undefined)
  }
}
