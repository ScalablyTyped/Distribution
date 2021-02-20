package typings.promiseFs.anon

import typings.std.Uint16Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferBytesRead extends StObject {
  
  var buffer: Uint16Array = js.native
  
  var bytesRead: Double = js.native
}
object BufferBytesRead {
  
  @scala.inline
  def apply(buffer: Uint16Array, bytesRead: Double): BufferBytesRead = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferBytesRead]
  }
  
  @scala.inline
  implicit class BufferBytesReadMutableBuilder[Self <: BufferBytesRead] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: Uint16Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
  }
}
