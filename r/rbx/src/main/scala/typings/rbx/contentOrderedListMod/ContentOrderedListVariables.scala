package typings.rbx.contentOrderedListMod

import typings.rbx.rbxStrings.`lower-alpha`
import typings.rbx.rbxStrings.`lower-roman`
import typings.rbx.rbxStrings.`upper-alpha`
import typings.rbx.rbxStrings.`upper-roman`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/elements/content/content-ordered-list.ContentOrderedListVariablesOverrides, rbx.rbx/elements/content/content-ordered-list.ContentOrderedListVariablesDefaults> */
trait ContentOrderedListVariables extends js.Object {
  var types: `lower-alpha` | `lower-roman` | `upper-alpha` | `upper-roman`
}

object ContentOrderedListVariables {
  @scala.inline
  def apply(types: `lower-alpha` | `lower-roman` | `upper-alpha` | `upper-roman`): ContentOrderedListVariables = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentOrderedListVariables]
  }
}

