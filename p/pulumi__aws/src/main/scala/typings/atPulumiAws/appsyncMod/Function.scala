package typings.atPulumiAws.appsyncMod

import typings.atPulumiAws.appsyncFunctionMod.FunctionArgs
import typings.atPulumiAws.appsyncFunctionMod.FunctionState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/appsync", "Function")
@js.native
class Function protected ()
  extends typings.atPulumiAws.appsyncFunctionMod.Function {
  /**
    * Create a Function resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: FunctionArgs) = this()
  def this(name: String, args: FunctionArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/appsync", "Function")
@js.native
object Function extends js.Object {
  /**
    * Get an existing Function resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.appsyncFunctionMod.Function = js.native
  def get(name: String, id: Input[ID], state: FunctionState): typings.atPulumiAws.appsyncFunctionMod.Function = js.native
  def get(name: String, id: Input[ID], state: FunctionState, opts: CustomResourceOptions): typings.atPulumiAws.appsyncFunctionMod.Function = js.native
  /**
    * Returns true if the given object is an instance of Function.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/function.Function */ Boolean = js.native
}

