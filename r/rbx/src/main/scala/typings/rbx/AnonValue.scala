package typings.rbx

import typings.rbx.rbxStrings.`inline-block`
import typings.rbx.rbxStrings.`inline-flex`
import typings.rbx.rbxStrings.`inline`
import typings.rbx.rbxStrings.block
import typings.rbx.rbxStrings.flex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue extends js.Object {
  var value: block | flex | `inline` | `inline-block` | `inline-flex`
}

object AnonValue {
  @scala.inline
  def apply(value: block | flex | `inline` | `inline-block` | `inline-flex`): AnonValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValue]
  }
}

