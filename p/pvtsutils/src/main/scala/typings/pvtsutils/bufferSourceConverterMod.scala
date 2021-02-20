package typings.pvtsutils

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferSourceConverterMod {
  
  @JSImport("pvtsutils/build/types/buffer_source_converter", "BufferSourceConverter")
  @js.native
  class BufferSourceConverter () extends StObject
  /* static members */
  object BufferSourceConverter {
    
    @JSImport("pvtsutils/build/types/buffer_source_converter", "BufferSourceConverter.isArrayBufferView")
    @js.native
    def isArrayBufferView(data: js.Any): /* is std.ArrayBufferView */ Boolean = js.native
    
    @JSImport("pvtsutils/build/types/buffer_source_converter", "BufferSourceConverter.isBufferSource")
    @js.native
    def isBufferSource(data: js.Any): /* is pvtsutils.pvtsutils/build/types/buffer_source_converter.BufferSource */ Boolean = js.native
    
    @JSImport("pvtsutils/build/types/buffer_source_converter", "BufferSourceConverter.toArrayBuffer")
    @js.native
    def toArrayBuffer(data: BufferSource): ArrayBuffer = js.native
    
    @JSImport("pvtsutils/build/types/buffer_source_converter", "BufferSourceConverter.toUint8Array")
    @js.native
    def toUint8Array(data: BufferSource): Uint8Array = js.native
  }
  
  type BufferSource = ArrayBuffer | ArrayBufferView
}
