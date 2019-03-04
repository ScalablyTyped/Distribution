package typings
package raygun4jsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Client extends js.Object {
  var Client: Anon_Name
  var Environment: Anon_Browser
  var Error: Anon_ClassName
  var GroupingKey: js.UndefOr[java.lang.String] = js.undefined
  var Request: Anon_Headers
  var Tags: js.Array[java.lang.String]
  var User: Anon_Email
  var UserCustomData: js.Any
  var Version: java.lang.String
}

object Anon_Client {
  @scala.inline
  def apply(
    Client: Anon_Name,
    Environment: Anon_Browser,
    Error: Anon_ClassName,
    Request: Anon_Headers,
    Tags: js.Array[java.lang.String],
    User: Anon_Email,
    UserCustomData: js.Any,
    Version: java.lang.String,
    GroupingKey: java.lang.String = null
  ): Anon_Client = {
    val __obj = js.Dynamic.literal(Client = Client, Environment = Environment, Error = Error, Request = Request, Tags = Tags, User = User, UserCustomData = UserCustomData, Version = Version)
    if (GroupingKey != null) __obj.updateDynamic("GroupingKey")(GroupingKey)
    __obj.asInstanceOf[Anon_Client]
  }
}

