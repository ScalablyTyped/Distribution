package typings.rbx.iconIconMod

import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.left
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.right
import typings.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconVariablesDefaults extends js.Object {
  var alignments: left | right
  var sizes: small | medium | large
}

object IconVariablesDefaults {
  @scala.inline
  def apply(alignments: left | right, sizes: small | medium | large): IconVariablesDefaults = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconVariablesDefaults]
  }
}

