package typings.reactVis.mod

import typings.reactVis.anon.Axes
import typings.reactVis.anon.Domain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadarChartProps extends js.Object {
  var animation: js.UndefOr[String | AnimationParam | Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
   // default: 'category'
  var colorRange: js.UndefOr[js.Array[String]] = js.undefined
   // default: ''
  var colorType: js.UndefOr[String] = js.undefined
   // default: ['#12939A','#79C7E3','#1A3177','#FF9833','#EF5D28']
  var data: js.Array[RadarChartPoint]
  var domains: js.Array[Domain]
  var height: Double
  var hideInnerMostValues: js.UndefOr[Boolean] = js.undefined
   // default: true
  var margin: js.UndefOr[Margin | Double] = js.undefined
  var startingAngle: js.UndefOr[Double] = js.undefined
   // default: 1.5707963267948966
  var style: js.UndefOr[Axes] = js.undefined
   // default: {'axes':{'line':{},'ticks':{},'text':{}},'labels':{'fontSize':10,'textAnchor':'middle'},'polygons':{'strokeWidth':0.5,'strokeOpacity':1,'fillOpacity':0.1}}
  var tickFormat: js.UndefOr[RVTickFormat] = js.undefined
  var width: Double
}

object RadarChartProps {
  @scala.inline
  def apply(
    data: js.Array[RadarChartPoint],
    domains: js.Array[Domain],
    height: Double,
    width: Double,
    animation: String | AnimationParam | Boolean = null,
    className: String = null,
    colorRange: js.Array[String] = null,
    colorType: String = null,
    hideInnerMostValues: js.UndefOr[Boolean] = js.undefined,
    margin: Margin | Double = null,
    startingAngle: js.UndefOr[Double] = js.undefined,
    style: Axes = null,
    tickFormat: /* tick */ js.Any => String = null
  ): RadarChartProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], domains = domains.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (colorRange != null) __obj.updateDynamic("colorRange")(colorRange.asInstanceOf[js.Any])
    if (colorType != null) __obj.updateDynamic("colorType")(colorType.asInstanceOf[js.Any])
    if (!js.isUndefined(hideInnerMostValues)) __obj.updateDynamic("hideInnerMostValues")(hideInnerMostValues.get.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(startingAngle)) __obj.updateDynamic("startingAngle")(startingAngle.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tickFormat != null) __obj.updateDynamic("tickFormat")(js.Any.fromFunction1(tickFormat))
    __obj.asInstanceOf[RadarChartProps]
  }
}

