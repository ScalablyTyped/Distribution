package typings.signalfx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CONTROL extends StObject {
    
    var CONTROL: String
    
    var DATA: String
    
    var EVENT: String
    
    var METADATA: String
  }
  object CONTROL {
    
    inline def apply(CONTROL: String, DATA: String, EVENT: String, METADATA: String): CONTROL = {
      val __obj = js.Dynamic.literal(CONTROL = CONTROL.asInstanceOf[js.Any], DATA = DATA.asInstanceOf[js.Any], EVENT = EVENT.asInstanceOf[js.Any], METADATA = METADATA.asInstanceOf[js.Any])
      __obj.asInstanceOf[CONTROL]
    }
    
    extension [Self <: CONTROL](x: Self) {
      
      inline def setCONTROL(value: String): Self = StObject.set(x, "CONTROL", value.asInstanceOf[js.Any])
      
      inline def setDATA(value: String): Self = StObject.set(x, "DATA", value.asInstanceOf[js.Any])
      
      inline def setEVENT(value: String): Self = StObject.set(x, "EVENT", value.asInstanceOf[js.Any])
      
      inline def setMETADATA(value: String): Self = StObject.set(x, "METADATA", value.asInstanceOf[js.Any])
    }
  }
}
