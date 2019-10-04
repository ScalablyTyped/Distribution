package typings.atPulumiAws.typesInputMod.appsyncNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLApiAdditionalAuthenticationProvider extends js.Object {
  /**
    * The authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`
    */
  var authenticationType: Input[String]
  /**
    * Nested argument containing OpenID Connect configuration. Defined below.
    */
  var openidConnectConfig: js.UndefOr[Input[GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfig]] = js.undefined
  /**
    * The Amazon Cognito User Pool configuration. Defined below.
    */
  var userPoolConfig: js.UndefOr[Input[GraphQLApiAdditionalAuthenticationProviderUserPoolConfig]] = js.undefined
}

object GraphQLApiAdditionalAuthenticationProvider {
  @scala.inline
  def apply(
    authenticationType: Input[String],
    openidConnectConfig: Input[GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfig] = null,
    userPoolConfig: Input[GraphQLApiAdditionalAuthenticationProviderUserPoolConfig] = null
  ): GraphQLApiAdditionalAuthenticationProvider = {
    val __obj = js.Dynamic.literal(authenticationType = authenticationType.asInstanceOf[js.Any])
    if (openidConnectConfig != null) __obj.updateDynamic("openidConnectConfig")(openidConnectConfig.asInstanceOf[js.Any])
    if (userPoolConfig != null) __obj.updateDynamic("userPoolConfig")(userPoolConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLApiAdditionalAuthenticationProvider]
  }
}

