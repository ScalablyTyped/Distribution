package typings.sketchapp

import typings.sketchapp.sketchappStrings.styleReflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSStyleReflection extends js.Object {
  var _class: styleReflection
  var distance: Double
  var isEnabled: Double
  var strength: Double
}

object SketchMSStyleReflection {
  @scala.inline
  def apply(_class: styleReflection, distance: Double, isEnabled: Double, strength: Double): SketchMSStyleReflection = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], strength = strength.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SketchMSStyleReflection]
  }
}

