package typings
package atPulumiAwsLib.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sagemaker", "Model")
@js.native
class Model protected ()
  extends atPulumiAwsLib.sagemakerModelMod.Model {
  /**
    * Create a Model resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.sagemakerModelMod.ModelArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.sagemakerModelMod.ModelArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/sagemaker", "Model")
@js.native
object Model extends js.Object {
  /**
    * Get an existing Model resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.sagemakerModelMod.Model = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.sagemakerModelMod.ModelState
  ): atPulumiAwsLib.sagemakerModelMod.Model = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.sagemakerModelMod.ModelState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.sagemakerModelMod.Model = js.native
}

