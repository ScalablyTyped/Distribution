package typings.atStorybookUi.distKeyboardKeyCodesMod

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
  
  /* 2 */ val Chord: typings.atStorybookUi.distKeyboardKeyCodesMod.KeybindingType.Chord with Double = js.native
  /* 1 */ val Simple: typings.atStorybookUi.distKeyboardKeyCodesMod.KeybindingType.Simple with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KeybindingType with Double] = js.native
}

