package typings.snappy.snappyMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snappy", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compress(buffer: String, callback: bufferCallback): Unit = js.native
  def compress(buffer: Buffer, callback: bufferCallback): Unit = js.native
  def compressSync(buffer: String): Buffer = js.native
  def compressSync(buffer: Buffer): Buffer = js.native
  def isValidCompressed(buffer: Buffer, callback: booleanCallback): Unit = js.native
  def isValidCompressedSync(buffer: Buffer): Boolean = js.native
  def uncompress(buffer: Buffer, callback: bufferCallback): Unit = js.native
  def uncompress(buffer: Buffer, options: SnappyDecompressOpts, callback: bufferOrStringCallback): Unit = js.native
  def uncompressSync(buffer: Buffer): Buffer = js.native
  def uncompressSync(buffer: Buffer, options: SnappyDecompressOpts): Buffer | String = js.native
}

