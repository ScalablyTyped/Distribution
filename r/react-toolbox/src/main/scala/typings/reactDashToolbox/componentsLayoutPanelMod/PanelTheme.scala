package typings.reactDashToolbox.componentsLayoutPanelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelTheme extends js.Object {
  /**
    * Used in the root class in case the panel has bodyScroll.
    */
  var bodyScroll: js.UndefOr[String] = js.undefined
  /**
    * Used as the root class of the panel component.
    */
  var panel: js.UndefOr[String] = js.undefined
}

object PanelTheme {
  @scala.inline
  def apply(bodyScroll: String = null, panel: String = null): PanelTheme = {
    val __obj = js.Dynamic.literal()
    if (bodyScroll != null) __obj.updateDynamic("bodyScroll")(bodyScroll.asInstanceOf[js.Any])
    if (panel != null) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanelTheme]
  }
}

