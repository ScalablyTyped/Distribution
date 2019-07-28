package typings.prosemirrorDashModel

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentDOM extends js.Object {
  var contentDOM: js.UndefOr[Node | Null] = js.undefined
  var dom: Node
}

object Anon_ContentDOM {
  @scala.inline
  def apply(dom: Node, contentDOM: Node = null): Anon_ContentDOM = {
    val __obj = js.Dynamic.literal(dom = dom)
    if (contentDOM != null) __obj.updateDynamic("contentDOM")(contentDOM)
    __obj.asInstanceOf[Anon_ContentDOM]
  }
}

