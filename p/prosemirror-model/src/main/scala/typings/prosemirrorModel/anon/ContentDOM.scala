package typings.prosemirrorModel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentDOM extends js.Object {
  var contentDOM: js.UndefOr[typings.std.Node | Null] = js.undefined
  var dom: typings.std.Node
}

object ContentDOM {
  @scala.inline
  def apply(dom: typings.std.Node, contentDOM: js.UndefOr[Null | typings.std.Node] = js.undefined): ContentDOM = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any])
    if (!js.isUndefined(contentDOM)) __obj.updateDynamic("contentDOM")(contentDOM.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentDOM]
  }
}

