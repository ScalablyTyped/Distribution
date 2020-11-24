package typings.pulumiAws.mod

import typings.pulumiAws.attachmentMod.AttachmentArgs
import typings.pulumiAws.attachmentMod.AttachmentState
import typings.pulumiAws.autoscalingPolicyMod.PolicyArgs
import typings.pulumiAws.autoscalingPolicyMod.PolicyState
import typings.pulumiAws.enumsAutoscalingMod.Metric
import typings.pulumiAws.enumsAutoscalingMod.MetricsGranularity
import typings.pulumiAws.enumsAutoscalingMod.NotificationType
import typings.pulumiAws.getGroupMod.GetGroupArgs
import typings.pulumiAws.getGroupMod.GetGroupResult
import typings.pulumiAws.groupMod.GroupArgs
import typings.pulumiAws.groupMod.GroupState
import typings.pulumiAws.lifecycleHookMod.LifecycleHookArgs
import typings.pulumiAws.lifecycleHookMod.LifecycleHookState
import typings.pulumiAws.notificationMod.NotificationArgs
import typings.pulumiAws.notificationMod.NotificationState
import typings.pulumiAws.pulumiAwsStrings.`1Minute`
import typings.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_LAUNCH
import typings.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_LAUNCH_ERROR
import typings.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_TERMINATE
import typings.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_TERMINATE_ERROR
import typings.pulumiAws.pulumiAwsStrings.autoscalingColonTEST_NOTIFICATION
import typings.pulumiAws.scheduleMod.ScheduleArgs
import typings.pulumiAws.scheduleMod.ScheduleState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "autoscaling")
@js.native
object autoscaling extends js.Object {
  
  var GroupDesiredCapacityMetric: Metric = js.native
  
  var GroupInServiceInstancesMetric: Metric = js.native
  
  var GroupMaxSizeMetric: Metric = js.native
  
  var GroupMinSizeMetric: Metric = js.native
  
  var GroupPendingInstances: Metric = js.native
  
  var GroupStandbyInstances: Metric = js.native
  
  var GroupTerminatingInstances: Metric = js.native
  
  var GroupTotalInstances: Metric = js.native
  
  var InstanceLaunchErrorNotification: NotificationType = js.native
  
  var InstanceLaunchNotification: NotificationType = js.native
  
  var InstanceTerminateErrorNotification: NotificationType = js.native
  
  var InstanceTerminateNotification: NotificationType = js.native
  
  var OneMinuteMetricsGranularity: MetricsGranularity = js.native
  
  var TestNotification: NotificationType = js.native
  
  def getGroup(args: GetGroupArgs): js.Promise[GetGroupResult] = js.native
  def getGroup(args: GetGroupArgs, opts: InvokeOptions): js.Promise[GetGroupResult] = js.native
  
  @js.native
  class Attachment protected ()
    extends typings.pulumiAws.autoscalingMod.Attachment {
    /**
      * Create a Attachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AttachmentArgs) = this()
    def this(name: String, args: AttachmentArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object Attachment extends js.Object {
    
    /**
      * Get an existing Attachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.attachmentMod.Attachment = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.attachmentMod.Attachment = js.native
    def get(name: String, id: Input[ID], state: AttachmentState): typings.pulumiAws.attachmentMod.Attachment = js.native
    def get(name: String, id: Input[ID], state: AttachmentState, opts: CustomResourceOptions): typings.pulumiAws.attachmentMod.Attachment = js.native
    
    /**
      * Returns true if the given object is an instance of Attachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/attachment.Attachment */ Boolean = js.native
  }
  
  @js.native
  class Group protected ()
    extends typings.pulumiAws.autoscalingMod.Group {
    /**
      * Create a Group resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GroupArgs) = this()
    def this(name: String, args: GroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object Group extends js.Object {
    
    /**
      * Get an existing Group resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.groupMod.Group = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.groupMod.Group = js.native
    def get(name: String, id: Input[ID], state: GroupState): typings.pulumiAws.groupMod.Group = js.native
    def get(name: String, id: Input[ID], state: GroupState, opts: CustomResourceOptions): typings.pulumiAws.groupMod.Group = js.native
    
    /**
      * Returns true if the given object is an instance of Group.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/group.Group */ Boolean = js.native
  }
  
  @js.native
  class LifecycleHook protected ()
    extends typings.pulumiAws.autoscalingMod.LifecycleHook {
    /**
      * Create a LifecycleHook resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LifecycleHookArgs) = this()
    def this(name: String, args: LifecycleHookArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object LifecycleHook extends js.Object {
    
    /**
      * Get an existing LifecycleHook resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.lifecycleHookMod.LifecycleHook = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.lifecycleHookMod.LifecycleHook = js.native
    def get(name: String, id: Input[ID], state: LifecycleHookState): typings.pulumiAws.lifecycleHookMod.LifecycleHook = js.native
    def get(name: String, id: Input[ID], state: LifecycleHookState, opts: CustomResourceOptions): typings.pulumiAws.lifecycleHookMod.LifecycleHook = js.native
    
    /**
      * Returns true if the given object is an instance of LifecycleHook.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/lifecycleHook.LifecycleHook */ Boolean = js.native
  }
  
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
  class Notification protected ()
    extends typings.pulumiAws.autoscalingMod.Notification {
    /**
      * Create a Notification resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NotificationArgs) = this()
    def this(name: String, args: NotificationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object Notification extends js.Object {
    
    /**
      * Get an existing Notification resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.notificationMod.Notification = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.notificationMod.Notification = js.native
    def get(name: String, id: Input[ID], state: NotificationState): typings.pulumiAws.notificationMod.Notification = js.native
    def get(name: String, id: Input[ID], state: NotificationState, opts: CustomResourceOptions): typings.pulumiAws.notificationMod.Notification = js.native
    
    /**
      * Returns true if the given object is an instance of Notification.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/notification.Notification */ Boolean = js.native
  }
  
  @js.native
  object NotificationType extends js.Object {
    
    val InstanceLaunch: autoscalingColonEC2_INSTANCE_LAUNCH = js.native
    
    val InstanceLaunchError: autoscalingColonEC2_INSTANCE_LAUNCH_ERROR = js.native
    
    val InstanceTerminate: autoscalingColonEC2_INSTANCE_TERMINATE = js.native
    
    val InstanceTerminateError: autoscalingColonEC2_INSTANCE_TERMINATE_ERROR = js.native
    
    val TestNotification: autoscalingColonTEST_NOTIFICATION = js.native
  }
  
  @js.native
  class Policy protected ()
    extends typings.pulumiAws.autoscalingMod.Policy {
    /**
      * Create a Policy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PolicyArgs) = this()
    def this(name: String, args: PolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object Policy extends js.Object {
    
    /**
      * Get an existing Policy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.autoscalingPolicyMod.Policy = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.autoscalingPolicyMod.Policy = js.native
    def get(name: String, id: Input[ID], state: PolicyState): typings.pulumiAws.autoscalingPolicyMod.Policy = js.native
    def get(name: String, id: Input[ID], state: PolicyState, opts: CustomResourceOptions): typings.pulumiAws.autoscalingPolicyMod.Policy = js.native
    
    /**
      * Returns true if the given object is an instance of Policy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/policy.Policy */ Boolean = js.native
  }
  
  @js.native
  class Schedule protected ()
    extends typings.pulumiAws.autoscalingMod.Schedule {
    /**
      * Create a Schedule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ScheduleArgs) = this()
    def this(name: String, args: ScheduleArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object Schedule extends js.Object {
    
    /**
      * Get an existing Schedule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.scheduleMod.Schedule = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.scheduleMod.Schedule = js.native
    def get(name: String, id: Input[ID], state: ScheduleState): typings.pulumiAws.scheduleMod.Schedule = js.native
    def get(name: String, id: Input[ID], state: ScheduleState, opts: CustomResourceOptions): typings.pulumiAws.scheduleMod.Schedule = js.native
    
    /**
      * Returns true if the given object is an instance of Schedule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/schedule.Schedule */ Boolean = js.native
  }
}
