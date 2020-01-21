package typings.qIo

import typings.node.Buffer
import typings.qIo.Qio.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QioBufferWriter extends js.Object {
  var Writer: typings.qIo.Qio.Writer = js.native
  def apply(writer: Buffer): Writer = js.native
}

