package typings.promiseFs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferInt32Array extends StObject {
  
  var buffer: js.typedarray.Int32Array
  
  var bytesRead: Double
}
object BufferInt32Array {
  
  inline def apply(buffer: js.typedarray.Int32Array, bytesRead: Double): BufferInt32Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferInt32Array]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BufferInt32Array] (val x: Self) extends AnyVal {
    
    inline def setBuffer(value: js.typedarray.Int32Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
  }
}
