package typings.reactVis.mod

import typings.reactVis.anon.Axes
import typings.reactVis.anon.Domain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadarChartProps extends js.Object {
  var animation: js.UndefOr[String | AnimationParam | Boolean] = js.native
  var className: js.UndefOr[String] = js.native
   // default: 'category'
  var colorRange: js.UndefOr[js.Array[String]] = js.native
   // default: ''
  var colorType: js.UndefOr[String] = js.native
   // default: ['#12939A','#79C7E3','#1A3177','#FF9833','#EF5D28']
  var data: js.Array[RadarChartPoint] = js.native
  var domains: js.Array[Domain] = js.native
  var height: Double = js.native
  var hideInnerMostValues: js.UndefOr[Boolean] = js.native
   // default: true
  var margin: js.UndefOr[Margin | Double] = js.native
  var startingAngle: js.UndefOr[Double] = js.native
   // default: 1.5707963267948966
  var style: js.UndefOr[Axes] = js.native
   // default: {'axes':{'line':{},'ticks':{},'text':{}},'labels':{'fontSize':10,'textAnchor':'middle'},'polygons':{'strokeWidth':0.5,'strokeOpacity':1,'fillOpacity':0.1}}
  var tickFormat: js.UndefOr[RVTickFormat] = js.native
  var width: Double = js.native
}

object RadarChartProps {
  @scala.inline
  def apply(data: js.Array[RadarChartPoint], domains: js.Array[Domain], height: Double, width: Double): RadarChartProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], domains = domains.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadarChartProps]
  }
  @scala.inline
  implicit class RadarChartPropsOps[Self <: RadarChartProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataVarargs(value: RadarChartPoint*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[RadarChartPoint]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainsVarargs(value: Domain*): Self = this.set("domains", js.Array(value :_*))
    @scala.inline
    def setDomains(value: js.Array[Domain]): Self = this.set("domains", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimation(value: String | AnimationParam | Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColorRangeVarargs(value: String*): Self = this.set("colorRange", js.Array(value :_*))
    @scala.inline
    def setColorRange(value: js.Array[String]): Self = this.set("colorRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorRange: Self = this.set("colorRange", js.undefined)
    @scala.inline
    def setColorType(value: String): Self = this.set("colorType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorType: Self = this.set("colorType", js.undefined)
    @scala.inline
    def setHideInnerMostValues(value: Boolean): Self = this.set("hideInnerMostValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideInnerMostValues: Self = this.set("hideInnerMostValues", js.undefined)
    @scala.inline
    def setMargin(value: Margin | Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setStartingAngle(value: Double): Self = this.set("startingAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartingAngle: Self = this.set("startingAngle", js.undefined)
    @scala.inline
    def setStyle(value: Axes): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTickFormat(value: /* tick */ js.Any => String): Self = this.set("tickFormat", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTickFormat: Self = this.set("tickFormat", js.undefined)
  }
  
}

