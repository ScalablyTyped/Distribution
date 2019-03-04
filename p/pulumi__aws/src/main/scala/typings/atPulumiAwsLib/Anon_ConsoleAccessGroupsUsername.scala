package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConsoleAccessGroupsUsername extends js.Object {
  var consoleAccess: scala.Boolean
  var groups: js.Array[java.lang.String]
  var username: java.lang.String
}

object Anon_ConsoleAccessGroupsUsername {
  @scala.inline
  def apply(consoleAccess: scala.Boolean, groups: js.Array[java.lang.String], username: java.lang.String): Anon_ConsoleAccessGroupsUsername = {
    val __obj = js.Dynamic.literal(consoleAccess = consoleAccess, groups = groups, username = username)
  
    __obj.asInstanceOf[Anon_ConsoleAccessGroupsUsername]
  }
}

