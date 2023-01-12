package typings.reactNavigationStack.anon

import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.TransitionSpec
import typings.reactNavigationStack.reactNavigationStackStrings.spring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animation
  extends StObject
     with TransitionSpec {
  
  var animation: spring
  
  var config: OmitSpringAnimationConfig
}
object Animation {
  
  inline def apply(config: OmitSpringAnimationConfig): Animation = {
    val __obj = js.Dynamic.literal(animation = "spring", config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Animation] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: spring): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: OmitSpringAnimationConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
  }
}
