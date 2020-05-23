package typings.rax.anon

import typings.rax.mod.RaxNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children extends js.Object {
  var children: js.UndefOr[RaxNode] = js.undefined
}

object Children {
  @scala.inline
  def apply(children: js.UndefOr[Null | RaxNode] = js.undefined): Children = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
}

