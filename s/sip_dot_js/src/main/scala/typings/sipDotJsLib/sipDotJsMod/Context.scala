package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Context")
@js.native
class Context () extends js.Object {
  var localIdentity: NameAddrHeader = js.native
  var method: java.lang.String = js.native
  var remoteIdentity: NameAddrHeader = js.native
  var request: OutgoingRequest = js.native
  var ua: UA = js.native
}

