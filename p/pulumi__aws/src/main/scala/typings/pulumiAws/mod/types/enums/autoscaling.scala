package typings.pulumiAws.mod.types.enums

import typings.pulumiAws.pulumiAwsStrings.`1Minute`
import typings.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_LAUNCH
import typings.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_LAUNCH_ERROR
import typings.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_TERMINATE
import typings.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_TERMINATE_ERROR
import typings.pulumiAws.pulumiAwsStrings.autoscalingColonTEST_NOTIFICATION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "types.enums.autoscaling")
@js.native
object autoscaling extends js.Object {
  
  @js.native
  object Metric extends js.Object {
    
    val GroupDesiredCapacity: typings.pulumiAws.pulumiAwsStrings.GroupDesiredCapacity = js.native
    
    val GroupInServiceCapacity: typings.pulumiAws.pulumiAwsStrings.GroupInServiceCapacity = js.native
    
    val GroupInServiceInstances: typings.pulumiAws.pulumiAwsStrings.GroupInServiceInstances = js.native
    
    val GroupMaxSize: typings.pulumiAws.pulumiAwsStrings.GroupMaxSize = js.native
    
    val GroupMinSize: typings.pulumiAws.pulumiAwsStrings.GroupMinSize = js.native
    
    val GroupPendingCapacity: typings.pulumiAws.pulumiAwsStrings.GroupPendingCapacity = js.native
    
    val GroupPendingInstances: typings.pulumiAws.pulumiAwsStrings.GroupPendingInstances = js.native
    
    val GroupStandbyCapacity: typings.pulumiAws.pulumiAwsStrings.GroupStandbyCapacity = js.native
    
    val GroupStandbyInstances: typings.pulumiAws.pulumiAwsStrings.GroupStandbyInstances = js.native
    
    val GroupTerminatingCapacity: typings.pulumiAws.pulumiAwsStrings.GroupTerminatingCapacity = js.native
    
    val GroupTerminatingInstances: typings.pulumiAws.pulumiAwsStrings.GroupTerminatingInstances = js.native
    
    val GroupTotalCapacity: typings.pulumiAws.pulumiAwsStrings.GroupTotalCapacity = js.native
    
    val GroupTotalInstances: typings.pulumiAws.pulumiAwsStrings.GroupTotalInstances = js.native
  }
  
  @js.native
  object MetricsGranularity extends js.Object {
    
    val OneMinute: `1Minute` = js.native
  }
  
  @js.native
  object NotificationType extends js.Object {
    
    val InstanceLaunch: autoscalingColonEC2_INSTANCE_LAUNCH = js.native
    
    val InstanceLaunchError: autoscalingColonEC2_INSTANCE_LAUNCH_ERROR = js.native
    
    val InstanceTerminate: autoscalingColonEC2_INSTANCE_TERMINATE = js.native
    
    val InstanceTerminateError: autoscalingColonEC2_INSTANCE_TERMINATE_ERROR = js.native
    
    val TestNotification: autoscalingColonTEST_NOTIFICATION = js.native
  }
}
