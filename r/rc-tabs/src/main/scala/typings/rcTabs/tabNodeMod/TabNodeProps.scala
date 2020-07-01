package typings.rcTabs.tabNodeMod

import typings.rcTabs.interfaceMod.EditableConfig
import typings.rcTabs.interfaceMod.Tab
import typings.rcTabs.interfaceMod.TabPosition
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabNodeProps extends js.Object {
  var active: Boolean
  var closable: js.UndefOr[Boolean] = js.undefined
  var editable: js.UndefOr[EditableConfig] = js.undefined
  var id: String
  var onClick: js.UndefOr[
    js.Function1[/* e */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], Unit]
  ] = js.undefined
  var onFocus: FocusEventHandler[Element]
  var onResize: js.UndefOr[
    js.Function4[/* width */ Double, /* height */ Double, /* left */ Double, /* top */ Double, Unit]
  ] = js.undefined
  var prefixCls: String
  var removeAriaLabel: js.UndefOr[String] = js.undefined
  var removeIcon: js.UndefOr[ReactNode] = js.undefined
  var renderWrapper: js.UndefOr[js.Function1[/* node */ ReactElement, ReactElement]] = js.undefined
  var rtl: Boolean
  var tab: Tab
  var tabBarGutter: js.UndefOr[Double] = js.undefined
  var tabPosition: TabPosition
  def onRemove(): Unit
}

object TabNodeProps {
  @scala.inline
  def apply(
    active: Boolean,
    id: String,
    onFocus: FocusEvent[Element] => Unit,
    onRemove: () => Unit,
    prefixCls: String,
    rtl: Boolean,
    tab: Tab,
    tabPosition: TabPosition,
    closable: js.UndefOr[Boolean] = js.undefined,
    editable: EditableConfig = null,
    onClick: /* e */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element] => Unit = null,
    onResize: (/* width */ Double, /* height */ Double, /* left */ Double, /* top */ Double) => Unit = null,
    removeAriaLabel: String = null,
    removeIcon: ReactNode = null,
    renderWrapper: /* node */ ReactElement => ReactElement = null,
    tabBarGutter: js.UndefOr[Double] = js.undefined
  ): TabNodeProps = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onFocus = js.Any.fromFunction1(onFocus), onRemove = js.Any.fromFunction0(onRemove), prefixCls = prefixCls.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any], tabPosition = tabPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.get.asInstanceOf[js.Any])
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction4(onResize))
    if (removeAriaLabel != null) __obj.updateDynamic("removeAriaLabel")(removeAriaLabel.asInstanceOf[js.Any])
    if (removeIcon != null) __obj.updateDynamic("removeIcon")(removeIcon.asInstanceOf[js.Any])
    if (renderWrapper != null) __obj.updateDynamic("renderWrapper")(js.Any.fromFunction1(renderWrapper))
    if (!js.isUndefined(tabBarGutter)) __obj.updateDynamic("tabBarGutter")(tabBarGutter.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabNodeProps]
  }
}

