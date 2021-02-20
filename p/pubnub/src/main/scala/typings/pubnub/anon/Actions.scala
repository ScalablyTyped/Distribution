package typings.pubnub.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Actions extends StObject {
  
  var actions: StringDictionary[StringDictionary[js.Array[ActionTimetoken]]] = js.native
  
  var channel: String = js.native
  
  var message: js.Any = js.native
  
  var meta: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var timetoken: String | Double = js.native
}
object Actions {
  
  @scala.inline
  def apply(
    actions: StringDictionary[StringDictionary[js.Array[ActionTimetoken]]],
    channel: String,
    message: js.Any,
    timetoken: String | Double
  ): Actions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions]
  }
  
  @scala.inline
  implicit class ActionsMutableBuilder[Self <: Actions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: StringDictionary[StringDictionary[js.Array[ActionTimetoken]]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: js.Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: StringDictionary[js.Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    @scala.inline
    def setTimetoken(value: String | Double): Self = StObject.set(x, "timetoken", value.asInstanceOf[js.Any])
  }
}
