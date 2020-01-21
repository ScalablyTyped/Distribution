package typings.raygun4js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClient extends js.Object {
  var Client: AnonName
  var Environment: AnonBrowser
  var Error: AnonClassName
  var GroupingKey: js.UndefOr[String] = js.undefined
  var Request: AnonHeaders
  var Tags: js.Array[String]
  var User: AnonEmail
  var UserCustomData: js.Any
  var Version: String
}

object AnonClient {
  @scala.inline
  def apply(
    Client: AnonName,
    Environment: AnonBrowser,
    Error: AnonClassName,
    Request: AnonHeaders,
    Tags: js.Array[String],
    User: AnonEmail,
    UserCustomData: js.Any,
    Version: String,
    GroupingKey: String = null
  ): AnonClient = {
    val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any], Environment = Environment.asInstanceOf[js.Any], Error = Error.asInstanceOf[js.Any], Request = Request.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any], UserCustomData = UserCustomData.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    if (GroupingKey != null) __obj.updateDynamic("GroupingKey")(GroupingKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClient]
  }
}

