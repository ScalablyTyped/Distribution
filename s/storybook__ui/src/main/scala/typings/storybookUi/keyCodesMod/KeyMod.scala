package typings.storybookUi.keyCodesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KeyMod with Double] = js.native
  /* 512 */ @js.native
  object Alt extends TopLevel[Alt with Double]
  
  /* 2048 */ @js.native
  object CtrlCmd extends TopLevel[CtrlCmd with Double]
  
  /* 1024 */ @js.native
  object Shift extends TopLevel[Shift with Double]
  
  /* 256 */ @js.native
  object WinCtrl extends TopLevel[WinCtrl with Double]
  
}

