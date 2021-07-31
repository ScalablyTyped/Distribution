package typings.pvtsutils

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferSourceConverterMod {
  
  @JSImport("pvtsutils/build/types/buffer_source_converter", "BufferSourceConverter")
  @js.native
  class BufferSourceConverter () extends StObject
  /* static members */
  object BufferSourceConverter {
    
    @JSImport("pvtsutils/build/types/buffer_source_converter", "BufferSourceConverter")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def isArrayBufferView(data: js.Any): /* is std.ArrayBufferView */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayBufferView")(data.asInstanceOf[js.Any]).asInstanceOf[/* is std.ArrayBufferView */ Boolean]
    
    @scala.inline
    def isBufferSource(data: js.Any): /* is pvtsutils.pvtsutils/build/types/buffer_source_converter.BufferSource */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBufferSource")(data.asInstanceOf[js.Any]).asInstanceOf[/* is pvtsutils.pvtsutils/build/types/buffer_source_converter.BufferSource */ Boolean]
    
    @scala.inline
    def toArrayBuffer(data: BufferSource): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toArrayBuffer")(data.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
    
    @scala.inline
    def toUint8Array(data: BufferSource): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toUint8Array")(data.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  }
  
  type BufferSource = ArrayBuffer | ArrayBufferView
}
