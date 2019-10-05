package typings.prosemirrorDashMenu.prosemirrorDashMenuMod

import typings.prosemirrorDashMenu.Anon_DomPUpdate
import typings.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import typings.prosemirrorDashView.prosemirrorDashViewMod.EditorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-menu", "renderGrouped")
@js.native
object renderGrouped extends js.Object {
  def apply[S /* <: Schema[_, _] */](view: EditorView[S], content: js.Array[MenuElement[S] | js.Array[MenuElement[S]]]): Anon_DomPUpdate[S] = js.native
}

