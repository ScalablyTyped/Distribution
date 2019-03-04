package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarData extends js.Object {
  var height: scala.Double
  var radius: scala.Double | js.Array[_]
  var value: scala.Double | java.lang.String | js.Array[_]
  var width: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object BarData {
  @scala.inline
  def apply(
    height: scala.Double,
    radius: scala.Double | js.Array[_],
    value: scala.Double | java.lang.String | js.Array[_],
    width: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): BarData = {
    val __obj = js.Dynamic.literal(height = height, radius = radius.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], width = width, x = x, y = y)
  
    __obj.asInstanceOf[BarData]
  }
}

