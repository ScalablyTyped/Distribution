package typings.atPulumiAws.typesOutputMod.mq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrokerUser extends js.Object {
  /**
    * Whether to enable access to the [ActiveMQ Web Console](http://activemq.apache.org/web-console.html) for the user.
    */
  var consoleAccess: js.UndefOr[Boolean] = js.undefined
  /**
    * The list of groups (20 maximum) to which the ActiveMQ user belongs.
    */
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The password of the user. It must be 12 to 250 characters long, at least 4 unique characters, and must not contain commas.
    */
  var password: String
  /**
    * The username of the user.
    */
  var username: String
}

object BrokerUser {
  @scala.inline
  def apply(
    password: String,
    username: String,
    consoleAccess: js.UndefOr[Boolean] = js.undefined,
    groups: js.Array[String] = null
  ): BrokerUser = {
    val __obj = js.Dynamic.literal(password = password, username = username)
    if (!js.isUndefined(consoleAccess)) __obj.updateDynamic("consoleAccess")(consoleAccess)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    __obj.asInstanceOf[BrokerUser]
  }
}

