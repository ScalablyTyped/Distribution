package typings.prosemirrorHistory

import typings.prosemirrorState.mod.Command
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
  
  /**
  Set a flag on the given transaction that will prevent further steps
  from being appended to an existing history event (so that they
  require a separate undo command to undo).
  */
  inline def closeHistory(tr: Transaction): Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("closeHistory")(tr.asInstanceOf[js.Any]).asInstanceOf[Transaction]
  
  /**
  Returns a plugin that enables the undo history for an editor. The
  plugin will track undo and redo stacks, which can be used with the
  [`undo`](https://prosemirror.net/docs/ref/#history.undo) and [`redo`](https://prosemirror.net/docs/ref/#history.redo) commands.
  You can set an `"addToHistory"` [metadata
  property](https://prosemirror.net/docs/ref/#state.Transaction.setMeta) of `false` on a transaction
  to prevent it from being rolled back by undo.
  */
  inline def history(): Plugin[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("history")().asInstanceOf[Plugin[Any]]
  inline def history(config: HistoryOptions): Plugin[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("history")(config.asInstanceOf[js.Any]).asInstanceOf[Plugin[Any]]
  
  /**
  A command function that redoes the last undone change, if any.
  */
  @JSImport("prosemirror-history", "redo")
  @js.native
  val redo: Command = js.native
  
  /**
  The amount of redoable events available in a given editor state.
  */
  inline def redoDepth(state: EditorState): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("redoDepth")(state.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
  A command function that undoes the last change, if any.
  */
  @JSImport("prosemirror-history", "undo")
  @js.native
  val undo: Command = js.native
  
  /**
  The amount of undoable events available in a given state.
  */
  inline def undoDepth(state: EditorState): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("undoDepth")(state.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait HistoryOptions extends StObject {
    
    /**
      The amount of history events that are collected before the
      oldest events are discarded. Defaults to 100.
      */
    var depth: js.UndefOr[Double] = js.undefined
    
    /**
      The delay between changes after which a new group should be
      started. Defaults to 500 (milliseconds). Note that when changes
      aren't adjacent, a new group is always started.
      */
    var newGroupDelay: js.UndefOr[Double] = js.undefined
  }
  object HistoryOptions {
    
    inline def apply(): HistoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HistoryOptions]
    }
    
    extension [Self <: HistoryOptions](x: Self) {
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setNewGroupDelay(value: Double): Self = StObject.set(x, "newGroupDelay", value.asInstanceOf[js.Any])
      
      inline def setNewGroupDelayUndefined: Self = StObject.set(x, "newGroupDelay", js.undefined)
    }
  }
}
