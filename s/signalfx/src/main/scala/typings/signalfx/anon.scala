package typings.signalfx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CONTROL extends StObject {
    
    var CONTROL: String = js.native
    
    var DATA: String = js.native
    
    var EVENT: String = js.native
    
    var METADATA: String = js.native
  }
  object CONTROL {
    
    @scala.inline
    def apply(CONTROL: String, DATA: String, EVENT: String, METADATA: String): CONTROL = {
      val __obj = js.Dynamic.literal(CONTROL = CONTROL.asInstanceOf[js.Any], DATA = DATA.asInstanceOf[js.Any], EVENT = EVENT.asInstanceOf[js.Any], METADATA = METADATA.asInstanceOf[js.Any])
      __obj.asInstanceOf[CONTROL]
    }
    
    @scala.inline
    implicit class CONTROLMutableBuilder[Self <: CONTROL] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCONTROL(value: String): Self = StObject.set(x, "CONTROL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDATA(value: String): Self = StObject.set(x, "DATA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEVENT(value: String): Self = StObject.set(x, "EVENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMETADATA(value: String): Self = StObject.set(x, "METADATA", value.asInstanceOf[js.Any])
    }
  }
}
