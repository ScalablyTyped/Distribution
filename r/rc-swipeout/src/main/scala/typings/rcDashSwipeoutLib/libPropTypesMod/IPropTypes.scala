package typings
package rcDashSwipeoutLib.libPropTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropTypes extends js.Object {
  var autoClose: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var left: js.UndefOr[js.Array[rcDashSwipeoutLib.Anon_ClassName]] = js.undefined
  var onClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onOpen: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var right: js.UndefOr[js.Array[rcDashSwipeoutLib.Anon_ClassName]] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
}

object IPropTypes {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    left: js.Array[rcDashSwipeoutLib.Anon_ClassName] = null,
    onClose: js.Function0[scala.Unit] = null,
    onOpen: js.Function0[scala.Unit] = null,
    prefixCls: java.lang.String = null,
    right: js.Array[rcDashSwipeoutLib.Anon_ClassName] = null,
    style: js.Any = null
  ): IPropTypes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (left != null) __obj.updateDynamic("left")(left)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (right != null) __obj.updateDynamic("right")(right)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[IPropTypes]
  }
}

