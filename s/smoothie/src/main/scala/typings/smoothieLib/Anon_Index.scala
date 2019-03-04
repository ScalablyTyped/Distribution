package typings
package smoothieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index extends js.Object {
  var index: scala.Double
  var series: smoothieLib.smoothieMod.TimeSeries
  var value: scala.Double
}

object Anon_Index {
  @scala.inline
  def apply(index: scala.Double, series: smoothieLib.smoothieMod.TimeSeries, value: scala.Double): Anon_Index = {
    val __obj = js.Dynamic.literal(index = index, series = series, value = value)
  
    __obj.asInstanceOf[Anon_Index]
  }
}

