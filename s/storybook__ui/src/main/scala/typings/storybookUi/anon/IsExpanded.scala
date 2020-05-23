package typings.storybookUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsExpanded extends js.Object {
  var childIds: Null
  var isExpanded: Boolean
}

object IsExpanded {
  @scala.inline
  def apply(childIds: Null, isExpanded: Boolean): IsExpanded = {
    val __obj = js.Dynamic.literal(childIds = childIds.asInstanceOf[js.Any], isExpanded = isExpanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsExpanded]
  }
}

