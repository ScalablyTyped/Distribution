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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Destroy[S /* <: typings.prosemirrorModel.mod.Schema[_, _] */] extends StObject {
    
    var destroy: js.UndefOr[js.Function0[Unit] | Null] = js.native
    
    var update: js.UndefOr[
        (js.Function2[/* view */ EditorView[S], /* prevState */ EditorState[S], Unit]) | Null
      ] = js.native
  }
  object Destroy {
    
    @scala.inline
    def apply[S /* <: typings.prosemirrorModel.mod.Schema[_, _] */](): Destroy[S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Destroy[S]]
    }
    
    @scala.inline
    implicit class DestroyMutableBuilder[Self <: Destroy[_], S /* <: typings.prosemirrorModel.mod.Schema[_, _] */] (val x: Self with Destroy[S]) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDestroyNull: Self = StObject.set(x, "destroy", null)
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setUpdate(value: (/* view */ EditorView[S], /* prevState */ EditorState[S]) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdateNull: Self = StObject.set(x, "update", null)
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  @js.native
  trait Doc[S /* <: typings.prosemirrorModel.mod.Schema[_, _] */] extends StObject {
    
    var doc: js.UndefOr[Node[S] | Null] = js.native
    
    var plugins: js.UndefOr[(js.Array[Plugin[_, S]]) | Null] = js.native
    
    var schema: js.UndefOr[S | Null] = js.native
    
    var selection: js.UndefOr[Selection[S] | Null] = js.native
    
    var storedMarks: js.UndefOr[js.Array[Mark[_]] | Null] = js.native
  }
  object Doc {
    
    @scala.inline
    def apply[S /* <: typings.prosemirrorModel.mod.Schema[_, _] */](): Doc[S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Doc[S]]
    }
    
    @scala.inline
    implicit class DocMutableBuilder[Self <: Doc[_], S /* <: typings.prosemirrorModel.mod.Schema[_, _] */] (val x: Self with Doc[S]) extends AnyVal {
      
      @scala.inline
      def setDoc(value: Node[S]): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocNull: Self = StObject.set(x, "doc", null)
      
      @scala.inline
      def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Array[Plugin[_, S]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsNull: Self = StObject.set(x, "plugins", null)
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: (Plugin[js.Any, S])*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setSchema(value: S): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaNull: Self = StObject.set(x, "schema", null)
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      @scala.inline
      def setSelection(value: Selection[S]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionNull: Self = StObject.set(x, "selection", null)
      
      @scala.inline
      def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
      
      @scala.inline
      def setStoredMarks(value: js.Array[Mark[_]]): Self = StObject.set(x, "storedMarks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoredMarksNull: Self = StObject.set(x, "storedMarks", null)
      
      @scala.inline
      def setStoredMarksUndefined: Self = StObject.set(x, "storedMarks", js.undefined)
      
      @scala.inline
      def setStoredMarksVarargs(value: Mark[js.Any]*): Self = StObject.set(x, "storedMarks", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Instantiable
    extends Instantiable1[/* args (repeated) */ js.Any, Selection[js.Any]]
  
  @js.native
  trait Plugins[S /* <: typings.prosemirrorModel.mod.Schema[_, _] */] extends StObject {
    
    var plugins: js.UndefOr[(js.Array[Plugin[_, S]]) | Null] = js.native
    
    var schema: js.UndefOr[S | Null] = js.native
  }
  object Plugins {
    
    @scala.inline
    def apply[S /* <: typings.prosemirrorModel.mod.Schema[_, _] */](): Plugins[S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Plugins[S]]
    }
    
    @scala.inline
    implicit class PluginsMutableBuilder[Self <: Plugins[_], S /* <: typings.prosemirrorModel.mod.Schema[_, _] */] (val x: Self with Plugins[S]) extends AnyVal {
      
      @scala.inline
      def setPlugins(value: js.Array[Plugin[_, S]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsNull: Self = StObject.set(x, "plugins", null)
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: (Plugin[js.Any, S])*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setSchema(value: S): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaNull: Self = StObject.set(x, "schema", null)
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    }
  }
  
  @js.native
  trait Schema[S /* <: typings.prosemirrorModel.mod.Schema[_, _] */] extends StObject {
    
    var plugins: js.UndefOr[(js.Array[Plugin[_, S]]) | Null] = js.native
    
    var schema: S = js.native
  }
  object Schema {
    
    @scala.inline
    def apply[S /* <: typings.prosemirrorModel.mod.Schema[_, _] */](schema: S): Schema[S] = {
      val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema[S]]
    }
    
    @scala.inline
    implicit class SchemaMutableBuilder[Self <: Schema[_], S /* <: typings.prosemirrorModel.mod.Schema[_, _] */] (val x: Self with Schema[S]) extends AnyVal {
      
      @scala.inline
      def setPlugins(value: js.Array[Plugin[_, S]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsNull: Self = StObject.set(x, "plugins", null)
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: (Plugin[js.Any, S])*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setSchema(value: S): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait State[S /* <: typings.prosemirrorModel.mod.Schema[_, _] */] extends StObject {
    
    var state: EditorState[S] = js.native
    
    var transactions: js.Array[Transaction[S]] = js.native
  }
  object State {
    
    @scala.inline
    def apply[S /* <: typings.prosemirrorModel.mod.Schema[_, _] */](state: EditorState[S], transactions: js.Array[Transaction[S]]): State[S] = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any])
      __obj.asInstanceOf[State[S]]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State[_], S /* <: typings.prosemirrorModel.mod.Schema[_, _] */] (val x: Self with State[S]) extends AnyVal {
      
      @scala.inline
      def setState(value: EditorState[S]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactions(value: js.Array[Transaction[S]]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionsVarargs(value: Transaction[S]*): Self = StObject.set(x, "transactions", js.Array(value :_*))
    }
  }
}
