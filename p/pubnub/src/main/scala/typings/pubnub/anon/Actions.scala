package typings.pubnub.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Actions extends js.Object {
  
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
  implicit class ActionsOps[Self <: Actions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActions(value: StringDictionary[StringDictionary[js.Array[ActionTimetoken]]]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: js.Any): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimetoken(value: String | Double): Self = this.set("timetoken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: StringDictionary[js.Any]): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
  }
}
