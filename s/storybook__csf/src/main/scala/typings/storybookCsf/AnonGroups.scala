package typings.storybookCsf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGroups extends js.Object {
  var groups: js.Array[String]
  var root: String | Null
}

object AnonGroups {
  @scala.inline
  def apply(groups: js.Array[String], root: String = null): AnonGroups = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGroups]
  }
}

