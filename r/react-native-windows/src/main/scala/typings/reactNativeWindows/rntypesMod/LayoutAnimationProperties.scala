package typings.reactNativeWindows.rntypesMod

import typings.reactNativeWindows.reactNativeWindowsStrings.opacity
import typings.reactNativeWindows.reactNativeWindowsStrings.scaleX
import typings.reactNativeWindows.reactNativeWindowsStrings.scaleXY
import typings.reactNativeWindows.reactNativeWindowsStrings.scaleY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ prop in react-native-windows.react-native-windows/rntypes.LayoutAnimationProperty ]: prop} */
trait LayoutAnimationProperties extends StObject {
  
  var opacity: typings.reactNativeWindows.reactNativeWindowsStrings.opacity
  
  var scaleX: typings.reactNativeWindows.reactNativeWindowsStrings.scaleX
  
  var scaleXY: typings.reactNativeWindows.reactNativeWindowsStrings.scaleXY
  
  var scaleY: typings.reactNativeWindows.reactNativeWindowsStrings.scaleY
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
