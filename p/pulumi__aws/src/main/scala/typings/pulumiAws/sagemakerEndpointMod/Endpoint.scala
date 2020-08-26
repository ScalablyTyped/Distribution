package typings.pulumiAws.sagemakerEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sagemaker/endpoint", "Endpoint")
@js.native
class Endpoint protected () extends CustomResource {
  /**
    * Create a Endpoint resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: EndpointArgs) = this()
  def this(name: String, args: EndpointArgs, opts: CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name (ARN) assigned by AWS to this endpoint.
    */
  val arn: Output_[String] = js.native
  /**
    * The name of the endpoint configuration to use.
    */
  val endpointConfigName: Output_[String] = js.native
  /**
    * The name of the endpoint. If omitted, this provider will assign a random, unique name.
    */
  val name: Output_[String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/sagemaker/endpoint", "Endpoint")
@js.native
object Endpoint extends js.Object {
  /**
    * Get an existing Endpoint resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Endpoint = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Endpoint = js.native
  def get(name: String, id: Input[ID], state: EndpointState): Endpoint = js.native
  def get(name: String, id: Input[ID], state: EndpointState, opts: CustomResourceOptions): Endpoint = js.native
  /**
    * Returns true if the given object is an instance of Endpoint.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/endpoint.Endpoint */ Boolean = js.native
}

