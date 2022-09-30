package typings.reactNativeReanimated.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-reanimated", "SequencedTransition")
@js.native
open class SequencedTransition () extends BaseAnimationBuilder {
  
  def reverse(): SequencedTransition = js.native
}
/* static members */
object SequencedTransition {
  
  @JSImport("react-native-reanimated", "SequencedTransition")
  @js.native
  val ^ : js.Any = js.native
  
  inline def reverse(): SequencedTransition = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")().asInstanceOf[SequencedTransition]
}
