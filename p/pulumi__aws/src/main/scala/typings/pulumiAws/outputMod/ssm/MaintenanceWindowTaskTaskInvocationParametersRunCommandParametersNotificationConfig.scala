package typings.pulumiAws.outputMod.ssm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig extends StObject {
  
  /**
    * An Amazon Resource Name (ARN) for a Simple Notification Service (SNS) topic. Run Command pushes notifications about command status changes to this topic.
    */
  var notificationArn: js.UndefOr[String] = js.undefined
  
  /**
    * The different events for which you can receive notifications. Valid values: `All`, `InProgress`, `Success`, `TimedOut`, `Cancelled`, and `Failed`
    */
  var notificationEvents: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * When specified with `Command`, receive notification when the status of a command changes. When specified with `Invocation`, for commands sent to multiple instances, receive notification on a per-instance basis when the status of a command changes. Valid values: `Command` and `Invocation`
    */
  var notificationType: js.UndefOr[String] = js.undefined
}
object MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig {
  
  inline def apply(): MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig]
  }
  
  extension [Self <: MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig](x: Self) {
    
    inline def setNotificationArn(value: String): Self = StObject.set(x, "notificationArn", value.asInstanceOf[js.Any])
    
    inline def setNotificationArnUndefined: Self = StObject.set(x, "notificationArn", js.undefined)
    
    inline def setNotificationEvents(value: js.Array[String]): Self = StObject.set(x, "notificationEvents", value.asInstanceOf[js.Any])
    
    inline def setNotificationEventsUndefined: Self = StObject.set(x, "notificationEvents", js.undefined)
    
    inline def setNotificationEventsVarargs(value: String*): Self = StObject.set(x, "notificationEvents", js.Array(value :_*))
    
    inline def setNotificationType(value: String): Self = StObject.set(x, "notificationType", value.asInstanceOf[js.Any])
    
    inline def setNotificationTypeUndefined: Self = StObject.set(x, "notificationType", js.undefined)
  }
}
