package typings.reduxOptimisticUi

import typings.redux.mod.AnyAction
import typings.redux.mod.Reducer
import typings.reduxOptimisticUi.anon.Optimistic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-optimistic-ui", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("redux-optimistic-ui", "BEGIN")
  @js.native
  val BEGIN: /* "@@optimist/BEGIN" */ String = js.native
  
  @JSImport("redux-optimistic-ui", "COMMIT")
  @js.native
  val COMMIT: /* "@@optimist/COMMIT" */ String = js.native
  
  @JSImport("redux-optimistic-ui", "REVERT")
  @js.native
  val REVERT: /* "@@optimist/REVERT" */ String = js.native
  
  inline def ensureState[TState](state: TState): TState = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureState")(state.asInstanceOf[js.Any]).asInstanceOf[TState]
  inline def ensureState[TState](state: OptimisticState[TState]): TState = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureState")(state.asInstanceOf[js.Any]).asInstanceOf[TState]
  
  inline def optimistic[TState](reducer: Reducer[TState, AnyAction]): Reducer[OptimisticState[TState], AnyAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("optimistic")(reducer.asInstanceOf[js.Any]).asInstanceOf[Reducer[OptimisticState[TState], AnyAction]]
  
  trait OptimisticAction extends StObject {
    
    var meta: Optimistic
  }
  object OptimisticAction {
    
    inline def apply(meta: Optimistic): OptimisticAction = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptimisticAction]
    }
    
    extension [Self <: OptimisticAction](x: Self) {
      
      inline def setMeta(value: Optimistic): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptimisticState[TState] extends StObject {
    
    /**
      * Before state
      */
    var beforeState: TState
    
    /**
      * Current state
      */
    var current: TState
    
    /**
      * History list
      * List is Immutable.List<>
      */
    var history: Any
  }
  object OptimisticState {
    
    inline def apply[TState](beforeState: TState, current: TState, history: Any): OptimisticState[TState] = {
      val __obj = js.Dynamic.literal(beforeState = beforeState.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptimisticState[TState]]
    }
    
    extension [Self <: OptimisticState[?], TState](x: Self & OptimisticState[TState]) {
      
      inline def setBeforeState(value: TState): Self = StObject.set(x, "beforeState", value.asInstanceOf[js.Any])
      
      inline def setCurrent(value: TState): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setHistory(value: Any): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    }
  }
}
