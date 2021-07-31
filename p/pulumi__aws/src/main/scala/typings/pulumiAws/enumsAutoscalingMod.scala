package typings.pulumiAws

import typings.pulumiAws.pulumiAwsStrings.`1Minute`
import typings.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_LAUNCH
import typings.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_LAUNCH_ERROR
import typings.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_TERMINATE
import typings.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_TERMINATE_ERROR
import typings.pulumiAws.pulumiAwsStrings.autoscalingColonTEST_NOTIFICATION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enumsAutoscalingMod {
  
  /* Inlined { readonly GroupMinSize :'GroupMinSize',  readonly GroupMaxSize :'GroupMaxSize',  readonly GroupDesiredCapacity :'GroupDesiredCapacity',  readonly GroupInServiceInstances :'GroupInServiceInstances',  readonly GroupInServiceCapacity :'GroupInServiceCapacity',  readonly GroupPendingInstances :'GroupPendingInstances',  readonly GroupPendingCapacity :'GroupPendingCapacity',  readonly GroupStandbyInstances :'GroupStandbyInstances',  readonly GroupStandbyCapacity :'GroupStandbyCapacity',  readonly GroupTerminatingInstances :'GroupTerminatingInstances',  readonly GroupTerminatingCapacity :'GroupTerminatingCapacity',  readonly GroupTotalInstances :'GroupTotalInstances',  readonly GroupTotalCapacity :'GroupTotalCapacity'}[keyof { readonly GroupMinSize :'GroupMinSize',  readonly GroupMaxSize :'GroupMaxSize',  readonly GroupDesiredCapacity :'GroupDesiredCapacity',  readonly GroupInServiceInstances :'GroupInServiceInstances',  readonly GroupInServiceCapacity :'GroupInServiceCapacity',  readonly GroupPendingInstances :'GroupPendingInstances',  readonly GroupPendingCapacity :'GroupPendingCapacity',  readonly GroupStandbyInstances :'GroupStandbyInstances',  readonly GroupStandbyCapacity :'GroupStandbyCapacity',  readonly GroupTerminatingInstances :'GroupTerminatingInstances',  readonly GroupTerminatingCapacity :'GroupTerminatingCapacity',  readonly GroupTotalInstances :'GroupTotalInstances',  readonly GroupTotalCapacity :'GroupTotalCapacity'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.pulumiAws.pulumiAwsStrings.GroupStandbyInstances
    - typings.pulumiAws.pulumiAwsStrings.GroupInServiceCapacity
    - typings.pulumiAws.pulumiAwsStrings.GroupTerminatingInstances
    - typings.pulumiAws.pulumiAwsStrings.GroupTotalCapacity
    - typings.pulumiAws.pulumiAwsStrings.GroupMinSize
    - typings.pulumiAws.pulumiAwsStrings.GroupMaxSize
    - typings.pulumiAws.pulumiAwsStrings.GroupPendingInstances
    - typings.pulumiAws.pulumiAwsStrings.GroupStandbyCapacity
    - typings.pulumiAws.pulumiAwsStrings.GroupTerminatingCapacity
    - typings.pulumiAws.pulumiAwsStrings.GroupPendingCapacity
    - typings.pulumiAws.pulumiAwsStrings.GroupTotalInstances
    - typings.pulumiAws.pulumiAwsStrings.GroupDesiredCapacity
    - typings.pulumiAws.pulumiAwsStrings.GroupInServiceInstances
  */
  trait Metric extends StObject
  object Metric {
    
    @JSImport("@pulumi/aws/types/enums/autoscaling", "Metric.GroupDesiredCapacity")
    @js.native
    val GroupDesiredCapacity: typings.pulumiAws.pulumiAwsStrings.GroupDesiredCapacity = js.native
    
    @JSImport("@pulumi/aws/types/enums/autoscaling", "Metric.GroupInServiceCapacity")
    @js.native
    val GroupInServiceCapacity: typings.pulumiAws.pulumiAwsStrings.GroupInServiceCapacity = js.native
    
    @JSImport("@pulumi/aws/types/enums/autoscaling", "Metric.GroupInServiceInstances")
    @js.native
    val GroupInServiceInstances: typings.pulumiAws.pulumiAwsStrings.GroupInServiceInstances = js.native
    
    @JSImport("@pulumi/aws/types/enums/autoscaling", "Metric.GroupMaxSize")
    @js.native
    val GroupMaxSize: typings.pulumiAws.pulumiAwsStrings.GroupMaxSize = js.native
    
    @JSImport("@pulumi/aws/types/enums/autoscaling", "Metric.GroupMinSize")
    @js.native
    val GroupMinSize: typings.pulumiAws.pulumiAwsStrings.GroupMinSize = js.native
    
    @JSImport("@pulumi/aws/types/enums/autoscaling", "Metric.GroupPendingCapacity")
    @js.native
    val GroupPendingCapacity: typings.pulumiAws.pulumiAwsStrings.GroupPendingCapacity = js.native
    
    @JSImport("@pulumi/aws/types/enums/autoscaling", "Metric.GroupPendingInstances")
    @js.native
    val GroupPendingInstances: typings.pulumiAws.pulumiAwsStrings.GroupPendingInstances = js.native
    
    @JSImport("@pulumi/aws/types/enums/autoscaling", "Metric.GroupStandbyCapacity")
    @js.native
    val GroupStandbyCapacity: typings.pulumiAws.pulumiAwsStrings.GroupStandbyCapacity = js.native
    
    @JSImport("@pulumi/aws/types/enums/autoscaling", "Metric.GroupStandbyInstances")
    @js.native
    val GroupStandbyInstances: typings.pulumiAws.pulumiAwsStrings.GroupStandbyInstances = js.native
    
    @JSImport("@pulumi/aws/types/enums/autoscaling", "Metric.GroupTerminatingCapacity")
    @js.native
    val GroupTerminatingCapacity: typings.pulumiAws.pulumiAwsStrings.GroupTerminatingCapacity = js.native
    
    @JSImport("@pulumi/aws/types/enums/autoscaling", "Metric.GroupTerminatingInstances")
    @js.native
    val GroupTerminatingInstances: typings.pulumiAws.pulumiAwsStrings.GroupTerminatingInstances = js.native
    
    @JSImport("@pulumi/aws/types/enums/autoscaling", "Metric.GroupTotalCapacity")
    @js.native
    val GroupTotalCapacity: typings.pulumiAws.pulumiAwsStrings.GroupTotalCapacity = js.native
    
    @JSImport("@pulumi/aws/types/enums/autoscaling", "Metric.GroupTotalInstances")
    @js.native
    val GroupTotalInstances: typings.pulumiAws.pulumiAwsStrings.GroupTotalInstances = js.native
  }
  
  object MetricsGranularity {
    
    @JSImport("@pulumi/aws/types/enums/autoscaling", "MetricsGranularity.OneMinute")
    @js.native
    val OneMinute: `1Minute` = js.native
  }
  /* Inlined { readonly OneMinute :'1Minute'}[keyof { readonly OneMinute :'1Minute'}] */
  type MetricsGranularity = `1Minute`
  
  /* Inlined { readonly InstanceLaunch :'autoscaling:EC2_INSTANCE_LAUNCH',  readonly InstanceTerminate :'autoscaling:EC2_INSTANCE_TERMINATE',  readonly InstanceLaunchError :'autoscaling:EC2_INSTANCE_LAUNCH_ERROR',  readonly InstanceTerminateError :'autoscaling:EC2_INSTANCE_TERMINATE_ERROR',  readonly TestNotification :'autoscaling:TEST_NOTIFICATION'}[keyof { readonly InstanceLaunch :'autoscaling:EC2_INSTANCE_LAUNCH',  readonly InstanceTerminate :'autoscaling:EC2_INSTANCE_TERMINATE',  readonly InstanceLaunchError :'autoscaling:EC2_INSTANCE_LAUNCH_ERROR',  readonly InstanceTerminateError :'autoscaling:EC2_INSTANCE_TERMINATE_ERROR',  readonly TestNotification :'autoscaling:TEST_NOTIFICATION'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_LAUNCH_ERROR
    - typings.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_TERMINATE
    - typings.pulumiAws.pulumiAwsStrings.autoscalingColonTEST_NOTIFICATION
    - typings.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_LAUNCH
    - typings.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_TERMINATE_ERROR
  */
  trait NotificationType extends StObject
  object NotificationType {
    
    @JSImport("@pulumi/aws/types/enums/autoscaling", "NotificationType.InstanceLaunch")
    @js.native
    val InstanceLaunch: autoscalingColonEC2_INSTANCE_LAUNCH = js.native
    
    @JSImport("@pulumi/aws/types/enums/autoscaling", "NotificationType.InstanceLaunchError")
    @js.native
    val InstanceLaunchError: autoscalingColonEC2_INSTANCE_LAUNCH_ERROR = js.native
    
    @JSImport("@pulumi/aws/types/enums/autoscaling", "NotificationType.InstanceTerminate")
    @js.native
    val InstanceTerminate: autoscalingColonEC2_INSTANCE_TERMINATE = js.native
    
    @JSImport("@pulumi/aws/types/enums/autoscaling", "NotificationType.InstanceTerminateError")
    @js.native
    val InstanceTerminateError: autoscalingColonEC2_INSTANCE_TERMINATE_ERROR = js.native
    
    @JSImport("@pulumi/aws/types/enums/autoscaling", "NotificationType.TestNotification")
    @js.native
    val TestNotification: autoscalingColonTEST_NOTIFICATION = js.native
  }
}
