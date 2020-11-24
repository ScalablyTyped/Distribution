package typings.seleniumWebdriver.inputMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Origin extends js.Object
@JSImport("selenium-webdriver/lib/input", "Origin")
@js.native
object Origin extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Origin with String] = js.native
  
  /** Compute offsets relative to the pointer's current position. */
  @js.native
  sealed trait POINTER extends Origin
  /* "pointer" */ @js.native
  object POINTER extends TopLevel[POINTER with String]
  
  /** Compute offsets relative to the viewport. */
  @js.native
  sealed trait VIEWPORT extends Origin
  /* "viewport" */ @js.native
  object VIEWPORT extends TopLevel[VIEWPORT with String]
}
