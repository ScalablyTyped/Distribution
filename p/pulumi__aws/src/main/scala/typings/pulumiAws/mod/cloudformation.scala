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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudformation {
  
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
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: StackArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Stack {
    
    /**
      * Get an existing Stack resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "cloudformation.Stack.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.stackMod.Stack = js.native
    @JSImport("@pulumi/aws", "cloudformation.Stack.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.stackMod.Stack = js.native
    @JSImport("@pulumi/aws", "cloudformation.Stack.get")
    @js.native
    def get(name: String, id: Input[ID], state: StackState): typings.pulumiAws.stackMod.Stack = js.native
    @JSImport("@pulumi/aws", "cloudformation.Stack.get")
    @js.native
    def get(name: String, id: Input[ID], state: StackState, opts: CustomResourceOptions): typings.pulumiAws.stackMod.Stack = js.native
    
    /**
      * Returns true if the given object is an instance of Stack.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "cloudformation.Stack.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudformation/stack.Stack */ Boolean = js.native
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
    
    /**
      * Get an existing StackSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "cloudformation.StackSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.stackSetMod.StackSet = js.native
    @JSImport("@pulumi/aws", "cloudformation.StackSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.stackSetMod.StackSet = js.native
    @JSImport("@pulumi/aws", "cloudformation.StackSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: StackSetState): typings.pulumiAws.stackSetMod.StackSet = js.native
    @JSImport("@pulumi/aws", "cloudformation.StackSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: StackSetState, opts: CustomResourceOptions): typings.pulumiAws.stackSetMod.StackSet = js.native
    
    /**
      * Returns true if the given object is an instance of StackSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "cloudformation.StackSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudformation/stackSet.StackSet */ Boolean = js.native
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
    
    /**
      * Get an existing StackSetInstance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "cloudformation.StackSetInstance.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.stackSetInstanceMod.StackSetInstance = js.native
    @JSImport("@pulumi/aws", "cloudformation.StackSetInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.stackSetInstanceMod.StackSetInstance = js.native
    @JSImport("@pulumi/aws", "cloudformation.StackSetInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: StackSetInstanceState): typings.pulumiAws.stackSetInstanceMod.StackSetInstance = js.native
    @JSImport("@pulumi/aws", "cloudformation.StackSetInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: StackSetInstanceState, opts: CustomResourceOptions): typings.pulumiAws.stackSetInstanceMod.StackSetInstance = js.native
    
    /**
      * Returns true if the given object is an instance of StackSetInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "cloudformation.StackSetInstance.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudformation/stackSetInstance.StackSetInstance */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "cloudformation.getExport")
  @js.native
  def getExport(args: GetExportArgs): js.Promise[GetExportResult] = js.native
  @JSImport("@pulumi/aws", "cloudformation.getExport")
  @js.native
  def getExport(args: GetExportArgs, opts: InvokeOptions): js.Promise[GetExportResult] = js.native
  
  @JSImport("@pulumi/aws", "cloudformation.getStack")
  @js.native
  def getStack(args: GetStackArgs): js.Promise[GetStackResult] = js.native
  @JSImport("@pulumi/aws", "cloudformation.getStack")
  @js.native
  def getStack(args: GetStackArgs, opts: InvokeOptions): js.Promise[GetStackResult] = js.native
}
