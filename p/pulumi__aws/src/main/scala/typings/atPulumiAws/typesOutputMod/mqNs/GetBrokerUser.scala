package typings.atPulumiAws.typesOutputMod.mqNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBrokerUser extends js.Object {
  var consoleAccess: Boolean
  var groups: js.Array[String]
  var username: String
}

object GetBrokerUser {
  @scala.inline
  def apply(consoleAccess: Boolean, groups: js.Array[String], username: String): GetBrokerUser = {
    val __obj = js.Dynamic.literal(consoleAccess = consoleAccess, groups = groups, username = username)
  
    __obj.asInstanceOf[GetBrokerUser]
  }
}

