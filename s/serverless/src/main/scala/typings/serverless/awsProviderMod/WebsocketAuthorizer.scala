package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebsocketAuthorizer extends js.Object {
  var arn: js.UndefOr[String] = js.undefined
  var identitySource: js.UndefOr[js.Array[String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object WebsocketAuthorizer {
  @scala.inline
  def apply(arn: String = null, identitySource: js.Array[String] = null, name: String = null): WebsocketAuthorizer = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (identitySource != null) __obj.updateDynamic("identitySource")(identitySource.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebsocketAuthorizer]
  }
}

