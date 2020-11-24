package typings.sketchapp

import typings.sketchapp.anon.X
import typings.sketchapp.sketchappStrings.styleBlur
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSStyleBlur extends js.Object {
  
  var _class: styleBlur = js.native
  
  var center: X = js.native
  
  var isEnabled: Double = js.native
  
  var motionAngle: Double = js.native
  
  var radius: Double = js.native
  
  var `type`: Double = js.native
}
object SketchMSStyleBlur {
  
  @scala.inline
  def apply(
    _class: styleBlur,
    center: X,
    isEnabled: Double,
    motionAngle: Double,
    radius: Double,
    `type`: Double
  ): SketchMSStyleBlur = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], motionAngle = motionAngle.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSStyleBlur]
  }
  
  @scala.inline
  implicit class SketchMSStyleBlurOps[Self <: SketchMSStyleBlur] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_class(value: styleBlur): Self = this.set("_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenter(value: X): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Double): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMotionAngle(value: Double): Self = this.set("motionAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
