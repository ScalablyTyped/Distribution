package typings.promiseFs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buffer extends StObject {
  
  var buffer: js.typedarray.Uint8Array
  
  var bytesRead: Double
}
object Buffer {
  
  inline def apply(buffer: js.typedarray.Uint8Array, bytesRead: Double): Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
  
  extension [Self <: Buffer](x: Self) {
    
    inline def setBuffer(value: js.typedarray.Uint8Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
  }
}
