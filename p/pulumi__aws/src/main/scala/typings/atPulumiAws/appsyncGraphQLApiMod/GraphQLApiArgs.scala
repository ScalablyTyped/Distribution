package typings.atPulumiAws.appsyncGraphQLApiMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_AppIdClientRegexAwsRegion
import typings.atPulumiAws.Anon_AuthTtlClientId
import typings.atPulumiAws.Anon_CloudwatchLogsRoleArnFieldLogLevel
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLApiArgs extends js.Object {
  /**
    * The authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`
    */
  val authenticationType: Input[String]
  /**
    * Nested argument containing logging configuration. Defined below.
    */
  val logConfig: js.UndefOr[Input[Anon_CloudwatchLogsRoleArnFieldLogLevel]] = js.undefined
  /**
    * A user-supplied name for the GraphqlApi.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Nested argument containing OpenID Connect configuration. Defined below.
    */
  val openidConnectConfig: js.UndefOr[Input[Anon_AuthTtlClientId]] = js.undefined
  /**
    * The schema definition, in GraphQL schema language format. This provider cannot perform drift detection of this configuration.
    */
  val schema: js.UndefOr[Input[String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * The Amazon Cognito User Pool configuration. Defined below.
    */
  val userPoolConfig: js.UndefOr[Input[Anon_AppIdClientRegexAwsRegion]] = js.undefined
}

object GraphQLApiArgs {
  @scala.inline
  def apply(
    authenticationType: Input[String],
    logConfig: Input[Anon_CloudwatchLogsRoleArnFieldLogLevel] = null,
    name: Input[String] = null,
    openidConnectConfig: Input[Anon_AuthTtlClientId] = null,
    schema: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    userPoolConfig: Input[Anon_AppIdClientRegexAwsRegion] = null
  ): GraphQLApiArgs = {
    val __obj = js.Dynamic.literal(authenticationType = authenticationType.asInstanceOf[js.Any])
    if (logConfig != null) __obj.updateDynamic("logConfig")(logConfig.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (openidConnectConfig != null) __obj.updateDynamic("openidConnectConfig")(openidConnectConfig.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (userPoolConfig != null) __obj.updateDynamic("userPoolConfig")(userPoolConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLApiArgs]
  }
}

