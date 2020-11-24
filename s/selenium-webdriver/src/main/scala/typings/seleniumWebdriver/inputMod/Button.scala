package typings.seleniumWebdriver.inputMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Button extends js.Object
@JSImport("selenium-webdriver/lib/input", "Button")
@js.native
object Button extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Button with Double] = js.native
  
  @js.native
  sealed trait LEFT extends Button
  /* 0 */ @js.native
  object LEFT extends TopLevel[LEFT with Double]
  
  @js.native
  sealed trait MIDDLE extends Button
  /* 1 */ @js.native
  object MIDDLE extends TopLevel[MIDDLE with Double]
  
  @js.native
  sealed trait RIGHT extends Button
  /* 2 */ @js.native
  object RIGHT extends TopLevel[RIGHT with Double]
}
