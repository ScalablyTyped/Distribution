package typings.prosemirrorState

import org.scalablytyped.runtime.Instantiable1
import typings.prosemirrorModel.mod.Mark
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorState.mod.EditorState
import typings.prosemirrorState.mod.Plugin
import typings.prosemirrorState.mod.Selection
import typings.prosemirrorState.mod.Transaction
import typings.prosemirrorView.mod.EditorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Destroy[S /* <: typings.prosemirrorModel.mod.Schema[js.Any, js.Any] */] extends StObject {
    
    var destroy: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
    
    var update: js.UndefOr[
        (js.Function2[/* view */ EditorView[S], /* prevState */ EditorState[S], Unit]) | Null
      ] = js.undefined
  }
  object Destroy {
    
    inline def apply[S /* <: typings.prosemirrorModel.mod.Schema[js.Any, js.Any] */](): Destroy[S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Destroy[S]]
    }
    
    extension [Self <: Destroy[?], S /* <: typings.prosemirrorModel.mod.Schema[js.Any, js.Any] */](x: Self & Destroy[S]) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDestroyNull: Self = StObject.set(x, "destroy", null)
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setUpdate(value: (/* view */ EditorView[S], /* prevState */ EditorState[S]) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
      
      inline def setUpdateNull: Self = StObject.set(x, "update", null)
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  trait Doc[S /* <: typings.prosemirrorModel.mod.Schema[js.Any, js.Any] */] extends StObject {
    
    var doc: js.UndefOr[Node[S] | Null] = js.undefined
    
    var plugins: js.UndefOr[(js.Array[Plugin[js.Any, S]]) | Null] = js.undefined
    
    var schema: js.UndefOr[S | Null] = js.undefined
    
    var selection: js.UndefOr[Selection[S] | Null] = js.undefined
    
    var storedMarks: js.UndefOr[js.Array[Mark[js.Any]] | Null] = js.undefined
  }
  object Doc {
    
    inline def apply[S /* <: typings.prosemirrorModel.mod.Schema[js.Any, js.Any] */](): Doc[S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Doc[S]]
    }
    
    extension [Self <: Doc[?], S /* <: typings.prosemirrorModel.mod.Schema[js.Any, js.Any] */](x: Self & Doc[S]) {
      
      inline def setDoc(value: Node[S]): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
      
      inline def setDocNull: Self = StObject.set(x, "doc", null)
      
      inline def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
      
      inline def setPlugins(value: js.Array[Plugin[js.Any, S]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsNull: Self = StObject.set(x, "plugins", null)
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: (Plugin[js.Any, S])*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      inline def setSchema(value: S): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaNull: Self = StObject.set(x, "schema", null)
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setSelection(value: Selection[S]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      inline def setSelectionNull: Self = StObject.set(x, "selection", null)
      
      inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
      
      inline def setStoredMarks(value: js.Array[Mark[js.Any]]): Self = StObject.set(x, "storedMarks", value.asInstanceOf[js.Any])
      
      inline def setStoredMarksNull: Self = StObject.set(x, "storedMarks", null)
      
      inline def setStoredMarksUndefined: Self = StObject.set(x, "storedMarks", js.undefined)
      
      inline def setStoredMarksVarargs(value: Mark[js.Any]*): Self = StObject.set(x, "storedMarks", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable1[/* args (repeated) */ js.Any, Selection[js.Any]]
  
  trait Plugins[S /* <: typings.prosemirrorModel.mod.Schema[js.Any, js.Any] */] extends StObject {
    
    var plugins: js.UndefOr[(js.Array[Plugin[js.Any, S]]) | Null] = js.undefined
    
    var schema: js.UndefOr[S | Null] = js.undefined
  }
  object Plugins {
    
    inline def apply[S /* <: typings.prosemirrorModel.mod.Schema[js.Any, js.Any] */](): Plugins[S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Plugins[S]]
    }
    
    extension [Self <: Plugins[?], S /* <: typings.prosemirrorModel.mod.Schema[js.Any, js.Any] */](x: Self & Plugins[S]) {
      
      inline def setPlugins(value: js.Array[Plugin[js.Any, S]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsNull: Self = StObject.set(x, "plugins", null)
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: (Plugin[js.Any, S])*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      inline def setSchema(value: S): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaNull: Self = StObject.set(x, "schema", null)
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    }
  }
  
  trait Schema[S /* <: typings.prosemirrorModel.mod.Schema[js.Any, js.Any] */] extends StObject {
    
    var plugins: js.UndefOr[(js.Array[Plugin[js.Any, S]]) | Null] = js.undefined
    
    var schema: S
  }
  object Schema {
    
    inline def apply[S /* <: typings.prosemirrorModel.mod.Schema[js.Any, js.Any] */](schema: S): Schema[S] = {
      val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema[S]]
    }
    
    extension [Self <: Schema[?], S /* <: typings.prosemirrorModel.mod.Schema[js.Any, js.Any] */](x: Self & Schema[S]) {
      
      inline def setPlugins(value: js.Array[Plugin[js.Any, S]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsNull: Self = StObject.set(x, "plugins", null)
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: (Plugin[js.Any, S])*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      inline def setSchema(value: S): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    }
  }
  
  trait State[S /* <: typings.prosemirrorModel.mod.Schema[js.Any, js.Any] */] extends StObject {
    
    var state: EditorState[S]
    
    var transactions: js.Array[Transaction[S]]
  }
  object State {
    
    inline def apply[S /* <: typings.prosemirrorModel.mod.Schema[js.Any, js.Any] */](state: EditorState[S], transactions: js.Array[Transaction[S]]): State[S] = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any])
      __obj.asInstanceOf[State[S]]
    }
    
    extension [Self <: State[?], S /* <: typings.prosemirrorModel.mod.Schema[js.Any, js.Any] */](x: Self & State[S]) {
      
      inline def setState(value: EditorState[S]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTransactions(value: js.Array[Transaction[S]]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
      
      inline def setTransactionsVarargs(value: Transaction[S]*): Self = StObject.set(x, "transactions", js.Array(value :_*))
    }
  }
}
