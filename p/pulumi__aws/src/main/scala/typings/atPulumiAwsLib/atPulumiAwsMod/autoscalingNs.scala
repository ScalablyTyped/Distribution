package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "autoscaling")
@js.native
object autoscalingNs extends js.Object {
  @js.native
  class Attachment protected ()
    extends atPulumiAwsLib.autoscalingMod.Attachment {
    /**
      * Create a Attachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.autoscalingAttachmentMod.AttachmentArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.autoscalingAttachmentMod.AttachmentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Group protected ()
    extends atPulumiAwsLib.autoscalingMod.Group {
    /**
      * Create a Group resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.autoscalingGroupMod.GroupArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.autoscalingGroupMod.GroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class LifecycleHook protected ()
    extends atPulumiAwsLib.autoscalingMod.LifecycleHook {
    /**
      * Create a LifecycleHook resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.autoscalingLifecycleHookMod.LifecycleHookArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.autoscalingLifecycleHookMod.LifecycleHookArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Notification protected ()
    extends atPulumiAwsLib.autoscalingMod.Notification {
    /**
      * Create a Notification resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.autoscalingNotificationMod.NotificationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.autoscalingNotificationMod.NotificationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Policy protected ()
    extends atPulumiAwsLib.autoscalingMod.Policy {
    /**
      * Create a Policy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.autoscalingPolicyMod.PolicyArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.autoscalingPolicyMod.PolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Schedule protected ()
    extends atPulumiAwsLib.autoscalingMod.Schedule {
    /**
      * Create a Schedule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.autoscalingScheduleMod.ScheduleArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.autoscalingScheduleMod.ScheduleArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  var GroupDesiredCapacityMetric: atPulumiAwsLib.autoscalingMetricsMod.Metric = js.native
  var GroupInServiceInstancesMetric: atPulumiAwsLib.autoscalingMetricsMod.Metric = js.native
  var GroupMaxSizeMetric: atPulumiAwsLib.autoscalingMetricsMod.Metric = js.native
  var GroupMinSizeMetric: atPulumiAwsLib.autoscalingMetricsMod.Metric = js.native
  var GroupPendingInstances: atPulumiAwsLib.autoscalingMetricsMod.Metric = js.native
  var GroupStandbyInstances: atPulumiAwsLib.autoscalingMetricsMod.Metric = js.native
  var GroupTerminatingInstances: atPulumiAwsLib.autoscalingMetricsMod.Metric = js.native
  var GroupTotalInstances: atPulumiAwsLib.autoscalingMetricsMod.Metric = js.native
  var InstanceLaunchErrorNotification: atPulumiAwsLib.autoscalingNotificationTypeMod.NotificationType = js.native
  var InstanceLaunchNotification: atPulumiAwsLib.autoscalingNotificationTypeMod.NotificationType = js.native
  var InstanceTerminateErrorNotification: atPulumiAwsLib.autoscalingNotificationTypeMod.NotificationType = js.native
  var InstanceTerminateNotification: atPulumiAwsLib.autoscalingNotificationTypeMod.NotificationType = js.native
  var OneMinuteMetricsGranularity: atPulumiAwsLib.autoscalingMetricsMod.MetricsGranularity = js.native
  var TestNotification: atPulumiAwsLib.autoscalingNotificationTypeMod.NotificationType = js.native
  def getGroup(args: atPulumiAwsLib.autoscalingGetGroupMod.GetGroupArgs): js.Promise[atPulumiAwsLib.autoscalingGetGroupMod.GetGroupResult] = js.native
  def getGroup(
    args: atPulumiAwsLib.autoscalingGetGroupMod.GetGroupArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.autoscalingGetGroupMod.GetGroupResult] = js.native
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
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.autoscalingAttachmentMod.Attachment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.autoscalingAttachmentMod.AttachmentState
    ): atPulumiAwsLib.autoscalingAttachmentMod.Attachment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.autoscalingAttachmentMod.AttachmentState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.autoscalingAttachmentMod.Attachment = js.native
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
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.autoscalingGroupMod.Group = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.autoscalingGroupMod.GroupState
    ): atPulumiAwsLib.autoscalingGroupMod.Group = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.autoscalingGroupMod.GroupState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.autoscalingGroupMod.Group = js.native
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
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.autoscalingLifecycleHookMod.LifecycleHook = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.autoscalingLifecycleHookMod.LifecycleHookState
    ): atPulumiAwsLib.autoscalingLifecycleHookMod.LifecycleHook = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.autoscalingLifecycleHookMod.LifecycleHookState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.autoscalingLifecycleHookMod.LifecycleHook = js.native
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
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.autoscalingNotificationMod.Notification = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.autoscalingNotificationMod.NotificationState
    ): atPulumiAwsLib.autoscalingNotificationMod.Notification = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.autoscalingNotificationMod.NotificationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.autoscalingNotificationMod.Notification = js.native
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
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.autoscalingPolicyMod.Policy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.autoscalingPolicyMod.PolicyState
    ): atPulumiAwsLib.autoscalingPolicyMod.Policy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.autoscalingPolicyMod.PolicyState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.autoscalingPolicyMod.Policy = js.native
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
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.autoscalingScheduleMod.Schedule = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.autoscalingScheduleMod.ScheduleState
    ): atPulumiAwsLib.autoscalingScheduleMod.Schedule = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.autoscalingScheduleMod.ScheduleState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.autoscalingScheduleMod.Schedule = js.native
  }
  
}

