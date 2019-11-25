package typings.sketchapp

import typings.sketchapp.sketchappStrings.gradient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSGradient extends js.Object {
  var _class: gradient
  var elipseLength: Double
  var from: Anon_X
  var gradientType: Double
  var shouldSmoothenOpacity: Boolean
  var stops: js.Array[SketchMSGradientStop]
  var to: Anon_X
}

object SketchMSGradient {
  @scala.inline
  def apply(
    _class: gradient,
    elipseLength: Double,
    from: Anon_X,
    gradientType: Double,
    shouldSmoothenOpacity: Boolean,
    stops: js.Array[SketchMSGradientStop],
    to: Anon_X
  ): SketchMSGradient = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], elipseLength = elipseLength.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], gradientType = gradientType.asInstanceOf[js.Any], shouldSmoothenOpacity = shouldSmoothenOpacity.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SketchMSGradient]
  }
}

