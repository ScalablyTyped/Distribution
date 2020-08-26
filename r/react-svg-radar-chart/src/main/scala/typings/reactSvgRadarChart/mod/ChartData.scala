package typings.reactSvgRadarChart.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactSvgRadarChart.anon.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartData extends js.Object {
  var data: StringDictionary[Double] = js.native
  var meta: Color = js.native
}

object ChartData {
  @scala.inline
  def apply(data: StringDictionary[Double], meta: Color): ChartData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartData]
  }
  @scala.inline
  implicit class ChartDataOps[Self <: ChartData] (val x: Self) extends AnyVal {
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
    def setData(value: StringDictionary[Double]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeta(value: Color): Self = this.set("meta", value.asInstanceOf[js.Any])
  }
  
}

