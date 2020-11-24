package typings.sentryBrowser.trycatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** JSDoc */
@js.native
trait TryCatchOptions extends js.Object {
  
  var XMLHttpRequest: Boolean = js.native
  
  var eventTarget: Boolean | js.Array[String] = js.native
  
  var requestAnimationFrame: Boolean = js.native
  
  var setInterval: Boolean = js.native
  
  var setTimeout: Boolean = js.native
}
object TryCatchOptions {
  
  @scala.inline
  def apply(
    XMLHttpRequest: Boolean,
    eventTarget: Boolean | js.Array[String],
    requestAnimationFrame: Boolean,
    setInterval: Boolean,
    setTimeout: Boolean
  ): TryCatchOptions = {
    val __obj = js.Dynamic.literal(XMLHttpRequest = XMLHttpRequest.asInstanceOf[js.Any], eventTarget = eventTarget.asInstanceOf[js.Any], requestAnimationFrame = requestAnimationFrame.asInstanceOf[js.Any], setInterval = setInterval.asInstanceOf[js.Any], setTimeout = setTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[TryCatchOptions]
  }
  
  @scala.inline
  implicit class TryCatchOptionsOps[Self <: TryCatchOptions] (val x: Self) extends AnyVal {
    
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
    def setEventTargetVarargs(value: String*): Self = this.set("eventTarget", js.Array(value :_*))
    
    @scala.inline
    def setEventTarget(value: Boolean | js.Array[String]): Self = this.set("eventTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestAnimationFrame(value: Boolean): Self = this.set("requestAnimationFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetInterval(value: Boolean): Self = this.set("setInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetTimeout(value: Boolean): Self = this.set("setTimeout", value.asInstanceOf[js.Any])
  }
}
