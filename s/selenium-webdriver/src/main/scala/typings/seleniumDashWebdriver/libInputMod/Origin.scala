package typings.seleniumDashWebdriver.libInputMod

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
  
  /* "pointer" */ val POINTER: typings.seleniumDashWebdriver.libInputMod.Origin.POINTER with String = js.native
  /* "viewport" */ val VIEWPORT: typings.seleniumDashWebdriver.libInputMod.Origin.VIEWPORT with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Origin with String] = js.native
}

