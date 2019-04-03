package typings
package seleniumDashWebdriverLib.libInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Button extends js.Object

@JSImport("selenium-webdriver/lib/input", "Button")
@js.native
object Button extends js.Object {
  @js.native
  sealed trait LEFT
    extends seleniumDashWebdriverLib.libInputMod.Button
  
  @js.native
  sealed trait MIDDLE
    extends seleniumDashWebdriverLib.libInputMod.Button
  
  @js.native
  sealed trait RIGHT
    extends seleniumDashWebdriverLib.libInputMod.Button
  
  /* 0 */ val LEFT: LEFT with scala.Double = js.native
  /* 1 */ val MIDDLE: MIDDLE with scala.Double = js.native
  /* 2 */ val RIGHT: RIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[seleniumDashWebdriverLib.libInputMod.Button with scala.Double] = js.native
}

