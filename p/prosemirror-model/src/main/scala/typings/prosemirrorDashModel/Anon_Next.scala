package typings.prosemirrorDashModel

import typings.prosemirrorDashModel.prosemirrorDashModelMod.ContentMatch
import typings.prosemirrorDashModel.prosemirrorDashModelMod.NodeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Next extends js.Object {
  var next: ContentMatch[_]
  var `type`: NodeType[_]
}

object Anon_Next {
  @scala.inline
  def apply(next: ContentMatch[_], `type`: NodeType[_]): Anon_Next = {
    val __obj = js.Dynamic.literal(next = next)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Next]
  }
}

