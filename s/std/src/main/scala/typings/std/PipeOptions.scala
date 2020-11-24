package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PipeOptions extends js.Object {
  
  var preventAbort: js.UndefOr[scala.Boolean] = js.native
  
  var preventCancel: js.UndefOr[scala.Boolean] = js.native
  
  var preventClose: js.UndefOr[scala.Boolean] = js.native
  
  var signal: js.UndefOr[AbortSignal] = js.native
}
object PipeOptions {
  
  @scala.inline
  def apply(): PipeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipeOptions]
  }
  
  @scala.inline
  implicit class PipeOptionsOps[Self <: PipeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPreventAbort(value: scala.Boolean): Self = this.set("preventAbort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventAbort: Self = this.set("preventAbort", js.undefined)
    
    @scala.inline
    def setPreventCancel(value: scala.Boolean): Self = this.set("preventCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventCancel: Self = this.set("preventCancel", js.undefined)
    
    @scala.inline
    def setPreventClose(value: scala.Boolean): Self = this.set("preventClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventClose: Self = this.set("preventClose", js.undefined)
    
    @scala.inline
    def setSignal(value: AbortSignal): Self = this.set("signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
  }
}
