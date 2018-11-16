package typings
package prosemirrorDashHistoryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-history", JSImport.Namespace)
@js.native
object prosemirrorDashHistoryMod extends js.Object {
  def closeHistory[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](tr: prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S]): prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S] = js.native
  def history(): prosemirrorDashStateLib.prosemirrorDashStateMod.Plugin[_] = js.native
  def history(config: prosemirrorDashHistoryLib.Anon_NewGroupDelay): prosemirrorDashStateLib.prosemirrorDashStateMod.Plugin[_] = js.native
  def redo[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Boolean = js.native
  def redo[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def redoDepth(state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[_]): scala.Double = js.native
  def undo[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Boolean = js.native
  def undo[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def undoDepth(state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[_]): scala.Double = js.native
}

