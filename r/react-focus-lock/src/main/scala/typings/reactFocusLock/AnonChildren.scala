package typings.reactFocusLock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren[ChildrenType] extends js.Object {
  var children: ChildrenType
}

object AnonChildren {
  @scala.inline
  def apply[ChildrenType](children: ChildrenType): AnonChildren[ChildrenType] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChildren[ChildrenType]]
  }
}

