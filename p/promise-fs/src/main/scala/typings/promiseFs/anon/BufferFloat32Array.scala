package typings.promiseFs.anon

import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferFloat32Array extends StObject {
  
  var buffer: Float32Array
  
  var bytesRead: Double
}
object BufferFloat32Array {
  
  @scala.inline
  def apply(buffer: Float32Array, bytesRead: Double): BufferFloat32Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferFloat32Array]
  }
  
  @scala.inline
  implicit class BufferFloat32ArrayMutableBuilder[Self <: BufferFloat32Array] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: Float32Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
  }
}
