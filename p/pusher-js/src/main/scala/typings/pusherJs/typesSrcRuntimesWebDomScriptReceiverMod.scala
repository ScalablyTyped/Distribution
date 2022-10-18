package typings.pusherJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcRuntimesWebDomScriptReceiverMod {
  
  trait ScriptReceiver extends StObject {
    
    var callback: js.Function
    
    var id: String
    
    var name: String
    
    var number: Double
  }
  object ScriptReceiver {
    
    inline def apply(callback: js.Function, id: String, name: String, number: Double): ScriptReceiver = {
      val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScriptReceiver]
    }
    
    extension [Self <: ScriptReceiver](x: Self) {
      
      inline def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    }
  }
}
