package typings.pulumiAws.graphQLApiMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.appsync.GraphQLApiAdditionalAuthenticationProvider
import typings.pulumiAws.outputMod.appsync.GraphQLApiLogConfig
import typings.pulumiAws.outputMod.appsync.GraphQLApiOpenidConnectConfig
import typings.pulumiAws.outputMod.appsync.GraphQLApiUserPoolConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/appsync/graphQLApi", "GraphQLApi")
@js.native
class GraphQLApi protected () extends CustomResource {
  /**
    * Create a GraphQLApi resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: GraphQLApiArgs) = this()
  def this(name: String, args: GraphQLApiArgs, opts: CustomResourceOptions) = this()
  /**
    * One or more additional authentication providers for the GraphqlApi. Defined below.
    */
  val additionalAuthenticationProviders: Output_[js.UndefOr[js.Array[GraphQLApiAdditionalAuthenticationProvider]]] = js.native
  /**
    * The ARN
    */
  val arn: Output_[String] = js.native
  /**
    * The authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`
    */
  val authenticationType: Output_[String] = js.native
  /**
    * Nested argument containing logging configuration. Defined below.
    */
  val logConfig: Output_[js.UndefOr[GraphQLApiLogConfig]] = js.native
  /**
    * A user-supplied name for the GraphqlApi.
    */
  val name: Output_[String] = js.native
  /**
    * Nested argument containing OpenID Connect configuration. Defined below.
    */
  val openidConnectConfig: Output_[js.UndefOr[GraphQLApiOpenidConnectConfig]] = js.native
  /**
    * The schema definition, in GraphQL schema language format. This provider cannot perform drift detection of this configuration.
    */
  val schema: Output_[js.UndefOr[String]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * Map of URIs associated with the API. e.g. `uris["GRAPHQL"] = https://ID.appsync-api.REGION.amazonaws.com/graphql`
    */
  val uris: Output_[StringDictionary[String]] = js.native
  /**
    * The Amazon Cognito User Pool configuration. Defined below.
    */
  val userPoolConfig: Output_[js.UndefOr[GraphQLApiUserPoolConfig]] = js.native
  /**
    * Whether tracing with X-ray is enabled. Defaults to false.
    */
  val xrayEnabled: Output_[js.UndefOr[Boolean]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/appsync/graphQLApi", "GraphQLApi")
@js.native
object GraphQLApi extends js.Object {
  /**
    * Get an existing GraphQLApi resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): GraphQLApi = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): GraphQLApi = js.native
  def get(name: String, id: Input[ID], state: GraphQLApiState): GraphQLApi = js.native
  def get(name: String, id: Input[ID], state: GraphQLApiState, opts: CustomResourceOptions): GraphQLApi = js.native
  /**
    * Returns true if the given object is an instance of GraphQLApi.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/graphQLApi.GraphQLApi */ Boolean = js.native
}

