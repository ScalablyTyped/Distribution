package typings.promiseFs.anon

import typings.node.NodeJS.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BytesWritten[TBuffer /* <: ArrayBufferView */] extends StObject {
  
  var buffer: TBuffer
  
  var bytesWritten: Double
}
object BytesWritten {
  
  @scala.inline
  def apply[TBuffer /* <: ArrayBufferView */](buffer: TBuffer, bytesWritten: Double): BytesWritten[TBuffer] = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesWritten[TBuffer]]
  }
  
  @scala.inline
  implicit class BytesWrittenMutableBuilder[Self <: BytesWritten[?], TBuffer /* <: ArrayBufferView */] (val x: Self & BytesWritten[TBuffer]) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: TBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
  }
}
