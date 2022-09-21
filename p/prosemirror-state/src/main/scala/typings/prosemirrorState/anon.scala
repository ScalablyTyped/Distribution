package typings.prosemirrorState

import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.mod.AllSelection
import typings.prosemirrorState.mod.EditorState
import typings.prosemirrorState.mod.Plugin
import typings.prosemirrorState.mod.Selection
import typings.prosemirrorState.mod.Transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    /**
      New set of active plugins.
      */
    var plugins: js.UndefOr[js.Array[Plugin[Any]]] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setPlugins(value: js.Array[Plugin[Any]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: Plugin[Any]*): Self = StObject.set(x, "plugins", js.Array(value*))
    }
  }
  
  trait FromJSON extends StObject {
    
    def fromJSON(doc: Node, json: Any): Selection
  }
  object FromJSON {
    
    inline def apply(fromJSON: (Node, Any) => Selection): FromJSON = {
      val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction2(fromJSON))
      __obj.asInstanceOf[FromJSON]
    }
    
    extension [Self <: FromJSON](x: Self) {
      
      inline def setFromJSON(value: (Node, Any) => Selection): Self = StObject.set(x, "fromJSON", js.Any.fromFunction2(value))
    }
  }
  
  trait Map extends StObject {
    
    def map(): Any
    
    def resolve(doc: Node): AllSelection
  }
  object Map {
    
    inline def apply(map: () => Any, resolve: Node => AllSelection): Map = {
      val __obj = js.Dynamic.literal(map = js.Any.fromFunction0(map), resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[Map]
    }
    
    extension [Self <: Map](x: Self) {
      
      inline def setMap(value: () => Any): Self = StObject.set(x, "map", js.Any.fromFunction0(value))
      
      inline def setResolve(value: Node => AllSelection): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
  
  trait Plugins extends StObject {
    
    /**
      The set of active plugins.
      */
    var plugins: js.UndefOr[js.Array[Plugin[Any]]] = js.undefined
    
    /**
      The schema to use.
      */
    var schema: Schema[Any, Any]
  }
  object Plugins {
    
    inline def apply(schema: Schema[Any, Any]): Plugins = {
      val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plugins]
    }
    
    extension [Self <: Plugins](x: Self) {
      
      inline def setPlugins(value: js.Array[Plugin[Any]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: Plugin[Any]*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setSchema(value: Schema[Any, Any]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    var state: EditorState
    
    var transactions: js.Array[Transaction]
  }
  object State {
    
    inline def apply(state: EditorState, transactions: js.Array[Transaction]): State = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setState(value: EditorState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTransactions(value: js.Array[Transaction]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
      
      inline def setTransactionsVarargs(value: Transaction*): Self = StObject.set(x, "transactions", js.Array(value*))
    }
  }
}
