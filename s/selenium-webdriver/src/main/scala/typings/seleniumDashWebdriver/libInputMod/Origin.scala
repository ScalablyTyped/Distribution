package typings.seleniumDashWebdriver.libInputMod

import org.scalablytyped.runtime.TopLevel
import typings.seleniumDashWebdriver.libInputMod.Origin.POINTER
import typings.seleniumDashWebdriver.libInputMod.Origin.VIEWPORT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Origin extends js.Object

@JSImport("selenium-webdriver/lib/input", "Origin")
@js.native
object Origin extends js.Object {
  /** Compute offsets relative to the pointer's current position. */
  @js.native
  sealed trait POINTER extends Origin
  
  /** Compute offsets relative to the viewport. */
  @js.native
  sealed trait VIEWPORT extends Origin
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Origin with String] = js.native
  /* "pointer" */ @js.native
  object POINTER extends TopLevel[POINTER with String]
  
  /* "viewport" */ @js.native
  object VIEWPORT extends TopLevel[VIEWPORT with String]
  
}

