package typings.reactWait.mod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaitingContextWaitProps extends js.Object {
  
  var fallback: Element = js.native
}
object WaitingContextWaitProps {
  
  @scala.inline
  def apply(fallback: Element): WaitingContextWaitProps = {
    val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitingContextWaitProps]
  }
  
  @scala.inline
  implicit class WaitingContextWaitPropsOps[Self <: WaitingContextWaitProps] (val x: Self) extends AnyVal {
    
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
    def setFallback(value: Element): Self = this.set("fallback", value.asInstanceOf[js.Any])
  }
}
