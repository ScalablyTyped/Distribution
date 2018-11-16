package typings
package sendLib.sendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("send", JSImport.Namespace)
@js.native
object sendModMembers extends js.Object {
  var mime: js.Any = js.native
  /**
   * Create a new SendStream for the given path to send to a res.
   * The req is the Node.js HTTP request and the path is a urlencoded path to send (urlencoded, not the actual file-system path).
   */
  def apply(req: nodeLib.streamMod.Readable, path: java.lang.String): sendLib.sendMod.sendNs.SendStream = js.native
  /**
   * Create a new SendStream for the given path to send to a res.
   * The req is the Node.js HTTP request and the path is a urlencoded path to send (urlencoded, not the actual file-system path).
   */
  def apply(
    req: nodeLib.streamMod.Readable,
    path: java.lang.String,
    options: sendLib.sendMod.sendNs.SendOptions
  ): sendLib.sendMod.sendNs.SendStream = js.native
}

