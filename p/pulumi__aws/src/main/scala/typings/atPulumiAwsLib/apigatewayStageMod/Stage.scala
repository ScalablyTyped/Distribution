package typings
package atPulumiAwsLib.apigatewayStageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway/stage", "Stage")
@js.native
class Stage protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Stage resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: StageArgs) = this()
  def this(name: java.lang.String, args: StageArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Enables access logs for the API stage. Detailed below.
    */
  val accessLogSettings: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_DestinationArn]] = js.native
  /**
    * Specifies whether a cache cluster is enabled for the stage
    */
  val cacheClusterEnabled: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The size of the cache cluster for the stage, if enabled.
    * Allowed values include `0.5`, `1.6`, `6.1`, `13.5`, `28.4`, `58.2`, `118` and `237`.
    */
  val cacheClusterSize: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The identifier of a client certificate for the stage.
    */
  val clientCertificateId: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The ID of the deployment that the stage points to
    */
  val deployment: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.apigatewayDeploymentMod.Deployment] = js.native
  /**
    * The description of the stage
    */
  val description: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The version of the associated API documentation
    */
  val documentationVersion: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The execution ARN to be used in [`lambda_permission`](https://www.terraform.io/docs/providers/aws/r/lambda_permission.html)'s `source_arn`
    * when allowing API Gateway to invoke a Lambda function,
    * e.g. `arn:aws:execute-api:eu-west-2:123456789012:z4675bid1j/prod`
    */
  val executionArn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The URL to invoke the API pointing to the stage,
    * e.g. `https://z4675bid1j.execute-api.eu-west-2.amazonaws.com/prod`
    */
  val invokeUrl: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ID of the associated REST API
    */
  val restApi: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.apigatewayRestApiMod.RestApi] = js.native
  /**
    * The name of the stage
    */
  val stageName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * A map that defines the stage variables
    */
  val variables: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * Whether active tracing with X-ray is enabled. Defaults to `false`.
    */
  val xrayTracingEnabled: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/apigateway/stage", "Stage")
@js.native
object Stage extends js.Object {
  /**
    * Get an existing Stage resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayStageMod.Stage = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayStageMod.StageState
  ): atPulumiAwsLib.apigatewayStageMod.Stage = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayStageMod.StageState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.apigatewayStageMod.Stage = js.native
  /**
    * Returns true if the given object is an instance of Stage.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/stage.Stage */ scala.Boolean = js.native
}

