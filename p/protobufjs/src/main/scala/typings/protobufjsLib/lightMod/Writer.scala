package typings
package protobufjsLib.lightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs/light", "Writer")
@js.native
/** Constructs a new writer instance. */
class Writer ()
  extends protobufjsLib.protobufjsMod.Writer

/* static members */
@JSImport("protobufjs/light", "Writer")
@js.native
object Writer extends js.Object {
  /**
    * Allocates a buffer of the specified size.
    * @param size Buffer size
    * @returns Buffer
    */
  def alloc(size: scala.Double): stdLib.Uint8Array = js.native
  /**
    * Creates a new writer.
    * @returns A {@link BufferWriter} when Buffers are supported, otherwise a {@link Writer}
    */
  def create(): protobufjsLib.protobufjsMod.BufferWriter | protobufjsLib.protobufjsMod.Writer = js.native
}

