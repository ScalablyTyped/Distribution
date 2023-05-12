package typings.recurlyRecurlyJs.libApplePayNativeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplePayErrorUpdate
  extends StObject
     with ApplePaySelectionUpdate {
  
  /**
    * A list of customized errors you provide that results from the user's selection.
    */
  var errors: js.UndefOr[js.Array[ApplePayError]] = js.undefined
}
object ApplePayErrorUpdate {
  
  inline def apply(): ApplePayErrorUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplePayErrorUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplePayErrorUpdate] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: js.Array[ApplePayError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: ApplePayError*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
