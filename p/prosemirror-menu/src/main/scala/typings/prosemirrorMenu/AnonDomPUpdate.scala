package typings.prosemirrorMenu

import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.mod.EditorState
import typings.std.DocumentFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDomPUpdate[S /* <: Schema[_, _] */] extends js.Object {
  var dom: js.UndefOr[DocumentFragment | Null] = js.undefined
  def update(p: EditorState[S]): Boolean
}

object AnonDomPUpdate {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](update: EditorState[S] => Boolean, dom: DocumentFragment = null): AnonDomPUpdate[S] = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
    if (dom != null) __obj.updateDynamic("dom")(dom.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDomPUpdate[S]]
  }
}

