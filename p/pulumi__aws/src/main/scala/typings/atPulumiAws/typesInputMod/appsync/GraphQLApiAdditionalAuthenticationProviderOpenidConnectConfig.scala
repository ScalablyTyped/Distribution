package typings.atPulumiAws.typesInputMod.appsync

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfig extends js.Object {
  /**
    * Number of milliseconds a token is valid after being authenticated.
    */
  var authTtl: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Client identifier of the Relying party at the OpenID identity provider. This identifier is typically obtained when the Relying party is registered with the OpenID identity provider. You can specify a regular expression so the AWS AppSync can validate against multiple client identifiers at a time.
    */
  var clientId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Number of milliseconds a token is valid after being issued to a user.
    */
  var iatTtl: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Issuer for the OpenID Connect configuration. The issuer returned by discovery MUST exactly match the value of iss in the ID Token.
    */
  var issuer: Input[String]
}

object GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfig {
  @scala.inline
  def apply(
    issuer: Input[String],
    authTtl: Input[Double] = null,
    clientId: Input[String] = null,
    iatTtl: Input[Double] = null
  ): GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfig = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any])
    if (authTtl != null) __obj.updateDynamic("authTtl")(authTtl.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (iatTtl != null) __obj.updateDynamic("iatTtl")(iatTtl.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfig]
  }
}

