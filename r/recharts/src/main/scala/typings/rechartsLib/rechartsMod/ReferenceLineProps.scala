package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof recharts.recharts.PresentationAttributes<number | string, number | string> ]:? recharts.recharts.PresentationAttributes<number | string, number | string>[P]} */ trait ReferenceLineProps extends js.Object {
  var alwaysShow: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var ifOverflow: js.UndefOr[IfOverflowType] = js.undefined
  var isFront: js.UndefOr[scala.Boolean] = js.undefined
  var label: js.UndefOr[
    java.lang.String | scala.Double | ContentRenderer[_] | reactLib.reactMod.ReactNs.ReactElement[_]
  ] = js.undefined
  var shape: js.UndefOr[
    (ContentRenderer[
      EventAttributes with (stdLib.Partial[
        PresentationAttributes[scala.Double | java.lang.String, scala.Double | java.lang.String]
      ]) with rechartsLib.Anon_X1
    ]) | reactLib.reactMod.ReactNs.ReactElement[_]
  ] = js.undefined
  var viewBox: js.UndefOr[ViewBox] = js.undefined
  var x: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var xAxis: js.UndefOr[js.Object] = js.undefined
  var xAxisId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var yAxis: js.UndefOr[js.Object] = js.undefined
  var yAxisId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object ReferenceLineProps {
  @scala.inline
  def apply(
    alwaysShow: js.UndefOr[scala.Boolean] = js.undefined,
    className: scala.Double | java.lang.String = null,
    ifOverflow: IfOverflowType = null,
    isFront: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String | scala.Double | ContentRenderer[_] | reactLib.reactMod.ReactNs.ReactElement[_] = null,
    shape: (ContentRenderer[
      EventAttributes with (stdLib.Partial[
        PresentationAttributes[scala.Double | java.lang.String, scala.Double | java.lang.String]
      ]) with rechartsLib.Anon_X1
    ]) | reactLib.reactMod.ReactNs.ReactElement[_] = null,
    viewBox: ViewBox = null,
    x: scala.Double | java.lang.String = null,
    xAxis: js.Object = null,
    xAxisId: java.lang.String | scala.Double = null,
    y: scala.Double | java.lang.String = null,
    yAxis: js.Object = null,
    yAxisId: java.lang.String | scala.Double = null
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

