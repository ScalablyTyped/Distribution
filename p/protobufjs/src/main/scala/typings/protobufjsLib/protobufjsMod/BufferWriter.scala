package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs", "BufferWriter")
@js.native
/** Constructs a new buffer writer instance. */
class BufferWriter () extends Writer

@JSImport("protobufjs", "BufferWriter")
@js.native
object BufferWriter extends js.Object {
  /**
    * Allocates a buffer of the specified size.
    * @param size Buffer size
    * @returns Buffer
    */
  def alloc(size: scala.Double): protobufjsLib.protobufjsMod.Buffer = js.native
}

