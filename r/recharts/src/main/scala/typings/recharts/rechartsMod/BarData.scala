package typings.recharts.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarData extends js.Object {
  var height: Double
  var radius: Double | js.Array[_]
  var value: Double | String | js.Array[_]
  var width: Double
  var x: Double
  var y: Double
}

object BarData {
  @scala.inline
  def apply(
    height: Double,
    radius: Double | js.Array[_],
    value: Double | String | js.Array[_],
    width: Double,
    x: Double,
    y: Double
  ): BarData = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BarData]
  }
}

