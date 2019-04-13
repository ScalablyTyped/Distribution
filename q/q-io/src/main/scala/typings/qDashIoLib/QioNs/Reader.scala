package typings
package qDashIoLib.QioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reader extends ForEach {
  var node: nodeLib.NodeJSNs.ReadableStream = js.native
  def close(): scala.Unit = js.native
  def read(): qLib.qMod.Promise[nodeLib.Buffer] = js.native
  def read(charset: java.lang.String): qLib.qMod.Promise[java.lang.String] = js.native
}

