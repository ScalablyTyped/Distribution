package typings
package reactDashBootstrapLib.libPanelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelProps
  extends reactLib.reactMod.HTMLProps[Panel]
     with reactDashBootstrapLib.reactDashBootstrapMod.TransitionCallbacks {
  var bsStyle: js.UndefOr[java.lang.String] = js.undefined
  var defaultExpanded: js.UndefOr[scala.Boolean] = js.undefined
  var eventKey: js.UndefOr[js.Any] = js.undefined
  var expanded: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("onSelect")
  var onSelect_PanelProps: js.UndefOr[reactDashBootstrapLib.reactDashBootstrapMod.SelectCallback] = js.undefined
  var onToggle: js.UndefOr[reactDashBootstrapLib.reactDashBootstrapMod.SelectCallback] = js.undefined
}

object PanelProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[Panel] = null,
    TransitionCallbacks: reactDashBootstrapLib.reactDashBootstrapMod.TransitionCallbacks = null,
    bsStyle: java.lang.String = null,
    defaultExpanded: js.UndefOr[scala.Boolean] = js.undefined,
    eventKey: js.Any = null,
    expanded: js.UndefOr[scala.Boolean] = js.undefined,
    onSelect: reactDashBootstrapLib.reactDashBootstrapMod.SelectCallback = null,
    onToggle: reactDashBootstrapLib.reactDashBootstrapMod.SelectCallback = null
  ): PanelProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    js.Dynamic.global.Object.assign(__obj, TransitionCallbacks)
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle)
    if (!js.isUndefined(defaultExpanded)) __obj.updateDynamic("defaultExpanded")(defaultExpanded)
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey)
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (onToggle != null) __obj.updateDynamic("onToggle")(onToggle)
    __obj.asInstanceOf[PanelProps]
  }
}

