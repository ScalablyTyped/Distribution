package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof recharts.recharts.PresentationAttributes<number, number> ]:? recharts.recharts.PresentationAttributes<number, number>[P]} */ trait CartesianGridProps extends js.Object {
  var chartHeight: js.UndefOr[scala.Double] = js.undefined
  var chartWidth: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var horizontal: js.UndefOr[
    js.Object | reactLib.reactMod.ReactElement[_] | (ContentRenderer[LineProps with CartesianGridProps]) | scala.Boolean
  ] = js.undefined
  var horizontalCoordinatesGenerator: js.UndefOr[CoordinatesGenerator] = js.undefined
  var horizontalFill: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var horizontalPoints: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var offset: js.UndefOr[js.Object] = js.undefined
  var vertical: js.UndefOr[
    js.Object | reactLib.reactMod.ReactElement[_] | (ContentRenderer[LineProps with CartesianGridProps]) | scala.Boolean
  ] = js.undefined
  var verticalCoordinatesGenerator: js.UndefOr[CoordinatesGenerator] = js.undefined
  var verticalFill: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var verticalPoints: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
  var xAxis: js.UndefOr[js.Object] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
  var yAxis: js.UndefOr[js.Object] = js.undefined
}

object CartesianGridProps {
  @scala.inline
  def apply(
    chartHeight: scala.Int | scala.Double = null,
    chartWidth: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    horizontal: js.Object | reactLib.reactMod.ReactElement[_] | (ContentRenderer[LineProps with CartesianGridProps]) | scala.Boolean = null,
    horizontalCoordinatesGenerator: CoordinatesGenerator = null,
    horizontalFill: js.Array[java.lang.String] = null,
    horizontalPoints: js.Array[scala.Double] = null,
    offset: js.Object = null,
    vertical: js.Object | reactLib.reactMod.ReactElement[_] | (ContentRenderer[LineProps with CartesianGridProps]) | scala.Boolean = null,
    verticalCoordinatesGenerator: CoordinatesGenerator = null,
    verticalFill: js.Array[java.lang.String] = null,
    verticalPoints: js.Array[scala.Double] = null,
    width: scala.Int | scala.Double = null,
    xAxis: js.Object = null,
    y: scala.Int | scala.Double = null,
    yAxis: js.Object = null
  ): CartesianGridProps = {
    val __obj = js.Dynamic.literal()
    if (chartHeight != null) __obj.updateDynamic("chartHeight")(chartHeight.asInstanceOf[js.Any])
    if (chartWidth != null) __obj.updateDynamic("chartWidth")(chartWidth.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (horizontalCoordinatesGenerator != null) __obj.updateDynamic("horizontalCoordinatesGenerator")(horizontalCoordinatesGenerator)
    if (horizontalFill != null) __obj.updateDynamic("horizontalFill")(horizontalFill)
    if (horizontalPoints != null) __obj.updateDynamic("horizontalPoints")(horizontalPoints)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (verticalCoordinatesGenerator != null) __obj.updateDynamic("verticalCoordinatesGenerator")(verticalCoordinatesGenerator)
    if (verticalFill != null) __obj.updateDynamic("verticalFill")(verticalFill)
    if (verticalPoints != null) __obj.updateDynamic("verticalPoints")(verticalPoints)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis)
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis)
    __obj.asInstanceOf[CartesianGridProps]
  }
}

