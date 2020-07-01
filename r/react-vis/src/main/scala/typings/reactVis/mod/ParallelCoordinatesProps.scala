package typings.reactVis.mod

import typings.reactVis.anon.Domain
import typings.reactVis.anon.Labels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParallelCoordinatesProps extends js.Object {
  var animation: js.UndefOr[String | AnimationParam | Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
   // default: 'category'
  var colorRange: js.UndefOr[js.Array[String]] = js.undefined
   // default: ''
  var colorType: js.UndefOr[String] = js.undefined
   // default: ['#12939A','#79C7E3','#1A3177','#FF9833','#EF5D28']
  var data: js.Array[ParallelCoordinatesPoint]
  var domains: js.Array[Domain]
  var height: Double
  var margin: js.UndefOr[Margin | Double] = js.undefined
   // default: {'axes':{'line':{},'ticks':{},'text':{}},'labels':{'fontSize':10,'textAnchor':'middle'},'lines':{'strokeWidth':1,'strokeOpacity':1}}
  var showMarks: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[Labels] = js.undefined
  var tickFormat: js.UndefOr[RVTickFormat] = js.undefined
  var width: Double
}

object ParallelCoordinatesProps {
  @scala.inline
  def apply(
    data: js.Array[ParallelCoordinatesPoint],
    domains: js.Array[Domain],
    height: Double,
    width: Double,
    animation: String | AnimationParam | Boolean = null,
    className: String = null,
    colorRange: js.Array[String] = null,
    colorType: String = null,
    margin: Margin | Double = null,
    showMarks: js.UndefOr[Boolean] = js.undefined,
    style: Labels = null,
    tickFormat: /* tick */ js.Any => String = null
  ): ParallelCoordinatesProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], domains = domains.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (colorRange != null) __obj.updateDynamic("colorRange")(colorRange.asInstanceOf[js.Any])
    if (colorType != null) __obj.updateDynamic("colorType")(colorType.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(showMarks)) __obj.updateDynamic("showMarks")(showMarks.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tickFormat != null) __obj.updateDynamic("tickFormat")(js.Any.fromFunction1(tickFormat))
    __obj.asInstanceOf[ParallelCoordinatesProps]
  }
}

