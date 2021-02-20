package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaledSize extends StObject {
  
  var fontScale: Double = js.native
  
  var height: Double = js.native
  
  var scale: Double = js.native
  
  var width: Double = js.native
}
object ScaledSize {
  
  @scala.inline
  def apply(fontScale: Double, height: Double, scale: Double, width: Double): ScaledSize = {
    val __obj = js.Dynamic.literal(fontScale = fontScale.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaledSize]
  }
  
  @scala.inline
  implicit class ScaledSizeMutableBuilder[Self <: ScaledSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFontScale(value: Double): Self = StObject.set(x, "fontScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
