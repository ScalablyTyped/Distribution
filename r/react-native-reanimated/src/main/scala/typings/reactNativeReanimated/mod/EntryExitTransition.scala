package typings.reactNativeReanimated.mod

import typings.reactNativeReanimated.anon.TypeofBaseAnimationBuildeDelay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-reanimated", "EntryExitTransition")
@js.native
open class EntryExitTransition () extends BaseAnimationBuilder {
  
  def entering(animation: TypeofBaseAnimationBuildeDelay): EntryExitTransition = js.native
  def entering(animation: BaseAnimationBuilder): EntryExitTransition = js.native
  
  def exiting(animation: TypeofBaseAnimationBuildeDelay): EntryExitTransition = js.native
  def exiting(animation: BaseAnimationBuilder): EntryExitTransition = js.native
}
/* static members */
object EntryExitTransition {
  
  @JSImport("react-native-reanimated", "EntryExitTransition")
  @js.native
  val ^ : js.Any = js.native
  
  inline def delay(durationMs: Double): EntryExitTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(durationMs.asInstanceOf[js.Any]).asInstanceOf[EntryExitTransition]
  
  inline def entering(animation: TypeofBaseAnimationBuildeDelay): EntryExitTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("entering")(animation.asInstanceOf[js.Any]).asInstanceOf[EntryExitTransition]
  inline def entering(animation: BaseAnimationBuilder): EntryExitTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("entering")(animation.asInstanceOf[js.Any]).asInstanceOf[EntryExitTransition]
  
  inline def exiting(animation: TypeofBaseAnimationBuildeDelay): EntryExitTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("exiting")(animation.asInstanceOf[js.Any]).asInstanceOf[EntryExitTransition]
  inline def exiting(animation: BaseAnimationBuilder): EntryExitTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("exiting")(animation.asInstanceOf[js.Any]).asInstanceOf[EntryExitTransition]
}
