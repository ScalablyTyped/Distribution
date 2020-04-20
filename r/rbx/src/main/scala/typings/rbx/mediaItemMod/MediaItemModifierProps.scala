package typings.rbx.mediaItemMod

import typings.rbx.rbxStrings.content
import typings.rbx.rbxStrings.left
import typings.rbx.rbxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaItemModifierProps extends js.Object {
  var align: js.UndefOr[content | left | right] = js.undefined
}

object MediaItemModifierProps {
  @scala.inline
  def apply(align: content | left | right = null): MediaItemModifierProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaItemModifierProps]
  }
}

