package typings.redisClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagesReceived extends StObject {
  
  var messagesReceived: Double
  
  var messagesSent: Double
}
object MessagesReceived {
  
  inline def apply(messagesReceived: Double, messagesSent: Double): MessagesReceived = {
    val __obj = js.Dynamic.literal(messagesReceived = messagesReceived.asInstanceOf[js.Any], messagesSent = messagesSent.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagesReceived]
  }
  
  extension [Self <: MessagesReceived](x: Self) {
    
    inline def setMessagesReceived(value: Double): Self = StObject.set(x, "messagesReceived", value.asInstanceOf[js.Any])
    
    inline def setMessagesSent(value: Double): Self = StObject.set(x, "messagesSent", value.asInstanceOf[js.Any])
  }
}
