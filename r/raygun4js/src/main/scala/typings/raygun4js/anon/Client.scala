package typings.raygun4js.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  var Client: Version = js.native
  var Environment: Browser = js.native
  var Error: ClassName = js.native
  var GroupingKey: js.UndefOr[String] = js.native
  var Request: Headers = js.native
  var Tags: js.Array[String] = js.native
  var User: Email = js.native
  var UserCustomData: js.Any = js.native
  var Version: String = js.native
}

object Client {
  @scala.inline
  def apply(
    Client: Version,
    Environment: Browser,
    Error: ClassName,
    Request: Headers,
    Tags: js.Array[String],
    User: Email,
    UserCustomData: js.Any,
    Version: String
  ): Client = {
    val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any], Environment = Environment.asInstanceOf[js.Any], Error = Error.asInstanceOf[js.Any], Request = Request.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any], UserCustomData = UserCustomData.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
  @scala.inline
  implicit class ClientOps[Self <: Client] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClient(value: Version): Self = this.set("Client", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironment(value: Browser): Self = this.set("Environment", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: ClassName): Self = this.set("Error", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: Headers): Self = this.set("Request", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: Email): Self = this.set("User", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserCustomData(value: js.Any): Self = this.set("UserCustomData", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupingKey(value: String): Self = this.set("GroupingKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupingKey: Self = this.set("GroupingKey", js.undefined)
  }
  
}

