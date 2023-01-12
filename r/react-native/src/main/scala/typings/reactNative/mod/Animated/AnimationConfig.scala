package typings.reactNative.mod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationConfig extends StObject {
  
  var isInteraction: js.UndefOr[Boolean] = js.undefined
  
  var useNativeDriver: Boolean
}
object AnimationConfig {
  
  inline def apply(useNativeDriver: Boolean): AnimationConfig = {
    val __obj = js.Dynamic.literal(useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationConfig] (val x: Self) extends AnyVal {
    
    inline def setIsInteraction(value: Boolean): Self = StObject.set(x, "isInteraction", value.asInstanceOf[js.Any])
    
    inline def setIsInteractionUndefined: Self = StObject.set(x, "isInteraction", js.undefined)
    
    inline def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
  }
}
