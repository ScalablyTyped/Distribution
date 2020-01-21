package typings.promiseSftp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGroup extends js.Object {
  var group: String
  var other: String
  var user: String
}

object AnonGroup {
  @scala.inline
  def apply(group: String, other: String, user: String): AnonGroup = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGroup]
  }
}

