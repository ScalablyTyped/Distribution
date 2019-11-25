package typings.sketchapp

import typings.sketchapp.sketchappStrings.styleBlur
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSStyleBlur extends js.Object {
  var _class: styleBlur
  var center: Anon_X
  var isEnabled: Double
  var motionAngle: Double
  var radius: Double
  var `type`: Double
}

object SketchMSStyleBlur {
  @scala.inline
  def apply(
    _class: styleBlur,
    center: Anon_X,
    isEnabled: Double,
    motionAngle: Double,
    radius: Double,
    `type`: Double
  ): SketchMSStyleBlur = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], motionAngle = motionAngle.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSStyleBlur]
  }
}

