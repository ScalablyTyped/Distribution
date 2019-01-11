package typings
package snappyLib.snappyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snappy", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compress(buffer: java.lang.String, callback: snappyLib.snappyMod.bufferCallback): scala.Unit = js.native
  def compress(buffer: nodeLib.Buffer, callback: snappyLib.snappyMod.bufferCallback): scala.Unit = js.native
  def compressSync(buffer: java.lang.String): nodeLib.Buffer = js.native
  def compressSync(buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def isValidCompressed(buffer: nodeLib.Buffer, callback: snappyLib.snappyMod.booleanCallback): scala.Unit = js.native
  def isValidCompressedSync(buffer: nodeLib.Buffer): scala.Boolean = js.native
  def uncompress(buffer: nodeLib.Buffer, callback: snappyLib.snappyMod.bufferCallback): scala.Unit = js.native
  def uncompress(
    buffer: nodeLib.Buffer,
    options: snappyLib.snappyMod.SnappyDecompressOpts,
    callback: snappyLib.snappyMod.bufferOrStringCallback
  ): scala.Unit = js.native
  def uncompressSync(buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def uncompressSync(buffer: nodeLib.Buffer, options: snappyLib.snappyMod.SnappyDecompressOpts): nodeLib.Buffer | java.lang.String = js.native
}

