package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarProp extends js.Object {
  val visible: scala.Boolean
}

object BarProp {
  @scala.inline
  def apply(visible: scala.Boolean): BarProp = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarProp]
  }
}

