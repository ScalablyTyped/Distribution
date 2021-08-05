package typings.reactNativeFirebase.mod.RNFirebase

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeError
  extends StObject
     with Error {
  
  var code: String
  
  var nativeErrorCode: js.UndefOr[String] = js.undefined
  
  var nativeErrorMessage: js.UndefOr[String] = js.undefined
}
object NativeError {
  
  inline def apply(code: String, message: String, name: String): NativeError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeError]
  }
  
  extension [Self <: NativeError](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setNativeErrorCode(value: String): Self = StObject.set(x, "nativeErrorCode", value.asInstanceOf[js.Any])
    
    inline def setNativeErrorCodeUndefined: Self = StObject.set(x, "nativeErrorCode", js.undefined)
    
    inline def setNativeErrorMessage(value: String): Self = StObject.set(x, "nativeErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setNativeErrorMessageUndefined: Self = StObject.set(x, "nativeErrorMessage", js.undefined)
  }
}
