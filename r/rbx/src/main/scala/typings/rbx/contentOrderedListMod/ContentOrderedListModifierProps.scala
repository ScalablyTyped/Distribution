package typings.rbx.contentOrderedListMod

import typings.rbx.rbxStrings.`lower-alpha`
import typings.rbx.rbxStrings.`lower-roman`
import typings.rbx.rbxStrings.`upper-alpha`
import typings.rbx.rbxStrings.`upper-roman`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentOrderedListModifierProps extends js.Object {
  var `type`: js.UndefOr[`lower-alpha` | `lower-roman` | `upper-alpha` | `upper-roman`] = js.undefined
}

object ContentOrderedListModifierProps {
  @scala.inline
  def apply(`type`: `lower-alpha` | `lower-roman` | `upper-alpha` | `upper-roman` = null): ContentOrderedListModifierProps = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentOrderedListModifierProps]
  }
}

