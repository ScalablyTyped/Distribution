package typings
package reactDashSimpleDashMapsLib.reactDashSimpleDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectionConfig extends js.Object {
  var precision: scala.Double
  var rotation: js.Tuple3[scala.Double, scala.Double, scala.Double]
  var scale: scala.Double
  var xOffset: scala.Double
  var yOffset: scala.Double
}

object ProjectionConfig {
  @scala.inline
  def apply(
    precision: scala.Double,
    rotation: js.Tuple3[scala.Double, scala.Double, scala.Double],
    scale: scala.Double,
    xOffset: scala.Double,
    yOffset: scala.Double
  ): ProjectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("precision")(precision)
    __obj.updateDynamic("rotation")(rotation)
    __obj.updateDynamic("scale")(scale)
    __obj.updateDynamic("xOffset")(xOffset)
    __obj.updateDynamic("yOffset")(yOffset)
    __obj.asInstanceOf[ProjectionConfig]
  }
}

