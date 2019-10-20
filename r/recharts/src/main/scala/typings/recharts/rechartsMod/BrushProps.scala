package typings.recharts.rechartsMod

import typings.react.reactMod.ReactNode
import typings.std.Partial
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
  var padding: js.UndefOr[Partial[Margin]] = js.undefined
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
    endIndex: Int | Double = null,
    fill: String = null,
    gap: Int | Double = null,
    height: Int | Double = null,
    leaveTimeOut: Int | Double = null,
    onChange: /* repeated */ js.Any => Unit = null,
    padding: Partial[Margin] = null,
    startIndex: Int | Double = null,
    stroke: String = null,
    tickFormatter: /* value */ js.Any => js.Any = null,
    travellerWidth: Int | Double = null,
    updateId: String | Double = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): BrushProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey.asInstanceOf[js.Any])
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (leaveTimeOut != null) __obj.updateDynamic("leaveTimeOut")(leaveTimeOut.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (tickFormatter != null) __obj.updateDynamic("tickFormatter")(js.Any.fromFunction1(tickFormatter))
    if (travellerWidth != null) __obj.updateDynamic("travellerWidth")(travellerWidth.asInstanceOf[js.Any])
    if (updateId != null) __obj.updateDynamic("updateId")(updateId.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrushProps]
  }
}

