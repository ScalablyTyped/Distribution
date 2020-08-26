package typings.smartwizard.JQuerySmartwizard

import typings.smartwizard.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarSettings extends js.Object {
  var showNextButton: js.UndefOr[Boolean] = js.native
  var showPreviousButton: js.UndefOr[Boolean] = js.native
  var toolbarButtonPosition: js.UndefOr[ToolbarButtonPosition] = js.native
  var toolbarExtraButtons: js.UndefOr[js.Array[JQuery]] = js.native
  var toolbarPosition: js.UndefOr[ToolbarPosition] = js.native
}

object ToolbarSettings {
  @scala.inline
  def apply(): ToolbarSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarSettings]
  }
  @scala.inline
  implicit class ToolbarSettingsOps[Self <: ToolbarSettings] (val x: Self) extends AnyVal {
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
    def setShowNextButton(value: Boolean): Self = this.set("showNextButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowNextButton: Self = this.set("showNextButton", js.undefined)
    @scala.inline
    def setShowPreviousButton(value: Boolean): Self = this.set("showPreviousButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowPreviousButton: Self = this.set("showPreviousButton", js.undefined)
    @scala.inline
    def setToolbarButtonPosition(value: ToolbarButtonPosition): Self = this.set("toolbarButtonPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbarButtonPosition: Self = this.set("toolbarButtonPosition", js.undefined)
    @scala.inline
    def setToolbarExtraButtonsVarargs(value: JQuery*): Self = this.set("toolbarExtraButtons", js.Array(value :_*))
    @scala.inline
    def setToolbarExtraButtons(value: js.Array[JQuery]): Self = this.set("toolbarExtraButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbarExtraButtons: Self = this.set("toolbarExtraButtons", js.undefined)
    @scala.inline
    def setToolbarPosition(value: ToolbarPosition): Self = this.set("toolbarPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbarPosition: Self = this.set("toolbarPosition", js.undefined)
  }
  
}

