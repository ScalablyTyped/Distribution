package typings.procfsStats

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Discardedpackets extends StObject {
    
    var `Discarded packets`: String
  }
  object Discardedpackets {
    
    inline def apply(`Discarded packets`: String): Discardedpackets = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("Discarded packets")((`Discarded packets`).asInstanceOf[js.Any])
      __obj.asInstanceOf[Discardedpackets]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Discardedpackets] (val x: Self) extends AnyVal {
      
      inline def `setDiscarded packets`(value: String): Self = StObject.set(x, "Discarded packets", value.asInstanceOf[js.Any])
    }
  }
  
  trait Missed extends StObject {
    
    var Missed: String
  }
  object Missed {
    
    inline def apply(Missed: String): Missed = {
      val __obj = js.Dynamic.literal(Missed = Missed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Missed]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Missed] (val x: Self) extends AnyVal {
      
      inline def setMissed(value: String): Self = StObject.set(x, "Missed", value.asInstanceOf[js.Any])
    }
  }
  
  trait Quality extends StObject {
    
    var Quality: String
  }
  object Quality {
    
    inline def apply(Quality: String): Quality = {
      val __obj = js.Dynamic.literal(Quality = Quality.asInstanceOf[js.Any])
      __obj.asInstanceOf[Quality]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Quality] (val x: Self) extends AnyVal {
      
      inline def setQuality(value: String): Self = StObject.set(x, "Quality", value.asInstanceOf[js.Any])
    }
  }
  
  trait Receive extends StObject {
    
    var Receive: String
    
    var Transmit: String
  }
  object Receive {
    
    inline def apply(Receive: String, Transmit: String): Receive = {
      val __obj = js.Dynamic.literal(Receive = Receive.asInstanceOf[js.Any], Transmit = Transmit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Receive]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Receive] (val x: Self) extends AnyVal {
      
      inline def setReceive(value: String): Self = StObject.set(x, "Receive", value.asInstanceOf[js.Any])
      
      inline def setTransmit(value: String): Self = StObject.set(x, "Transmit", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReceiveString extends StObject {
    
    var Receive: String
  }
  object ReceiveString {
    
    inline def apply(Receive: String): ReceiveString = {
      val __obj = js.Dynamic.literal(Receive = Receive.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiveString]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReceiveString] (val x: Self) extends AnyVal {
      
      inline def setReceive(value: String): Self = StObject.set(x, "Receive", value.asInstanceOf[js.Any])
    }
  }
  
  trait Transmit extends StObject {
    
    var Transmit: String
  }
  object Transmit {
    
    inline def apply(Transmit: String): Transmit = {
      val __obj = js.Dynamic.literal(Transmit = Transmit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transmit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Transmit] (val x: Self) extends AnyVal {
      
      inline def setTransmit(value: String): Self = StObject.set(x, "Transmit", value.asInstanceOf[js.Any])
    }
  }
}
