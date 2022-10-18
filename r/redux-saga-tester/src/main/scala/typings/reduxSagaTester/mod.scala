package typings.reduxSagaTester

import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.redux.mod.Reducer
import typings.redux.mod.ReducersMapObject
import typings.redux.mod.Store
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-saga-tester", JSImport.Default)
  @js.native
  open class default[StateType /* <: js.Object */] ()
    extends StObject
       with SagaTester[StateType] {
    def this(options: SagaTesterOptions[StateType]) = this()
  }
  
  @js.native
  trait SagaFunction extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
  
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
    def start(saga: SagaFunction, args: Any*): Any = js.native
    
    /**
      * The reference of the redux store.
      */
    var store: Store[StateType, AnyAction] = js.native
    
    /**
      * Assigns the newState into the current state. (Only works with the default reducer.)
      */
    def updateState(state: StateType): Unit = js.native
    
    /**
      * Returns a promise that will resolve if the specified action is dispatched to the store.
      * @param actionType Action name.
      * @param futureOnly Causes waitFor to only resolve if the action is called in the future.
      */
    def waitFor(actionType: String): PromiseLike[AnyAction] = js.native
    def waitFor(actionType: String, futureOnly: Boolean): PromiseLike[AnyAction] = js.native
    
    /**
      * Returns whether the specified was dispatched in the past.
      */
    def wasCalled(actionType: String): Boolean = js.native
  }
  
  trait SagaTesterOptions[StateType] extends StObject {
    
    var combineReducers: js.UndefOr[
        js.Function1[/* map */ ReducersMapObject[Any, Action[Any]], Reducer[StateType, AnyAction]]
      ] = js.undefined
    
    var ignoreReduxActions: js.UndefOr[Boolean] = js.undefined
    
    var initialState: js.UndefOr[StateType] = js.undefined
    
    var middlewares: js.UndefOr[js.Array[Middleware[js.Object, Any, Dispatch[AnyAction]]]] = js.undefined
    
    var options: js.UndefOr[js.Object] = js.undefined
    
    var reducers: js.UndefOr[(ReducersMapObject[Any, Action[Any]]) | (Reducer[StateType, AnyAction])] = js.undefined
  }
  object SagaTesterOptions {
    
    inline def apply[StateType](): SagaTesterOptions[StateType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SagaTesterOptions[StateType]]
    }
    
    extension [Self <: SagaTesterOptions[?], StateType](x: Self & SagaTesterOptions[StateType]) {
      
      inline def setCombineReducers(value: /* map */ ReducersMapObject[Any, Action[Any]] => Reducer[StateType, AnyAction]): Self = StObject.set(x, "combineReducers", js.Any.fromFunction1(value))
      
      inline def setCombineReducersUndefined: Self = StObject.set(x, "combineReducers", js.undefined)
      
      inline def setIgnoreReduxActions(value: Boolean): Self = StObject.set(x, "ignoreReduxActions", value.asInstanceOf[js.Any])
      
      inline def setIgnoreReduxActionsUndefined: Self = StObject.set(x, "ignoreReduxActions", js.undefined)
      
      inline def setInitialState(value: StateType): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setMiddlewares(value: js.Array[Middleware[js.Object, Any, Dispatch[AnyAction]]]): Self = StObject.set(x, "middlewares", value.asInstanceOf[js.Any])
      
      inline def setMiddlewaresUndefined: Self = StObject.set(x, "middlewares", js.undefined)
      
      inline def setMiddlewaresVarargs(value: (Middleware[js.Object, Any, Dispatch[AnyAction]])*): Self = StObject.set(x, "middlewares", js.Array(value*))
      
      inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setReducers(value: (ReducersMapObject[Any, Action[Any]]) | (Reducer[StateType, AnyAction])): Self = StObject.set(x, "reducers", value.asInstanceOf[js.Any])
      
      inline def setReducersFunction2(value: (/* state */ js.UndefOr[StateType], AnyAction) => StateType): Self = StObject.set(x, "reducers", js.Any.fromFunction2(value))
      
      inline def setReducersUndefined: Self = StObject.set(x, "reducers", js.undefined)
    }
  }
}
