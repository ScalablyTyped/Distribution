package typings.pvtsutils

import typings.std.ArrayBuffer
import typings.std.BufferSource
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pvtsutils/build/types/buffer_source_converter", JSImport.Namespace)
@js.native
object buildTypesBufferUnderscoreSourceUnderscoreConverterMod extends js.Object {
  @js.native
  class BufferSourceConverter () extends js.Object
  
  /* static members */
  @js.native
  object BufferSourceConverter extends js.Object {
    def isBufferSource(data: js.Any): /* is std.BufferSource */ Boolean = js.native
    def toArrayBuffer(data: BufferSource): ArrayBuffer = js.native
    def toUint8Array(data: BufferSource): Uint8Array = js.native
  }
  
}

