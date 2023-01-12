package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageAction extends StObject {
  
  var actionTimetoken: String
  
  var messageTimetoken: String
  
  var `type`: String
  
  var uuid: String
  
  var value: String
}
object MessageAction {
  
  inline def apply(actionTimetoken: String, messageTimetoken: String, `type`: String, uuid: String, value: String): MessageAction = {
    val __obj = js.Dynamic.literal(actionTimetoken = actionTimetoken.asInstanceOf[js.Any], messageTimetoken = messageTimetoken.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageAction] (val x: Self) extends AnyVal {
    
    inline def setActionTimetoken(value: String): Self = StObject.set(x, "actionTimetoken", value.asInstanceOf[js.Any])
    
    inline def setMessageTimetoken(value: String): Self = StObject.set(x, "messageTimetoken", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
