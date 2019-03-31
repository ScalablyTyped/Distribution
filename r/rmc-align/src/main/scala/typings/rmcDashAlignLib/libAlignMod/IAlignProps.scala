package typings
package rmcDashAlignLib.libAlignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAlignProps extends js.Object {
  var childrenProps: js.UndefOr[js.Object] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var monitorBufferTime: js.UndefOr[scala.Double] = js.undefined
  var monitorWindowResize: js.UndefOr[scala.Boolean] = js.undefined
  var onAlign: js.UndefOr[js.Function2[/* source */ js.Any, /* align */ js.Any, scala.Unit]] = js.undefined
  def target(): scala.Unit
}

object IAlignProps {
  @scala.inline
  def apply(
    target: () => scala.Unit,
    childrenProps: js.Object = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    monitorBufferTime: scala.Int | scala.Double = null,
    monitorWindowResize: js.UndefOr[scala.Boolean] = js.undefined,
    onAlign: (/* source */ js.Any, /* align */ js.Any) => scala.Unit = null
  ): IAlignProps = {
    val __obj = js.Dynamic.literal(target = js.Any.fromFunction0(target))
    if (childrenProps != null) __obj.updateDynamic("childrenProps")(childrenProps)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (monitorBufferTime != null) __obj.updateDynamic("monitorBufferTime")(monitorBufferTime.asInstanceOf[js.Any])
    if (!js.isUndefined(monitorWindowResize)) __obj.updateDynamic("monitorWindowResize")(monitorWindowResize)
    if (onAlign != null) __obj.updateDynamic("onAlign")(js.Any.fromFunction2(onAlign))
    __obj.asInstanceOf[IAlignProps]
  }
}

