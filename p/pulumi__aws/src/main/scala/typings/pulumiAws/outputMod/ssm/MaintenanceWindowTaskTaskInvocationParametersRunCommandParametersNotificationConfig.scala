package typings.pulumiAws.outputMod.ssm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig extends js.Object {
  
  /**
    * An Amazon Resource Name (ARN) for a Simple Notification Service (SNS) topic. Run Command pushes notifications about command status changes to this topic.
    */
  var notificationArn: js.UndefOr[String] = js.native
  
  /**
    * The different events for which you can receive notifications. Valid values: `All`, `InProgress`, `Success`, `TimedOut`, `Cancelled`, and `Failed`
    */
  var notificationEvents: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * When specified with `Command`, receive notification when the status of a command changes. When specified with `Invocation`, for commands sent to multiple instances, receive notification on a per-instance basis when the status of a command changes. Valid values: `Command` and `Invocation`
    */
  var notificationType: js.UndefOr[String] = js.native
}
object MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig {
  
  @scala.inline
  def apply(): MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig]
  }
  
  @scala.inline
  implicit class MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfigOps[Self <: MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig] (val x: Self) extends AnyVal {
    
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
    def setNotificationArn(value: String): Self = this.set("notificationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationArn: Self = this.set("notificationArn", js.undefined)
    
    @scala.inline
    def setNotificationEventsVarargs(value: String*): Self = this.set("notificationEvents", js.Array(value :_*))
    
    @scala.inline
    def setNotificationEvents(value: js.Array[String]): Self = this.set("notificationEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationEvents: Self = this.set("notificationEvents", js.undefined)
    
    @scala.inline
    def setNotificationType(value: String): Self = this.set("notificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationType: Self = this.set("notificationType", js.undefined)
  }
}
