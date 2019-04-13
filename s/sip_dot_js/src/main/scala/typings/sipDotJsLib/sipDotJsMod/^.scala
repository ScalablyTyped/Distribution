package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val name: java.lang.String = js.native
  val version: java.lang.String = js.native
  def sanityCheck(): js.Function3[
    /* message */ sipDotJsLib.typesSipDashMessageMod.IncomingRequest | sipDotJsLib.typesSipDashMessageMod.IncomingResponse, 
    /* ua */ sipDotJsLib.typesUaMod.UA, 
    /* transport */ Transport, 
    scala.Boolean
  ] = js.native
}

