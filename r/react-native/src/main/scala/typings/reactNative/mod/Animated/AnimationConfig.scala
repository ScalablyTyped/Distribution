package typings.reactNative.mod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationConfig extends StObject {
  
  var isInteraction: js.UndefOr[Boolean] = js.native
  
  var useNativeDriver: Boolean = js.native
}
object AnimationConfig {
  
  @scala.inline
  def apply(useNativeDriver: Boolean): AnimationConfig = {
    val __obj = js.Dynamic.literal(useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationConfig]
  }
  
  @scala.inline
  implicit class AnimationConfigMutableBuilder[Self <: AnimationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsInteraction(value: Boolean): Self = StObject.set(x, "isInteraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInteractionUndefined: Self = StObject.set(x, "isInteraction", js.undefined)
    
    @scala.inline
    def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
  }
}
