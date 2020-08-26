package typings.pulumiAws.modelMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigatewayv2/model", "Model")
@js.native
class Model protected () extends CustomResource {
  /**
    * Create a Model resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ModelArgs) = this()
  def this(name: String, args: ModelArgs, opts: CustomResourceOptions) = this()
  /**
    * The API identifier.
    */
  val apiId: Output_[String] = js.native
  /**
    * The content-type for the model, for example, `application/json`.
    */
  val contentType: Output_[String] = js.native
  /**
    * The description of the model.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * The name of the model. Must be alphanumeric.
    */
  val name: Output_[String] = js.native
  /**
    * The schema for the model. This should be a [JSON schema draft 4](https://tools.ietf.org/html/draft-zyp-json-schema-04) model.
    */
  val schema: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/apigatewayv2/model", "Model")
@js.native
object Model extends js.Object {
  /**
    * Get an existing Model resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Model = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Model = js.native
  def get(name: String, id: Input[ID], state: ModelState): Model = js.native
  def get(name: String, id: Input[ID], state: ModelState, opts: CustomResourceOptions): Model = js.native
  /**
    * Returns true if the given object is an instance of Model.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/model.Model */ Boolean = js.native
}

