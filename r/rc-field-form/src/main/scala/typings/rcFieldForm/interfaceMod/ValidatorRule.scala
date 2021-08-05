package typings.rcFieldForm.interfaceMod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidatorRule extends StObject {
  
  var message: js.UndefOr[String | ReactElement] = js.undefined
  
  var validator: Validator
}
object ValidatorRule {
  
  inline def apply(
    validator: (/* rule */ RuleObject, /* value */ StoreValue, /* callback */ js.Function1[/* error */ js.UndefOr[String], Unit]) => (js.Promise[Unit | js.Any]) | Unit
  ): ValidatorRule = {
    val __obj = js.Dynamic.literal(validator = js.Any.fromFunction3(validator))
    __obj.asInstanceOf[ValidatorRule]
  }
  
  extension [Self <: ValidatorRule](x: Self) {
    
    inline def setMessage(value: String | ReactElement): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setValidator(
      value: (/* rule */ RuleObject, /* value */ StoreValue, /* callback */ js.Function1[/* error */ js.UndefOr[String], Unit]) => (js.Promise[Unit | js.Any]) | Unit
    ): Self = StObject.set(x, "validator", js.Any.fromFunction3(value))
  }
}
