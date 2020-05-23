package typings.reactVirtualizedSelect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option[TValue] extends js.Object {
  var option: TValue
}

object Option {
  @scala.inline
  def apply[TValue](option: TValue): Option[TValue] = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option[TValue]]
  }
}

