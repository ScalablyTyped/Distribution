package typings.rbx.tagTagMod

import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagVariablesDefaults extends js.Object {
  var sizes: normal | medium | large
}

object TagVariablesDefaults {
  @scala.inline
  def apply(sizes: normal | medium | large): TagVariablesDefaults = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagVariablesDefaults]
  }
}

