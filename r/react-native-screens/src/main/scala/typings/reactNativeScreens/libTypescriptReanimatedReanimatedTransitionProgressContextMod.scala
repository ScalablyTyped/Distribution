package typings.reactNativeScreens

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import typings.reactNativeReanimated.mod.Animated.SharedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptReanimatedReanimatedTransitionProgressContextMod extends Shortcut {
  
  @JSImport("react-native-screens/lib/typescript/reanimated/ReanimatedTransitionProgressContext", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr[ReanimatedTransitionProgressContextBody]] = js.native
  
  trait ReanimatedTransitionProgressContextBody extends StObject {
    
    var closing: SharedValue[Double]
    
    var goingForward: SharedValue[Double]
    
    var progress: SharedValue[Double]
  }
  object ReanimatedTransitionProgressContextBody {
    
    inline def apply(closing: SharedValue[Double], goingForward: SharedValue[Double], progress: SharedValue[Double]): ReanimatedTransitionProgressContextBody = {
      val __obj = js.Dynamic.literal(closing = closing.asInstanceOf[js.Any], goingForward = goingForward.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReanimatedTransitionProgressContextBody]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReanimatedTransitionProgressContextBody] (val x: Self) extends AnyVal {
      
      inline def setClosing(value: SharedValue[Double]): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
      
      inline def setGoingForward(value: SharedValue[Double]): Self = StObject.set(x, "goingForward", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: SharedValue[Double]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Context[js.UndefOr[ReanimatedTransitionProgressContextBody]]
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptReanimatedReanimatedTransitionProgressContextMod.foo` */
  override def _to: Context[js.UndefOr[ReanimatedTransitionProgressContextBody]] = default
}
