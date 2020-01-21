package typings.prosemirrorModel

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentDOM extends js.Object {
  var contentDOM: js.UndefOr[Node | Null] = js.undefined
  var dom: Node
}

object AnonContentDOM {
  @scala.inline
  def apply(dom: Node, contentDOM: Node = null): AnonContentDOM = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any])
    if (contentDOM != null) __obj.updateDynamic("contentDOM")(contentDOM.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContentDOM]
  }
}

