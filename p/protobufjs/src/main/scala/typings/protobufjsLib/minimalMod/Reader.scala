package typings
package protobufjsLib.minimalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs/minimal", "Reader")
@js.native
class Reader protected ()
  extends protobufjsLib.protobufjsMod.Reader {
  /**
    * Constructs a new reader instance using the specified buffer.
    * @param buffer Buffer to read from
    */
  def this(buffer: stdLib.Uint8Array) = this()
}

/* static members */
@JSImport("protobufjs/minimal", "Reader")
@js.native
object Reader extends js.Object {
  /**
    * Creates a new reader using the specified buffer.
    * @param buffer Buffer to read from
    * @returns A {@link BufferReader} if `buffer` is a Buffer, otherwise a {@link Reader}
    * @throws {Error} If `buffer` is not a valid buffer
    */
  def create(buffer: protobufjsLib.protobufjsMod.Buffer | stdLib.Uint8Array): protobufjsLib.protobufjsMod.Reader | protobufjsLib.protobufjsMod.BufferReader = js.native
}

