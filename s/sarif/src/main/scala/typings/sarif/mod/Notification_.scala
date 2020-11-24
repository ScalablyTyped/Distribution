package typings.sarif.mod

import typings.sarif.mod.Notification.level
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Notification_ extends js.Object {
  
  /**
    * A reference used to locate the rule descriptor associated with this notification.
    */
  var associatedRule: js.UndefOr[ReportingDescriptorReference] = js.native
  
  /**
    * A reference used to locate the descriptor relevant to this notification.
    */
  var descriptor: js.UndefOr[ReportingDescriptorReference] = js.native
  
  /**
    * The runtime exception, if any, relevant to this notification.
    */
  var exception: js.UndefOr[Exception] = js.native
  
  /**
    * A value specifying the severity level of the notification.
    */
  var level: js.UndefOr[level] = js.native
  
  /**
    * The locations relevant to this notification.
    */
  var locations: js.UndefOr[js.Array[Location]] = js.native
  
  /**
    * A message that describes the condition that was encountered.
    */
  var message: Message = js.native
  
  /**
    * Key/value pairs that provide additional information about the notification.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  
  /**
    * The thread identifier of the code that generated the notification.
    */
  var threadId: js.UndefOr[Double] = js.native
  
  /**
    * The Coordinated Universal Time (UTC) date and time at which the analysis tool generated the notification.
    */
  var timeUtc: js.UndefOr[String] = js.native
}
object Notification_ {
  
  @scala.inline
  def apply(message: Message): Notification_ = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notification_]
  }
  
  @scala.inline
  implicit class Notification_Ops[Self <: Notification_] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: Message): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatedRule(value: ReportingDescriptorReference): Self = this.set("associatedRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociatedRule: Self = this.set("associatedRule", js.undefined)
    
    @scala.inline
    def setDescriptor(value: ReportingDescriptorReference): Self = this.set("descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescriptor: Self = this.set("descriptor", js.undefined)
    
    @scala.inline
    def setException(value: Exception): Self = this.set("exception", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteException: Self = this.set("exception", js.undefined)
    
    @scala.inline
    def setLevel(value: level): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setLocationsVarargs(value: Location*): Self = this.set("locations", js.Array(value :_*))
    
    @scala.inline
    def setLocations(value: js.Array[Location]): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setThreadId(value: Double): Self = this.set("threadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreadId: Self = this.set("threadId", js.undefined)
    
    @scala.inline
    def setTimeUtc(value: String): Self = this.set("timeUtc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeUtc: Self = this.set("timeUtc", js.undefined)
  }
}
