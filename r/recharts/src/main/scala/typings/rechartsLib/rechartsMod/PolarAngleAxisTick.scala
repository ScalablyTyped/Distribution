package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolarAngleAxisTick extends js.Object {
  var coordinate: scala.Double
  var value: js.Any
}

object PolarAngleAxisTick {
  @scala.inline
  def apply(coordinate: scala.Double, value: js.Any): PolarAngleAxisTick = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("coordinate")(coordinate)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[PolarAngleAxisTick]
  }
}

