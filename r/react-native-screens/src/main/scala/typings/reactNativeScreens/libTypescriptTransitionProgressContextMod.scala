package typings.reactNativeScreens

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import typings.reactNative.mod.Animated.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptTransitionProgressContextMod extends Shortcut {
  
  @JSImport("react-native-screens/lib/typescript/TransitionProgressContext", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr[TransitionProgressContextBody]] = js.native
  
  trait TransitionProgressContextBody extends StObject {
    
    var closing: Value
    
    var goingForward: Value
    
    var progress: Value
  }
  object TransitionProgressContextBody {
    
    inline def apply(closing: Value, goingForward: Value, progress: Value): TransitionProgressContextBody = {
      val __obj = js.Dynamic.literal(closing = closing.asInstanceOf[js.Any], goingForward = goingForward.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionProgressContextBody]
    }
    
    extension [Self <: TransitionProgressContextBody](x: Self) {
      
      inline def setClosing(value: Value): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
      
      inline def setGoingForward(value: Value): Self = StObject.set(x, "goingForward", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: Value): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Context[js.UndefOr[TransitionProgressContextBody]]
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptTransitionProgressContextMod.foo` */
  override def _to: Context[js.UndefOr[TransitionProgressContextBody]] = default
}
