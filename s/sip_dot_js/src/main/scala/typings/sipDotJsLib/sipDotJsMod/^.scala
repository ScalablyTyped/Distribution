package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val name: js.Any = js.native
  val sanityCheck: js.Function3[
    /* message */ sipDotJsLib.libSIPMessageMod.IncomingRequest | sipDotJsLib.libSIPMessageMod.IncomingResponse, 
    /* ua */ sipDotJsLib.libUAMod.UA, 
    /* transport */ sipDotJsLib.libTransportMod.Transport, 
    scala.Boolean
  ] = js.native
  val version: js.Any = js.native
}

