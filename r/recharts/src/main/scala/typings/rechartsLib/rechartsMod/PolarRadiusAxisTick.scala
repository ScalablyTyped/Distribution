package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolarRadiusAxisTick extends js.Object {
  var coordinate: scala.Double
  var value: js.Any
}

object PolarRadiusAxisTick {
  @scala.inline
  def apply(coordinate: scala.Double, value: js.Any): PolarRadiusAxisTick = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("coordinate")(coordinate)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[PolarRadiusAxisTick]
  }
}

