package typings.atPulumiAws.typesOutputMod.appsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLApiAdditionalAuthenticationProviderUserPoolConfig extends js.Object {
  /**
    * A regular expression for validating the incoming Amazon Cognito User Pool app client ID.
    */
  var appIdClientRegex: js.UndefOr[String] = js.undefined
  /**
    * The AWS region in which the user pool was created.
    */
  var awsRegion: String
  /**
    * The user pool ID.
    */
  var userPoolId: String
}

object GraphQLApiAdditionalAuthenticationProviderUserPoolConfig {
  @scala.inline
  def apply(awsRegion: String, userPoolId: String, appIdClientRegex: String = null): GraphQLApiAdditionalAuthenticationProviderUserPoolConfig = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion, userPoolId = userPoolId)
    if (appIdClientRegex != null) __obj.updateDynamic("appIdClientRegex")(appIdClientRegex)
    __obj.asInstanceOf[GraphQLApiAdditionalAuthenticationProviderUserPoolConfig]
  }
}

