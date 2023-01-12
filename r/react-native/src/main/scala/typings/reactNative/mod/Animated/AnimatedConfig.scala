package typings.reactNative.mod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimatedConfig extends StObject {
  
  val useNativeDriver: Boolean
}
object AnimatedConfig {
  
  inline def apply(useNativeDriver: Boolean): AnimatedConfig = {
    val __obj = js.Dynamic.literal(useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimatedConfig] (val x: Self) extends AnyVal {
    
    inline def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
  }
}
