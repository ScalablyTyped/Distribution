package typings
package prosemirrorDashMenuLib.prosemirrorDashMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-menu", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var joinUpItem: prosemirrorDashMenuLib.prosemirrorDashMenuMod.MenuItem[js.Any] = js.native
  var liftItem: prosemirrorDashMenuLib.prosemirrorDashMenuMod.MenuItem[js.Any] = js.native
  var selectParentNodeItem: prosemirrorDashMenuLib.prosemirrorDashMenuMod.MenuItem[js.Any] = js.native
  def blockTypeItem[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    nodeType: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S],
    options: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): prosemirrorDashMenuLib.prosemirrorDashMenuMod.MenuItem[S] = js.native
  def menuBar[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](options: prosemirrorDashMenuLib.Anon_Content[S]): prosemirrorDashStateLib.prosemirrorDashStateMod.Plugin[S, _] = js.native
  def redoItem(p: org.scalablytyped.runtime.StringDictionary[js.Any]): prosemirrorDashMenuLib.prosemirrorDashMenuMod.MenuItem[_] = js.native
  def renderGrouped[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    view: prosemirrorDashViewLib.prosemirrorDashViewMod.EditorView[S],
    content: js.Array[
      prosemirrorDashMenuLib.prosemirrorDashMenuMod.MenuElement[S] | js.Array[prosemirrorDashMenuLib.prosemirrorDashMenuMod.MenuElement[S]]
    ]
  ): prosemirrorDashMenuLib.Anon_DomPUpdate[S] = js.native
  def undoItem(p: org.scalablytyped.runtime.StringDictionary[js.Any]): prosemirrorDashMenuLib.prosemirrorDashMenuMod.MenuItem[_] = js.native
  def wrapItem[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    nodeType: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S],
    options: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): prosemirrorDashMenuLib.prosemirrorDashMenuMod.MenuItem[S] = js.native
}

