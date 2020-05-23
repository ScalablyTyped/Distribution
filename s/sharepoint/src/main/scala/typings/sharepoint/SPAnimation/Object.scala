package typings.sharepoint.SPAnimation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object extends js.Object {
  def RunAnimation(): Unit
}

object Object {
  @scala.inline
  def apply(RunAnimation: () => Unit): Object = {
    val __obj = js.Dynamic.literal(RunAnimation = js.Any.fromFunction0(RunAnimation))
    __obj.asInstanceOf[Object]
  }
}

