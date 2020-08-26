package typings.pulumiAws.outputMod.mq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerUser extends js.Object {
  /**
    * Whether to enable access to the [ActiveMQ Web Console](http://activemq.apache.org/web-console.html) for the user.
    */
  var consoleAccess: js.UndefOr[Boolean] = js.native
  /**
    * The list of groups (20 maximum) to which the ActiveMQ user belongs.
    */
  var groups: js.UndefOr[js.Array[String]] = js.native
  /**
    * The password of the user. It must be 12 to 250 characters long, at least 4 unique characters, and must not contain commas.
    */
  var password: String = js.native
  /**
    * The username of the user.
    */
  var username: String = js.native
}

object BrokerUser {
  @scala.inline
  def apply(password: String, username: String): BrokerUser = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerUser]
  }
  @scala.inline
  implicit class BrokerUserOps[Self <: BrokerUser] (val x: Self) extends AnyVal {
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
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsoleAccess(value: Boolean): Self = this.set("consoleAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsoleAccess: Self = this.set("consoleAccess", js.undefined)
    @scala.inline
    def setGroupsVarargs(value: String*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: js.Array[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
  }
  
}

