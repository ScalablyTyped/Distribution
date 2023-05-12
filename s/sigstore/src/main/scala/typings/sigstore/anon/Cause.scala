package typings.sigstore.anon

import typings.sigstore.distErrorMod.InternalErrorCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cause extends StObject {
  
  var cause: js.UndefOr[Any] = js.undefined
  
  var code: InternalErrorCode
  
  var message: String
}
object Cause {
  
  inline def apply(code: InternalErrorCode, message: String): Cause = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cause]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cause] (val x: Self) extends AnyVal {
    
    inline def setCause(value: Any): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setCode(value: InternalErrorCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
