package typings.reactMdStates.reducerMod

import typings.reactMdStates.typesMod.RippleState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnteredAction
  extends RippleStateAction[js.Any] {
  
  var ripple: RippleState = js.native
  
  var `type`: /* "ENTERED" */ String = js.native
}
object EnteredAction {
  
  @scala.inline
  def apply(ripple: RippleState, `type`: /* "ENTERED" */ String): EnteredAction = {
    val __obj = js.Dynamic.literal(ripple = ripple.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnteredAction]
  }
  
  @scala.inline
  implicit class EnteredActionOps[Self <: EnteredAction] (val x: Self) extends AnyVal {
    
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
    def setRipple(value: RippleState): Self = this.set("ripple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: /* "ENTERED" */ String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
