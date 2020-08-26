package typings.reactNativeCalendars.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DotMarking extends Marking {
  var activeOpacity: js.UndefOr[Double] = js.native
  var disableTouchEvent: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var dotColor: js.UndefOr[String] = js.native
  var marked: js.UndefOr[Boolean] = js.native
  var selected: js.UndefOr[Boolean] = js.native
  var selectedColor: js.UndefOr[String] = js.native
}

object DotMarking {
  @scala.inline
  def apply(): DotMarking = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DotMarking]
  }
  @scala.inline
  implicit class DotMarkingOps[Self <: DotMarking] (val x: Self) extends AnyVal {
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
    def setActiveOpacity(value: Double): Self = this.set("activeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveOpacity: Self = this.set("activeOpacity", js.undefined)
    @scala.inline
    def setDisableTouchEvent(value: Boolean): Self = this.set("disableTouchEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableTouchEvent: Self = this.set("disableTouchEvent", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDotColor(value: String): Self = this.set("dotColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotColor: Self = this.set("dotColor", js.undefined)
    @scala.inline
    def setMarked(value: Boolean): Self = this.set("marked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarked: Self = this.set("marked", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setSelectedColor(value: String): Self = this.set("selectedColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedColor: Self = this.set("selectedColor", js.undefined)
  }
  
}

