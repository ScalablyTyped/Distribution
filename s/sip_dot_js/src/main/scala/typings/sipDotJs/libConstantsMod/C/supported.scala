package typings.sipDotJs.libConstantsMod.C

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait supported extends js.Object

@JSImport("sip.js/lib/Constants", "C.supported")
@js.native
object supported extends js.Object {
  @js.native
  sealed trait REQUIRED extends supported
  
  @js.native
  sealed trait SUPPORTED extends supported
  
  @js.native
  sealed trait UNSUPPORTED extends supported
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[supported with String] = js.native
  /* "required" */ @js.native
  object REQUIRED extends TopLevel[REQUIRED with String]
  
  /* "supported" */ @js.native
  object SUPPORTED extends TopLevel[SUPPORTED with String]
  
  /* "none" */ @js.native
  object UNSUPPORTED extends TopLevel[UNSUPPORTED with String]
  
}

