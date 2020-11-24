package typings.qtip2.QTip2

import typings.qtip2.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Show property
  */
@js.native
trait Show extends js.Object {
  
  var delay: js.UndefOr[Double] = js.native
  
  var effect: js.UndefOr[Boolean | (js.Function1[/* offset */ js.Any, Unit])] = js.native
  
  var event: js.UndefOr[String | Boolean] = js.native
  
  var modal: js.UndefOr[Boolean | Modal] = js.native
  
  var ready: js.UndefOr[Boolean] = js.native
  
  var solo: js.UndefOr[JQuery | String | Boolean] = js.native
  
  var target: js.UndefOr[JQuery | Boolean] = js.native
}
object Show {
  
  @scala.inline
  def apply(): Show = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Show]
  }
  
  @scala.inline
  implicit class ShowOps[Self <: Show] (val x: Self) extends AnyVal {
    
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
    def setModal(value: Boolean | Modal): Self = this.set("modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    
    @scala.inline
    def setReady(value: Boolean): Self = this.set("ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
    
    @scala.inline
    def setSolo(value: JQuery | String | Boolean): Self = this.set("solo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSolo: Self = this.set("solo", js.undefined)
    
    @scala.inline
    def setTarget(value: JQuery | Boolean): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
