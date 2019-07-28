package typings.prosemirrorDashMenu.prosemirrorDashMenuMod

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorDashMenu.Anon_Content
import typings.prosemirrorDashMenu.Anon_DomPUpdate
import typings.prosemirrorDashModel.prosemirrorDashModelMod.NodeType
import typings.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import typings.prosemirrorDashState.prosemirrorDashStateMod.Plugin
import typings.prosemirrorDashView.prosemirrorDashViewMod.EditorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-menu", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var joinUpItem: MenuItem[js.Any] = js.native
  var liftItem: MenuItem[js.Any] = js.native
  var selectParentNodeItem: MenuItem[js.Any] = js.native
  def blockTypeItem[S /* <: Schema[_, _] */](nodeType: NodeType[S], options: StringDictionary[js.Any]): MenuItem[S] = js.native
  def menuBar[S /* <: Schema[_, _] */](options: Anon_Content[S]): Plugin[S, _] = js.native
  def redoItem(p: StringDictionary[js.Any]): MenuItem[_] = js.native
  def renderGrouped[S /* <: Schema[_, _] */](view: EditorView[S], content: js.Array[MenuElement[S] | js.Array[MenuElement[S]]]): Anon_DomPUpdate[S] = js.native
  def undoItem(p: StringDictionary[js.Any]): MenuItem[_] = js.native
  def wrapItem[S /* <: Schema[_, _] */](nodeType: NodeType[S], options: StringDictionary[js.Any]): MenuItem[S] = js.native
}

