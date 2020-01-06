package typings.atPulumiAws.appsyncGraphQLApiMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.appsync.GraphQLApiAdditionalAuthenticationProvider
import typings.atPulumiAws.typesInputMod.appsync.GraphQLApiLogConfig
import typings.atPulumiAws.typesInputMod.appsync.GraphQLApiOpenidConnectConfig
import typings.atPulumiAws.typesInputMod.appsync.GraphQLApiUserPoolConfig
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLApiState extends js.Object {
  /**
    * One or more additional authentication providers for the GraphqlApi. Defined below.
    */
  val additionalAuthenticationProviders: js.UndefOr[Input[js.Array[Input[GraphQLApiAdditionalAuthenticationProvider]]]] = js.native
  /**
    * The ARN
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`
    */
  val authenticationType: js.UndefOr[Input[String]] = js.native
  /**
    * Nested argument containing logging configuration. Defined below.
    */
  val logConfig: js.UndefOr[Input[GraphQLApiLogConfig]] = js.native
  /**
    * A user-supplied name for the GraphqlApi.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Nested argument containing OpenID Connect configuration. Defined below.
    */
  val openidConnectConfig: js.UndefOr[Input[GraphQLApiOpenidConnectConfig]] = js.native
  /**
    * The schema definition, in GraphQL schema language format. This provider cannot perform drift detection of this configuration.
    */
  val schema: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Map of URIs associated with the API. e.g. `uris["GRAPHQL"] = https://ID.appsync-api.REGION.amazonaws.com/graphql`
    */
  val uris: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The Amazon Cognito User Pool configuration. Defined below.
    */
  val userPoolConfig: js.UndefOr[Input[GraphQLApiUserPoolConfig]] = js.native
}

object GraphQLApiState {
  @scala.inline
  def apply(
    additionalAuthenticationProviders: Input[js.Array[Input[GraphQLApiAdditionalAuthenticationProvider]]] = null,
    arn: Input[String] = null,
    authenticationType: Input[String] = null,
    logConfig: Input[GraphQLApiLogConfig] = null,
    name: Input[String] = null,
    openidConnectConfig: Input[GraphQLApiOpenidConnectConfig] = null,
    schema: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    uris: Input[StringDictionary[Input[String]]] = null,
    userPoolConfig: Input[GraphQLApiUserPoolConfig] = null
  ): GraphQLApiState = {
    val __obj = js.Dynamic.literal()
    if (additionalAuthenticationProviders != null) __obj.updateDynamic("additionalAuthenticationProviders")(additionalAuthenticationProviders.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (authenticationType != null) __obj.updateDynamic("authenticationType")(authenticationType.asInstanceOf[js.Any])
    if (logConfig != null) __obj.updateDynamic("logConfig")(logConfig.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (openidConnectConfig != null) __obj.updateDynamic("openidConnectConfig")(openidConnectConfig.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (uris != null) __obj.updateDynamic("uris")(uris.asInstanceOf[js.Any])
    if (userPoolConfig != null) __obj.updateDynamic("userPoolConfig")(userPoolConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLApiState]
  }
}

