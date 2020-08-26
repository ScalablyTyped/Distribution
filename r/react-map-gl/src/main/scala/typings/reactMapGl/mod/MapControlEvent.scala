package typings.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapControlEvent extends js.Object {
  var center: Center = js.native
  var delta: js.UndefOr[Double] = js.native
  var key: js.UndefOr[Double] = js.native
  var leftButton: js.UndefOr[Boolean] = js.native
  var middleButton: js.UndefOr[Boolean] = js.native
  var offsetCenter: Center = js.native
  var pointerType: js.UndefOr[String] = js.native
  var rightButton: js.UndefOr[Boolean] = js.native
  var srcEvent: js.Any = js.native
  var target: js.Any = js.native
  var `type`: String = js.native
}

object MapControlEvent {
  @scala.inline
  def apply(center: Center, offsetCenter: Center, srcEvent: js.Any, target: js.Any, `type`: String): MapControlEvent = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], offsetCenter = offsetCenter.asInstanceOf[js.Any], srcEvent = srcEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapControlEvent]
  }
  @scala.inline
  implicit class MapControlEventOps[Self <: MapControlEvent] (val x: Self) extends AnyVal {
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
    def setCenter(value: Center): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetCenter(value: Center): Self = this.set("offsetCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrcEvent(value: js.Any): Self = this.set("srcEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelta(value: Double): Self = this.set("delta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelta: Self = this.set("delta", js.undefined)
    @scala.inline
    def setKey(value: Double): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLeftButton(value: Boolean): Self = this.set("leftButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftButton: Self = this.set("leftButton", js.undefined)
    @scala.inline
    def setMiddleButton(value: Boolean): Self = this.set("middleButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMiddleButton: Self = this.set("middleButton", js.undefined)
    @scala.inline
    def setPointerType(value: String): Self = this.set("pointerType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointerType: Self = this.set("pointerType", js.undefined)
    @scala.inline
    def setRightButton(value: Boolean): Self = this.set("rightButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightButton: Self = this.set("rightButton", js.undefined)
  }
  
}

