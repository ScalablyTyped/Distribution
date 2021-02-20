package typings.pulumiAws

import typings.pulumiAws.dashboardMod.DashboardArgs
import typings.pulumiAws.dashboardMod.DashboardState
import typings.pulumiAws.eventBusMod.EventBusArgs
import typings.pulumiAws.eventBusMod.EventBusState
import typings.pulumiAws.eventPermissionMod.EventPermissionArgs
import typings.pulumiAws.eventPermissionMod.EventPermissionState
import typings.pulumiAws.eventRuleMixinsMod.EventRuleEventHandler
import typings.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscriptionArgs
import typings.pulumiAws.eventRuleMod.EventRuleArgs
import typings.pulumiAws.eventRuleMod.EventRuleState
import typings.pulumiAws.eventTargetMod.EventTargetArgs
import typings.pulumiAws.eventTargetMod.EventTargetState
import typings.pulumiAws.getLogGroupMod.GetLogGroupArgs
import typings.pulumiAws.getLogGroupMod.GetLogGroupResult
import typings.pulumiAws.lambdaMixinsMod.Callback
import typings.pulumiAws.logDestinationMod.LogDestinationArgs
import typings.pulumiAws.logDestinationMod.LogDestinationState
import typings.pulumiAws.logDestinationPolicyMod.LogDestinationPolicyArgs
import typings.pulumiAws.logDestinationPolicyMod.LogDestinationPolicyState
import typings.pulumiAws.logGroupMixinsMod.DecodedLogGroupEvent
import typings.pulumiAws.logGroupMixinsMod.LogGroupEventHandler
import typings.pulumiAws.logGroupMixinsMod.LogGroupEventSubscriptionArgs
import typings.pulumiAws.logGroupMod.LogGroupArgs
import typings.pulumiAws.logGroupMod.LogGroupState
import typings.pulumiAws.logMetricFilterMod.LogMetricFilterArgs
import typings.pulumiAws.logMetricFilterMod.LogMetricFilterState
import typings.pulumiAws.logResourcePolicyMod.LogResourcePolicyArgs
import typings.pulumiAws.logResourcePolicyMod.LogResourcePolicyState
import typings.pulumiAws.logStreamMod.LogStreamArgs
import typings.pulumiAws.logStreamMod.LogStreamState
import typings.pulumiAws.logSubscriptionFilterMod.LogSubscriptionFilterArgs
import typings.pulumiAws.logSubscriptionFilterMod.LogSubscriptionFilterState
import typings.pulumiAws.metricAlarmMod.MetricAlarmArgs
import typings.pulumiAws.metricAlarmMod.MetricAlarmState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudwatchMod {
  
  @JSImport("@pulumi/aws/cloudwatch", "Dashboard")
  @js.native
  class Dashboard protected ()
    extends typings.pulumiAws.dashboardMod.Dashboard {
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
  /* static members */
  object Dashboard {
    
    /**
      * Get an existing Dashboard resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch", "Dashboard.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.dashboardMod.Dashboard = js.native
    @JSImport("@pulumi/aws/cloudwatch", "Dashboard.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.dashboardMod.Dashboard = js.native
    @JSImport("@pulumi/aws/cloudwatch", "Dashboard.get")
    @js.native
    def get(name: String, id: Input[ID], state: DashboardState): typings.pulumiAws.dashboardMod.Dashboard = js.native
    @JSImport("@pulumi/aws/cloudwatch", "Dashboard.get")
    @js.native
    def get(name: String, id: Input[ID], state: DashboardState, opts: CustomResourceOptions): typings.pulumiAws.dashboardMod.Dashboard = js.native
    
    /**
      * Returns true if the given object is an instance of Dashboard.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch", "Dashboard.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/dashboard.Dashboard */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cloudwatch", "EventBus")
  @js.native
  class EventBus protected ()
    extends typings.pulumiAws.eventBusMod.EventBus {
    /**
      * Create a EventBus resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: EventBusArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: EventBusArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object EventBus {
    
    /**
      * Get an existing EventBus resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch", "EventBus.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.eventBusMod.EventBus = js.native
    @JSImport("@pulumi/aws/cloudwatch", "EventBus.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.eventBusMod.EventBus = js.native
    @JSImport("@pulumi/aws/cloudwatch", "EventBus.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventBusState): typings.pulumiAws.eventBusMod.EventBus = js.native
    @JSImport("@pulumi/aws/cloudwatch", "EventBus.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventBusState, opts: CustomResourceOptions): typings.pulumiAws.eventBusMod.EventBus = js.native
    
    /**
      * Returns true if the given object is an instance of EventBus.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch", "EventBus.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/eventBus.EventBus */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cloudwatch", "EventPermission")
  @js.native
  class EventPermission protected ()
    extends typings.pulumiAws.eventPermissionMod.EventPermission {
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
  /* static members */
  object EventPermission {
    
    /**
      * Get an existing EventPermission resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch", "EventPermission.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.eventPermissionMod.EventPermission = js.native
    @JSImport("@pulumi/aws/cloudwatch", "EventPermission.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.eventPermissionMod.EventPermission = js.native
    @JSImport("@pulumi/aws/cloudwatch", "EventPermission.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventPermissionState): typings.pulumiAws.eventPermissionMod.EventPermission = js.native
    @JSImport("@pulumi/aws/cloudwatch", "EventPermission.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventPermissionState, opts: CustomResourceOptions): typings.pulumiAws.eventPermissionMod.EventPermission = js.native
    
    /**
      * Returns true if the given object is an instance of EventPermission.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch", "EventPermission.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/eventPermission.EventPermission */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cloudwatch", "EventRule")
  @js.native
  class EventRule protected ()
    extends typings.pulumiAws.eventRuleMod.EventRule {
    /**
      * Create a EventRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: EventRuleArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: EventRuleArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object EventRule {
    
    /**
      * Get an existing EventRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch", "EventRule.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.eventRuleMod.EventRule = js.native
    @JSImport("@pulumi/aws/cloudwatch", "EventRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.eventRuleMod.EventRule = js.native
    @JSImport("@pulumi/aws/cloudwatch", "EventRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventRuleState): typings.pulumiAws.eventRuleMod.EventRule = js.native
    @JSImport("@pulumi/aws/cloudwatch", "EventRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventRuleState, opts: CustomResourceOptions): typings.pulumiAws.eventRuleMod.EventRule = js.native
    
    /**
      * Returns true if the given object is an instance of EventRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch", "EventRule.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/eventRule.EventRule */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cloudwatch", "EventRuleEventSubscription")
  @js.native
  class EventRuleEventSubscription protected ()
    extends typings.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription {
    def this(name: String, eventRuleOrSchedule: String, handler: EventRuleEventHandler) = this()
    def this(
      name: String,
      eventRuleOrSchedule: typings.pulumiAws.eventRuleMod.EventRule,
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
      eventRuleOrSchedule: typings.pulumiAws.eventRuleMod.EventRule,
      handler: EventRuleEventHandler,
      args: EventRuleEventSubscriptionArgs
    ) = this()
    def this(
      name: String,
      eventRuleOrSchedule: String,
      handler: EventRuleEventHandler,
      args: js.UndefOr[scala.Nothing],
      opts: ComponentResourceOptions
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
      eventRuleOrSchedule: typings.pulumiAws.eventRuleMod.EventRule,
      handler: EventRuleEventHandler,
      args: js.UndefOr[scala.Nothing],
      opts: ComponentResourceOptions
    ) = this()
    def this(
      name: String,
      eventRuleOrSchedule: typings.pulumiAws.eventRuleMod.EventRule,
      handler: EventRuleEventHandler,
      args: EventRuleEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ) = this()
  }
  
  @JSImport("@pulumi/aws/cloudwatch", "EventTarget")
  @js.native
  class EventTarget protected ()
    extends typings.pulumiAws.eventTargetMod.EventTarget {
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
  /* static members */
  object EventTarget {
    
    /**
      * Get an existing EventTarget resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch", "EventTarget.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.eventTargetMod.EventTarget = js.native
    @JSImport("@pulumi/aws/cloudwatch", "EventTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.eventTargetMod.EventTarget = js.native
    @JSImport("@pulumi/aws/cloudwatch", "EventTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventTargetState): typings.pulumiAws.eventTargetMod.EventTarget = js.native
    @JSImport("@pulumi/aws/cloudwatch", "EventTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventTargetState, opts: CustomResourceOptions): typings.pulumiAws.eventTargetMod.EventTarget = js.native
    
    /**
      * Returns true if the given object is an instance of EventTarget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch", "EventTarget.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/eventTarget.EventTarget */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cloudwatch", "LogDestination")
  @js.native
  class LogDestination protected ()
    extends typings.pulumiAws.logDestinationMod.LogDestination {
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
  /* static members */
  object LogDestination {
    
    /**
      * Get an existing LogDestination resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch", "LogDestination.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.logDestinationMod.LogDestination = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogDestination.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.logDestinationMod.LogDestination = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogDestination.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogDestinationState): typings.pulumiAws.logDestinationMod.LogDestination = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogDestination.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogDestinationState, opts: CustomResourceOptions): typings.pulumiAws.logDestinationMod.LogDestination = js.native
    
    /**
      * Returns true if the given object is an instance of LogDestination.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch", "LogDestination.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logDestination.LogDestination */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cloudwatch", "LogDestinationPolicy")
  @js.native
  class LogDestinationPolicy protected ()
    extends typings.pulumiAws.logDestinationPolicyMod.LogDestinationPolicy {
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
  /* static members */
  object LogDestinationPolicy {
    
    /**
      * Get an existing LogDestinationPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch", "LogDestinationPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.logDestinationPolicyMod.LogDestinationPolicy = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogDestinationPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.logDestinationPolicyMod.LogDestinationPolicy = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogDestinationPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogDestinationPolicyState): typings.pulumiAws.logDestinationPolicyMod.LogDestinationPolicy = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogDestinationPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogDestinationPolicyState, opts: CustomResourceOptions): typings.pulumiAws.logDestinationPolicyMod.LogDestinationPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of LogDestinationPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch", "LogDestinationPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logDestinationPolicy.LogDestinationPolicy */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cloudwatch", "LogGroup")
  @js.native
  class LogGroup protected ()
    extends typings.pulumiAws.logGroupMod.LogGroup {
    /**
      * Create a LogGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: LogGroupArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: LogGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object LogGroup {
    
    /**
      * Get an existing LogGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch", "LogGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.logGroupMod.LogGroup = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.logGroupMod.LogGroup = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogGroupState): typings.pulumiAws.logGroupMod.LogGroup = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogGroupState, opts: CustomResourceOptions): typings.pulumiAws.logGroupMod.LogGroup = js.native
    
    /**
      * Returns true if the given object is an instance of LogGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch", "LogGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logGroup.LogGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cloudwatch", "LogGroupEventSubscription")
  @js.native
  class LogGroupEventSubscription protected ()
    extends typings.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription {
    def this(name: String, logGroup: typings.pulumiAws.logGroupMod.LogGroup, handler: LogGroupEventHandler) = this()
    def this(
      name: String,
      logGroup: typings.pulumiAws.logGroupMod.LogGroup,
      handler: LogGroupEventHandler,
      args: LogGroupEventSubscriptionArgs
    ) = this()
    def this(
      name: String,
      logGroup: typings.pulumiAws.logGroupMod.LogGroup,
      handler: LogGroupEventHandler,
      args: js.UndefOr[scala.Nothing],
      opts: ComponentResourceOptions
    ) = this()
    def this(
      name: String,
      logGroup: typings.pulumiAws.logGroupMod.LogGroup,
      handler: LogGroupEventHandler,
      args: LogGroupEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ) = this()
  }
  
  @JSImport("@pulumi/aws/cloudwatch", "LogMetricFilter")
  @js.native
  class LogMetricFilter protected ()
    extends typings.pulumiAws.logMetricFilterMod.LogMetricFilter {
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
  /* static members */
  object LogMetricFilter {
    
    /**
      * Get an existing LogMetricFilter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch", "LogMetricFilter.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.logMetricFilterMod.LogMetricFilter = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogMetricFilter.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.logMetricFilterMod.LogMetricFilter = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogMetricFilter.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogMetricFilterState): typings.pulumiAws.logMetricFilterMod.LogMetricFilter = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogMetricFilter.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogMetricFilterState, opts: CustomResourceOptions): typings.pulumiAws.logMetricFilterMod.LogMetricFilter = js.native
    
    /**
      * Returns true if the given object is an instance of LogMetricFilter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch", "LogMetricFilter.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logMetricFilter.LogMetricFilter */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cloudwatch", "LogResourcePolicy")
  @js.native
  class LogResourcePolicy protected ()
    extends typings.pulumiAws.logResourcePolicyMod.LogResourcePolicy {
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
  /* static members */
  object LogResourcePolicy {
    
    /**
      * Get an existing LogResourcePolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch", "LogResourcePolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.logResourcePolicyMod.LogResourcePolicy = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogResourcePolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.logResourcePolicyMod.LogResourcePolicy = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogResourcePolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogResourcePolicyState): typings.pulumiAws.logResourcePolicyMod.LogResourcePolicy = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogResourcePolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogResourcePolicyState, opts: CustomResourceOptions): typings.pulumiAws.logResourcePolicyMod.LogResourcePolicy = js.native
    
    /**
      * Returns true if the given object is an instance of LogResourcePolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch", "LogResourcePolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logResourcePolicy.LogResourcePolicy */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cloudwatch", "LogStream")
  @js.native
  class LogStream protected ()
    extends typings.pulumiAws.logStreamMod.LogStream {
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
  /* static members */
  object LogStream {
    
    /**
      * Get an existing LogStream resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch", "LogStream.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.logStreamMod.LogStream = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogStream.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.logStreamMod.LogStream = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogStream.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogStreamState): typings.pulumiAws.logStreamMod.LogStream = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogStream.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogStreamState, opts: CustomResourceOptions): typings.pulumiAws.logStreamMod.LogStream = js.native
    
    /**
      * Returns true if the given object is an instance of LogStream.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch", "LogStream.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logStream.LogStream */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cloudwatch", "LogSubscriptionFilter")
  @js.native
  class LogSubscriptionFilter protected ()
    extends typings.pulumiAws.logSubscriptionFilterMod.LogSubscriptionFilter {
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
  /* static members */
  object LogSubscriptionFilter {
    
    /**
      * Get an existing LogSubscriptionFilter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch", "LogSubscriptionFilter.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.logSubscriptionFilterMod.LogSubscriptionFilter = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogSubscriptionFilter.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.logSubscriptionFilterMod.LogSubscriptionFilter = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogSubscriptionFilter.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogSubscriptionFilterState): typings.pulumiAws.logSubscriptionFilterMod.LogSubscriptionFilter = js.native
    @JSImport("@pulumi/aws/cloudwatch", "LogSubscriptionFilter.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogSubscriptionFilterState, opts: CustomResourceOptions): typings.pulumiAws.logSubscriptionFilterMod.LogSubscriptionFilter = js.native
    
    /**
      * Returns true if the given object is an instance of LogSubscriptionFilter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch", "LogSubscriptionFilter.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logSubscriptionFilter.LogSubscriptionFilter */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cloudwatch", "MetricAlarm")
  @js.native
  class MetricAlarm protected ()
    extends typings.pulumiAws.metricAlarmMod.MetricAlarm {
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
  /* static members */
  object MetricAlarm {
    
    /**
      * Get an existing MetricAlarm resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch", "MetricAlarm.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.metricAlarmMod.MetricAlarm = js.native
    @JSImport("@pulumi/aws/cloudwatch", "MetricAlarm.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.metricAlarmMod.MetricAlarm = js.native
    @JSImport("@pulumi/aws/cloudwatch", "MetricAlarm.get")
    @js.native
    def get(name: String, id: Input[ID], state: MetricAlarmState): typings.pulumiAws.metricAlarmMod.MetricAlarm = js.native
    @JSImport("@pulumi/aws/cloudwatch", "MetricAlarm.get")
    @js.native
    def get(name: String, id: Input[ID], state: MetricAlarmState, opts: CustomResourceOptions): typings.pulumiAws.metricAlarmMod.MetricAlarm = js.native
    
    /**
      * Returns true if the given object is an instance of MetricAlarm.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch", "MetricAlarm.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/metricAlarm.MetricAlarm */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cloudwatch", "getLogGroup")
  @js.native
  def getLogGroup(args: GetLogGroupArgs): js.Promise[GetLogGroupResult] = js.native
  @JSImport("@pulumi/aws/cloudwatch", "getLogGroup")
  @js.native
  def getLogGroup(args: GetLogGroupArgs, opts: InvokeOptions): js.Promise[GetLogGroupResult] = js.native
  
  @JSImport("@pulumi/aws/cloudwatch", "onSchedule")
  @js.native
  def onSchedule(name: String, schedule: String, handler: EventRuleEventHandler): typings.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription = js.native
  @JSImport("@pulumi/aws/cloudwatch", "onSchedule")
  @js.native
  def onSchedule(
    name: String,
    schedule: String,
    handler: EventRuleEventHandler,
    args: js.UndefOr[scala.Nothing],
    opts: ComponentResourceOptions
  ): typings.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription = js.native
  @JSImport("@pulumi/aws/cloudwatch", "onSchedule")
  @js.native
  def onSchedule(
    name: String,
    schedule: String,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs
  ): typings.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription = js.native
  @JSImport("@pulumi/aws/cloudwatch", "onSchedule")
  @js.native
  def onSchedule(
    name: String,
    schedule: String,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ): typings.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription = js.native
  
  /* augmented module */
  object pulumiAwsCloudwatchEventRuleAugmentingMod {
    
    @js.native
    trait EventRule extends StObject {
      
      /**
        * Creates a new subscription to events fired from this EventRule to the handler provided, along
        * with options to control the behavior of the subscription.
        */
      def onEvent(name: String, handler: EventRuleEventHandler): typings.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription = js.native
      def onEvent(
        name: String,
        handler: EventRuleEventHandler,
        args: js.UndefOr[scala.Nothing],
        opts: ComponentResourceOptions
      ): typings.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription = js.native
      def onEvent(name: String, handler: EventRuleEventHandler, args: EventRuleEventSubscriptionArgs): typings.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription = js.native
      def onEvent(
        name: String,
        handler: EventRuleEventHandler,
        args: EventRuleEventSubscriptionArgs,
        opts: ComponentResourceOptions
      ): typings.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription = js.native
    }
  }
  
  /* augmented module */
  object pulumiAwsCloudwatchLogGroupAugmentingMod {
    
    @js.native
    trait LogGroup extends StObject {
      
      /**
        * Creates a new subscription to events fired from this LogGroup to the callback provided,
        * along with options to control the behavior of the subscription.
        *
        * The events will be provided in their decoded form.  Because this event hookup needs to
        * execute code to convert the raw messages, it can only be passed an [EntryPoint] callback,
        * not a [lambda.Function] instance.
        */
      def onDecodedEvent(name: String, callback: Callback[DecodedLogGroupEvent, Unit]): typings.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription = js.native
      def onDecodedEvent(
        name: String,
        callback: Callback[DecodedLogGroupEvent, Unit],
        args: js.UndefOr[scala.Nothing],
        opts: ComponentResourceOptions
      ): typings.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription = js.native
      def onDecodedEvent(name: String, callback: Callback[DecodedLogGroupEvent, Unit], args: LogGroupEventSubscriptionArgs): typings.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription = js.native
      def onDecodedEvent(
        name: String,
        callback: Callback[DecodedLogGroupEvent, Unit],
        args: LogGroupEventSubscriptionArgs,
        opts: ComponentResourceOptions
      ): typings.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription = js.native
      
      /**
        * Creates a new subscription to events fired from this LogGroup to the handler provided,
        * along with options to control the behavior of the subscription.
        *
        * The events will be produced in raw (gzipped + base64 encoded) form.
        */
      def onEvent(name: String, handler: LogGroupEventHandler): typings.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription = js.native
      def onEvent(
        name: String,
        handler: LogGroupEventHandler,
        args: js.UndefOr[scala.Nothing],
        opts: ComponentResourceOptions
      ): typings.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription = js.native
      def onEvent(name: String, handler: LogGroupEventHandler, args: LogGroupEventSubscriptionArgs): typings.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription = js.native
      def onEvent(
        name: String,
        handler: LogGroupEventHandler,
        args: LogGroupEventSubscriptionArgs,
        opts: ComponentResourceOptions
      ): typings.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription = js.native
    }
  }
}
