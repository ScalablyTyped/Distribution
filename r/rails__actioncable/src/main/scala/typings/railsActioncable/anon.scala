package typings.railsActioncable

import typings.railsActioncable.mod.DisconnectReasons
import typings.railsActioncable.mod.MessageTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AllowReconnect extends StObject {
    
    var allowReconnect: Boolean
  }
  object AllowReconnect {
    
    inline def apply(allowReconnect: Boolean): AllowReconnect = {
      val __obj = js.Dynamic.literal(allowReconnect = allowReconnect.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllowReconnect]
    }
    
    extension [Self <: AllowReconnect](x: Self) {
      
      inline def setAllowReconnect(value: Boolean): Self = StObject.set(x, "allowReconnect", value.asInstanceOf[js.Any])
    }
  }
  
  trait Close extends StObject {
    
    def close(): Unit
    
    def error(): Unit
    
    def message(event: Data): Any
    
    def open(): Unit
  }
  object Close {
    
    inline def apply(close: () => Unit, error: () => Unit, message: Data => Any, open: () => Unit): Close = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), error = js.Any.fromFunction0(error), message = js.Any.fromFunction1(message), open = js.Any.fromFunction0(open))
      __obj.asInstanceOf[Close]
    }
    
    extension [Self <: Close](x: Self) {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setError(value: () => Unit): Self = StObject.set(x, "error", js.Any.fromFunction0(value))
      
      inline def setMessage(value: Data => Any): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
      
      inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    }
  }
  
  trait Data extends StObject {
    
    var data: Identifier
  }
  object Data {
    
    inline def apply(data: Identifier): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: Identifier): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait Identifier extends StObject {
    
    var identifier: String
    
    var message: String
    
    var reason: DisconnectReasons
    
    var reconnect: Boolean
    
    var `type`: MessageTypes
  }
  object Identifier {
    
    inline def apply(
      identifier: String,
      message: String,
      reason: DisconnectReasons,
      reconnect: Boolean,
      `type`: MessageTypes
    ): Identifier = {
      val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], reconnect = reconnect.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Identifier]
    }
    
    extension [Self <: Identifier](x: Self) {
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setReason(value: DisconnectReasons): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReconnect(value: Boolean): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
      
      inline def setType(value: MessageTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
