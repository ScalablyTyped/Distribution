package typings.reactNativeWindows.keyboardExtPropsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventPhase extends js.Object
@JSImport("react-native-windows/Libraries/Components/Keyboard/KeyboardExtProps", "EventPhase")
@js.native
object EventPhase extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventPhase with Double] = js.native
  
  @js.native
  sealed trait AtTarget extends EventPhase
  /* 2 */ @js.native
  object AtTarget extends TopLevel[AtTarget with Double]
  
  @js.native
  sealed trait Bubbling extends EventPhase
  /* 3 */ @js.native
  object Bubbling extends TopLevel[Bubbling with Double]
  
  @js.native
  sealed trait Capturing extends EventPhase
  /* 1 */ @js.native
  object Capturing extends TopLevel[Capturing with Double]
  
  @js.native
  sealed trait None extends EventPhase
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
}
