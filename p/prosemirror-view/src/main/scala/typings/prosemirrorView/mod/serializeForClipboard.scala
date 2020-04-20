package typings.prosemirrorView.mod

import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorModel.mod.Slice
import typings.prosemirrorView.AnonDom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-view", "__serializeForClipboard")
@js.native
object serializeForClipboard extends js.Object {
  def apply[S /* <: Schema[_, _] */](view: EditorView[S], slice: Slice[S]): AnonDom = js.native
}

