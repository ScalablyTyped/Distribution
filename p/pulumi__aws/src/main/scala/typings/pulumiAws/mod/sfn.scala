package typings.pulumiAws.mod

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sfn {
  
  @JSImport("@pulumi/aws", "sfn")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws", "sfn.Activity")
  @js.native
  class Activity protected ()
    extends typings.pulumiAws.sfnMod.Activity {
    /**
      * Create a Activity resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ActivityArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ActivityArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Activity {
    
    @JSImport("@pulumi/aws", "sfn.Activity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Activity resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.activityMod.Activity = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.activityMod.Activity]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.activityMod.Activity = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.activityMod.Activity]
    @scala.inline
    def get(name: String, id: Input[ID], state: ActivityState): typings.pulumiAws.activityMod.Activity = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.activityMod.Activity]
    @scala.inline
    def get(name: String, id: Input[ID], state: ActivityState, opts: CustomResourceOptions): typings.pulumiAws.activityMod.Activity = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.activityMod.Activity]
    
    /**
      * Returns true if the given object is an instance of Activity.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sfn/activity.Activity */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/sfn/activity.Activity */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "sfn.StateMachine")
  @js.native
  class StateMachine protected ()
    extends typings.pulumiAws.sfnMod.StateMachine {
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
    
    @JSImport("@pulumi/aws", "sfn.StateMachine")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing StateMachine resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.stateMachineMod.StateMachine = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.stateMachineMod.StateMachine]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.stateMachineMod.StateMachine = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.stateMachineMod.StateMachine]
    @scala.inline
    def get(name: String, id: Input[ID], state: StateMachineState): typings.pulumiAws.stateMachineMod.StateMachine = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.stateMachineMod.StateMachine]
    @scala.inline
    def get(name: String, id: Input[ID], state: StateMachineState, opts: CustomResourceOptions): typings.pulumiAws.stateMachineMod.StateMachine = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.stateMachineMod.StateMachine]
    
    /**
      * Returns true if the given object is an instance of StateMachine.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sfn/stateMachine.StateMachine */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/sfn/stateMachine.StateMachine */ Boolean]
  }
  
  @scala.inline
  def getActivity(): js.Promise[GetActivityResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActivity")().asInstanceOf[js.Promise[GetActivityResult]]
  @scala.inline
  def getActivity(args: Unit, opts: InvokeOptions): js.Promise[GetActivityResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getActivity")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetActivityResult]]
  @scala.inline
  def getActivity(args: GetActivityArgs): js.Promise[GetActivityResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActivity")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetActivityResult]]
  @scala.inline
  def getActivity(args: GetActivityArgs, opts: InvokeOptions): js.Promise[GetActivityResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getActivity")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetActivityResult]]
  
  @scala.inline
  def getStateMachine(args: GetStateMachineArgs): js.Promise[GetStateMachineResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateMachine")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetStateMachineResult]]
  @scala.inline
  def getStateMachine(args: GetStateMachineArgs, opts: InvokeOptions): js.Promise[GetStateMachineResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStateMachine")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetStateMachineResult]]
}
