package typings.sipJs

import typings.sipJs.coreMod.Exception
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/exceptions/session-terminated", JSImport.Namespace)
@js.native
object sessionTerminatedMod extends js.Object {
  @js.native
  class SessionTerminatedError () extends Exception
  
}

