package typings.seleniumDashWebdriver.libInputMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Button with Double] = js.native
  /* 0 */ @js.native
  object LEFT extends TopLevel[LEFT with Double]
  
  /* 1 */ @js.native
  object MIDDLE extends TopLevel[MIDDLE with Double]
  
  /* 2 */ @js.native
  object RIGHT extends TopLevel[RIGHT with Double]
  
}

