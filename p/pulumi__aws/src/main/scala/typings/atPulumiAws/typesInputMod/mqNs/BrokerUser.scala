package typings.atPulumiAws.typesInputMod.mqNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrokerUser extends js.Object {
  /**
    * Whether to enable access to the [ActiveMQ Web Console](http://activemq.apache.org/web-console.html) for the user.
    */
  var consoleAccess: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The list of groups (20 maximum) to which the ActiveMQ user belongs.
    */
  var groups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The password of the user. It must be 12 to 250 characters long, at least 4 unique characters, and must not contain commas.
    */
  var password: Input[String]
  /**
    * The username of the user.
    */
  var username: Input[String]
}

object BrokerUser {
  @scala.inline
  def apply(
    password: Input[String],
    username: Input[String],
    consoleAccess: Input[Boolean] = null,
    groups: Input[js.Array[Input[String]]] = null
  ): BrokerUser = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (consoleAccess != null) __obj.updateDynamic("consoleAccess")(consoleAccess.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerUser]
  }
}

