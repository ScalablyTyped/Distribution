package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSGradient extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.gradient
  var do_objectID: js.UndefOr[java.lang.String] = js.undefined
  var elipseLength: scala.Double
  var from: Anon_X
  var gradientType: scala.Double
  var shouldSmoothenOpacity: scala.Boolean
  var stops: js.Array[SketchMSGradientStop]
  var to: Anon_X
}

object SketchMSGradient {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.gradient,
    elipseLength: scala.Double,
    from: Anon_X,
    gradientType: scala.Double,
    shouldSmoothenOpacity: scala.Boolean,
    stops: js.Array[SketchMSGradientStop],
    to: Anon_X,
    do_objectID: java.lang.String = null
  ): SketchMSGradient = {
    val __obj = js.Dynamic.literal(_class = _class, elipseLength = elipseLength, from = from, gradientType = gradientType, shouldSmoothenOpacity = shouldSmoothenOpacity, stops = stops, to = to)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSGradient]
  }
}

