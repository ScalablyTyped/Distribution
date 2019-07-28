package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConsoleAccessGroupsUsername extends js.Object {
  var consoleAccess: Boolean
  var groups: js.Array[String]
  var username: String
}

object Anon_ConsoleAccessGroupsUsername {
  @scala.inline
  def apply(consoleAccess: Boolean, groups: js.Array[String], username: String): Anon_ConsoleAccessGroupsUsername = {
    val __obj = js.Dynamic.literal(consoleAccess = consoleAccess, groups = groups, username = username)
  
    __obj.asInstanceOf[Anon_ConsoleAccessGroupsUsername]
  }
}

