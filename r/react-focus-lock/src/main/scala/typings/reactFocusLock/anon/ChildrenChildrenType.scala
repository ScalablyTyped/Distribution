package typings.reactFocusLock.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildrenChildrenType[ChildrenType] extends js.Object {
  var children: ChildrenType
}

object ChildrenChildrenType {
  @scala.inline
  def apply[ChildrenType](children: ChildrenType): ChildrenChildrenType[ChildrenType] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenChildrenType[ChildrenType]]
  }
}

