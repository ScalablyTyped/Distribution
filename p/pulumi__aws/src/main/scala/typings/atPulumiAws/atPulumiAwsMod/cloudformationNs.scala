package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.cloudformationGetExportMod.GetExportArgs
import typings.atPulumiAws.cloudformationGetExportMod.GetExportResult
import typings.atPulumiAws.cloudformationGetStackMod.GetStackArgs
import typings.atPulumiAws.cloudformationGetStackMod.GetStackResult
import typings.atPulumiAws.cloudformationStackMod.StackArgs
import typings.atPulumiAws.cloudformationStackMod.StackState
import typings.atPulumiAws.cloudformationStackSetInstanceMod.StackSetInstanceArgs
import typings.atPulumiAws.cloudformationStackSetInstanceMod.StackSetInstanceState
import typings.atPulumiAws.cloudformationStackSetMod.StackSetArgs
import typings.atPulumiAws.cloudformationStackSetMod.StackSetState
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "cloudformation")
@js.native
object cloudformationNs extends js.Object {
  @js.native
  class Stack protected ()
    extends typings.atPulumiAws.cloudformationMod.Stack {
    /**
      * Create a Stack resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: StackArgs) = this()
    def this(name: String, args: StackArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class StackSet protected ()
    extends typings.atPulumiAws.cloudformationMod.StackSet {
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
  
  @js.native
  class StackSetInstance protected ()
    extends typings.atPulumiAws.cloudformationMod.StackSetInstance {
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
  
  def getExport(args: GetExportArgs): js.Promise[GetExportResult] with GetExportResult = js.native
  def getExport(args: GetExportArgs, opts: InvokeOptions): js.Promise[GetExportResult] with GetExportResult = js.native
  def getStack(args: GetStackArgs): js.Promise[GetStackResult] with GetStackResult = js.native
  def getStack(args: GetStackArgs, opts: InvokeOptions): js.Promise[GetStackResult] with GetStackResult = js.native
  /* static members */
  @js.native
  object Stack extends js.Object {
    /**
      * Get an existing Stack resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cloudformationStackMod.Stack = js.native
    def get(name: String, id: Input[ID], state: StackState): typings.atPulumiAws.cloudformationStackMod.Stack = js.native
    def get(name: String, id: Input[ID], state: StackState, opts: CustomResourceOptions): typings.atPulumiAws.cloudformationStackMod.Stack = js.native
    /**
      * Returns true if the given object is an instance of Stack.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudformation/stack.Stack */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object StackSet extends js.Object {
    /**
      * Get an existing StackSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cloudformationStackSetMod.StackSet = js.native
    def get(name: String, id: Input[ID], state: StackSetState): typings.atPulumiAws.cloudformationStackSetMod.StackSet = js.native
    def get(name: String, id: Input[ID], state: StackSetState, opts: CustomResourceOptions): typings.atPulumiAws.cloudformationStackSetMod.StackSet = js.native
    /**
      * Returns true if the given object is an instance of StackSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudformation/stackSet.StackSet */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object StackSetInstance extends js.Object {
    /**
      * Get an existing StackSetInstance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cloudformationStackSetInstanceMod.StackSetInstance = js.native
    def get(name: String, id: Input[ID], state: StackSetInstanceState): typings.atPulumiAws.cloudformationStackSetInstanceMod.StackSetInstance = js.native
    def get(name: String, id: Input[ID], state: StackSetInstanceState, opts: CustomResourceOptions): typings.atPulumiAws.cloudformationStackSetInstanceMod.StackSetInstance = js.native
    /**
      * Returns true if the given object is an instance of StackSetInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudformation/stackSetInstance.StackSetInstance */ Boolean = js.native
  }
  
}

