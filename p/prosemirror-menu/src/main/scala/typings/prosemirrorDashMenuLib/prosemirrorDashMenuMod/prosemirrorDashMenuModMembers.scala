package typings
package prosemirrorDashMenuLib.prosemirrorDashMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-menu", JSImport.Namespace)
@js.native
object prosemirrorDashMenuModMembers extends js.Object {
  var joinUpItem: MenuItem[js.Any] = js.native
  var liftItem: MenuItem[js.Any] = js.native
  var selectParentNodeItem: MenuItem[js.Any] = js.native
  def blockTypeItem[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    nodeType: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S],
    options: ScalablyTyped.runtime.StringDictionary[js.Any]
  ): MenuItem[S] = js.native
  def menuBar[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](options: prosemirrorDashMenuLib.Anon_Floating[S]): prosemirrorDashStateLib.prosemirrorDashStateMod.Plugin[S] = js.native
  def redoItem(p: ScalablyTyped.runtime.StringDictionary[js.Any]): MenuItem[_] = js.native
  def renderGrouped[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    view: prosemirrorDashViewLib.prosemirrorDashViewMod.EditorView[S],
    content: js.Array[MenuElement[S] | js.Array[MenuElement[S]]]
  ): prosemirrorDashMenuLib.Anon_UpdateP[S] = js.native
  def undoItem(p: ScalablyTyped.runtime.StringDictionary[js.Any]): MenuItem[_] = js.native
  def wrapItem[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    nodeType: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S],
    options: ScalablyTyped.runtime.StringDictionary[js.Any]
  ): MenuItem[S] = js.native
}

