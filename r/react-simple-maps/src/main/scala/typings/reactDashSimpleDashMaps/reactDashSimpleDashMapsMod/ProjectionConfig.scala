package typings.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectionConfig extends js.Object {
  var precision: Double
  var rotation: js.Tuple3[Double, Double, Double]
  var scale: Double
  var xOffset: Double
  var yOffset: Double
}

object ProjectionConfig {
  @scala.inline
  def apply(
    precision: Double,
    rotation: js.Tuple3[Double, Double, Double],
    scale: Double,
    xOffset: Double,
    yOffset: Double
  ): ProjectionConfig = {
    val __obj = js.Dynamic.literal(precision = precision, rotation = rotation, scale = scale, xOffset = xOffset, yOffset = yOffset)
  
    __obj.asInstanceOf[ProjectionConfig]
  }
}

