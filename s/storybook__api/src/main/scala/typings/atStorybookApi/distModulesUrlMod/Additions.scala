package typings.atStorybookApi.distModulesUrlMod

import typings.atStorybookApi.distModulesLayoutMod.PanelPositions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Additions extends js.Object {
  var isFullscreen: js.UndefOr[Boolean] = js.undefined
  var panelPosition: js.UndefOr[PanelPositions] = js.undefined
  var selectedPanel: js.UndefOr[String] = js.undefined
  var showNav: js.UndefOr[Boolean] = js.undefined
  var showPanel: js.UndefOr[Boolean] = js.undefined
}

object Additions {
  @scala.inline
  def apply(
    isFullscreen: js.UndefOr[Boolean] = js.undefined,
    panelPosition: PanelPositions = null,
    selectedPanel: String = null,
    showNav: js.UndefOr[Boolean] = js.undefined,
    showPanel: js.UndefOr[Boolean] = js.undefined
  ): Additions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isFullscreen)) __obj.updateDynamic("isFullscreen")(isFullscreen)
    if (panelPosition != null) __obj.updateDynamic("panelPosition")(panelPosition)
    if (selectedPanel != null) __obj.updateDynamic("selectedPanel")(selectedPanel)
    if (!js.isUndefined(showNav)) __obj.updateDynamic("showNav")(showNav)
    if (!js.isUndefined(showPanel)) __obj.updateDynamic("showPanel")(showPanel)
    __obj.asInstanceOf[Additions]
  }
}

