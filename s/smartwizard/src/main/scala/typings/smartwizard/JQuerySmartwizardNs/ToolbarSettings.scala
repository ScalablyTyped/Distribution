package typings.smartwizard.JQuerySmartwizardNs

import typings.smartwizard.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarSettings extends js.Object {
  var showNextButton: js.UndefOr[Boolean] = js.undefined
  var showPreviousButton: js.UndefOr[Boolean] = js.undefined
  var toolbarButtonPosition: js.UndefOr[ToolbarButtonPosition] = js.undefined
  var toolbarExtraButtons: js.UndefOr[js.Array[JQuery]] = js.undefined
  var toolbarPosition: js.UndefOr[ToolbarPosition] = js.undefined
}

object ToolbarSettings {
  @scala.inline
  def apply(
    showNextButton: js.UndefOr[Boolean] = js.undefined,
    showPreviousButton: js.UndefOr[Boolean] = js.undefined,
    toolbarButtonPosition: ToolbarButtonPosition = null,
    toolbarExtraButtons: js.Array[JQuery] = null,
    toolbarPosition: ToolbarPosition = null
  ): ToolbarSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showNextButton)) __obj.updateDynamic("showNextButton")(showNextButton)
    if (!js.isUndefined(showPreviousButton)) __obj.updateDynamic("showPreviousButton")(showPreviousButton)
    if (toolbarButtonPosition != null) __obj.updateDynamic("toolbarButtonPosition")(toolbarButtonPosition)
    if (toolbarExtraButtons != null) __obj.updateDynamic("toolbarExtraButtons")(toolbarExtraButtons)
    if (toolbarPosition != null) __obj.updateDynamic("toolbarPosition")(toolbarPosition)
    __obj.asInstanceOf[ToolbarSettings]
  }
}

