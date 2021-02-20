package typings.reactNativeForm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CallbackProp extends StObject {
    
    var callbackProp: String = js.native
    
    var controlled: Boolean = js.native
    
    var valueProp: String = js.native
  }
  object CallbackProp {
    
    @scala.inline
    def apply(callbackProp: String, controlled: Boolean, valueProp: String): CallbackProp = {
      val __obj = js.Dynamic.literal(callbackProp = callbackProp.asInstanceOf[js.Any], controlled = controlled.asInstanceOf[js.Any], valueProp = valueProp.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallbackProp]
    }
    
    @scala.inline
    implicit class CallbackPropMutableBuilder[Self <: CallbackProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbackProp(value: String): Self = StObject.set(x, "callbackProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlled(value: Boolean): Self = StObject.set(x, "controlled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueProp(value: String): Self = StObject.set(x, "valueProp", value.asInstanceOf[js.Any])
    }
  }
}
