package typings.atPulumiAws.typesOutputMod.appsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLApiUserPoolConfig extends js.Object {
  /**
    * A regular expression for validating the incoming Amazon Cognito User Pool app client ID.
    */
  var appIdClientRegex: js.UndefOr[String] = js.native
  /**
    * The AWS region in which the user pool was created.
    */
  var awsRegion: String = js.native
  /**
    * The action that you want your GraphQL API to take when a request that uses Amazon Cognito User Pool authentication doesn't match the Amazon Cognito User Pool configuration. Valid: `ALLOW` and `DENY`
    */
  var defaultAction: String = js.native
  /**
    * The user pool ID.
    */
  var userPoolId: String = js.native
}

object GraphQLApiUserPoolConfig {
  @scala.inline
  def apply(awsRegion: String, defaultAction: String, userPoolId: String, appIdClientRegex: String = null): GraphQLApiUserPoolConfig = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], defaultAction = defaultAction.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
    if (appIdClientRegex != null) __obj.updateDynamic("appIdClientRegex")(appIdClientRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLApiUserPoolConfig]
  }
}

