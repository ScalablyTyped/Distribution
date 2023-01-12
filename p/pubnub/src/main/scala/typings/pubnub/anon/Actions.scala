package typings.pubnub.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actions extends StObject {
  
  var actions: StringDictionary[StringDictionary[js.Array[ActionTimetoken]]]
  
  var channel: String
  
  var message: Any
  
  var messageType: js.UndefOr[String | Double] = js.undefined
  
  var meta: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var timetoken: String | Double
  
  var uuid: js.UndefOr[String] = js.undefined
}
object Actions {
  
  inline def apply(
    actions: StringDictionary[StringDictionary[js.Array[ActionTimetoken]]],
    channel: String,
    message: Any,
    timetoken: String | Double
  ): Actions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Actions] (val x: Self) extends AnyVal {
    
    inline def setActions(value: StringDictionary[StringDictionary[js.Array[ActionTimetoken]]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageType(value: String | Double): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    inline def setMessageTypeUndefined: Self = StObject.set(x, "messageType", js.undefined)
    
    inline def setMeta(value: StringDictionary[Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setTimetoken(value: String | Double): Self = StObject.set(x, "timetoken", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
