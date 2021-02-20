package typings.reactNativeFirebase.mod.RNFirebase

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeError extends Error {
  
  var code: String = js.native
  
  var nativeErrorCode: js.UndefOr[String] = js.native
  
  var nativeErrorMessage: js.UndefOr[String] = js.native
}
object NativeError {
  
  @scala.inline
  def apply(code: String, message: String, name: String): NativeError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeError]
  }
  
  @scala.inline
  implicit class NativeErrorMutableBuilder[Self <: NativeError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeErrorCode(value: String): Self = StObject.set(x, "nativeErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeErrorCodeUndefined: Self = StObject.set(x, "nativeErrorCode", js.undefined)
    
    @scala.inline
    def setNativeErrorMessage(value: String): Self = StObject.set(x, "nativeErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeErrorMessageUndefined: Self = StObject.set(x, "nativeErrorMessage", js.undefined)
  }
}
