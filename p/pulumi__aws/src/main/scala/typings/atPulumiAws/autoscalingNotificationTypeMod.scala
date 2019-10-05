package typings.atPulumiAws

import typings.atPulumiAws.autoscalingNotificationTypeMod.NotificationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/autoscaling/notificationType", JSImport.Namespace)
@js.native
object autoscalingNotificationTypeMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.atPulumiAws.atPulumiAwsStrings.`autoscaling:EC2_INSTANCE_LAUNCH`
    - typings.atPulumiAws.atPulumiAwsStrings.`autoscaling:EC2_INSTANCE_TERMINATE`
    - typings.atPulumiAws.atPulumiAwsStrings.`autoscaling:EC2_INSTANCE_LAUNCH_ERROR`
    - typings.atPulumiAws.atPulumiAwsStrings.`autoscaling:EC2_INSTANCE_TERMINATE_ERROR`
    - typings.atPulumiAws.atPulumiAwsStrings.`autoscaling:TEST_NOTIFICATION`
  */
  trait NotificationType extends js.Object
  
  var InstanceLaunchErrorNotification: NotificationType = js.native
  var InstanceLaunchNotification: NotificationType = js.native
  var InstanceTerminateErrorNotification: NotificationType = js.native
  var InstanceTerminateNotification: NotificationType = js.native
  var TestNotification: NotificationType = js.native
}

