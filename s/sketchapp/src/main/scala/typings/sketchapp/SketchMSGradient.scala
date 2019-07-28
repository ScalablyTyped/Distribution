package typings.sketchapp

import typings.sketchapp.sketchappStrings.gradient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSGradient extends js.Object {
  var _class: gradient
  var do_objectID: js.UndefOr[String] = js.undefined
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
    to: Anon_X,
    do_objectID: String = null
  ): SketchMSGradient = {
    val __obj = js.Dynamic.literal(_class = _class, elipseLength = elipseLength, from = from, gradientType = gradientType, shouldSmoothenOpacity = shouldSmoothenOpacity, stops = stops, to = to)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSGradient]
  }
}

