package typings
package reactDashToolboxLib.libLayoutPanelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelTheme extends js.Object {
  /**
    * Used in the root class in case the panel has bodyScroll.
    */
  var bodyScroll: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used as the root class of the panel component.
    */
  var panel: js.UndefOr[java.lang.String] = js.undefined
}

object PanelTheme {
  @scala.inline
  def apply(bodyScroll: java.lang.String = null, panel: java.lang.String = null): PanelTheme = {
    val __obj = js.Dynamic.literal()
    if (bodyScroll != null) __obj.updateDynamic("bodyScroll")(bodyScroll)
    if (panel != null) __obj.updateDynamic("panel")(panel)
    __obj.asInstanceOf[PanelTheme]
  }
}

