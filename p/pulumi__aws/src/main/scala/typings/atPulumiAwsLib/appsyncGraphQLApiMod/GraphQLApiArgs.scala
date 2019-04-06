package typings
package atPulumiAwsLib.appsyncGraphQLApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLApiArgs extends js.Object {
  /**
    * The authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`
    */
  val authenticationType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Nested argument containing logging configuration. Defined below.
    */
  val logConfig: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CloudwatchLogsRoleArnFieldLogLevel]
  ] = js.undefined
  /**
    * A user-supplied name for the GraphqlApi.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Nested argument containing OpenID Connect configuration. Defined below.
    */
  val openidConnectConfig: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AuthTtlClientId]] = js.undefined
  /**
    * The schema definition, in GraphQL schema language format. Terraform cannot perform drift detection of this configuration.
    */
  val schema: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The Amazon Cognito User Pool configuration. Defined below.
    */
  val userPoolConfig: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AppIdClientRegexAwsRegion]] = js.undefined
}

object GraphQLApiArgs {
  @scala.inline
  def apply(
    authenticationType: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    logConfig: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CloudwatchLogsRoleArnFieldLogLevel] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    openidConnectConfig: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AuthTtlClientId] = null,
    schema: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    userPoolConfig: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AppIdClientRegexAwsRegion] = null
  ): GraphQLApiArgs = {
    val __obj = js.Dynamic.literal(authenticationType = authenticationType.asInstanceOf[js.Any])
    if (logConfig != null) __obj.updateDynamic("logConfig")(logConfig.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (openidConnectConfig != null) __obj.updateDynamic("openidConnectConfig")(openidConnectConfig.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (userPoolConfig != null) __obj.updateDynamic("userPoolConfig")(userPoolConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLApiArgs]
  }
}

