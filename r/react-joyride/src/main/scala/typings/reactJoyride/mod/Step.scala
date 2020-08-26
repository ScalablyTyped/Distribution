package typings.reactJoyride.mod

import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Step extends CommonProps {
  var content: ReactNode = js.native
  var disableBeacon: js.UndefOr[Boolean] = js.native
  var event: js.UndefOr[String] = js.native
  var hideCloseButton: js.UndefOr[Boolean] = js.native
  var hideFooter: js.UndefOr[Boolean] = js.native
  var isFixed: js.UndefOr[Boolean] = js.native
  var offset: js.UndefOr[Double] = js.native
  var placement: js.UndefOr[Placement] = js.native
  var placementBeacon: js.UndefOr[PlacementBeacon] = js.native
  var target: String | HTMLElement = js.native
  var title: js.UndefOr[ReactNode] = js.native
}

object Step {
  @scala.inline
  def apply(target: String | HTMLElement): Step = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Step]
  }
  @scala.inline
  implicit class StepOps[Self <: Step] (val x: Self) extends AnyVal {
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
    def setTarget(value: String | HTMLElement): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: ReactNode): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDisableBeacon(value: Boolean): Self = this.set("disableBeacon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableBeacon: Self = this.set("disableBeacon", js.undefined)
    @scala.inline
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setHideCloseButton(value: Boolean): Self = this.set("hideCloseButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideCloseButton: Self = this.set("hideCloseButton", js.undefined)
    @scala.inline
    def setHideFooter(value: Boolean): Self = this.set("hideFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideFooter: Self = this.set("hideFooter", js.undefined)
    @scala.inline
    def setIsFixed(value: Boolean): Self = this.set("isFixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFixed: Self = this.set("isFixed", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setPlacement(value: Placement): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setPlacementBeacon(value: PlacementBeacon): Self = this.set("placementBeacon", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacementBeacon: Self = this.set("placementBeacon", js.undefined)
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

