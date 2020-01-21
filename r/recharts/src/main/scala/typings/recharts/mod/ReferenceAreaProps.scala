package typings.recharts.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof recharts.recharts.PresentationAttributes<number, number> ]:? recharts.recharts.PresentationAttributes<number, number>[P]} */ trait ReferenceAreaProps extends js.Object {
  var alwaysShow: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[Double | String] = js.undefined
  var ifOverflow: js.UndefOr[IfOverflowType] = js.undefined
  var isFront: js.UndefOr[Boolean] = js.undefined
  var shape: js.UndefOr[(ContentRenderer[ReferenceAreaProps with RectangleProps]) | ReactElement] = js.undefined
  var viewBox: js.UndefOr[ViewBox] = js.undefined
  var x1: js.UndefOr[Double | String] = js.undefined
  var x2: js.UndefOr[Double | String] = js.undefined
  var xAxis: js.UndefOr[js.Object] = js.undefined
  var xAxisId: js.UndefOr[String | Double] = js.undefined
  var y1: js.UndefOr[Double | String] = js.undefined
  var y2: js.UndefOr[Double | String] = js.undefined
  var yAxis: js.UndefOr[js.Object] = js.undefined
  var yAxisId: js.UndefOr[String | Double] = js.undefined
}

object ReferenceAreaProps {
  @scala.inline
  def apply(
    alwaysShow: js.UndefOr[Boolean] = js.undefined,
    className: Double | String = null,
    ifOverflow: IfOverflowType = null,
    isFront: js.UndefOr[Boolean] = js.undefined,
    shape: (ContentRenderer[ReferenceAreaProps with RectangleProps]) | ReactElement = null,
    viewBox: ViewBox = null,
    x1: Double | String = null,
    x2: Double | String = null,
    xAxis: js.Object = null,
    xAxisId: String | Double = null,
    y1: Double | String = null,
    y2: Double | String = null,
    yAxis: js.Object = null,
    yAxisId: String | Double = null
  ): ReferenceAreaProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysShow)) __obj.updateDynamic("alwaysShow")(alwaysShow.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (ifOverflow != null) __obj.updateDynamic("ifOverflow")(ifOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(isFront)) __obj.updateDynamic("isFront")(isFront.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    if (x1 != null) __obj.updateDynamic("x1")(x1.asInstanceOf[js.Any])
    if (x2 != null) __obj.updateDynamic("x2")(x2.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (xAxisId != null) __obj.updateDynamic("xAxisId")(xAxisId.asInstanceOf[js.Any])
    if (y1 != null) __obj.updateDynamic("y1")(y1.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    if (yAxisId != null) __obj.updateDynamic("yAxisId")(yAxisId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceAreaProps]
  }
}

