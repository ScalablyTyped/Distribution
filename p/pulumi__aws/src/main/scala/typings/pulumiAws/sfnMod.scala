package typings.pulumiAws

import typings.pulumiAws.activityMod.ActivityArgs
import typings.pulumiAws.activityMod.ActivityState
import typings.pulumiAws.getActivityMod.GetActivityArgs
import typings.pulumiAws.getActivityMod.GetActivityResult
import typings.pulumiAws.getStateMachineMod.GetStateMachineArgs
import typings.pulumiAws.getStateMachineMod.GetStateMachineResult
import typings.pulumiAws.stateMachineMod.StateMachineArgs
import typings.pulumiAws.stateMachineMod.StateMachineState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sfnMod {
  
  @JSImport("@pulumi/aws/sfn", "Activity")
  @js.native
  class Activity protected ()
    extends typings.pulumiAws.activityMod.Activity {
    /**
      * Create a Activity resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ActivityArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ActivityArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Activity {
    
    /**
      * Get an existing Activity resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/sfn", "Activity.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.activityMod.Activity = js.native
    @JSImport("@pulumi/aws/sfn", "Activity.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.activityMod.Activity = js.native
    @JSImport("@pulumi/aws/sfn", "Activity.get")
    @js.native
    def get(name: String, id: Input[ID], state: ActivityState): typings.pulumiAws.activityMod.Activity = js.native
    @JSImport("@pulumi/aws/sfn", "Activity.get")
    @js.native
    def get(name: String, id: Input[ID], state: ActivityState, opts: CustomResourceOptions): typings.pulumiAws.activityMod.Activity = js.native
    
    /**
      * Returns true if the given object is an instance of Activity.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/sfn", "Activity.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sfn/activity.Activity */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/sfn", "StateMachine")
  @js.native
  class StateMachine protected ()
    extends typings.pulumiAws.stateMachineMod.StateMachine {
    /**
      * Create a StateMachine resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: StateMachineArgs) = this()
    def this(name: String, args: StateMachineArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object StateMachine {
    
    /**
      * Get an existing StateMachine resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/sfn", "StateMachine.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.stateMachineMod.StateMachine = js.native
    @JSImport("@pulumi/aws/sfn", "StateMachine.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.stateMachineMod.StateMachine = js.native
    @JSImport("@pulumi/aws/sfn", "StateMachine.get")
    @js.native
    def get(name: String, id: Input[ID], state: StateMachineState): typings.pulumiAws.stateMachineMod.StateMachine = js.native
    @JSImport("@pulumi/aws/sfn", "StateMachine.get")
    @js.native
    def get(name: String, id: Input[ID], state: StateMachineState, opts: CustomResourceOptions): typings.pulumiAws.stateMachineMod.StateMachine = js.native
    
    /**
      * Returns true if the given object is an instance of StateMachine.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/sfn", "StateMachine.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sfn/stateMachine.StateMachine */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/sfn", "getActivity")
  @js.native
  def getActivity(): js.Promise[GetActivityResult] = js.native
  @JSImport("@pulumi/aws/sfn", "getActivity")
  @js.native
  def getActivity(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetActivityResult] = js.native
  @JSImport("@pulumi/aws/sfn", "getActivity")
  @js.native
  def getActivity(args: GetActivityArgs): js.Promise[GetActivityResult] = js.native
  @JSImport("@pulumi/aws/sfn", "getActivity")
  @js.native
  def getActivity(args: GetActivityArgs, opts: InvokeOptions): js.Promise[GetActivityResult] = js.native
  
  @JSImport("@pulumi/aws/sfn", "getStateMachine")
  @js.native
  def getStateMachine(args: GetStateMachineArgs): js.Promise[GetStateMachineResult] = js.native
  @JSImport("@pulumi/aws/sfn", "getStateMachine")
  @js.native
  def getStateMachine(args: GetStateMachineArgs, opts: InvokeOptions): js.Promise[GetStateMachineResult] = js.native
}
