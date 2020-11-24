package typings.sentryBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@sentry/browser.@sentry/browser/dist/integrations/trycatch.TryCatchOptions> */
@js.native
trait PartialTryCatchOptions extends js.Object {
  
  var XMLHttpRequest: js.UndefOr[Boolean] = js.native
  
  var eventTarget: js.UndefOr[Boolean | js.Array[String]] = js.native
  
  var requestAnimationFrame: js.UndefOr[Boolean] = js.native
  
  var setInterval: js.UndefOr[Boolean] = js.native
  
  var setTimeout: js.UndefOr[Boolean] = js.native
}
object PartialTryCatchOptions {
  
  @scala.inline
  def apply(): PartialTryCatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTryCatchOptions]
  }
  
  @scala.inline
  implicit class PartialTryCatchOptionsOps[Self <: PartialTryCatchOptions] (val x: Self) extends AnyVal {
    
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
    def setXMLHttpRequest(value: Boolean): Self = this.set("XMLHttpRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXMLHttpRequest: Self = this.set("XMLHttpRequest", js.undefined)
    
    @scala.inline
    def setEventTargetVarargs(value: String*): Self = this.set("eventTarget", js.Array(value :_*))
    
    @scala.inline
    def setEventTarget(value: Boolean | js.Array[String]): Self = this.set("eventTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTarget: Self = this.set("eventTarget", js.undefined)
    
    @scala.inline
    def setRequestAnimationFrame(value: Boolean): Self = this.set("requestAnimationFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestAnimationFrame: Self = this.set("requestAnimationFrame", js.undefined)
    
    @scala.inline
    def setSetInterval(value: Boolean): Self = this.set("setInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetInterval: Self = this.set("setInterval", js.undefined)
    
    @scala.inline
    def setSetTimeout(value: Boolean): Self = this.set("setTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetTimeout: Self = this.set("setTimeout", js.undefined)
  }
}
