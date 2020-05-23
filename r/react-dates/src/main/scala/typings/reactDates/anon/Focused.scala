package typings.reactDates.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Focused extends js.Object {
  var focused: Boolean | Null
}

object Focused {
  @scala.inline
  def apply(focused: Boolean = null.asInstanceOf[Boolean]): Focused = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focused]
  }
}

