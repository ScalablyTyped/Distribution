package typings.storybookAddons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrent[T] extends js.Object {
  var current: T
}

object AnonCurrent {
  @scala.inline
  def apply[T](current: T): AnonCurrent[T] = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCurrent[T]]
  }
}

