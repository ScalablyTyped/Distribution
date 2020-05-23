package typings.snykNodejsLockfileParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var node: js.UndefOr[String] = js.undefined
}

object Node {
  @scala.inline
  def apply(node: String = null): Node = {
    val __obj = js.Dynamic.literal()
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

