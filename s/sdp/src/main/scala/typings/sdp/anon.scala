package typings.sdp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Mechanism extends StObject {
    
    var mechanism: String = js.native
    
    var ssrc: Double = js.native
  }
  object Mechanism {
    
    @scala.inline
    def apply(mechanism: String, ssrc: Double): Mechanism = {
      val __obj = js.Dynamic.literal(mechanism = mechanism.asInstanceOf[js.Any], ssrc = ssrc.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mechanism]
    }
    
    @scala.inline
    implicit class MechanismMutableBuilder[Self <: Mechanism] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMechanism(value: String): Self = StObject.set(x, "mechanism", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSsrc(value: Double): Self = StObject.set(x, "ssrc", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Ssrc extends StObject {
    
    var ssrc: Double = js.native
  }
  object Ssrc {
    
    @scala.inline
    def apply(ssrc: Double): Ssrc = {
      val __obj = js.Dynamic.literal(ssrc = ssrc.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ssrc]
    }
    
    @scala.inline
    implicit class SsrcMutableBuilder[Self <: Ssrc] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSsrc(value: Double): Self = StObject.set(x, "ssrc", value.asInstanceOf[js.Any])
    }
  }
}
