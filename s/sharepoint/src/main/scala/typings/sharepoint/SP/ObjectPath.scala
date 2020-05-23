package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectPath extends js.Object {
  def setPendingReplace(): Unit
}

object ObjectPath {
  @scala.inline
  def apply(setPendingReplace: () => Unit): ObjectPath = {
    val __obj = js.Dynamic.literal(setPendingReplace = js.Any.fromFunction0(setPendingReplace))
    __obj.asInstanceOf[ObjectPath]
  }
}

