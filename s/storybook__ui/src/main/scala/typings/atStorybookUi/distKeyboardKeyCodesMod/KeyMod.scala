package typings.atStorybookUi.distKeyboardKeyCodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KeyMod extends js.Object

@JSImport("@storybook/ui/dist/keyboard/keyCodes", "KeyMod")
@js.native
object KeyMod extends js.Object {
  @js.native
  sealed trait Alt extends KeyMod
  
  @js.native
  sealed trait CtrlCmd extends KeyMod
  
  @js.native
  sealed trait Shift extends KeyMod
  
  @js.native
  sealed trait WinCtrl extends KeyMod
  
  /* 512 */ val Alt: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyMod.Alt with Double = js.native
  /* 2048 */ val CtrlCmd: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyMod.CtrlCmd with Double = js.native
  /* 1024 */ val Shift: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyMod.Shift with Double = js.native
  /* 256 */ val WinCtrl: typings.atStorybookUi.distKeyboardKeyCodesMod.KeyMod.WinCtrl with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KeyMod with Double] = js.native
}

