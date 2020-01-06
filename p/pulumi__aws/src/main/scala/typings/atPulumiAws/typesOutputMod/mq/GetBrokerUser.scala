package typings.atPulumiAws.typesOutputMod.mq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBrokerUser extends js.Object {
  var consoleAccess: Boolean = js.native
  var groups: js.Array[String] = js.native
  var username: String = js.native
}

object GetBrokerUser {
  @scala.inline
  def apply(consoleAccess: Boolean, groups: js.Array[String], username: String): GetBrokerUser = {
    val __obj = js.Dynamic.literal(consoleAccess = consoleAccess.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBrokerUser]
  }
}

