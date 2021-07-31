package typings.pulumiAws.mod

import typings.pulumiAws.getExportMod.GetExportArgs
import typings.pulumiAws.getExportMod.GetExportResult
import typings.pulumiAws.getStackMod.GetStackArgs
import typings.pulumiAws.getStackMod.GetStackResult
import typings.pulumiAws.stackMod.StackArgs
import typings.pulumiAws.stackMod.StackState
import typings.pulumiAws.stackSetInstanceMod.StackSetInstanceArgs
import typings.pulumiAws.stackSetInstanceMod.StackSetInstanceState
import typings.pulumiAws.stackSetMod.StackSetArgs
import typings.pulumiAws.stackSetMod.StackSetState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudformation {
  
  @JSImport("@pulumi/aws", "cloudformation")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws", "cloudformation.Stack")
  @js.native
  class Stack protected ()
    extends typings.pulumiAws.cloudformationMod.Stack {
    /**
      * Create a Stack resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: StackArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: StackArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Stack {
    
    @JSImport("@pulumi/aws", "cloudformation.Stack")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Stack resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.stackMod.Stack = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.stackMod.Stack]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.stackMod.Stack = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.stackMod.Stack]
    @scala.inline
    def get(name: String, id: Input[ID], state: StackState): typings.pulumiAws.stackMod.Stack = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.stackMod.Stack]
    @scala.inline
    def get(name: String, id: Input[ID], state: StackState, opts: CustomResourceOptions): typings.pulumiAws.stackMod.Stack = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.stackMod.Stack]
    
    /**
      * Returns true if the given object is an instance of Stack.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudformation/stack.Stack */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cloudformation/stack.Stack */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "cloudformation.StackSet")
  @js.native
  class StackSet protected ()
    extends typings.pulumiAws.cloudformationMod.StackSet {
    /**
      * Create a StackSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: StackSetArgs) = this()
    def this(name: String, args: StackSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object StackSet {
    
    @JSImport("@pulumi/aws", "cloudformation.StackSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing StackSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.stackSetMod.StackSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.stackSetMod.StackSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.stackSetMod.StackSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.stackSetMod.StackSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: StackSetState): typings.pulumiAws.stackSetMod.StackSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.stackSetMod.StackSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: StackSetState, opts: CustomResourceOptions): typings.pulumiAws.stackSetMod.StackSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.stackSetMod.StackSet]
    
    /**
      * Returns true if the given object is an instance of StackSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudformation/stackSet.StackSet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cloudformation/stackSet.StackSet */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "cloudformation.StackSetInstance")
  @js.native
  class StackSetInstance protected ()
    extends typings.pulumiAws.cloudformationMod.StackSetInstance {
    /**
      * Create a StackSetInstance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: StackSetInstanceArgs) = this()
    def this(name: String, args: StackSetInstanceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object StackSetInstance {
    
    @JSImport("@pulumi/aws", "cloudformation.StackSetInstance")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing StackSetInstance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.stackSetInstanceMod.StackSetInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.stackSetInstanceMod.StackSetInstance]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.stackSetInstanceMod.StackSetInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.stackSetInstanceMod.StackSetInstance]
    @scala.inline
    def get(name: String, id: Input[ID], state: StackSetInstanceState): typings.pulumiAws.stackSetInstanceMod.StackSetInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.stackSetInstanceMod.StackSetInstance]
    @scala.inline
    def get(name: String, id: Input[ID], state: StackSetInstanceState, opts: CustomResourceOptions): typings.pulumiAws.stackSetInstanceMod.StackSetInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.stackSetInstanceMod.StackSetInstance]
    
    /**
      * Returns true if the given object is an instance of StackSetInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudformation/stackSetInstance.StackSetInstance */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cloudformation/stackSetInstance.StackSetInstance */ Boolean]
  }
  
  @scala.inline
  def getExport(args: GetExportArgs): js.Promise[GetExportResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getExport")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetExportResult]]
  @scala.inline
  def getExport(args: GetExportArgs, opts: InvokeOptions): js.Promise[GetExportResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getExport")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetExportResult]]
  
  @scala.inline
  def getStack(args: GetStackArgs): js.Promise[GetStackResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStack")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetStackResult]]
  @scala.inline
  def getStack(args: GetStackArgs, opts: InvokeOptions): js.Promise[GetStackResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStack")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetStackResult]]
}
