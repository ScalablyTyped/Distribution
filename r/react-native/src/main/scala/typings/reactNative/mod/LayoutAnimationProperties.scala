package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutAnimationProperties extends StObject {
  
  var opacity: String
  
  var scaleXY: String
}
object LayoutAnimationProperties {
  
  @scala.inline
  def apply(opacity: String, scaleXY: String): LayoutAnimationProperties = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any], scaleXY = scaleXY.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutAnimationProperties]
  }
  
  @scala.inline
  implicit class LayoutAnimationPropertiesMutableBuilder[Self <: LayoutAnimationProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpacity(value: String): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleXY(value: String): Self = StObject.set(x, "scaleXY", value.asInstanceOf[js.Any])
  }
}
