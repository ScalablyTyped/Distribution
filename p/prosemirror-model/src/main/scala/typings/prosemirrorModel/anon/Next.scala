package typings.prosemirrorModel.anon

import typings.prosemirrorModel.mod.ContentMatch
import typings.prosemirrorModel.mod.NodeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Next extends js.Object {
  var next: ContentMatch[_]
  var `type`: NodeType[_]
}

object Next {
  @scala.inline
  def apply(next: ContentMatch[_], `type`: NodeType[_]): Next = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Next]
  }
}

