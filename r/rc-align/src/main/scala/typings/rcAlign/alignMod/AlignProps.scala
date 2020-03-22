package typings.rcAlign.alignMod

import typings.rcAlign.interfaceMod.AlignResult
import typings.rcAlign.interfaceMod.AlignType
import typings.rcAlign.interfaceMod.TargetType
import typings.react.mod.ReactElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlignProps extends js.Object {
  var align: AlignType
  var children: ReactElement
  var disabled: js.UndefOr[Boolean] = js.undefined
  var monitorBufferTime: js.UndefOr[Double] = js.undefined
  var monitorWindowResize: js.UndefOr[Boolean] = js.undefined
  var onAlign: js.UndefOr[OnAlign] = js.undefined
  var target: TargetType
}

object AlignProps {
  @scala.inline
  def apply(
    align: AlignType,
    children: ReactElement,
    target: TargetType,
    disabled: js.UndefOr[Boolean] = js.undefined,
    monitorBufferTime: Int | Double = null,
    monitorWindowResize: js.UndefOr[Boolean] = js.undefined,
    onAlign: (/* source */ HTMLElement, /* result */ AlignResult) => Unit = null
  ): AlignProps = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (monitorBufferTime != null) __obj.updateDynamic("monitorBufferTime")(monitorBufferTime.asInstanceOf[js.Any])
    if (!js.isUndefined(monitorWindowResize)) __obj.updateDynamic("monitorWindowResize")(monitorWindowResize.asInstanceOf[js.Any])
    if (onAlign != null) __obj.updateDynamic("onAlign")(js.Any.fromFunction2(onAlign))
    __obj.asInstanceOf[AlignProps]
  }
}

