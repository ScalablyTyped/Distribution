package typings.protobufjs.lightMod

import typings.protobufjs.protobufjsMod.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs/light", "BufferWriter")
@js.native
/** Constructs a new buffer writer instance. */
class BufferWriter ()
  extends typings.protobufjs.protobufjsMod.BufferWriter

/* static members */
@JSImport("protobufjs/light", "BufferWriter")
@js.native
object BufferWriter extends js.Object {
  /**
    * Allocates a buffer of the specified size.
    * @param size Buffer size
    * @returns Buffer
    */
  def alloc(size: Double): Buffer = js.native
}

