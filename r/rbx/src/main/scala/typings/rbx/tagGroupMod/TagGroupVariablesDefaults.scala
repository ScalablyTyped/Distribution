package typings.rbx.tagGroupMod

import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.medium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagGroupVariablesDefaults extends js.Object {
  var sizes: medium | large
}

object TagGroupVariablesDefaults {
  @scala.inline
  def apply(sizes: medium | large): TagGroupVariablesDefaults = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagGroupVariablesDefaults]
  }
}

