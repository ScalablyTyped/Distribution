package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrushProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Array[_]] = js.undefined
  var dataKey: js.UndefOr[DataKey] = js.undefined
  var endIndex: js.UndefOr[scala.Double] = js.undefined
  var fill: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var onChange: js.UndefOr[RechartsFunction] = js.undefined
  var padding: js.UndefOr[stdLib.Partial[Margin]] = js.undefined
  var startIndex: js.UndefOr[scala.Double] = js.undefined
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  var tickFormatter: js.UndefOr[TickFormatterFunction] = js.undefined
  var travellerWidth: js.UndefOr[scala.Double] = js.undefined
  var updateId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
  var x: js.UndefOr[scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
}

object BrushProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    data: js.Array[_] = null,
    dataKey: DataKey = null,
    endIndex: scala.Int | scala.Double = null,
    fill: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    onChange: RechartsFunction = null,
    padding: stdLib.Partial[Margin] = null,
    startIndex: scala.Int | scala.Double = null,
    stroke: java.lang.String = null,
    tickFormatter: TickFormatterFunction = null,
    travellerWidth: scala.Int | scala.Double = null,
    updateId: java.lang.String | scala.Double = null,
    width: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): BrushProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey.asInstanceOf[js.Any])
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (tickFormatter != null) __obj.updateDynamic("tickFormatter")(tickFormatter)
    if (travellerWidth != null) __obj.updateDynamic("travellerWidth")(travellerWidth.asInstanceOf[js.Any])
    if (updateId != null) __obj.updateDynamic("updateId")(updateId.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrushProps]
  }
}

