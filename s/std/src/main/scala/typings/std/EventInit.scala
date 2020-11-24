package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventInit extends js.Object {
  
  var bubbles: js.UndefOr[scala.Boolean] = js.native
  
  var cancelable: js.UndefOr[scala.Boolean] = js.native
  
  var composed: js.UndefOr[scala.Boolean] = js.native
}
object EventInit {
  
  @scala.inline
  def apply(): EventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventInit]
  }
  
  @scala.inline
  implicit class EventInitOps[Self <: EventInit] (val x: Self) extends AnyVal {
    
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
    def setBubbles(value: scala.Boolean): Self = this.set("bubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBubbles: Self = this.set("bubbles", js.undefined)
    
    @scala.inline
    def setCancelable(value: scala.Boolean): Self = this.set("cancelable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelable: Self = this.set("cancelable", js.undefined)
    
    @scala.inline
    def setComposed(value: scala.Boolean): Self = this.set("composed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComposed: Self = this.set("composed", js.undefined)
  }
}
