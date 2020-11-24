package typings.rrc.mod

import typings.history.mod.Location
import typings.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnUpdateProps extends js.Object {
  
  var call: OnUpdateCall = js.native
  
  var immediate: js.UndefOr[Boolean] = js.native
}
object OnUpdateProps {
  
  @scala.inline
  def apply(call: /* location */ Location[LocationState] => Unit): OnUpdateProps = {
    val __obj = js.Dynamic.literal(call = js.Any.fromFunction1(call))
    __obj.asInstanceOf[OnUpdateProps]
  }
  
  @scala.inline
  implicit class OnUpdatePropsOps[Self <: OnUpdateProps] (val x: Self) extends AnyVal {
    
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
    def setCall(value: /* location */ Location[LocationState] => Unit): Self = this.set("call", js.Any.fromFunction1(value))
    
    @scala.inline
    def setImmediate(value: Boolean): Self = this.set("immediate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImmediate: Self = this.set("immediate", js.undefined)
  }
}
