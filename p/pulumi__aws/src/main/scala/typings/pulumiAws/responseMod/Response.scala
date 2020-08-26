package typings.pulumiAws.responseMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway/response", "Response")
@js.native
class Response protected () extends CustomResource {
  /**
    * Create a Response resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ResponseArgs) = this()
  def this(name: String, args: ResponseArgs, opts: CustomResourceOptions) = this()
  /**
    * A map specifying the parameters (paths, query strings and headers) of the Gateway Response.
    */
  val responseParameters: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * A map specifying the templates used to transform the response body.
    */
  val responseTemplates: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * The response type of the associated GatewayResponse.
    */
  val responseType: Output_[String] = js.native
  /**
    * The string identifier of the associated REST API.
    */
  val restApiId: Output_[String] = js.native
  /**
    * The HTTP status code of the Gateway Response.
    */
  val statusCode: Output_[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/apigateway/response", "Response")
@js.native
object Response extends js.Object {
  /**
    * Get an existing Response resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Response = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Response = js.native
  def get(name: String, id: Input[ID], state: ResponseState): Response = js.native
  def get(name: String, id: Input[ID], state: ResponseState, opts: CustomResourceOptions): Response = js.native
  /**
    * Returns true if the given object is an instance of Response.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/response.Response */ Boolean = js.native
}

