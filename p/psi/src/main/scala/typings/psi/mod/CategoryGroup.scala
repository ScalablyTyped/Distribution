package typings.psi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategoryGroup extends js.Object {
  var description: String
  var title: String
}

object CategoryGroup {
  @scala.inline
  def apply(description: String, title: String): CategoryGroup = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryGroup]
  }
}

