package typings.rcDashCheckbox.rcDashCheckboxMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.MouseEvent
import typings.std.Event
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var checked: js.UndefOr[Double | Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var defaultChecked: js.UndefOr[Double | Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLInputElement], Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLInputElement, NativeMouseEvent], Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLInputElement], Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tabIndex: js.UndefOr[String | Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    checked: Double | Boolean = null,
    className: String = null,
    defaultChecked: Double | Boolean = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    name: String = null,
    onBlur: /* e */ FocusEvent[HTMLInputElement] => Unit = null,
    onChange: /* e */ Event => Unit = null,
    onClick: /* e */ MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit = null,
    onFocus: /* e */ FocusEvent[HTMLInputElement] => Unit = null,
    prefixCls: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    tabIndex: String | Double = null,
    `type`: String = null,
    value: js.Any = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (checked != null) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultChecked != null) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Props]
  }
}

