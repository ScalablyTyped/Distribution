package typings.snappy.snappyMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snappy", "uncompress")
@js.native
object uncompress extends js.Object {
  def apply(buffer: Buffer, callback: bufferCallback): Unit = js.native
  def apply(buffer: Buffer, options: SnappyDecompressOpts, callback: bufferOrStringCallback): Unit = js.native
}

