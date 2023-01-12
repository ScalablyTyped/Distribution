package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.opacity
import typings.reactNative.reactNativeStrings.scaleX
import typings.reactNative.reactNativeStrings.scaleXY
import typings.reactNative.reactNativeStrings.scaleY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ prop in react-native.react-native.LayoutAnimationProperty ]: prop} */
trait LayoutAnimationProperties extends StObject {
  
  var opacity: typings.reactNative.reactNativeStrings.opacity
  
  var scaleX: typings.reactNative.reactNativeStrings.scaleX
  
  var scaleXY: typings.reactNative.reactNativeStrings.scaleXY
  
  var scaleY: typings.reactNative.reactNativeStrings.scaleY
}
object LayoutAnimationProperties {
  
  inline def apply(): LayoutAnimationProperties = {
    val __obj = js.Dynamic.literal(opacity = "opacity", scaleX = "scaleX", scaleXY = "scaleXY", scaleY = "scaleY")
    __obj.asInstanceOf[LayoutAnimationProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayoutAnimationProperties] (val x: Self) extends AnyVal {
    
    inline def setOpacity(value: opacity): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setScaleX(value: scaleX): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleXY(value: scaleXY): Self = StObject.set(x, "scaleXY", value.asInstanceOf[js.Any])
    
    inline def setScaleY(value: scaleY): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
  }
}
