package typings
package qDashIoLib.QioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stream extends js.Object {
  var node: js.Any = js.native
  def close(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def flush(): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  def read(): qLib.qMod.QNs.Promise[nodeLib.Buffer] = js.native
  def read(charset: java.lang.String): qLib.qMod.QNs.Promise[java.lang.String] = js.native
  def write(content: java.lang.String): scala.Unit = js.native
  def write(content: nodeLib.Buffer): scala.Unit = js.native
}

