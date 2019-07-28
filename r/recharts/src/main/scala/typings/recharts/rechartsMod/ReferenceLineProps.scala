package typings.recharts.rechartsMod

import typings.react.reactMod.ReactElement
import typings.recharts.Anon_X1
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof recharts.recharts.PresentationAttributes<number | string, number | string> ]:? recharts.recharts.PresentationAttributes<number | string, number | string>[P]} */ trait ReferenceLineProps extends js.Object {
  var alwaysShow: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[Double | String] = js.undefined
  var ifOverflow: js.UndefOr[IfOverflowType] = js.undefined
  var isFront: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String | Double | ContentRenderer[_] | ReactElement] = js.undefined
  var shape: js.UndefOr[
    (ContentRenderer[
      EventAttributes with (Partial[PresentationAttributes[Double | String, Double | String]]) with Anon_X1
    ]) | ReactElement
  ] = js.undefined
  var viewBox: js.UndefOr[ViewBox] = js.undefined
  var x: js.UndefOr[Double | String] = js.undefined
  var xAxis: js.UndefOr[js.Object] = js.undefined
  var xAxisId: js.UndefOr[String | Double] = js.undefined
  var y: js.UndefOr[Double | String] = js.undefined
  var yAxis: js.UndefOr[js.Object] = js.undefined
  var yAxisId: js.UndefOr[String | Double] = js.undefined
}

object ReferenceLineProps {
  @scala.inline
  def apply(
    alwaysShow: js.UndefOr[Boolean] = js.undefined,
    className: Double | String = null,
    ifOverflow: IfOverflowType = null,
    isFront: js.UndefOr[Boolean] = js.undefined,
    label: String | Double | ContentRenderer[_] | ReactElement = null,
    shape: (ContentRenderer[
      EventAttributes with (Partial[PresentationAttributes[Double | String, Double | String]]) with Anon_X1
    ]) | ReactElement = null,
    viewBox: ViewBox = null,
    x: Double | String = null,
    xAxis: js.Object = null,
    xAxisId: String | Double = null,
    y: Double | String = null,
    yAxis: js.Object = null,
    yAxisId: String | Double = null
  ): ReferenceLineProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysShow)) __obj.updateDynamic("alwaysShow")(alwaysShow)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (ifOverflow != null) __obj.updateDynamic("ifOverflow")(ifOverflow)
    if (!js.isUndefined(isFront)) __obj.updateDynamic("isFront")(isFront)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis)
    if (xAxisId != null) __obj.updateDynamic("xAxisId")(xAxisId.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis)
    if (yAxisId != null) __obj.updateDynamic("yAxisId")(yAxisId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceLineProps]
  }
}

