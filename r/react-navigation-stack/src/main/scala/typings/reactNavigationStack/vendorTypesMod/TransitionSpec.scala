package typings.reactNavigationStack.vendorTypesMod

import typings.reactNavigationStack.anon.OmitSpringAnimationConfig
import typings.reactNavigationStack.anon.OmitTimingAnimationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactNavigationStack.anon.Animation
  - typings.reactNavigationStack.anon.Config
*/
trait TransitionSpec extends StObject
object TransitionSpec {
  
  @scala.inline
  def Animation(config: OmitSpringAnimationConfig): typings.reactNavigationStack.anon.Animation = {
    val __obj = js.Dynamic.literal(animation = "spring", config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNavigationStack.anon.Animation]
  }
  
  @scala.inline
  def Config(config: OmitTimingAnimationConfig): typings.reactNavigationStack.anon.Config = {
    val __obj = js.Dynamic.literal(animation = "timing", config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNavigationStack.anon.Config]
  }
}
