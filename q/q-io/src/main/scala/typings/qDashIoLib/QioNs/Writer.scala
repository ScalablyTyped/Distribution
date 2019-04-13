package typings
package qDashIoLib.QioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Writer extends js.Object {
  var node: nodeLib.NodeJSNs.WritableStream = js.native
  def close(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def flush(): qLib.qMod.Promise[scala.Unit] = js.native
  def write(content: java.lang.String): scala.Unit = js.native
  def write(content: nodeLib.Buffer): scala.Unit = js.native
}

