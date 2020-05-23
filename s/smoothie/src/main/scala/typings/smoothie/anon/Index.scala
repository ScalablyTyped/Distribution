package typings.smoothie.anon

import typings.smoothie.mod.TimeSeries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index extends js.Object {
  var index: Double
  var series: TimeSeries
  var value: Double
}

object Index {
  @scala.inline
  def apply(index: Double, series: TimeSeries, value: Double): Index = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
}

