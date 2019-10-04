package typings.atPulumiAws.typesOutputMod.appsyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLApiAdditionalAuthenticationProvider extends js.Object {
  /**
    * The authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`
    */
  var authenticationType: String
  /**
    * Nested argument containing OpenID Connect configuration. Defined below.
    */
  var openidConnectConfig: js.UndefOr[GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfig] = js.undefined
  /**
    * The Amazon Cognito User Pool configuration. Defined below.
    */
  var userPoolConfig: js.UndefOr[GraphQLApiAdditionalAuthenticationProviderUserPoolConfig] = js.undefined
}

object GraphQLApiAdditionalAuthenticationProvider {
  @scala.inline
  def apply(
    authenticationType: String,
    openidConnectConfig: GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfig = null,
    userPoolConfig: GraphQLApiAdditionalAuthenticationProviderUserPoolConfig = null
  ): GraphQLApiAdditionalAuthenticationProvider = {
    val __obj = js.Dynamic.literal(authenticationType = authenticationType)
    if (openidConnectConfig != null) __obj.updateDynamic("openidConnectConfig")(openidConnectConfig)
    if (userPoolConfig != null) __obj.updateDynamic("userPoolConfig")(userPoolConfig)
    __obj.asInstanceOf[GraphQLApiAdditionalAuthenticationProvider]
  }
}

