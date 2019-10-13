package typings.reactDashBootstrap.libPanelMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.reactDashBootstrap.reactDashBootstrapMod.SelectCallback
import typings.reactDashBootstrap.reactDashBootstrapMod.TransitionCallbacks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelProps
  extends AllHTMLAttributes[Panel]
     with TransitionCallbacks
     with ClassAttributes[Panel] {
  var bsStyle: js.UndefOr[String] = js.undefined
  var defaultExpanded: js.UndefOr[Boolean] = js.undefined
  var eventKey: js.UndefOr[js.Any] = js.undefined
  var expanded: js.UndefOr[Boolean] = js.undefined
  @JSName("onSelect")
  var onSelect_PanelProps: js.UndefOr[SelectCallback] = js.undefined
  var onToggle: js.UndefOr[SelectCallback] = js.undefined
}

object PanelProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[Panel] = null,
    ClassAttributes: ClassAttributes[Panel] = null,
    TransitionCallbacks: TransitionCallbacks = null,
    bsStyle: String = null,
    defaultExpanded: js.UndefOr[Boolean] = js.undefined,
    eventKey: js.Any = null,
    expanded: js.UndefOr[Boolean] = js.undefined,
    onSelect: SelectCallback = null,
    onToggle: SelectCallback = null
  ): PanelProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
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

