package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "cloudwatch")
@js.native
object cloudwatchNs extends js.Object {
  @js.native
  class Dashboard protected ()
    extends atPulumiAwsLib.cloudwatchMod.Dashboard {
    /**
      * Create a Dashboard resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchDashboardMod.DashboardArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchDashboardMod.DashboardArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class EventPermission protected ()
    extends atPulumiAwsLib.cloudwatchMod.EventPermission {
    /**
      * Create a EventPermission resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchEventPermissionMod.EventPermissionArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchEventPermissionMod.EventPermissionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class EventRule protected ()
    extends atPulumiAwsLib.cloudwatchMod.EventRule {
    /**
      * Create a EventRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchEventRuleMod.EventRuleArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchEventRuleMod.EventRuleArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class EventRuleEventSubscription protected ()
    extends atPulumiAwsLib.cloudwatchMod.EventRuleEventSubscription {
    def this(name: java.lang.String, eventRuleOrSchedule: atPulumiAwsLib.cloudwatchEventRuleMixinsMod.cloudwatchEventRuleMod.EventRule, handler: atPulumiAwsLib.cloudwatchEventRuleMixinsMod.EventRuleEventHandler, args: atPulumiAwsLib.cloudwatchEventRuleMixinsMod.EventRuleEventSubscriptionArgs) = this()
    def this(name: java.lang.String, eventRuleOrSchedule: java.lang.String, handler: atPulumiAwsLib.cloudwatchEventRuleMixinsMod.EventRuleEventHandler, args: atPulumiAwsLib.cloudwatchEventRuleMixinsMod.EventRuleEventSubscriptionArgs) = this()
    def this(name: java.lang.String, eventRuleOrSchedule: atPulumiAwsLib.cloudwatchEventRuleMixinsMod.cloudwatchEventRuleMod.EventRule, handler: atPulumiAwsLib.cloudwatchEventRuleMixinsMod.EventRuleEventHandler, args: atPulumiAwsLib.cloudwatchEventRuleMixinsMod.EventRuleEventSubscriptionArgs, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
    def this(name: java.lang.String, eventRuleOrSchedule: java.lang.String, handler: atPulumiAwsLib.cloudwatchEventRuleMixinsMod.EventRuleEventHandler, args: atPulumiAwsLib.cloudwatchEventRuleMixinsMod.EventRuleEventSubscriptionArgs, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
  }
  
  @js.native
  class EventTarget protected ()
    extends atPulumiAwsLib.cloudwatchMod.EventTarget {
    /**
      * Create a EventTarget resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchEventTargetMod.EventTargetArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchEventTargetMod.EventTargetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class LogDestination protected ()
    extends atPulumiAwsLib.cloudwatchMod.LogDestination {
    /**
      * Create a LogDestination resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchLogDestinationMod.LogDestinationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchLogDestinationMod.LogDestinationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class LogDestinationPolicy protected ()
    extends atPulumiAwsLib.cloudwatchMod.LogDestinationPolicy {
    /**
      * Create a LogDestinationPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchLogDestinationPolicyMod.LogDestinationPolicyArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchLogDestinationPolicyMod.LogDestinationPolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class LogGroup protected ()
    extends atPulumiAwsLib.cloudwatchMod.LogGroup {
    /**
      * Create a LogGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchLogGroupMod.LogGroupArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchLogGroupMod.LogGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class LogGroupEventSubscription protected ()
    extends atPulumiAwsLib.cloudwatchMod.LogGroupEventSubscription {
    def this(name: java.lang.String, logGroup: atPulumiAwsLib.cloudwatchLogGroupMixinsMod.cloudwatchLogGroupMod.LogGroup, handler: atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventHandler, args: atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventSubscriptionArgs) = this()
    def this(name: java.lang.String, logGroup: atPulumiAwsLib.cloudwatchLogGroupMixinsMod.cloudwatchLogGroupMod.LogGroup, handler: atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventHandler, args: atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventSubscriptionArgs, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
  }
  
  @js.native
  class LogMetricFilter protected ()
    extends atPulumiAwsLib.cloudwatchMod.LogMetricFilter {
    /**
      * Create a LogMetricFilter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchLogMetricFilterMod.LogMetricFilterArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchLogMetricFilterMod.LogMetricFilterArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class LogResourcePolicy protected ()
    extends atPulumiAwsLib.cloudwatchMod.LogResourcePolicy {
    /**
      * Create a LogResourcePolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchLogResourcePolicyMod.LogResourcePolicyArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchLogResourcePolicyMod.LogResourcePolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class LogStream protected ()
    extends atPulumiAwsLib.cloudwatchMod.LogStream {
    /**
      * Create a LogStream resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchLogStreamMod.LogStreamArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchLogStreamMod.LogStreamArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class LogSubscriptionFilter protected ()
    extends atPulumiAwsLib.cloudwatchMod.LogSubscriptionFilter {
    /**
      * Create a LogSubscriptionFilter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchLogSubscriptionFilterMod.LogSubscriptionFilterArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchLogSubscriptionFilterMod.LogSubscriptionFilterArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class MetricAlarm protected ()
    extends atPulumiAwsLib.cloudwatchMod.MetricAlarm {
    /**
      * Create a MetricAlarm resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchMetricAlarmMod.MetricAlarmArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchMetricAlarmMod.MetricAlarmArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  def getLogGroup(args: atPulumiAwsLib.cloudwatchGetLogGroupMod.GetLogGroupArgs): js.Promise[atPulumiAwsLib.cloudwatchGetLogGroupMod.GetLogGroupResult] = js.native
  def getLogGroup(
    args: atPulumiAwsLib.cloudwatchGetLogGroupMod.GetLogGroupArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.cloudwatchGetLogGroupMod.GetLogGroupResult] = js.native
  def onSchedule(
    name: java.lang.String,
    schedule: java.lang.String,
    handler: atPulumiAwsLib.cloudwatchEventRuleMixinsMod.EventRuleEventHandler
  ): atPulumiAwsLib.cloudwatchEventRuleMixinsMod.EventRuleEventSubscription = js.native
  def onSchedule(
    name: java.lang.String,
    schedule: java.lang.String,
    handler: atPulumiAwsLib.cloudwatchEventRuleMixinsMod.EventRuleEventHandler,
    args: atPulumiAwsLib.cloudwatchEventRuleMixinsMod.EventRuleEventSubscriptionArgs
  ): atPulumiAwsLib.cloudwatchEventRuleMixinsMod.EventRuleEventSubscription = js.native
  def onSchedule(
    name: java.lang.String,
    schedule: java.lang.String,
    handler: atPulumiAwsLib.cloudwatchEventRuleMixinsMod.EventRuleEventHandler,
    args: atPulumiAwsLib.cloudwatchEventRuleMixinsMod.EventRuleEventSubscriptionArgs,
    opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions
  ): atPulumiAwsLib.cloudwatchEventRuleMixinsMod.EventRuleEventSubscription = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloudwatchDashboardMod.Dashboard = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cloudwatchDashboardMod.DashboardState
    ): atPulumiAwsLib.cloudwatchDashboardMod.Dashboard = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cloudwatchDashboardMod.DashboardState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.cloudwatchDashboardMod.Dashboard = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloudwatchEventPermissionMod.EventPermission = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cloudwatchEventPermissionMod.EventPermissionState
    ): atPulumiAwsLib.cloudwatchEventPermissionMod.EventPermission = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cloudwatchEventPermissionMod.EventPermissionState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.cloudwatchEventPermissionMod.EventPermission = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloudwatchEventRuleMixinsMod.cloudwatchEventRuleMod.EventRule = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cloudwatchEventRuleMod.EventRuleState
    ): atPulumiAwsLib.cloudwatchEventRuleMixinsMod.cloudwatchEventRuleMod.EventRule = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cloudwatchEventRuleMod.EventRuleState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.cloudwatchEventRuleMixinsMod.cloudwatchEventRuleMod.EventRule = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloudwatchEventTargetMod.EventTarget = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cloudwatchEventTargetMod.EventTargetState
    ): atPulumiAwsLib.cloudwatchEventTargetMod.EventTarget = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cloudwatchEventTargetMod.EventTargetState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.cloudwatchEventTargetMod.EventTarget = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloudwatchLogDestinationMod.LogDestination = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cloudwatchLogDestinationMod.LogDestinationState
    ): atPulumiAwsLib.cloudwatchLogDestinationMod.LogDestination = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cloudwatchLogDestinationMod.LogDestinationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.cloudwatchLogDestinationMod.LogDestination = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloudwatchLogDestinationPolicyMod.LogDestinationPolicy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cloudwatchLogDestinationPolicyMod.LogDestinationPolicyState
    ): atPulumiAwsLib.cloudwatchLogDestinationPolicyMod.LogDestinationPolicy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cloudwatchLogDestinationPolicyMod.LogDestinationPolicyState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.cloudwatchLogDestinationPolicyMod.LogDestinationPolicy = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloudwatchLogGroupMixinsMod.cloudwatchLogGroupMod.LogGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cloudwatchLogGroupMod.LogGroupState
    ): atPulumiAwsLib.cloudwatchLogGroupMixinsMod.cloudwatchLogGroupMod.LogGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cloudwatchLogGroupMod.LogGroupState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.cloudwatchLogGroupMixinsMod.cloudwatchLogGroupMod.LogGroup = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloudwatchLogMetricFilterMod.LogMetricFilter = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cloudwatchLogMetricFilterMod.LogMetricFilterState
    ): atPulumiAwsLib.cloudwatchLogMetricFilterMod.LogMetricFilter = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cloudwatchLogMetricFilterMod.LogMetricFilterState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.cloudwatchLogMetricFilterMod.LogMetricFilter = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloudwatchLogResourcePolicyMod.LogResourcePolicy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cloudwatchLogResourcePolicyMod.LogResourcePolicyState
    ): atPulumiAwsLib.cloudwatchLogResourcePolicyMod.LogResourcePolicy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cloudwatchLogResourcePolicyMod.LogResourcePolicyState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.cloudwatchLogResourcePolicyMod.LogResourcePolicy = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloudwatchLogStreamMod.LogStream = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cloudwatchLogStreamMod.LogStreamState
    ): atPulumiAwsLib.cloudwatchLogStreamMod.LogStream = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cloudwatchLogStreamMod.LogStreamState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.cloudwatchLogStreamMod.LogStream = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloudwatchLogSubscriptionFilterMod.LogSubscriptionFilter = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cloudwatchLogSubscriptionFilterMod.LogSubscriptionFilterState
    ): atPulumiAwsLib.cloudwatchLogSubscriptionFilterMod.LogSubscriptionFilter = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cloudwatchLogSubscriptionFilterMod.LogSubscriptionFilterState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.cloudwatchLogSubscriptionFilterMod.LogSubscriptionFilter = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloudwatchMetricAlarmMod.MetricAlarm = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cloudwatchMetricAlarmMod.MetricAlarmState
    ): atPulumiAwsLib.cloudwatchMetricAlarmMod.MetricAlarm = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cloudwatchMetricAlarmMod.MetricAlarmState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.cloudwatchMetricAlarmMod.MetricAlarm = js.native
  }
  
}

