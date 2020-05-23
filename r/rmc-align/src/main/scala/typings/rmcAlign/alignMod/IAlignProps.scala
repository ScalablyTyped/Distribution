package typings.rmcAlign.alignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAlignProps extends js.Object {
  var childrenProps: js.UndefOr[js.Object] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var monitorBufferTime: js.UndefOr[Double] = js.undefined
  var monitorWindowResize: js.UndefOr[Boolean] = js.undefined
  var onAlign: js.UndefOr[js.Function2[/* source */ js.Any, /* align */ js.Any, Unit]] = js.undefined
  def target(): Unit
}

object IAlignProps {
  @scala.inline
  def apply(
    target: () => Unit,
    childrenProps: js.Object = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    monitorBufferTime: js.UndefOr[Double] = js.undefined,
    monitorWindowResize: js.UndefOr[Boolean] = js.undefined,
    onAlign: (/* source */ js.Any, /* align */ js.Any) => Unit = null
  ): IAlignProps = {
    val __obj = js.Dynamic.literal(target = js.Any.fromFunction0(target))
    if (childrenProps != null) __obj.updateDynamic("childrenProps")(childrenProps.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(monitorBufferTime)) __obj.updateDynamic("monitorBufferTime")(monitorBufferTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(monitorWindowResize)) __obj.updateDynamic("monitorWindowResize")(monitorWindowResize.get.asInstanceOf[js.Any])
    if (onAlign != null) __obj.updateDynamic("onAlign")(js.Any.fromFunction2(onAlign))
    __obj.asInstanceOf[IAlignProps]
  }
}

