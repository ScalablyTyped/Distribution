package typings.smoothie

import typings.smoothie.mod.TimeSeries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndex extends js.Object {
  var index: Double
  var series: TimeSeries
  var value: Double
}

object AnonIndex {
  @scala.inline
  def apply(index: Double, series: TimeSeries, value: Double): AnonIndex = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIndex]
  }
}

