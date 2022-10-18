package typings.reactNativeNavigation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationType extends StObject {
  
  var animationType: String
  
  var blurOnUnmount: Boolean
  
  var transparent: Boolean
}
object AnimationType {
  
  inline def apply(animationType: String, blurOnUnmount: Boolean, transparent: Boolean): AnimationType = {
    val __obj = js.Dynamic.literal(animationType = animationType.asInstanceOf[js.Any], blurOnUnmount = blurOnUnmount.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationType]
  }
  
  extension [Self <: AnimationType](x: Self) {
    
    inline def setAnimationType(value: String): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
    
    inline def setBlurOnUnmount(value: Boolean): Self = StObject.set(x, "blurOnUnmount", value.asInstanceOf[js.Any])
    
    inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
  }
}
