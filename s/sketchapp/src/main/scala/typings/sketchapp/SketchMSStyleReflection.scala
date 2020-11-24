package typings.sketchapp

import typings.sketchapp.sketchappStrings.styleReflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSStyleReflection extends js.Object {
  
  var _class: styleReflection = js.native
  
  var distance: Double = js.native
  
  var isEnabled: Double = js.native
  
  var strength: Double = js.native
}
object SketchMSStyleReflection {
  
  @scala.inline
  def apply(_class: styleReflection, distance: Double, isEnabled: Double, strength: Double): SketchMSStyleReflection = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], strength = strength.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSStyleReflection]
  }
  
  @scala.inline
  implicit class SketchMSStyleReflectionOps[Self <: SketchMSStyleReflection] (val x: Self) extends AnyVal {
    
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
    def set_class(value: styleReflection): Self = this.set("_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Double): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrength(value: Double): Self = this.set("strength", value.asInstanceOf[js.Any])
  }
}
