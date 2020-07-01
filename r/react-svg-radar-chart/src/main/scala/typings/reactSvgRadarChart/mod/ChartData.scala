package typings.reactSvgRadarChart.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactSvgRadarChart.anon.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartData extends js.Object {
  var data: StringDictionary[Double]
  var meta: Color
}

object ChartData {
  @scala.inline
  def apply(data: StringDictionary[Double], meta: Color): ChartData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartData]
  }
}

