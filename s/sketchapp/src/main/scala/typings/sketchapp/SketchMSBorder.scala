package typings.sketchapp

import typings.sketchapp.sketchappStrings.border
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSBorder extends StObject {
  
  var _class: border = js.native
  
  var color: SketchMSColor = js.native
  
  var fillType: SketchMSFillTypeEnum = js.native
  
  var isEnabled: Boolean = js.native
  
  var position: SketchMSBorderPositionEnum = js.native
  
  var thickness: Double = js.native
}
object SketchMSBorder {
  
  @scala.inline
  def apply(
    _class: border,
    color: SketchMSColor,
    fillType: SketchMSFillTypeEnum,
    isEnabled: Boolean,
    position: SketchMSBorderPositionEnum,
    thickness: Double
  ): SketchMSBorder = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], fillType = fillType.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSBorder]
  }
  
  @scala.inline
  implicit class SketchMSBorderMutableBuilder[Self <: SketchMSBorder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: SketchMSColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillType(value: SketchMSFillTypeEnum): Self = StObject.set(x, "fillType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: SketchMSBorderPositionEnum): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_class(value: border): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
