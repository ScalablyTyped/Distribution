package typings.senchaTouch.Ext.event

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEvent
  extends IBase
     with IDom {
  /** [Property] (Number) */
  var angle: js.UndefOr[Double] = js.native
  /** [Property] (Number) */
  var direction: js.UndefOr[Double] = js.native
  /** [Property] (Number) */
  var duration: js.UndefOr[Double] = js.native
  /** [Property] (Number) */
  var rotation: js.UndefOr[Double] = js.native
  /** [Property] (Number) */
  var scale: js.UndefOr[Double] = js.native
  /** [Method] Stop the event preventDefault and stopPropagation
    * @returns Ext.event.Event this
    */
  var stopEvent: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Cancels bubbling of the event
    * @returns Ext.event.Event this
    */
  var stopPropagation: js.UndefOr[js.Function0[this.type]] = js.native
}

object IEvent {
  @scala.inline
  def apply(): IEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEvent]
  }
  @scala.inline
  implicit class IEventOps[Self <: IEvent] (val x: Self) extends AnyVal {
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    @scala.inline
    def setDirection(value: Double): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setStopEvent(value: () => IEvent): Self = this.set("stopEvent", js.Any.fromFunction0(value))
    @scala.inline
    def deleteStopEvent: Self = this.set("stopEvent", js.undefined)
    @scala.inline
    def setStopPropagation(value: () => IEvent): Self = this.set("stopPropagation", js.Any.fromFunction0(value))
    @scala.inline
    def deleteStopPropagation: Self = this.set("stopPropagation", js.undefined)
  }
  
}

