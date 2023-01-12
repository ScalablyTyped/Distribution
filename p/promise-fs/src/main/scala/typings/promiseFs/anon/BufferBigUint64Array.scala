package typings.promiseFs.anon

import typings.std.BigUint64Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferBigUint64Array extends StObject {
  
  var buffer: BigUint64Array
  
  var bytesRead: Double
}
object BufferBigUint64Array {
  
  inline def apply(buffer: BigUint64Array, bytesRead: Double): BufferBigUint64Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferBigUint64Array]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BufferBigUint64Array] (val x: Self) extends AnyVal {
    
    inline def setBuffer(value: BigUint64Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
  }
}
