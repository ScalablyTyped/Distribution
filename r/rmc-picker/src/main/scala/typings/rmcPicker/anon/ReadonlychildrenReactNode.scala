package typings.rmcPicker.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  children ? :react.react.ReactNode}> & std.Readonly<rmc-picker.rmc-picker/lib/MultiPickerProps.default> */
trait ReadonlychildrenReactNode extends js.Object {
  val children: js.UndefOr[ReactNode with js.Any] = js.undefined
  val className: js.UndefOr[String] = js.undefined
  val onScrollChange: js.UndefOr[js.Function2[/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double], Unit]] = js.undefined
  val onValueChange: js.UndefOr[js.Function2[/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double], Unit]] = js.undefined
  val prefixCls: js.UndefOr[String] = js.undefined
  val rootNativeProps: js.UndefOr[js.Any] = js.undefined
  val selectedValue: js.UndefOr[js.Array[_]] = js.undefined
  val style: js.UndefOr[js.Any] = js.undefined
}

object ReadonlychildrenReactNode {
  @scala.inline
  def apply(
    children: ReactNode with js.Any = null,
    className: String = null,
    onScrollChange: (/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double]) => Unit = null,
    onValueChange: (/* v */ js.UndefOr[js.Any], /* i */ js.UndefOr[Double]) => Unit = null,
    prefixCls: String = null,
    rootNativeProps: js.Any = null,
    selectedValue: js.Array[_] = null,
    style: js.Any = null
  ): ReadonlychildrenReactNode = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(js.Any.fromFunction2(onScrollChange))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction2(onValueChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (rootNativeProps != null) __obj.updateDynamic("rootNativeProps")(rootNativeProps.asInstanceOf[js.Any])
    if (selectedValue != null) __obj.updateDynamic("selectedValue")(selectedValue.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlychildrenReactNode]
  }
}

