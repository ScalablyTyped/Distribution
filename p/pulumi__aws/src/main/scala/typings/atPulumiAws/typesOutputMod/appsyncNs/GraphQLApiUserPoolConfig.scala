package typings.atPulumiAws.typesOutputMod.appsyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLApiUserPoolConfig extends js.Object {
  /**
    * A regular expression for validating the incoming Amazon Cognito User Pool app client ID.
    */
  var appIdClientRegex: js.UndefOr[String] = js.undefined
  /**
    * The AWS region in which the user pool was created.
    */
  var awsRegion: String
  /**
    * The action that you want your GraphQL API to take when a request that uses Amazon Cognito User Pool authentication doesn't match the Amazon Cognito User Pool configuration. Valid: `ALLOW` and `DENY`
    */
  var defaultAction: String
  /**
    * The user pool ID.
    */
  var userPoolId: String
}

object GraphQLApiUserPoolConfig {
  @scala.inline
  def apply(awsRegion: String, defaultAction: String, userPoolId: String, appIdClientRegex: String = null): GraphQLApiUserPoolConfig = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion, defaultAction = defaultAction, userPoolId = userPoolId)
    if (appIdClientRegex != null) __obj.updateDynamic("appIdClientRegex")(appIdClientRegex)
    __obj.asInstanceOf[GraphQLApiUserPoolConfig]
  }
}

