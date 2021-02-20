package typings.reduxStorage

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.redux.mod.Reducer
import typings.redux.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-storage", "LOAD")
  @js.native
  val LOAD: String = js.native
  
  @JSImport("redux-storage", "SAVE")
  @js.native
  val SAVE: String = js.native
  
  @JSImport("redux-storage", "createLoader")
  @js.native
  def createLoader[TState](engine: StorageEngine): Loader[TState] = js.native
  
  @JSImport("redux-storage", "createMiddleware")
  @js.native
  def createMiddleware(engine: StorageEngine): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  @JSImport("redux-storage", "createMiddleware")
  @js.native
  def createMiddleware(
    engine: StorageEngine,
    actionBlacklist: js.UndefOr[scala.Nothing],
    actionWhitelist: js.Array[String]
  ): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  @JSImport("redux-storage", "createMiddleware")
  @js.native
  def createMiddleware(
    engine: StorageEngine,
    actionBlacklist: js.UndefOr[scala.Nothing],
    actionWhitelist: ActionTypeCheckCallback
  ): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  @JSImport("redux-storage", "createMiddleware")
  @js.native
  def createMiddleware(engine: StorageEngine, actionBlacklist: js.Array[String]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  @JSImport("redux-storage", "createMiddleware")
  @js.native
  def createMiddleware(engine: StorageEngine, actionBlacklist: js.Array[String], actionWhitelist: js.Array[String]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  @JSImport("redux-storage", "createMiddleware")
  @js.native
  def createMiddleware(engine: StorageEngine, actionBlacklist: js.Array[String], actionWhitelist: ActionTypeCheckCallback): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  
  @JSImport("redux-storage", "reducer")
  @js.native
  def reducer[TState](reducer: Reducer[TState, AnyAction]): Reducer[TState, AnyAction] = js.native
  @JSImport("redux-storage", "reducer")
  @js.native
  def reducer[TState](reducer: Reducer[TState, AnyAction], merger: StateMerger): Reducer[TState, AnyAction] = js.native
  
  type ActionTypeCheckCallback = js.Function1[/* type */ String, Boolean]
  
  /**
    * Loader interface
    */
  type Loader[TState] = js.Function1[/* store */ Store[TState, AnyAction], js.Thenable[js.Any]]
  
  type StateMerger = js.Function2[/* oldState */ js.Any, /* newState */ js.Any, js.Any]
  
  @js.native
  trait StorageEngine extends StObject {
    
    /**
      * Load
      */
    def load(): js.Thenable[_] = js.native
    
    /**
      * Save
      * @param state
      */
    def save(state: js.Any): js.Thenable[_] = js.native
  }
  object StorageEngine {
    
    @scala.inline
    def apply(load: () => js.Thenable[_], save: js.Any => js.Thenable[_]): StorageEngine = {
      val __obj = js.Dynamic.literal(load = js.Any.fromFunction0(load), save = js.Any.fromFunction1(save))
      __obj.asInstanceOf[StorageEngine]
    }
    
    @scala.inline
    implicit class StorageEngineMutableBuilder[Self <: StorageEngine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoad(value: () => js.Thenable[_]): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSave(value: js.Any => js.Thenable[_]): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
    }
  }
}
