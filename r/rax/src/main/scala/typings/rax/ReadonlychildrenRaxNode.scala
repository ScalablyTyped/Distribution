package typings.rax

import typings.rax.mod.RaxNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  children ? :rax.rax.RaxNode}> */
trait ReadonlychildrenRaxNode extends js.Object {
  val children: js.UndefOr[RaxNode] = js.undefined
}

object ReadonlychildrenRaxNode {
  @scala.inline
  def apply(children: RaxNode = null): ReadonlychildrenRaxNode = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlychildrenRaxNode]
  }
}

