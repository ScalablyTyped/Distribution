package typings.rax.anon

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
  def apply(children: js.UndefOr[Null | RaxNode] = js.undefined): ReadonlychildrenRaxNode = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlychildrenRaxNode]
  }
}

