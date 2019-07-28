package typings.smoothie

import typings.smoothie.smoothieMod.TimeSeries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index extends js.Object {
  var index: Double
  var series: TimeSeries
  var value: Double
}

object Anon_Index {
  @scala.inline
  def apply(index: Double, series: TimeSeries, value: Double): Anon_Index = {
    val __obj = js.Dynamic.literal(index = index, series = series, value = value)
  
    __obj.asInstanceOf[Anon_Index]
  }
}

