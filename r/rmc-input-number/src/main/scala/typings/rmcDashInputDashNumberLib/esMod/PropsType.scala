package typings
package rmcDashInputDashNumberLib.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType
  extends rmcDashInputDashNumberLib.esBaseMod.PropsType {
  var className: js.UndefOr[js.Any] = js.undefined
  var downHandler: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var focusOnUpDown: js.UndefOr[scala.Boolean] = js.undefined
  var formatter: js.UndefOr[js.Function1[/* v */ js.Any, scala.Unit]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var upHandler: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object PropsType {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    className: js.Any = null,
    defaultValue: scala.Int | scala.Double = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    downHandler: reactLib.reactMod.ReactNode = null,
    focusOnUpDown: js.UndefOr[scala.Boolean] = js.undefined,
    formatter: /* v */ js.Any => scala.Unit = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    onBlur: /* e */ js.Any => scala.Unit = null,
    onChange: /* e */ js.Any => scala.Unit = null,
    onFocus: /* e */ js.UndefOr[js.Any] => scala.Unit = null,
    parser: /* v */ js.Any => scala.Unit = null,
    precision: scala.Int | scala.Double = null,
    prefixCls: java.lang.String = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    step: java.lang.String | scala.Double = null,
    style: js.Any = null,
    tabIndex: scala.Int | scala.Double = null,
    upHandler: reactLib.reactMod.ReactNode = null,
    value: scala.Int | scala.Double = null
  ): PropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (downHandler != null) __obj.updateDynamic("downHandler")(downHandler.asInstanceOf[js.Any])
    if (!js.isUndefined(focusOnUpDown)) __obj.updateDynamic("focusOnUpDown")(focusOnUpDown)
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (parser != null) __obj.updateDynamic("parser")(js.Any.fromFunction1(parser))
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (upHandler != null) __obj.updateDynamic("upHandler")(upHandler.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
}

