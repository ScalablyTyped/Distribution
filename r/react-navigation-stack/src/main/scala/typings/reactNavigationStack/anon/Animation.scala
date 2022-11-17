package typings.reactNavigationStack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animation extends StObject {
  
  var animation: "spring"
  
  var config: OmitSpringAnimationConfig
}
object Animation {
  
  inline def apply(config: OmitSpringAnimationConfig): Animation = {
    val __obj = js.Dynamic.literal(animation = "spring", config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
  
  extension [Self <: Animation](x: Self) {
    
    inline def setAnimation(value: "spring"): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: OmitSpringAnimationConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
  }
}
