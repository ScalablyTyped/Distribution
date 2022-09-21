package typings.promiseFs

import typings.node.bufferMod.global.BufferEncoding
import typings.promiseFs.promiseFsBooleans.`false`
import typings.promiseFs.promiseFsBooleans.`true`
import typings.promiseFs.promiseFsStrings.buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var encoding: js.UndefOr[String | Null] = js.undefined
    
    var withFileTypes: js.UndefOr[`false`] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setWithFileTypes(value: `false`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
      
      inline def setWithFileTypesUndefined: Self = StObject.set(x, "withFileTypes", js.undefined)
    }
  }
  
  trait `1` extends StObject {
    
    var encoding: js.UndefOr[String | Null] = js.undefined
    
    var withFileTypes: `true`
  }
  object `1` {
    
    inline def apply(): `1` = {
      val __obj = js.Dynamic.literal(withFileTypes = true)
      __obj.asInstanceOf[`1`]
    }
    
    extension [Self <: `1`](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setWithFileTypes(value: `true`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
    }
  }
  
  trait `2` extends StObject {
    
    var encoding: js.UndefOr[BufferEncoding | Null] = js.undefined
  }
  object `2` {
    
    inline def apply(): `2` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`2`]
    }
    
    extension [Self <: `2`](x: Self) {
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
  
  trait `3` extends StObject {
    
    var encoding: buffer
  }
  object `3` {
    
    inline def apply(): `3` = {
      val __obj = js.Dynamic.literal(encoding = "buffer")
      __obj.asInstanceOf[`3`]
    }
    
    extension [Self <: `3`](x: Self) {
      
      inline def setEncoding(value: buffer): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
  
  trait `4` extends StObject {
    
    var encoding: js.UndefOr[String | Null] = js.undefined
  }
  object `4` {
    
    inline def apply(): `4` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`4`]
    }
    
    extension [Self <: `4`](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
  
  trait Buffer[TBuffer /* <: js.typedarray.ArrayBufferView */] extends StObject {
    
    var buffer: TBuffer
    
    var bytesRead: Double
  }
  object Buffer {
    
    inline def apply[TBuffer /* <: js.typedarray.ArrayBufferView */](buffer: TBuffer, bytesRead: Double): Buffer[TBuffer] = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
      __obj.asInstanceOf[Buffer[TBuffer]]
    }
    
    extension [Self <: Buffer[?], TBuffer /* <: js.typedarray.ArrayBufferView */](x: Self & Buffer[TBuffer]) {
      
      inline def setBuffer(value: TBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
    }
  }
  
  trait BufferBytesWritten extends StObject {
    
    var buffer: String
    
    var bytesWritten: Double
  }
  object BufferBytesWritten {
    
    inline def apply(buffer: String, bytesWritten: Double): BufferBytesWritten = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferBytesWritten]
    }
    
    extension [Self <: BufferBytesWritten](x: Self) {
      
      inline def setBuffer(value: String): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
    }
  }
  
  trait BytesWritten[TBuffer /* <: js.typedarray.ArrayBufferView */] extends StObject {
    
    var buffer: TBuffer
    
    var bytesWritten: Double
  }
  object BytesWritten {
    
    inline def apply[TBuffer /* <: js.typedarray.ArrayBufferView */](buffer: TBuffer, bytesWritten: Double): BytesWritten[TBuffer] = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
      __obj.asInstanceOf[BytesWritten[TBuffer]]
    }
    
    extension [Self <: BytesWritten[?], TBuffer /* <: js.typedarray.ArrayBufferView */](x: Self & BytesWritten[TBuffer]) {
      
      inline def setBuffer(value: TBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
    }
  }
  
  trait Encoding extends StObject {
    
    var encoding: js.UndefOr[Null] = js.undefined
    
    var flag: js.UndefOr[String] = js.undefined
  }
  object Encoding {
    
    inline def apply(): Encoding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Encoding]
    }
    
    extension [Self <: Encoding](x: Self) {
      
      inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    }
  }
  
  trait EncodingFlag extends StObject {
    
    var encoding: js.UndefOr[String | Null] = js.undefined
    
    var flag: js.UndefOr[String] = js.undefined
  }
  object EncodingFlag {
    
    inline def apply(): EncodingFlag = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodingFlag]
    }
    
    extension [Self <: EncodingFlag](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    }
  }
  
  trait EncodingWithFileTypes extends StObject {
    
    var encoding: buffer
    
    var withFileTypes: js.UndefOr[`false`] = js.undefined
  }
  object EncodingWithFileTypes {
    
    inline def apply(): EncodingWithFileTypes = {
      val __obj = js.Dynamic.literal(encoding = "buffer")
      __obj.asInstanceOf[EncodingWithFileTypes]
    }
    
    extension [Self <: EncodingWithFileTypes](x: Self) {
      
      inline def setEncoding(value: buffer): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setWithFileTypes(value: `false`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
      
      inline def setWithFileTypesUndefined: Self = StObject.set(x, "withFileTypes", js.undefined)
    }
  }
  
  trait Flag extends StObject {
    
    var encoding: String
    
    var flag: js.UndefOr[String] = js.undefined
  }
  object Flag {
    
    inline def apply(encoding: String): Flag = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[Flag]
    }
    
    extension [Self <: Flag](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    }
  }
  
  trait WithFileTypes extends StObject {
    
    var encoding: BufferEncoding | Null
    
    var withFileTypes: js.UndefOr[`false`] = js.undefined
  }
  object WithFileTypes {
    
    inline def apply(): WithFileTypes = {
      val __obj = js.Dynamic.literal(encoding = null)
      __obj.asInstanceOf[WithFileTypes]
    }
    
    extension [Self <: WithFileTypes](x: Self) {
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setWithFileTypes(value: `false`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
      
      inline def setWithFileTypesUndefined: Self = StObject.set(x, "withFileTypes", js.undefined)
    }
  }
}
