package typings.reactOverlays.overlayMod

import typings.reactOverlays.anon.Arialabelledby
import typings.reactOverlays.anon.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayRenderProps extends js.Object {
  var arrowProps: Ref = js.native
  var outOfBoundaries: js.UndefOr[Boolean] = js.native
  var placement: Placements = js.native
  var props: Arialabelledby = js.native
  var show: Boolean = js.native
  def scheduleUpdate(): Unit = js.native
}

object OverlayRenderProps {
  @scala.inline
  def apply(
    arrowProps: Ref,
    placement: Placements,
    props: Arialabelledby,
    scheduleUpdate: () => Unit,
    show: Boolean
  ): OverlayRenderProps = {
    val __obj = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], scheduleUpdate = js.Any.fromFunction0(scheduleUpdate), show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayRenderProps]
  }
  @scala.inline
  implicit class OverlayRenderPropsOps[Self <: OverlayRenderProps] (val x: Self) extends AnyVal {
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
    def setArrowProps(value: Ref): Self = this.set("arrowProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlacement(value: Placements): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def setProps(value: Arialabelledby): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def setScheduleUpdate(value: () => Unit): Self = this.set("scheduleUpdate", js.Any.fromFunction0(value))
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutOfBoundaries(value: Boolean): Self = this.set("outOfBoundaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutOfBoundaries: Self = this.set("outOfBoundaries", js.undefined)
  }
  
}

