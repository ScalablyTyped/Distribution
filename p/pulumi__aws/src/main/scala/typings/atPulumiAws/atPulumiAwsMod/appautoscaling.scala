package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.appautoscalingPolicyMod.PolicyArgs
import typings.atPulumiAws.appautoscalingPolicyMod.PolicyState
import typings.atPulumiAws.appautoscalingScheduledActionMod.ScheduledActionArgs
import typings.atPulumiAws.appautoscalingScheduledActionMod.ScheduledActionState
import typings.atPulumiAws.appautoscalingTargetMod.TargetArgs
import typings.atPulumiAws.appautoscalingTargetMod.TargetState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "appautoscaling")
@js.native
object appautoscaling extends js.Object {
  @js.native
  class Policy protected ()
    extends typings.atPulumiAws.appautoscalingMod.Policy {
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
  
  @js.native
  class ScheduledAction protected ()
    extends typings.atPulumiAws.appautoscalingMod.ScheduledAction {
    /**
      * Create a ScheduledAction resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ScheduledActionArgs) = this()
    def this(name: String, args: ScheduledActionArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Target protected ()
    extends typings.atPulumiAws.appautoscalingMod.Target {
    /**
      * Create a Target resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TargetArgs) = this()
    def this(name: String, args: TargetArgs, opts: CustomResourceOptions) = this()
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.appautoscalingPolicyMod.Policy = js.native
    def get(name: String, id: Input[ID], state: PolicyState): typings.atPulumiAws.appautoscalingPolicyMod.Policy = js.native
    def get(name: String, id: Input[ID], state: PolicyState, opts: CustomResourceOptions): typings.atPulumiAws.appautoscalingPolicyMod.Policy = js.native
    /**
      * Returns true if the given object is an instance of Policy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appautoscaling/policy.Policy */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ScheduledAction extends js.Object {
    /**
      * Get an existing ScheduledAction resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.appautoscalingScheduledActionMod.ScheduledAction = js.native
    def get(name: String, id: Input[ID], state: ScheduledActionState): typings.atPulumiAws.appautoscalingScheduledActionMod.ScheduledAction = js.native
    def get(name: String, id: Input[ID], state: ScheduledActionState, opts: CustomResourceOptions): typings.atPulumiAws.appautoscalingScheduledActionMod.ScheduledAction = js.native
    /**
      * Returns true if the given object is an instance of ScheduledAction.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appautoscaling/scheduledAction.ScheduledAction */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Target extends js.Object {
    /**
      * Get an existing Target resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.appautoscalingTargetMod.Target = js.native
    def get(name: String, id: Input[ID], state: TargetState): typings.atPulumiAws.appautoscalingTargetMod.Target = js.native
    def get(name: String, id: Input[ID], state: TargetState, opts: CustomResourceOptions): typings.atPulumiAws.appautoscalingTargetMod.Target = js.native
    /**
      * Returns true if the given object is an instance of Target.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appautoscaling/target.Target */ Boolean = js.native
  }
  
}

