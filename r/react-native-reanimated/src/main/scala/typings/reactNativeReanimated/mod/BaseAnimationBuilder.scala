package typings.reactNativeReanimated.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-reanimated", "BaseAnimationBuilder")
@js.native
open class BaseAnimationBuilder () extends StObject {
  
  def build(): LayoutAnimationFunction | EntryExitAnimationFunction = js.native
  
  def delay(durationMs: Double): BaseAnimationBuilder = js.native
  
  def duration(durationMs: Double): BaseAnimationBuilder = js.native
  
  def randomDelay(): BaseAnimationBuilder = js.native
  
  def withCallback(callback: js.Function1[/* finished */ Boolean, Unit]): BaseAnimationBuilder = js.native
}
/* static members */
object BaseAnimationBuilder {
  
  @JSImport("react-native-reanimated", "BaseAnimationBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  inline def delay(durationMs: Double): BaseAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(durationMs.asInstanceOf[js.Any]).asInstanceOf[BaseAnimationBuilder]
  
  inline def duration(durationMs: Double): BaseAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("duration")(durationMs.asInstanceOf[js.Any]).asInstanceOf[BaseAnimationBuilder]
  
  inline def randomDelay(): BaseAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("randomDelay")().asInstanceOf[BaseAnimationBuilder]
  
  inline def withCallback(callback: js.Function1[/* finished */ Boolean, Unit]): BaseAnimationBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[BaseAnimationBuilder]
}
