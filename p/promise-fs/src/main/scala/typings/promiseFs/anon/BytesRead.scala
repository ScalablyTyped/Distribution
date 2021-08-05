package typings.promiseFs.anon

import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BytesRead extends StObject {
  
  var buffer: Uint8ClampedArray
  
  var bytesRead: Double
}
object BytesRead {
  
  inline def apply(buffer: Uint8ClampedArray, bytesRead: Double): BytesRead = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesRead]
  }
  
  extension [Self <: BytesRead](x: Self) {
    
    inline def setBuffer(value: Uint8ClampedArray): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
  }
}
