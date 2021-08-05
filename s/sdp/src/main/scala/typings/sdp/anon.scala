package typings.sdp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Mechanism extends StObject {
    
    var mechanism: String
    
    var ssrc: Double
  }
  object Mechanism {
    
    inline def apply(mechanism: String, ssrc: Double): Mechanism = {
      val __obj = js.Dynamic.literal(mechanism = mechanism.asInstanceOf[js.Any], ssrc = ssrc.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mechanism]
    }
    
    extension [Self <: Mechanism](x: Self) {
      
      inline def setMechanism(value: String): Self = StObject.set(x, "mechanism", value.asInstanceOf[js.Any])
      
      inline def setSsrc(value: Double): Self = StObject.set(x, "ssrc", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ssrc extends StObject {
    
    var ssrc: Double
  }
  object Ssrc {
    
    inline def apply(ssrc: Double): Ssrc = {
      val __obj = js.Dynamic.literal(ssrc = ssrc.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ssrc]
    }
    
    extension [Self <: Ssrc](x: Self) {
      
      inline def setSsrc(value: Double): Self = StObject.set(x, "ssrc", value.asInstanceOf[js.Any])
    }
  }
}
