package typings.reduxOptimisticUi

import typings.redux.mod.AnyAction
import typings.redux.mod.Reducer
import typings.reduxOptimisticUi.anon.Optimistic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-optimistic-ui", "BEGIN")
  @js.native
  val BEGIN: /* "@@optimist/BEGIN" */ String = js.native
  
  @JSImport("redux-optimistic-ui", "COMMIT")
  @js.native
  val COMMIT: /* "@@optimist/COMMIT" */ String = js.native
  
  @JSImport("redux-optimistic-ui", "REVERT")
  @js.native
  val REVERT: /* "@@optimist/REVERT" */ String = js.native
  
  @JSImport("redux-optimistic-ui", "ensureState")
  @js.native
  def ensureState[TState](state: TState): TState = js.native
  @JSImport("redux-optimistic-ui", "ensureState")
  @js.native
  def ensureState[TState](state: OptimisticState[TState]): TState = js.native
  
  @JSImport("redux-optimistic-ui", "optimistic")
  @js.native
  def optimistic[TState](reducer: Reducer[TState, AnyAction]): Reducer[OptimisticState[TState], AnyAction] = js.native
  
  @js.native
  trait OptimisticAction extends StObject {
    
    var meta: Optimistic = js.native
  }
  object OptimisticAction {
    
    @scala.inline
    def apply(meta: Optimistic): OptimisticAction = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptimisticAction]
    }
    
    @scala.inline
    implicit class OptimisticActionMutableBuilder[Self <: OptimisticAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMeta(value: Optimistic): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OptimisticState[TState] extends StObject {
    
    /**
      * Before state
      */
    var beforeState: TState = js.native
    
    /**
      * Current state
      */
    var current: TState = js.native
    
    /**
      * History list
      * List is Immutable.List<>
      */
    var history: js.Any = js.native
  }
  object OptimisticState {
    
    @scala.inline
    def apply[TState](beforeState: TState, current: TState, history: js.Any): OptimisticState[TState] = {
      val __obj = js.Dynamic.literal(beforeState = beforeState.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptimisticState[TState]]
    }
    
    @scala.inline
    implicit class OptimisticStateMutableBuilder[Self <: OptimisticState[_], TState] (val x: Self with OptimisticState[TState]) extends AnyVal {
      
      @scala.inline
      def setBeforeState(value: TState): Self = StObject.set(x, "beforeState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrent(value: TState): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistory(value: js.Any): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    }
  }
}
