package typings.pulumiAws.logGroupMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecodedLogGroupEvent extends js.Object {
  
  var logEvents: js.Array[LogGroupEventRecord] = js.native
  
  var logGroup: String = js.native
  
  var logStream: String = js.native
  
  var messageType: String = js.native
  
  var owner: String = js.native
  
  var subscriptionFilters: js.Array[String] = js.native
}
object DecodedLogGroupEvent {
  
  @scala.inline
  def apply(
    logEvents: js.Array[LogGroupEventRecord],
    logGroup: String,
    logStream: String,
    messageType: String,
    owner: String,
    subscriptionFilters: js.Array[String]
  ): DecodedLogGroupEvent = {
    val __obj = js.Dynamic.literal(logEvents = logEvents.asInstanceOf[js.Any], logGroup = logGroup.asInstanceOf[js.Any], logStream = logStream.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], subscriptionFilters = subscriptionFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodedLogGroupEvent]
  }
  
  @scala.inline
  implicit class DecodedLogGroupEventOps[Self <: DecodedLogGroupEvent] (val x: Self) extends AnyVal {
    
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
    def setLogEventsVarargs(value: LogGroupEventRecord*): Self = this.set("logEvents", js.Array(value :_*))
    
    @scala.inline
    def setLogEvents(value: js.Array[LogGroupEventRecord]): Self = this.set("logEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroup(value: String): Self = this.set("logGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogStream(value: String): Self = this.set("logStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageType(value: String): Self = this.set("messageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionFiltersVarargs(value: String*): Self = this.set("subscriptionFilters", js.Array(value :_*))
    
    @scala.inline
    def setSubscriptionFilters(value: js.Array[String]): Self = this.set("subscriptionFilters", value.asInstanceOf[js.Any])
  }
}
