package typings.recharts.mod

import typings.react.mod.ReactNode
import typings.recharts.anon.PartialMargin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrushProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Array[_]] = js.undefined
  var dataKey: js.UndefOr[DataKey] = js.undefined
  var endIndex: js.UndefOr[Double] = js.undefined
  var fill: js.UndefOr[String] = js.undefined
  var gap: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var leaveTimeOut: js.UndefOr[Double] = js.undefined
  var onChange: js.UndefOr[RechartsFunction] = js.undefined
  var padding: js.UndefOr[PartialMargin] = js.undefined
  var startIndex: js.UndefOr[Double] = js.undefined
  var stroke: js.UndefOr[String] = js.undefined
  var tickFormatter: js.UndefOr[TickFormatterFunction] = js.undefined
  var travellerWidth: js.UndefOr[Double] = js.undefined
  var updateId: js.UndefOr[String | Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object BrushProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    className: String = null,
    data: js.Array[_] = null,
    dataKey: DataKey = null,
    endIndex: js.UndefOr[Double] = js.undefined,
    fill: String = null,
    gap: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    leaveTimeOut: js.UndefOr[Double] = js.undefined,
    onChange: /* repeated */ js.Any => Unit = null,
    padding: PartialMargin = null,
    startIndex: js.UndefOr[Double] = js.undefined,
    stroke: String = null,
    tickFormatter: /* value */ js.Any => js.Any = null,
    travellerWidth: js.UndefOr[Double] = js.undefined,
    updateId: String | Double = null,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): BrushProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey.asInstanceOf[js.Any])
    if (!js.isUndefined(endIndex)) __obj.updateDynamic("endIndex")(endIndex.get.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(gap)) __obj.updateDynamic("gap")(gap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(leaveTimeOut)) __obj.updateDynamic("leaveTimeOut")(leaveTimeOut.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(startIndex)) __obj.updateDynamic("startIndex")(startIndex.get.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (tickFormatter != null) __obj.updateDynamic("tickFormatter")(js.Any.fromFunction1(tickFormatter))
    if (!js.isUndefined(travellerWidth)) __obj.updateDynamic("travellerWidth")(travellerWidth.get.asInstanceOf[js.Any])
    if (updateId != null) __obj.updateDynamic("updateId")(updateId.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrushProps]
  }
}

