package typings.atPulumiAws.sagemakerModelMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_ContainerHostname
import typings.atPulumiAws.Anon_SecurityGroupIdsSubnetsArray
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sagemaker/model", "Model")
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
    * The Amazon Resource Name (ARN) assigned by AWS to this model.
    */
  val arn: Output[String] = js.native
  /**
    * Specifies containers in the inference pipeline. If not specified, the `primary_container` argument is required. Fields are documented below.
    */
  val containers: Output[js.UndefOr[js.Array[Anon_ContainerHostname]]] = js.native
  /**
    * Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
    */
  val enableNetworkIsolation: Output[js.UndefOr[Boolean]] = js.native
  /**
    * A role that SageMaker can assume to access model artifacts and docker images for deployment.
    */
  val executionRoleArn: Output[String] = js.native
  /**
    * The name of the model (must be unique). If omitted, this provider will assign a random, unique name.
    */
  val name: Output[String] = js.native
  /**
    * The primary docker image containing inference code that is used when the model is deployed for predictions.  If not specified, the `container` argument is required. Fields are documented below.
    */
  val primaryContainer: Output[js.UndefOr[Anon_ContainerHostname]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * Specifies the VPC that you want your model to connect to. VpcConfig is used in hosting services and in batch transform.
    */
  val vpcConfig: Output[js.UndefOr[Anon_SecurityGroupIdsSubnetsArray]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/sagemaker/model", "Model")
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
  def get(name: String, id: Input[ID]): Model = js.native
  def get(name: String, id: Input[ID], state: ModelState): Model = js.native
  def get(name: String, id: Input[ID], state: ModelState, opts: CustomResourceOptions): Model = js.native
  /**
    * Returns true if the given object is an instance of Model.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/model.Model */ Boolean = js.native
}

