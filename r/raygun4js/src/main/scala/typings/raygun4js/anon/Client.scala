package typings.raygun4js.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client extends js.Object {
  var Client: Name
  var Environment: Browser
  var Error: ClassName
  var GroupingKey: js.UndefOr[String] = js.undefined
  var Request: Headers
  var Tags: js.Array[String]
  var User: Email
  var UserCustomData: js.Any
  var Version: String
}

object Client {
  @scala.inline
  def apply(
    Client: Name,
    Environment: Browser,
    Error: ClassName,
    Request: Headers,
    Tags: js.Array[String],
    User: Email,
    UserCustomData: js.Any,
    Version: String,
    GroupingKey: String = null
  ): Client = {
    val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any], Environment = Environment.asInstanceOf[js.Any], Error = Error.asInstanceOf[js.Any], Request = Request.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any], UserCustomData = UserCustomData.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    if (GroupingKey != null) __obj.updateDynamic("GroupingKey")(GroupingKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
}

