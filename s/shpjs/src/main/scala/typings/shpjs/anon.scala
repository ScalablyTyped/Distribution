package typings.shpjs

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Buffer extends StObject {
    
    var buffer: ArrayBuffer
  }
  object Buffer {
    
    inline def apply(buffer: ArrayBuffer): Buffer = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Buffer]
    }
    
    extension [Self <: Buffer](x: Self) {
      
      inline def setBuffer(value: ArrayBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    }
  }
}
