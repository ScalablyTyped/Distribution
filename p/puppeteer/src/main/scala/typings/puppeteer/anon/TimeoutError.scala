package typings.puppeteer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeoutError extends js.Object {
  
  var TimeoutError: typings.puppeteer.mod.TimeoutError = js.native
}
object TimeoutError {
  
  @scala.inline
  def apply(TimeoutError: typings.puppeteer.mod.TimeoutError): TimeoutError = {
    val __obj = js.Dynamic.literal(TimeoutError = TimeoutError.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeoutError]
  }
  
  @scala.inline
  implicit class TimeoutErrorOps[Self <: TimeoutError] (val x: Self) extends AnyVal {
    
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
    def setTimeoutError(value: typings.puppeteer.mod.TimeoutError): Self = this.set("TimeoutError", value.asInstanceOf[js.Any])
  }
}
