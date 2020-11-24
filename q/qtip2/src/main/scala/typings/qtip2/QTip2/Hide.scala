package typings.qtip2.QTip2

import typings.qtip2.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Hide property
  */
@js.native
trait Hide extends js.Object {
  
  var delay: js.UndefOr[Double] = js.native
  
  var distance: js.UndefOr[Double | Boolean] = js.native
  
  var effect: js.UndefOr[Boolean | (js.Function1[/* offset */ js.Any, Unit])] = js.native
  
  var event: js.UndefOr[String | Boolean] = js.native
  
  var fixed: js.UndefOr[Boolean] = js.native
  
  var inactive: js.UndefOr[Double | Boolean] = js.native
  
  var leave: js.UndefOr[String | Boolean] = js.native
  
  var target: js.UndefOr[JQuery | Boolean] = js.native
}
object Hide {
  
  @scala.inline
  def apply(): Hide = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hide]
  }
  
  @scala.inline
  implicit class HideOps[Self <: Hide] (val x: Self) extends AnyVal {
    
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDistance(value: Double | Boolean): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    
    @scala.inline
    def setEffectFunction1(value: /* offset */ js.Any => Unit): Self = this.set("effect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEffect(value: Boolean | (js.Function1[/* offset */ js.Any, Unit])): Self = this.set("effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffect: Self = this.set("effect", js.undefined)
    
    @scala.inline
    def setEvent(value: String | Boolean): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setFixed(value: Boolean): Self = this.set("fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
    
    @scala.inline
    def setInactive(value: Double | Boolean): Self = this.set("inactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInactive: Self = this.set("inactive", js.undefined)
    
    @scala.inline
    def setLeave(value: String | Boolean): Self = this.set("leave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeave: Self = this.set("leave", js.undefined)
    
    @scala.inline
    def setTarget(value: JQuery | Boolean): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
