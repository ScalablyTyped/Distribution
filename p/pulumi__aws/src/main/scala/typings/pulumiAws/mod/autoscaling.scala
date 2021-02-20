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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoscaling {
  
  @JSImport("@pulumi/aws", "autoscaling")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws", "autoscaling.Attachment")
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
  object Attachment {
    
    /**
      * Get an existing Attachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "autoscaling.Attachment.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.attachmentMod.Attachment = js.native
    @JSImport("@pulumi/aws", "autoscaling.Attachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.attachmentMod.Attachment = js.native
    @JSImport("@pulumi/aws", "autoscaling.Attachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: AttachmentState): typings.pulumiAws.attachmentMod.Attachment = js.native
    @JSImport("@pulumi/aws", "autoscaling.Attachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: AttachmentState, opts: CustomResourceOptions): typings.pulumiAws.attachmentMod.Attachment = js.native
    
    /**
      * Returns true if the given object is an instance of Attachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "autoscaling.Attachment.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/attachment.Attachment */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "autoscaling.Group")
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
  object Group {
    
    /**
      * Get an existing Group resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "autoscaling.Group.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.groupMod.Group = js.native
    @JSImport("@pulumi/aws", "autoscaling.Group.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.groupMod.Group = js.native
    @JSImport("@pulumi/aws", "autoscaling.Group.get")
    @js.native
    def get(name: String, id: Input[ID], state: GroupState): typings.pulumiAws.groupMod.Group = js.native
    @JSImport("@pulumi/aws", "autoscaling.Group.get")
    @js.native
    def get(name: String, id: Input[ID], state: GroupState, opts: CustomResourceOptions): typings.pulumiAws.groupMod.Group = js.native
    
    /**
      * Returns true if the given object is an instance of Group.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "autoscaling.Group.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/group.Group */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "autoscaling.GroupDesiredCapacityMetric")
  @js.native
  def GroupDesiredCapacityMetric: Metric = js.native
  @scala.inline
  def GroupDesiredCapacityMetric_=(x: Metric): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GroupDesiredCapacityMetric")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "autoscaling.GroupInServiceInstancesMetric")
  @js.native
  def GroupInServiceInstancesMetric: Metric = js.native
  @scala.inline
  def GroupInServiceInstancesMetric_=(x: Metric): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GroupInServiceInstancesMetric")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "autoscaling.GroupMaxSizeMetric")
  @js.native
  def GroupMaxSizeMetric: Metric = js.native
  @scala.inline
  def GroupMaxSizeMetric_=(x: Metric): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GroupMaxSizeMetric")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "autoscaling.GroupMinSizeMetric")
  @js.native
  def GroupMinSizeMetric: Metric = js.native
  @scala.inline
  def GroupMinSizeMetric_=(x: Metric): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GroupMinSizeMetric")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "autoscaling.GroupPendingInstances")
  @js.native
  def GroupPendingInstances: Metric = js.native
  @scala.inline
  def GroupPendingInstances_=(x: Metric): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GroupPendingInstances")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "autoscaling.GroupStandbyInstances")
  @js.native
  def GroupStandbyInstances: Metric = js.native
  @scala.inline
  def GroupStandbyInstances_=(x: Metric): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GroupStandbyInstances")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "autoscaling.GroupTerminatingInstances")
  @js.native
  def GroupTerminatingInstances: Metric = js.native
  @scala.inline
  def GroupTerminatingInstances_=(x: Metric): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GroupTerminatingInstances")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "autoscaling.GroupTotalInstances")
  @js.native
  def GroupTotalInstances: Metric = js.native
  @scala.inline
  def GroupTotalInstances_=(x: Metric): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GroupTotalInstances")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "autoscaling.InstanceLaunchErrorNotification")
  @js.native
  def InstanceLaunchErrorNotification: NotificationType = js.native
  @scala.inline
  def InstanceLaunchErrorNotification_=(x: NotificationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InstanceLaunchErrorNotification")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "autoscaling.InstanceLaunchNotification")
  @js.native
  def InstanceLaunchNotification: NotificationType = js.native
  @scala.inline
  def InstanceLaunchNotification_=(x: NotificationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InstanceLaunchNotification")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "autoscaling.InstanceTerminateErrorNotification")
  @js.native
  def InstanceTerminateErrorNotification: NotificationType = js.native
  @scala.inline
  def InstanceTerminateErrorNotification_=(x: NotificationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InstanceTerminateErrorNotification")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "autoscaling.InstanceTerminateNotification")
  @js.native
  def InstanceTerminateNotification: NotificationType = js.native
  @scala.inline
  def InstanceTerminateNotification_=(x: NotificationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InstanceTerminateNotification")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "autoscaling.LifecycleHook")
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
  object LifecycleHook {
    
    /**
      * Get an existing LifecycleHook resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "autoscaling.LifecycleHook.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.lifecycleHookMod.LifecycleHook = js.native
    @JSImport("@pulumi/aws", "autoscaling.LifecycleHook.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.lifecycleHookMod.LifecycleHook = js.native
    @JSImport("@pulumi/aws", "autoscaling.LifecycleHook.get")
    @js.native
    def get(name: String, id: Input[ID], state: LifecycleHookState): typings.pulumiAws.lifecycleHookMod.LifecycleHook = js.native
    @JSImport("@pulumi/aws", "autoscaling.LifecycleHook.get")
    @js.native
    def get(name: String, id: Input[ID], state: LifecycleHookState, opts: CustomResourceOptions): typings.pulumiAws.lifecycleHookMod.LifecycleHook = js.native
    
    /**
      * Returns true if the given object is an instance of LifecycleHook.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "autoscaling.LifecycleHook.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/lifecycleHook.LifecycleHook */ Boolean = js.native
  }
  
  object Metric {
    
    @JSImport("@pulumi/aws", "autoscaling.Metric.GroupDesiredCapacity")
    @js.native
    val GroupDesiredCapacity: typings.pulumiAws.pulumiAwsStrings.GroupDesiredCapacity = js.native
    
    @JSImport("@pulumi/aws", "autoscaling.Metric.GroupInServiceCapacity")
    @js.native
    val GroupInServiceCapacity: typings.pulumiAws.pulumiAwsStrings.GroupInServiceCapacity = js.native
    
    @JSImport("@pulumi/aws", "autoscaling.Metric.GroupInServiceInstances")
    @js.native
    val GroupInServiceInstances: typings.pulumiAws.pulumiAwsStrings.GroupInServiceInstances = js.native
    
    @JSImport("@pulumi/aws", "autoscaling.Metric.GroupMaxSize")
    @js.native
    val GroupMaxSize: typings.pulumiAws.pulumiAwsStrings.GroupMaxSize = js.native
    
    @JSImport("@pulumi/aws", "autoscaling.Metric.GroupMinSize")
    @js.native
    val GroupMinSize: typings.pulumiAws.pulumiAwsStrings.GroupMinSize = js.native
    
    @JSImport("@pulumi/aws", "autoscaling.Metric.GroupPendingCapacity")
    @js.native
    val GroupPendingCapacity: typings.pulumiAws.pulumiAwsStrings.GroupPendingCapacity = js.native
    
    @JSImport("@pulumi/aws", "autoscaling.Metric.GroupPendingInstances")
    @js.native
    val GroupPendingInstances: typings.pulumiAws.pulumiAwsStrings.GroupPendingInstances = js.native
    
    @JSImport("@pulumi/aws", "autoscaling.Metric.GroupStandbyCapacity")
    @js.native
    val GroupStandbyCapacity: typings.pulumiAws.pulumiAwsStrings.GroupStandbyCapacity = js.native
    
    @JSImport("@pulumi/aws", "autoscaling.Metric.GroupStandbyInstances")
    @js.native
    val GroupStandbyInstances: typings.pulumiAws.pulumiAwsStrings.GroupStandbyInstances = js.native
    
    @JSImport("@pulumi/aws", "autoscaling.Metric.GroupTerminatingCapacity")
    @js.native
    val GroupTerminatingCapacity: typings.pulumiAws.pulumiAwsStrings.GroupTerminatingCapacity = js.native
    
    @JSImport("@pulumi/aws", "autoscaling.Metric.GroupTerminatingInstances")
    @js.native
    val GroupTerminatingInstances: typings.pulumiAws.pulumiAwsStrings.GroupTerminatingInstances = js.native
    
    @JSImport("@pulumi/aws", "autoscaling.Metric.GroupTotalCapacity")
    @js.native
    val GroupTotalCapacity: typings.pulumiAws.pulumiAwsStrings.GroupTotalCapacity = js.native
    
    @JSImport("@pulumi/aws", "autoscaling.Metric.GroupTotalInstances")
    @js.native
    val GroupTotalInstances: typings.pulumiAws.pulumiAwsStrings.GroupTotalInstances = js.native
  }
  
  object MetricsGranularity {
    
    @JSImport("@pulumi/aws", "autoscaling.MetricsGranularity.OneMinute")
    @js.native
    val OneMinute: `1Minute` = js.native
  }
  
  @JSImport("@pulumi/aws", "autoscaling.Notification")
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
  object Notification {
    
    /**
      * Get an existing Notification resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "autoscaling.Notification.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.notificationMod.Notification = js.native
    @JSImport("@pulumi/aws", "autoscaling.Notification.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.notificationMod.Notification = js.native
    @JSImport("@pulumi/aws", "autoscaling.Notification.get")
    @js.native
    def get(name: String, id: Input[ID], state: NotificationState): typings.pulumiAws.notificationMod.Notification = js.native
    @JSImport("@pulumi/aws", "autoscaling.Notification.get")
    @js.native
    def get(name: String, id: Input[ID], state: NotificationState, opts: CustomResourceOptions): typings.pulumiAws.notificationMod.Notification = js.native
    
    /**
      * Returns true if the given object is an instance of Notification.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "autoscaling.Notification.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/notification.Notification */ Boolean = js.native
  }
  
  object NotificationType {
    
    @JSImport("@pulumi/aws", "autoscaling.NotificationType.InstanceLaunch")
    @js.native
    val InstanceLaunch: autoscalingColonEC2_INSTANCE_LAUNCH = js.native
    
    @JSImport("@pulumi/aws", "autoscaling.NotificationType.InstanceLaunchError")
    @js.native
    val InstanceLaunchError: autoscalingColonEC2_INSTANCE_LAUNCH_ERROR = js.native
    
    @JSImport("@pulumi/aws", "autoscaling.NotificationType.InstanceTerminate")
    @js.native
    val InstanceTerminate: autoscalingColonEC2_INSTANCE_TERMINATE = js.native
    
    @JSImport("@pulumi/aws", "autoscaling.NotificationType.InstanceTerminateError")
    @js.native
    val InstanceTerminateError: autoscalingColonEC2_INSTANCE_TERMINATE_ERROR = js.native
    
    @JSImport("@pulumi/aws", "autoscaling.NotificationType.TestNotification")
    @js.native
    val TestNotification: autoscalingColonTEST_NOTIFICATION = js.native
  }
  
  @JSImport("@pulumi/aws", "autoscaling.OneMinuteMetricsGranularity")
  @js.native
  def OneMinuteMetricsGranularity: MetricsGranularity = js.native
  @scala.inline
  def OneMinuteMetricsGranularity_=(x: MetricsGranularity): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OneMinuteMetricsGranularity")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "autoscaling.Policy")
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
  object Policy {
    
    /**
      * Get an existing Policy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "autoscaling.Policy.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.autoscalingPolicyMod.Policy = js.native
    @JSImport("@pulumi/aws", "autoscaling.Policy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.autoscalingPolicyMod.Policy = js.native
    @JSImport("@pulumi/aws", "autoscaling.Policy.get")
    @js.native
    def get(name: String, id: Input[ID], state: PolicyState): typings.pulumiAws.autoscalingPolicyMod.Policy = js.native
    @JSImport("@pulumi/aws", "autoscaling.Policy.get")
    @js.native
    def get(name: String, id: Input[ID], state: PolicyState, opts: CustomResourceOptions): typings.pulumiAws.autoscalingPolicyMod.Policy = js.native
    
    /**
      * Returns true if the given object is an instance of Policy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "autoscaling.Policy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/policy.Policy */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "autoscaling.Schedule")
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
  object Schedule {
    
    /**
      * Get an existing Schedule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "autoscaling.Schedule.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.scheduleMod.Schedule = js.native
    @JSImport("@pulumi/aws", "autoscaling.Schedule.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.scheduleMod.Schedule = js.native
    @JSImport("@pulumi/aws", "autoscaling.Schedule.get")
    @js.native
    def get(name: String, id: Input[ID], state: ScheduleState): typings.pulumiAws.scheduleMod.Schedule = js.native
    @JSImport("@pulumi/aws", "autoscaling.Schedule.get")
    @js.native
    def get(name: String, id: Input[ID], state: ScheduleState, opts: CustomResourceOptions): typings.pulumiAws.scheduleMod.Schedule = js.native
    
    /**
      * Returns true if the given object is an instance of Schedule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "autoscaling.Schedule.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/schedule.Schedule */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "autoscaling.TestNotification")
  @js.native
  def TestNotification: NotificationType = js.native
  @scala.inline
  def TestNotification_=(x: NotificationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TestNotification")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "autoscaling.getGroup")
  @js.native
  def getGroup(args: GetGroupArgs): js.Promise[GetGroupResult] = js.native
  @JSImport("@pulumi/aws", "autoscaling.getGroup")
  @js.native
  def getGroup(args: GetGroupArgs, opts: InvokeOptions): js.Promise[GetGroupResult] = js.native
}
