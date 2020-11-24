package typings.reactNativeFirebaseApp.mod.ReactNativeFirebase

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeFirebaseError extends Error {
  
  /**
    * Firebase error code, e.g. `auth/invalid-email`
    */
  val code: String = js.native
  
  /**
    * The firebase module namespace that this error originated from, e.g. 'analytics'
    */
  val namespace: String = js.native
  
  /**
    * The native sdks returned error code, different per platform
    */
  val nativeErrorCode: String | Double = js.native
  
  /**
    * The native sdks returned error message, different per platform
    */
  val nativeErrorMessage: String = js.native
}
object NativeFirebaseError {
  
  @scala.inline
  def apply(
    code: String,
    message: String,
    name: String,
    namespace: String,
    nativeErrorCode: String | Double,
    nativeErrorMessage: String
  ): NativeFirebaseError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], nativeErrorCode = nativeErrorCode.asInstanceOf[js.Any], nativeErrorMessage = nativeErrorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeFirebaseError]
  }
  
  @scala.inline
  implicit class NativeFirebaseErrorOps[Self <: NativeFirebaseError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeErrorCode(value: String | Double): Self = this.set("nativeErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeErrorMessage(value: String): Self = this.set("nativeErrorMessage", value.asInstanceOf[js.Any])
  }
}
