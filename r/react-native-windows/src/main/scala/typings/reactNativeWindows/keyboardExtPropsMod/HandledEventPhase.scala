package typings.reactNativeWindows.keyboardExtPropsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HandledEventPhase extends js.Object
@JSImport("react-native-windows/Libraries/Components/Keyboard/KeyboardExtProps", "HandledEventPhase")
@js.native
object HandledEventPhase extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HandledEventPhase with Double] = js.native
  
  @js.native
  sealed trait Bubbling extends HandledEventPhase
  /* 3 */ @js.native
  object Bubbling extends TopLevel[Bubbling with Double]
  
  @js.native
  sealed trait Capturing extends HandledEventPhase
  /* 1 */ @js.native
  object Capturing extends TopLevel[Capturing with Double]
}
