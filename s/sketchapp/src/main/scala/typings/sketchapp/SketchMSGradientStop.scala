package typings.sketchapp

import typings.sketchapp.sketchappStrings.gradientStop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSGradientStop extends js.Object {
  var _class: gradientStop
  var color: SketchMSColor
  var do_objectID: js.UndefOr[String] = js.undefined
  var position: Double
}

object SketchMSGradientStop {
  @scala.inline
  def apply(_class: gradientStop, color: SketchMSColor, position: Double, do_objectID: String = null): SketchMSGradientStop = {
    val __obj = js.Dynamic.literal(_class = _class, color = color, position = position)
    if (do_objectID != null) __obj.updateDynamic("do_objectID")(do_objectID)
    __obj.asInstanceOf[SketchMSGradientStop]
  }
}

