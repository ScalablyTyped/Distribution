package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "cloudformation")
@js.native
object cloudformationNs extends js.Object {
  @js.native
  class Stack protected ()
    extends atPulumiAwsLib.cloudformationMod.Stack {
    /**
      * Create a Stack resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cloudformationStackMod.StackArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cloudformationStackMod.StackArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  def getExport(args: atPulumiAwsLib.cloudformationGetExportMod.GetExportArgs): js.Promise[atPulumiAwsLib.cloudformationGetExportMod.GetExportResult] = js.native
  def getExport(
    args: atPulumiAwsLib.cloudformationGetExportMod.GetExportArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.cloudformationGetExportMod.GetExportResult] = js.native
  def getStack(args: atPulumiAwsLib.cloudformationGetStackMod.GetStackArgs): js.Promise[atPulumiAwsLib.cloudformationGetStackMod.GetStackResult] = js.native
  def getStack(
    args: atPulumiAwsLib.cloudformationGetStackMod.GetStackArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.cloudformationGetStackMod.GetStackResult] = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloudformationStackMod.Stack = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cloudformationStackMod.StackState
    ): atPulumiAwsLib.cloudformationStackMod.Stack = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cloudformationStackMod.StackState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.cloudformationStackMod.Stack = js.native
  }
  
}

