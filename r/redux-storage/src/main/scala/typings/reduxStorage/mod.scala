package typings.reduxStorage

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.redux.mod.Reducer
import typings.redux.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-storage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("redux-storage", "LOAD")
  @js.native
  val LOAD: String = js.native
  
  @JSImport("redux-storage", "SAVE")
  @js.native
  val SAVE: String = js.native
  
  @scala.inline
  def createLoader[TState](engine: StorageEngine): Loader[TState] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLoader")(engine.asInstanceOf[js.Any]).asInstanceOf[Loader[TState]]
  
  @scala.inline
  def createMiddleware(engine: StorageEngine): Middleware[js.Object, js.Any, Dispatch[AnyAction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMiddleware")(engine.asInstanceOf[js.Any]).asInstanceOf[Middleware[js.Object, js.Any, Dispatch[AnyAction]]]
  @scala.inline
  def createMiddleware(engine: StorageEngine, actionBlacklist: js.Array[String]): Middleware[js.Object, js.Any, Dispatch[AnyAction]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createMiddleware")(engine.asInstanceOf[js.Any], actionBlacklist.asInstanceOf[js.Any])).asInstanceOf[Middleware[js.Object, js.Any, Dispatch[AnyAction]]]
  @scala.inline
  def createMiddleware(engine: StorageEngine, actionBlacklist: js.Array[String], actionWhitelist: js.Array[String]): Middleware[js.Object, js.Any, Dispatch[AnyAction]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createMiddleware")(engine.asInstanceOf[js.Any], actionBlacklist.asInstanceOf[js.Any], actionWhitelist.asInstanceOf[js.Any])).asInstanceOf[Middleware[js.Object, js.Any, Dispatch[AnyAction]]]
  @scala.inline
  def createMiddleware(engine: StorageEngine, actionBlacklist: js.Array[String], actionWhitelist: ActionTypeCheckCallback): Middleware[js.Object, js.Any, Dispatch[AnyAction]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createMiddleware")(engine.asInstanceOf[js.Any], actionBlacklist.asInstanceOf[js.Any], actionWhitelist.asInstanceOf[js.Any])).asInstanceOf[Middleware[js.Object, js.Any, Dispatch[AnyAction]]]
  @scala.inline
  def createMiddleware(engine: StorageEngine, actionBlacklist: Unit, actionWhitelist: js.Array[String]): Middleware[js.Object, js.Any, Dispatch[AnyAction]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createMiddleware")(engine.asInstanceOf[js.Any], actionBlacklist.asInstanceOf[js.Any], actionWhitelist.asInstanceOf[js.Any])).asInstanceOf[Middleware[js.Object, js.Any, Dispatch[AnyAction]]]
  @scala.inline
  def createMiddleware(engine: StorageEngine, actionBlacklist: Unit, actionWhitelist: ActionTypeCheckCallback): Middleware[js.Object, js.Any, Dispatch[AnyAction]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createMiddleware")(engine.asInstanceOf[js.Any], actionBlacklist.asInstanceOf[js.Any], actionWhitelist.asInstanceOf[js.Any])).asInstanceOf[Middleware[js.Object, js.Any, Dispatch[AnyAction]]]
  
  @scala.inline
  def reducer[TState](reducer: Reducer[TState, AnyAction]): Reducer[TState, AnyAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("reducer")(reducer.asInstanceOf[js.Any]).asInstanceOf[Reducer[TState, AnyAction]]
  @scala.inline
  def reducer[TState](reducer: Reducer[TState, AnyAction], merger: StateMerger): Reducer[TState, AnyAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("reducer")(reducer.asInstanceOf[js.Any], merger.asInstanceOf[js.Any])).asInstanceOf[Reducer[TState, AnyAction]]
  
  type ActionTypeCheckCallback = js.Function1[/* type */ String, Boolean]
  
  /**
    * Loader interface
    */
  type Loader[TState] = js.Function1[/* store */ Store[TState, AnyAction], js.Thenable[js.Any]]
  
  type StateMerger = js.Function2[/* oldState */ js.Any, /* newState */ js.Any, js.Any]
  
  trait StorageEngine extends StObject {
    
    /**
      * Load
      */
    def load(): js.Thenable[js.Any]
    
    /**
      * Save
      * @param state
      */
    def save(state: js.Any): js.Thenable[js.Any]
  }
  object StorageEngine {
    
    @scala.inline
    def apply(load: () => js.Thenable[js.Any], save: js.Any => js.Thenable[js.Any]): StorageEngine = {
      val __obj = js.Dynamic.literal(load = js.Any.fromFunction0(load), save = js.Any.fromFunction1(save))
      __obj.asInstanceOf[StorageEngine]
    }
    
    @scala.inline
    implicit class StorageEngineMutableBuilder[Self <: StorageEngine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoad(value: () => js.Thenable[js.Any]): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSave(value: js.Any => js.Thenable[js.Any]): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
    }
  }
}
