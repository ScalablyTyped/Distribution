package typings.promiseSftp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  var group: String
  var other: String
  var user: String
}

object Group {
  @scala.inline
  def apply(group: String, other: String, user: String): Group = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
}

