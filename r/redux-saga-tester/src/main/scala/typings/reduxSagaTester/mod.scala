package typings.reduxSagaTester

import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.redux.mod.Reducer
import typings.redux.mod.ReducersMapObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-saga-tester", JSImport.Default)
  @js.native
  class default[StateType /* <: js.Object */] () extends SagaTester[StateType] {
    def this(options: SagaTesterOptions[StateType]) = this()
  }
  
  type SagaFunction = js.Function1[/* repeated */ js.Any, js.Any]
  
  @js.native
  trait SagaTester[StateType /* <: js.Object */] extends StObject {
    
    /**
      * Dispatches an action to the redux store.
      */
    def dispatch(action: AnyAction): Unit = js.native
    
    /**
      * Returns an array of all actions dispatched.
      */
    def getCalledActions(): js.Array[AnyAction] = js.native
    
    /**
      * Returns the last action dispatched to the store.
      */
    def getLatestCalledAction(): AnyAction = js.native
    
    /**
      * Returns the state of the redux store.
      */
    def getState(): StateType = js.native
    
    /**
      * Returns the number of times an action with the given type was dispatched.
      */
    def numCalled(actionType: String): Double = js.native
    
    /**
      * Reset the store state back to initialState
      * @param clearActionList Clears the history of past actions (defaults to false).
      */
    def reset(): Unit = js.native
    def reset(clearActionList: Boolean): Unit = js.native
    
    /**
      * Starts execution of the provided saga.
      */
    def start(saga: SagaFunction, args: js.Any*): js.Any = js.native
    
    /**
      * Assigns the newState into the current state. (Only works with the default reducer.)
      */
    def updateState(state: StateType): Unit = js.native
    
    /**
      * Returns a promise that will resolve if the specified action is dispatched to the store.
      * @param actionType Action name.
      * @param futureOnly Causes waitFor to only resolve if the action is called in the future.
      */
    def waitFor(actionType: String): js.Thenable[AnyAction] = js.native
    def waitFor(actionType: String, futureOnly: Boolean): js.Thenable[AnyAction] = js.native
    
    /**
      * Returns whether the specified was dispatched in the past.
      */
    def wasCalled(actionType: String): Boolean = js.native
  }
  
  @js.native
  trait SagaTesterOptions[StateType] extends StObject {
    
    var combineReducers: js.UndefOr[
        js.Function1[/* map */ ReducersMapObject[_, Action[_]], Reducer[StateType, AnyAction]]
      ] = js.native
    
    var ignoreReduxActions: js.UndefOr[Boolean] = js.native
    
    var initialState: js.UndefOr[StateType] = js.native
    
    var middlewares: js.UndefOr[js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]]] = js.native
    
    var options: js.UndefOr[js.Object] = js.native
    
    var reducers: js.UndefOr[(ReducersMapObject[_, Action[_]]) | (Reducer[StateType, AnyAction])] = js.native
  }
  object SagaTesterOptions {
    
    @scala.inline
    def apply[StateType](): SagaTesterOptions[StateType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SagaTesterOptions[StateType]]
    }
    
    @scala.inline
    implicit class SagaTesterOptionsMutableBuilder[Self <: SagaTesterOptions[_], StateType] (val x: Self with SagaTesterOptions[StateType]) extends AnyVal {
      
      @scala.inline
      def setCombineReducers(value: /* map */ ReducersMapObject[_, Action[_]] => Reducer[StateType, AnyAction]): Self = StObject.set(x, "combineReducers", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCombineReducersUndefined: Self = StObject.set(x, "combineReducers", js.undefined)
      
      @scala.inline
      def setIgnoreReduxActions(value: Boolean): Self = StObject.set(x, "ignoreReduxActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreReduxActionsUndefined: Self = StObject.set(x, "ignoreReduxActions", js.undefined)
      
      @scala.inline
      def setInitialState(value: StateType): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      @scala.inline
      def setMiddlewares(value: js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]]): Self = StObject.set(x, "middlewares", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiddlewaresUndefined: Self = StObject.set(x, "middlewares", js.undefined)
      
      @scala.inline
      def setMiddlewaresVarargs(value: (Middleware[js.Object, js.Any, Dispatch[AnyAction]])*): Self = StObject.set(x, "middlewares", js.Array(value :_*))
      
      @scala.inline
      def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setReducers(value: (ReducersMapObject[_, Action[_]]) | (Reducer[StateType, AnyAction])): Self = StObject.set(x, "reducers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReducersFunction2(value: (/* state */ js.UndefOr[StateType], AnyAction) => StateType): Self = StObject.set(x, "reducers", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReducersUndefined: Self = StObject.set(x, "reducers", js.undefined)
    }
  }
}
