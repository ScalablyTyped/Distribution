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
    * The Amazon Cognito User Pool configuration. Defined below.
    */
  val userPoolConfig: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AppIdClientRegexAwsRegion]] = js.undefined
}

