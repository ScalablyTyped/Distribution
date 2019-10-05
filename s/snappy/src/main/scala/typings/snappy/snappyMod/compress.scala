package typings.snappy.snappyMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snappy", "compress")
@js.native
object compress extends js.Object {
  def apply(buffer: String, callback: bufferCallback): Unit = js.native
  def apply(buffer: Buffer, callback: bufferCallback): Unit = js.native
}

