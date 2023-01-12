package typings.promiseFs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferFloat64Array extends StObject {
  
  var buffer: js.typedarray.Float64Array
  
  var bytesRead: Double
}
object BufferFloat64Array {
  
  inline def apply(buffer: js.typedarray.Float64Array, bytesRead: Double): BufferFloat64Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferFloat64Array]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BufferFloat64Array] (val x: Self) extends AnyVal {
    
    inline def setBuffer(value: js.typedarray.Float64Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
  }
}
