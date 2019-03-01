package typings
package reactDashBootstrapLib.libPanelCollapseMod.PanelCollapseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelCollapseProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libPanelCollapseMod.PanelCollapse] {
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
  var onEnter: js.UndefOr[js.Function] = js.undefined
  var onEntered: js.UndefOr[js.Function] = js.undefined
  var onEntering: js.UndefOr[js.Function] = js.undefined
  var onExit: js.UndefOr[js.Function] = js.undefined
  var onExited: js.UndefOr[js.Function] = js.undefined
  var onExiting: js.UndefOr[js.Function] = js.undefined
}

object PanelCollapseProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libPanelCollapseMod.PanelCollapse] = null,
    bsClass: java.lang.String = null,
    onEnter: js.Function = null,
    onEntered: js.Function = null,
    onEntering: js.Function = null,
    onExit: js.Function = null,
    onExited: js.Function = null,
    onExiting: js.Function = null
  ): PanelCollapseProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter)
    if (onEntered != null) __obj.updateDynamic("onEntered")(onEntered)
    if (onEntering != null) __obj.updateDynamic("onEntering")(onEntering)
    if (onExit != null) __obj.updateDynamic("onExit")(onExit)
    if (onExited != null) __obj.updateDynamic("onExited")(onExited)
    if (onExiting != null) __obj.updateDynamic("onExiting")(onExiting)
    __obj.asInstanceOf[PanelCollapseProps]
  }
}

