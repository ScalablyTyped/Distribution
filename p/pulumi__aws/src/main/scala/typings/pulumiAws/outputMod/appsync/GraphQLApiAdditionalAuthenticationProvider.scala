package typings.pulumiAws.outputMod.appsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLApiAdditionalAuthenticationProvider extends js.Object {
  /**
    * The authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`
    */
  var authenticationType: String = js.native
  /**
    * Nested argument containing OpenID Connect configuration. Defined below.
    */
  var openidConnectConfig: js.UndefOr[GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfig] = js.native
  /**
    * The Amazon Cognito User Pool configuration. Defined below.
    */
  var userPoolConfig: js.UndefOr[GraphQLApiAdditionalAuthenticationProviderUserPoolConfig] = js.native
}

object GraphQLApiAdditionalAuthenticationProvider {
  @scala.inline
  def apply(
    authenticationType: String,
    openidConnectConfig: GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfig = null,
    userPoolConfig: GraphQLApiAdditionalAuthenticationProviderUserPoolConfig = null
  ): GraphQLApiAdditionalAuthenticationProvider = {
    val __obj = js.Dynamic.literal(authenticationType = authenticationType.asInstanceOf[js.Any])
    if (openidConnectConfig != null) __obj.updateDynamic("openidConnectConfig")(openidConnectConfig.asInstanceOf[js.Any])
    if (userPoolConfig != null) __obj.updateDynamic("userPoolConfig")(userPoolConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLApiAdditionalAuthenticationProvider]
  }
}

