package typings.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxError extends js.Object {
  
  var maxError: js.Any = js.native
}
object MaxError {
  
  @scala.inline
  def apply(maxError: js.Any): MaxError = {
    val __obj = js.Dynamic.literal(maxError = maxError.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxError]
  }
  
  @scala.inline
  implicit class MaxErrorOps[Self <: MaxError] (val x: Self) extends AnyVal {
    
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
    def setMaxError(value: js.Any): Self = this.set("maxError", value.asInstanceOf[js.Any])
  }
}
