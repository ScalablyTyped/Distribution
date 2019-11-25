package typings.raygun4js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Client extends js.Object {
  var Client: Anon_Name
  var Environment: Anon_Browser
  var Error: Anon_ClassName
  var GroupingKey: js.UndefOr[String] = js.undefined
  var Request: Anon_Headers
  var Tags: js.Array[String]
  var User: Anon_Email
  var UserCustomData: js.Any
  var Version: String
}

object Anon_Client {
  @scala.inline
  def apply(
    Client: Anon_Name,
    Environment: Anon_Browser,
    Error: Anon_ClassName,
    Request: Anon_Headers,
    Tags: js.Array[String],
    User: Anon_Email,
    UserCustomData: js.Any,
    Version: String,
    GroupingKey: String = null
  ): Anon_Client = {
    val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any], Environment = Environment.asInstanceOf[js.Any], Error = Error.asInstanceOf[js.Any], Request = Request.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any], UserCustomData = UserCustomData.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    if (GroupingKey != null) __obj.updateDynamic("GroupingKey")(GroupingKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Client]
  }
}

