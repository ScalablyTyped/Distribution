package typings.atStorybookUi.distKeyboardKeyCodesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KeybindingType extends js.Object

@JSImport("@storybook/ui/dist/keyboard/keyCodes", "KeybindingType")
@js.native
object KeybindingType extends js.Object {
  @js.native
  sealed trait Chord extends KeybindingType
  
  @js.native
  sealed trait Simple extends KeybindingType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KeybindingType with Double] = js.native
  /* 2 */ @js.native
  object Chord extends TopLevel[Chord with Double]
  
  /* 1 */ @js.native
  object Simple extends TopLevel[Simple with Double]
  
}

