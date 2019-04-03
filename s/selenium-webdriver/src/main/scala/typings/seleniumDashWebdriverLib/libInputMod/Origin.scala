package typings
package seleniumDashWebdriverLib.libInputMod

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
  sealed trait POINTER
    extends seleniumDashWebdriverLib.libInputMod.Origin
  
  /** Compute offsets relative to the viewport. */
  @js.native
  sealed trait VIEWPORT
    extends seleniumDashWebdriverLib.libInputMod.Origin
  
  /* "pointer" */ val POINTER: POINTER with java.lang.String = js.native
  /* "viewport" */ val VIEWPORT: VIEWPORT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[seleniumDashWebdriverLib.libInputMod.Origin with java.lang.String] = js.native
}

