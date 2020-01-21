package typings.reactVirtualizedSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOption[TValue] extends js.Object {
  var option: TValue
}

object AnonOption {
  @scala.inline
  def apply[TValue](option: TValue): AnonOption[TValue] = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOption[TValue]]
  }
}

