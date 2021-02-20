package typings.prosemirrorHistory

import typings.prosemirrorHistory.anon.Depth
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.mod.EditorState
import typings.prosemirrorState.mod.Plugin
import typings.prosemirrorState.mod.Transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-history", "closeHistory")
  @js.native
  def closeHistory[S /* <: Schema[_, _] */](tr: Transaction[S]): Transaction[S] = js.native
  
  @JSImport("prosemirror-history", "history")
  @js.native
  def history(): Plugin[_, _] = js.native
  @JSImport("prosemirror-history", "history")
  @js.native
  def history(config: Depth): Plugin[_, _] = js.native
  
  @JSImport("prosemirror-history", "redo")
  @js.native
  def redo[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  @JSImport("prosemirror-history", "redo")
  @js.native
  def redo[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  
  @JSImport("prosemirror-history", "redoDepth")
  @js.native
  def redoDepth(state: EditorState[_]): Double = js.native
  
  @JSImport("prosemirror-history", "undo")
  @js.native
  def undo[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  @JSImport("prosemirror-history", "undo")
  @js.native
  def undo[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  
  @JSImport("prosemirror-history", "undoDepth")
  @js.native
  def undoDepth(state: EditorState[_]): Double = js.native
}
