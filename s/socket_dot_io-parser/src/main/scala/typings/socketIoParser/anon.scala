package typings.socketIoParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Buffers extends StObject {
    
    var buffers: js.Array[Any]
    
    var packet: Any
  }
  object Buffers {
    
    inline def apply(buffers: js.Array[Any], packet: Any): Buffers = {
      val __obj = js.Dynamic.literal(buffers = buffers.asInstanceOf[js.Any], packet = packet.asInstanceOf[js.Any])
      __obj.asInstanceOf[Buffers]
    }
    
    extension [Self <: Buffers](x: Self) {
      
      inline def setBuffers(value: js.Array[Any]): Self = StObject.set(x, "buffers", value.asInstanceOf[js.Any])
      
      inline def setBuffersVarargs(value: Any*): Self = StObject.set(x, "buffers", js.Array(value*))
      
      inline def setPacket(value: Any): Self = StObject.set(x, "packet", value.asInstanceOf[js.Any])
    }
  }
}
