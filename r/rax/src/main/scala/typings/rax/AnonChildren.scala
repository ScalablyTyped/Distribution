package typings.rax

import typings.rax.mod.RaxNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: js.UndefOr[RaxNode] = js.undefined
}

object AnonChildren {
  @scala.inline
  def apply(children: RaxNode = null): AnonChildren = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren]
  }
}

