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
    val __obj = js.Dynamic.literal(precision = precision.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], xOffset = xOffset.asInstanceOf[js.Any], yOffset = yOffset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProjectionConfig]
  }
}

