package typings.promiseFs.anon

import typings.std.BigInt64Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferBigInt64Array extends StObject {
  
  var buffer: BigInt64Array
  
  var bytesRead: Double
}
object BufferBigInt64Array {
  
  inline def apply(buffer: BigInt64Array, bytesRead: Double): BufferBigInt64Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferBigInt64Array]
  }
  
  extension [Self <: BufferBigInt64Array](x: Self) {
    
    inline def setBuffer(value: BigInt64Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
  }
}
