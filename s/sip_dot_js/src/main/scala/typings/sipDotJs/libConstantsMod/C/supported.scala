package typings.sipDotJs.libConstantsMod.C

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
  
  /* "required" */ val REQUIRED: typings.sipDotJs.libConstantsMod.C.supported.REQUIRED with String = js.native
  /* "supported" */ val SUPPORTED: typings.sipDotJs.libConstantsMod.C.supported.SUPPORTED with String = js.native
  /* "none" */ val UNSUPPORTED: typings.sipDotJs.libConstantsMod.C.supported.UNSUPPORTED with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[supported with String] = js.native
}

