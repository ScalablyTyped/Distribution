package typings.reactHotLoader.mod

import typings.react.mod.ErrorInfo
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HotError extends js.Object {
  
  var error: Error = js.native
  
  var errorInfo: js.UndefOr[ErrorInfo] = js.native
}
object HotError {
  
  @scala.inline
  def apply(error: Error): HotError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[HotError]
  }
  
  @scala.inline
  implicit class HotErrorOps[Self <: HotError] (val x: Self) extends AnyVal {
    
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
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorInfo(value: ErrorInfo): Self = this.set("errorInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorInfo: Self = this.set("errorInfo", js.undefined)
  }
}
