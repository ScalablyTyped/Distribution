package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ prop in react-native.react-native.LayoutAnimationProperty ]: prop} */
trait LayoutAnimationProperties extends StObject {
  
  var opacity: "opacity"
  
  var scaleX: "scaleX"
  
  var scaleXY: "scaleXY"
  
  var scaleY: "scaleY"
}
object LayoutAnimationProperties {
  
  inline def apply(): LayoutAnimationProperties = {
    val __obj = js.Dynamic.literal(opacity = "opacity", scaleX = "scaleX", scaleXY = "scaleXY", scaleY = "scaleY")
    __obj.asInstanceOf[LayoutAnimationProperties]
  }
  
  extension [Self <: LayoutAnimationProperties](x: Self) {
    
    inline def setOpacity(value: "opacity"): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setScaleX(value: "scaleX"): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleXY(value: "scaleXY"): Self = StObject.set(x, "scaleXY", value.asInstanceOf[js.Any])
    
    inline def setScaleY(value: "scaleY"): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
  }
}
