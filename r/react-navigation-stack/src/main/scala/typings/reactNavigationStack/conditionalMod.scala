package typings.reactNavigationStack

import typings.reactNative.mod.Animated.AnimatedAddition
import typings.reactNative.mod.Animated.AnimatedInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conditionalMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/utils/conditional", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(condition: AnimatedInterpolation, main: AnimatedInterpolation, fallback: AnimatedInterpolation): AnimatedAddition = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(condition.asInstanceOf[js.Any], main.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[AnimatedAddition]
}
