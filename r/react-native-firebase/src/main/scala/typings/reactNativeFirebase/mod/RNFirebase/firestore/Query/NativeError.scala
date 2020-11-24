package typings.reactNativeFirebase.mod.RNFirebase.firestore.Query

import typings.std.Error
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
  implicit class NativeErrorOps[Self <: NativeError] (val x: Self) extends AnyVal {
    
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
    def setNativeErrorCode(value: String): Self = this.set("nativeErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNativeErrorCode: Self = this.set("nativeErrorCode", js.undefined)
    
    @scala.inline
    def setNativeErrorMessage(value: String): Self = this.set("nativeErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNativeErrorMessage: Self = this.set("nativeErrorMessage", js.undefined)
  }
}
