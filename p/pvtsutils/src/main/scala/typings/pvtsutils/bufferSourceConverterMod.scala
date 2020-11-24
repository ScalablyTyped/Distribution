package typings.pvtsutils

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pvtsutils/build/types/buffer_source_converter", JSImport.Namespace)
@js.native
object bufferSourceConverterMod extends js.Object {
  
  @js.native
  class BufferSourceConverter () extends js.Object
  /* static members */
  @js.native
  object BufferSourceConverter extends js.Object {
    
    def isArrayBufferView(data: js.Any): /* is std.ArrayBufferView */ Boolean = js.native
    
    def isBufferSource(data: js.Any): /* is pvtsutils.pvtsutils/build/types/buffer_source_converter.BufferSource */ Boolean = js.native
    
    def toArrayBuffer(data: BufferSource): ArrayBuffer = js.native
    
    def toUint8Array(data: BufferSource): Uint8Array = js.native
  }
  
  type BufferSource = ArrayBuffer | ArrayBufferView
}
