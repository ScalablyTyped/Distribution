package typings.rbx.mediaItemMod

import typings.rbx.rbxStrings.content
import typings.rbx.rbxStrings.left
import typings.rbx.rbxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaItemVariablesDefaults extends js.Object {
  var alignments: content | left | right
}

object MediaItemVariablesDefaults {
  @scala.inline
  def apply(alignments: content | left | right): MediaItemVariablesDefaults = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaItemVariablesDefaults]
  }
}

