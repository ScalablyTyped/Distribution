package typings.qDashIo

import typings.node.Buffer
import typings.qDashIo.Qio.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QioBufferWriter extends js.Object {
  var Writer: typings.qDashIo.Qio.Writer = js.native
  def apply(writer: Buffer): Writer = js.native
}

