package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "C")
@js.native
object CNs extends js.Object {
  @JSName("causes")
  @js.native
  object causesNs extends js.Object {
    val CONNECTION_ERROR: java.lang.String = js.native
    val INVALID_TARGET: java.lang.String = js.native
    val REQUEST_TIMEOUT: java.lang.String = js.native
    val SIP_FAILURE_CODE: java.lang.String = js.native
  }
  
  @JSName("supported")
  @js.native
  object supportedNs extends js.Object {
    val REQUIRED: java.lang.String = js.native
    val SUPPORTED: java.lang.String = js.native
    val UNSUPPORTED: java.lang.String = js.native
  }
  
}

