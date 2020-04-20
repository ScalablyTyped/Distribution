package typings.storybookUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsExpanded extends js.Object {
  var childIds: Null
  var isExpanded: Boolean
}

object AnonIsExpanded {
  @scala.inline
  def apply(childIds: Null, isExpanded: Boolean): AnonIsExpanded = {
    val __obj = js.Dynamic.literal(childIds = childIds.asInstanceOf[js.Any], isExpanded = isExpanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsExpanded]
  }
}

