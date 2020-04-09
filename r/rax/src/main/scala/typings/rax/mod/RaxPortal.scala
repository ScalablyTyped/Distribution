package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaxPortal
  extends RaxElement[js.Any, String | JSXElementConstructor[js.Any]] {
  var children: RaxNode
}

object RaxPortal {
  @scala.inline
  def apply(
    props: js.Any,
    `type`: String | JSXElementConstructor[js.Any],
    children: RaxNode = null,
    key: Key = null
  ): RaxPortal = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaxPortal]
  }
}

