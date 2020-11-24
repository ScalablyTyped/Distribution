package typings.sketchapp

import typings.sketchapp.sketchappStrings.color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSColor extends js.Object {
  
  var _class: color = js.native
  
  var alpha: Double = js.native
  
  var blue: Double = js.native
  
  var green: Double = js.native
  
  var red: Double = js.native
}
object SketchMSColor {
  
  @scala.inline
  def apply(_class: color, alpha: Double, blue: Double, green: Double, red: Double): SketchMSColor = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSColor]
  }
  
  @scala.inline
  implicit class SketchMSColorOps[Self <: SketchMSColor] (val x: Self) extends AnyVal {
    
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
    def set_class(value: color): Self = this.set("_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlue(value: Double): Self = this.set("blue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreen(value: Double): Self = this.set("green", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRed(value: Double): Self = this.set("red", value.asInstanceOf[js.Any])
  }
}
