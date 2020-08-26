package typings.pulumiAws.methodResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway/methodResponse", "MethodResponse")
@js.native
class MethodResponse protected () extends CustomResource {
  /**
    * Create a MethodResponse resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: MethodResponseArgs) = this()
  def this(name: String, args: MethodResponseArgs, opts: CustomResourceOptions) = this()
  /**
    * The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
    */
  val httpMethod: Output_[String] = js.native
  /**
    * The API resource ID
    */
  val resourceId: Output_[String] = js.native
  /**
    * A map of the API models used for the response's content type
    */
  val responseModels: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * A map of response parameters that can be sent to the caller.
    * For example: `responseParameters = { "method.response.header.X-Some-Header" = true }`
    * would define that the header `X-Some-Header` can be provided on the response.
    */
  val responseParameters: Output_[js.UndefOr[StringDictionary[Boolean]]] = js.native
  /**
    * The ID of the associated REST API
    */
  val restApi: Output_[String] = js.native
  /**
    * The HTTP status code
    */
  val statusCode: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/apigateway/methodResponse", "MethodResponse")
@js.native
object MethodResponse extends js.Object {
  /**
    * Get an existing MethodResponse resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): MethodResponse = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): MethodResponse = js.native
  def get(name: String, id: Input[ID], state: MethodResponseState): MethodResponse = js.native
  def get(name: String, id: Input[ID], state: MethodResponseState, opts: CustomResourceOptions): MethodResponse = js.native
  /**
    * Returns true if the given object is an instance of MethodResponse.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/methodResponse.MethodResponse */ Boolean = js.native
}

