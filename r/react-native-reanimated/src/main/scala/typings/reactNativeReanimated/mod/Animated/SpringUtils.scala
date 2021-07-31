package typings.reactNativeReanimated.mod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpringUtils extends StObject {
  
  def makeConfigFromBouncinessAndSpeed(prevConfig: SpringConfigWithBouncinessAndSpeed): SpringConfig
  
  def makeConfigFromOrigamiTensionAndFriction(prevConfig: SpringConfigWithOrigamiTensionAndFriction): SpringConfig
  
  def makeDefaultConfig(): SpringConfig
}
object SpringUtils {
  
  @scala.inline
  def apply(
    makeConfigFromBouncinessAndSpeed: SpringConfigWithBouncinessAndSpeed => SpringConfig,
    makeConfigFromOrigamiTensionAndFriction: SpringConfigWithOrigamiTensionAndFriction => SpringConfig,
    makeDefaultConfig: () => SpringConfig
  ): SpringUtils = {
    val __obj = js.Dynamic.literal(makeConfigFromBouncinessAndSpeed = js.Any.fromFunction1(makeConfigFromBouncinessAndSpeed), makeConfigFromOrigamiTensionAndFriction = js.Any.fromFunction1(makeConfigFromOrigamiTensionAndFriction), makeDefaultConfig = js.Any.fromFunction0(makeDefaultConfig))
    __obj.asInstanceOf[SpringUtils]
  }
  
  @scala.inline
  implicit class SpringUtilsMutableBuilder[Self <: SpringUtils] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMakeConfigFromBouncinessAndSpeed(value: SpringConfigWithBouncinessAndSpeed => SpringConfig): Self = StObject.set(x, "makeConfigFromBouncinessAndSpeed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMakeConfigFromOrigamiTensionAndFriction(value: SpringConfigWithOrigamiTensionAndFriction => SpringConfig): Self = StObject.set(x, "makeConfigFromOrigamiTensionAndFriction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMakeDefaultConfig(value: () => SpringConfig): Self = StObject.set(x, "makeDefaultConfig", js.Any.fromFunction0(value))
  }
}
