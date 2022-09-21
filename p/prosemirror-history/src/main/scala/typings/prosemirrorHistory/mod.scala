package typings.prosemirrorHistory

import typings.prosemirrorHistory.anon.Depth
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.mod.EditorState
import typings.prosemirrorState.mod.Plugin
import typings.prosemirrorState.mod.Transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-history", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def closeHistory[S /* <: Schema[Any, Any] */](tr: Transaction): Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("closeHistory")(tr.asInstanceOf[js.Any]).asInstanceOf[Transaction]
  
  inline def history(): Plugin[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("history")().asInstanceOf[Plugin[Any]]
  inline def history(config: Depth): Plugin[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("history")(config.asInstanceOf[js.Any]).asInstanceOf[Plugin[Any]]
  
  inline def redo[S /* <: Schema[Any, Any] */](state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("redo")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def redo[S /* <: Schema[Any, Any] */](state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("redo")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def redoDepth(state: EditorState): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("redoDepth")(state.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def undo[S /* <: Schema[Any, Any] */](state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("undo")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def undo[S /* <: Schema[Any, Any] */](state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("undo")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def undoDepth(state: EditorState): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("undoDepth")(state.asInstanceOf[js.Any]).asInstanceOf[Double]
}
