package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.cloudwatchDashboardMod.DashboardArgs
import typings.atPulumiAws.cloudwatchDashboardMod.DashboardState
import typings.atPulumiAws.cloudwatchEventPermissionMod.EventPermissionArgs
import typings.atPulumiAws.cloudwatchEventPermissionMod.EventPermissionState
import typings.atPulumiAws.cloudwatchEventRuleMixinsMod.EventRuleEventHandler
import typings.atPulumiAws.cloudwatchEventRuleMixinsMod.EventRuleEventSubscriptionArgs
import typings.atPulumiAws.cloudwatchEventRuleMod.EventRuleArgs
import typings.atPulumiAws.cloudwatchEventRuleMod.EventRuleState
import typings.atPulumiAws.cloudwatchEventTargetMod.EventTargetArgs
import typings.atPulumiAws.cloudwatchEventTargetMod.EventTargetState
import typings.atPulumiAws.cloudwatchGetLogGroupMod.GetLogGroupArgs
import typings.atPulumiAws.cloudwatchGetLogGroupMod.GetLogGroupResult
import typings.atPulumiAws.cloudwatchLogDestinationMod.LogDestinationArgs
import typings.atPulumiAws.cloudwatchLogDestinationMod.LogDestinationState
import typings.atPulumiAws.cloudwatchLogDestinationPolicyMod.LogDestinationPolicyArgs
import typings.atPulumiAws.cloudwatchLogDestinationPolicyMod.LogDestinationPolicyState
import typings.atPulumiAws.cloudwatchLogGroupMixinsMod.LogGroupEventHandler
import typings.atPulumiAws.cloudwatchLogGroupMixinsMod.LogGroupEventSubscriptionArgs
import typings.atPulumiAws.cloudwatchLogGroupMod.LogGroupArgs
import typings.atPulumiAws.cloudwatchLogGroupMod.LogGroupState
import typings.atPulumiAws.cloudwatchLogMetricFilterMod.LogMetricFilterArgs
import typings.atPulumiAws.cloudwatchLogMetricFilterMod.LogMetricFilterState
import typings.atPulumiAws.cloudwatchLogResourcePolicyMod.LogResourcePolicyArgs
import typings.atPulumiAws.cloudwatchLogResourcePolicyMod.LogResourcePolicyState
import typings.atPulumiAws.cloudwatchLogStreamMod.LogStreamArgs
import typings.atPulumiAws.cloudwatchLogStreamMod.LogStreamState
import typings.atPulumiAws.cloudwatchLogSubscriptionFilterMod.LogSubscriptionFilterArgs
import typings.atPulumiAws.cloudwatchLogSubscriptionFilterMod.LogSubscriptionFilterState
import typings.atPulumiAws.cloudwatchMetricAlarmMod.MetricAlarmArgs
import typings.atPulumiAws.cloudwatchMetricAlarmMod.MetricAlarmState
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.ComponentResourceOptions
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "cloudwatch")
@js.native
object cloudwatchNs extends js.Object {
  @js.native
  class Dashboard protected ()
    extends typings.atPulumiAws.cloudwatchMod.Dashboard {
    /**
      * Create a Dashboard resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DashboardArgs) = this()
    def this(name: String, args: DashboardArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class EventPermission protected ()
    extends typings.atPulumiAws.cloudwatchMod.EventPermission {
    /**
      * Create a EventPermission resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EventPermissionArgs) = this()
    def this(name: String, args: EventPermissionArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class EventRule protected ()
    extends typings.atPulumiAws.cloudwatchMod.EventRule {
    /**
      * Create a EventRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: EventRuleArgs) = this()
    def this(name: String, args: EventRuleArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class EventRuleEventSubscription protected ()
    extends typings.atPulumiAws.cloudwatchMod.EventRuleEventSubscription {
    def this(name: String, eventRuleOrSchedule: String, handler: EventRuleEventHandler) = this()
    def this(
      name: String,
      eventRuleOrSchedule: typings.atPulumiAws.cloudwatchEventRuleMixinsMod.cloudwatchEventRuleMod.EventRule,
      handler: EventRuleEventHandler
    ) = this()
    def this(
      name: String,
      eventRuleOrSchedule: String,
      handler: EventRuleEventHandler,
      args: EventRuleEventSubscriptionArgs
    ) = this()
    def this(
      name: String,
      eventRuleOrSchedule: typings.atPulumiAws.cloudwatchEventRuleMixinsMod.cloudwatchEventRuleMod.EventRule,
      handler: EventRuleEventHandler,
      args: EventRuleEventSubscriptionArgs
    ) = this()
    def this(
      name: String,
      eventRuleOrSchedule: String,
      handler: EventRuleEventHandler,
      args: EventRuleEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ) = this()
    def this(
      name: String,
      eventRuleOrSchedule: typings.atPulumiAws.cloudwatchEventRuleMixinsMod.cloudwatchEventRuleMod.EventRule,
      handler: EventRuleEventHandler,
      args: EventRuleEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ) = this()
  }
  
  @js.native
  class EventTarget protected ()
    extends typings.atPulumiAws.cloudwatchMod.EventTarget {
    /**
      * Create a EventTarget resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EventTargetArgs) = this()
    def this(name: String, args: EventTargetArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class LogDestination protected ()
    extends typings.atPulumiAws.cloudwatchMod.LogDestination {
    /**
      * Create a LogDestination resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LogDestinationArgs) = this()
    def this(name: String, args: LogDestinationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class LogDestinationPolicy protected ()
    extends typings.atPulumiAws.cloudwatchMod.LogDestinationPolicy {
    /**
      * Create a LogDestinationPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LogDestinationPolicyArgs) = this()
    def this(name: String, args: LogDestinationPolicyArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class LogGroup protected ()
    extends typings.atPulumiAws.cloudwatchMod.LogGroup {
    /**
      * Create a LogGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: LogGroupArgs) = this()
    def this(name: String, args: LogGroupArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class LogGroupEventSubscription protected ()
    extends typings.atPulumiAws.cloudwatchMod.LogGroupEventSubscription {
    def this(
      name: String,
      logGroup: typings.atPulumiAws.cloudwatchLogGroupMixinsMod.cloudwatchLogGroupMod.LogGroup,
      handler: LogGroupEventHandler
    ) = this()
    def this(
      name: String,
      logGroup: typings.atPulumiAws.cloudwatchLogGroupMixinsMod.cloudwatchLogGroupMod.LogGroup,
      handler: LogGroupEventHandler,
      args: LogGroupEventSubscriptionArgs
    ) = this()
    def this(
      name: String,
      logGroup: typings.atPulumiAws.cloudwatchLogGroupMixinsMod.cloudwatchLogGroupMod.LogGroup,
      handler: LogGroupEventHandler,
      args: LogGroupEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ) = this()
  }
  
  @js.native
  class LogMetricFilter protected ()
    extends typings.atPulumiAws.cloudwatchMod.LogMetricFilter {
    /**
      * Create a LogMetricFilter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LogMetricFilterArgs) = this()
    def this(name: String, args: LogMetricFilterArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class LogResourcePolicy protected ()
    extends typings.atPulumiAws.cloudwatchMod.LogResourcePolicy {
    /**
      * Create a LogResourcePolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LogResourcePolicyArgs) = this()
    def this(name: String, args: LogResourcePolicyArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class LogStream protected ()
    extends typings.atPulumiAws.cloudwatchMod.LogStream {
    /**
      * Create a LogStream resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LogStreamArgs) = this()
    def this(name: String, args: LogStreamArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class LogSubscriptionFilter protected ()
    extends typings.atPulumiAws.cloudwatchMod.LogSubscriptionFilter {
    /**
      * Create a LogSubscriptionFilter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LogSubscriptionFilterArgs) = this()
    def this(name: String, args: LogSubscriptionFilterArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class MetricAlarm protected ()
    extends typings.atPulumiAws.cloudwatchMod.MetricAlarm {
    /**
      * Create a MetricAlarm resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MetricAlarmArgs) = this()
    def this(name: String, args: MetricAlarmArgs, opts: CustomResourceOptions) = this()
  }
  
  def getLogGroup(args: GetLogGroupArgs): js.Promise[GetLogGroupResult] with GetLogGroupResult = js.native
  def getLogGroup(args: GetLogGroupArgs, opts: InvokeOptions): js.Promise[GetLogGroupResult] with GetLogGroupResult = js.native
  def onSchedule(name: String, schedule: String, handler: EventRuleEventHandler): typings.atPulumiAws.cloudwatchEventRuleMixinsMod.EventRuleEventSubscription = js.native
  def onSchedule(
    name: String,
    schedule: String,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs
  ): typings.atPulumiAws.cloudwatchEventRuleMixinsMod.EventRuleEventSubscription = js.native
  def onSchedule(
    name: String,
    schedule: String,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ): typings.atPulumiAws.cloudwatchEventRuleMixinsMod.EventRuleEventSubscription = js.native
  /* static members */
  @js.native
  object Dashboard extends js.Object {
    /**
      * Get an existing Dashboard resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cloudwatchDashboardMod.Dashboard = js.native
    def get(name: String, id: Input[ID], state: DashboardState): typings.atPulumiAws.cloudwatchDashboardMod.Dashboard = js.native
    def get(name: String, id: Input[ID], state: DashboardState, opts: CustomResourceOptions): typings.atPulumiAws.cloudwatchDashboardMod.Dashboard = js.native
    /**
      * Returns true if the given object is an instance of Dashboard.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/dashboard.Dashboard */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object EventPermission extends js.Object {
    /**
      * Get an existing EventPermission resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cloudwatchEventPermissionMod.EventPermission = js.native
    def get(name: String, id: Input[ID], state: EventPermissionState): typings.atPulumiAws.cloudwatchEventPermissionMod.EventPermission = js.native
    def get(name: String, id: Input[ID], state: EventPermissionState, opts: CustomResourceOptions): typings.atPulumiAws.cloudwatchEventPermissionMod.EventPermission = js.native
    /**
      * Returns true if the given object is an instance of EventPermission.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/eventPermission.EventPermission */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object EventRule extends js.Object {
    /**
      * Get an existing EventRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cloudwatchEventRuleMixinsMod.cloudwatchEventRuleMod.EventRule = js.native
    def get(name: String, id: Input[ID], state: EventRuleState): typings.atPulumiAws.cloudwatchEventRuleMixinsMod.cloudwatchEventRuleMod.EventRule = js.native
    def get(name: String, id: Input[ID], state: EventRuleState, opts: CustomResourceOptions): typings.atPulumiAws.cloudwatchEventRuleMixinsMod.cloudwatchEventRuleMod.EventRule = js.native
    /**
      * Returns true if the given object is an instance of EventRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/eventRuleMixins.@pulumi/aws/cloudwatch/eventRule.EventRule */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object EventTarget extends js.Object {
    /**
      * Get an existing EventTarget resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cloudwatchEventTargetMod.EventTarget = js.native
    def get(name: String, id: Input[ID], state: EventTargetState): typings.atPulumiAws.cloudwatchEventTargetMod.EventTarget = js.native
    def get(name: String, id: Input[ID], state: EventTargetState, opts: CustomResourceOptions): typings.atPulumiAws.cloudwatchEventTargetMod.EventTarget = js.native
    /**
      * Returns true if the given object is an instance of EventTarget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/eventTarget.EventTarget */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object LogDestination extends js.Object {
    /**
      * Get an existing LogDestination resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cloudwatchLogDestinationMod.LogDestination = js.native
    def get(name: String, id: Input[ID], state: LogDestinationState): typings.atPulumiAws.cloudwatchLogDestinationMod.LogDestination = js.native
    def get(name: String, id: Input[ID], state: LogDestinationState, opts: CustomResourceOptions): typings.atPulumiAws.cloudwatchLogDestinationMod.LogDestination = js.native
    /**
      * Returns true if the given object is an instance of LogDestination.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logDestination.LogDestination */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object LogDestinationPolicy extends js.Object {
    /**
      * Get an existing LogDestinationPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cloudwatchLogDestinationPolicyMod.LogDestinationPolicy = js.native
    def get(name: String, id: Input[ID], state: LogDestinationPolicyState): typings.atPulumiAws.cloudwatchLogDestinationPolicyMod.LogDestinationPolicy = js.native
    def get(name: String, id: Input[ID], state: LogDestinationPolicyState, opts: CustomResourceOptions): typings.atPulumiAws.cloudwatchLogDestinationPolicyMod.LogDestinationPolicy = js.native
    /**
      * Returns true if the given object is an instance of LogDestinationPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logDestinationPolicy.LogDestinationPolicy */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object LogGroup extends js.Object {
    /**
      * Get an existing LogGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cloudwatchLogGroupMixinsMod.cloudwatchLogGroupMod.LogGroup = js.native
    def get(name: String, id: Input[ID], state: LogGroupState): typings.atPulumiAws.cloudwatchLogGroupMixinsMod.cloudwatchLogGroupMod.LogGroup = js.native
    def get(name: String, id: Input[ID], state: LogGroupState, opts: CustomResourceOptions): typings.atPulumiAws.cloudwatchLogGroupMixinsMod.cloudwatchLogGroupMod.LogGroup = js.native
    /**
      * Returns true if the given object is an instance of LogGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logGroupMixins.@pulumi/aws/cloudwatch/logGroup.LogGroup */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object LogMetricFilter extends js.Object {
    /**
      * Get an existing LogMetricFilter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cloudwatchLogMetricFilterMod.LogMetricFilter = js.native
    def get(name: String, id: Input[ID], state: LogMetricFilterState): typings.atPulumiAws.cloudwatchLogMetricFilterMod.LogMetricFilter = js.native
    def get(name: String, id: Input[ID], state: LogMetricFilterState, opts: CustomResourceOptions): typings.atPulumiAws.cloudwatchLogMetricFilterMod.LogMetricFilter = js.native
    /**
      * Returns true if the given object is an instance of LogMetricFilter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logMetricFilter.LogMetricFilter */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object LogResourcePolicy extends js.Object {
    /**
      * Get an existing LogResourcePolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cloudwatchLogResourcePolicyMod.LogResourcePolicy = js.native
    def get(name: String, id: Input[ID], state: LogResourcePolicyState): typings.atPulumiAws.cloudwatchLogResourcePolicyMod.LogResourcePolicy = js.native
    def get(name: String, id: Input[ID], state: LogResourcePolicyState, opts: CustomResourceOptions): typings.atPulumiAws.cloudwatchLogResourcePolicyMod.LogResourcePolicy = js.native
    /**
      * Returns true if the given object is an instance of LogResourcePolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logResourcePolicy.LogResourcePolicy */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object LogStream extends js.Object {
    /**
      * Get an existing LogStream resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cloudwatchLogStreamMod.LogStream = js.native
    def get(name: String, id: Input[ID], state: LogStreamState): typings.atPulumiAws.cloudwatchLogStreamMod.LogStream = js.native
    def get(name: String, id: Input[ID], state: LogStreamState, opts: CustomResourceOptions): typings.atPulumiAws.cloudwatchLogStreamMod.LogStream = js.native
    /**
      * Returns true if the given object is an instance of LogStream.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logStream.LogStream */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object LogSubscriptionFilter extends js.Object {
    /**
      * Get an existing LogSubscriptionFilter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cloudwatchLogSubscriptionFilterMod.LogSubscriptionFilter = js.native
    def get(name: String, id: Input[ID], state: LogSubscriptionFilterState): typings.atPulumiAws.cloudwatchLogSubscriptionFilterMod.LogSubscriptionFilter = js.native
    def get(name: String, id: Input[ID], state: LogSubscriptionFilterState, opts: CustomResourceOptions): typings.atPulumiAws.cloudwatchLogSubscriptionFilterMod.LogSubscriptionFilter = js.native
    /**
      * Returns true if the given object is an instance of LogSubscriptionFilter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logSubscriptionFilter.LogSubscriptionFilter */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object MetricAlarm extends js.Object {
    /**
      * Get an existing MetricAlarm resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cloudwatchMetricAlarmMod.MetricAlarm = js.native
    def get(name: String, id: Input[ID], state: MetricAlarmState): typings.atPulumiAws.cloudwatchMetricAlarmMod.MetricAlarm = js.native
    def get(name: String, id: Input[ID], state: MetricAlarmState, opts: CustomResourceOptions): typings.atPulumiAws.cloudwatchMetricAlarmMod.MetricAlarm = js.native
    /**
      * Returns true if the given object is an instance of MetricAlarm.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/metricAlarm.MetricAlarm */ Boolean = js.native
  }
  
}

