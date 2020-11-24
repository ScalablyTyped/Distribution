package typings.reactOverlays.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsePopper extends js.Object {
  
  var usePopper: Boolean = js.native
}
object UsePopper {
  
  @scala.inline
  def apply(usePopper: Boolean): UsePopper = {
    val __obj = js.Dynamic.literal(usePopper = usePopper.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsePopper]
  }
  
  @scala.inline
  implicit class UsePopperOps[Self <: UsePopper] (val x: Self) extends AnyVal {
    
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
    def setUsePopper(value: Boolean): Self = this.set("usePopper", value.asInstanceOf[js.Any])
  }
}
