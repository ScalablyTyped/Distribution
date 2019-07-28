package typings.seleniumDashWebdriver.libInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Button extends js.Object

@JSImport("selenium-webdriver/lib/input", "Button")
@js.native
object Button extends js.Object {
  @js.native
  sealed trait LEFT extends Button
  
  @js.native
  sealed trait MIDDLE extends Button
  
  @js.native
  sealed trait RIGHT extends Button
  
  /* 0 */ val LEFT: typings.seleniumDashWebdriver.libInputMod.Button.LEFT with Double = js.native
  /* 1 */ val MIDDLE: typings.seleniumDashWebdriver.libInputMod.Button.MIDDLE with Double = js.native
  /* 2 */ val RIGHT: typings.seleniumDashWebdriver.libInputMod.Button.RIGHT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Button with Double] = js.native
}

