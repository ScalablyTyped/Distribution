package typings.reduxFirstRouter

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.redux.mod.MiddlewareAPI
import typings.redux.mod.Reducer
import typings.redux.mod.Store
import typings.redux.mod.StoreEnhancer
import typings.redux.mod.StoreEnhancerStoreCreator
import typings.reduxFirstRouter.mod.Bag
import typings.reduxFirstRouter.mod.ConfirmLeave
import typings.reduxFirstRouter.mod.LocationState
import typings.reduxFirstRouter.mod.Meta
import typings.reduxFirstRouter.mod.NavigationAction
import typings.reduxFirstRouter.mod.Nullable
import typings.reduxFirstRouter.mod.Query
import typings.reduxFirstRouter.mod.RouteThunk
import typings.reduxFirstRouter.mod.StateGetter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Action extends StObject {
    
    var action: js.Object
    
    var navigationAction: Nullable[NavigationAction]
  }
  object Action {
    
    inline def apply(action: js.Object): Action = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    extension [Self <: Action](x: Self) {
      
      inline def setAction(value: js.Object): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setNavigationAction(value: Nullable[NavigationAction]): Self = StObject.set(x, "navigationAction", value.asInstanceOf[js.Any])
      
      inline def setNavigationActionNull: Self = StObject.set(x, "navigationAction", null)
      
      inline def setNavigationActionUndefined: Self = StObject.set(x, "navigationAction", js.undefined)
    }
  }
  
  trait CapitalizedWords[TState] extends StObject {
    
    var capitalizedWords: js.UndefOr[Boolean] = js.undefined
    
    var coerceNumbers: js.UndefOr[Boolean] = js.undefined
    
    var confirmLeave: js.UndefOr[ConfirmLeave] = js.undefined
    
    var fromPath: js.UndefOr[js.Function2[/* path */ String, /* key */ js.UndefOr[String], String]] = js.undefined
    
    var meta: js.UndefOr[Meta] = js.undefined
    
    var navKey: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var thunk: js.UndefOr[RouteThunk[TState]] = js.undefined
    
    var toPath: js.UndefOr[js.Function2[/* param */ String, /* key */ js.UndefOr[String], String]] = js.undefined
  }
  object CapitalizedWords {
    
    inline def apply[TState](): CapitalizedWords[TState] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CapitalizedWords[TState]]
    }
    
    extension [Self <: CapitalizedWords[?], TState](x: Self & CapitalizedWords[TState]) {
      
      inline def setCapitalizedWords(value: Boolean): Self = StObject.set(x, "capitalizedWords", value.asInstanceOf[js.Any])
      
      inline def setCapitalizedWordsUndefined: Self = StObject.set(x, "capitalizedWords", js.undefined)
      
      inline def setCoerceNumbers(value: Boolean): Self = StObject.set(x, "coerceNumbers", value.asInstanceOf[js.Any])
      
      inline def setCoerceNumbersUndefined: Self = StObject.set(x, "coerceNumbers", js.undefined)
      
      inline def setConfirmLeave(value: (/* state */ js.Object, /* action */ js.Object) => Nullable[String]): Self = StObject.set(x, "confirmLeave", js.Any.fromFunction2(value))
      
      inline def setConfirmLeaveUndefined: Self = StObject.set(x, "confirmLeave", js.undefined)
      
      inline def setFromPath(value: (/* path */ String, /* key */ js.UndefOr[String]) => String): Self = StObject.set(x, "fromPath", js.Any.fromFunction2(value))
      
      inline def setFromPathUndefined: Self = StObject.set(x, "fromPath", js.undefined)
      
      inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setNavKey(value: String): Self = StObject.set(x, "navKey", value.asInstanceOf[js.Any])
      
      inline def setNavKeyUndefined: Self = StObject.set(x, "navKey", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setThunk(
        value: (/* dispatch */ Dispatch[Any], /* getState */ StateGetter[TState], /* bag */ Bag) => Any | js.Promise[Any]
      ): Self = StObject.set(x, "thunk", js.Any.fromFunction3(value))
      
      inline def setThunkUndefined: Self = StObject.set(x, "thunk", js.undefined)
      
      inline def setToPath(value: (/* param */ String, /* key */ js.UndefOr[String]) => String): Self = StObject.set(x, "toPath", js.Any.fromFunction2(value))
      
      inline def setToPathUndefined: Self = StObject.set(x, "toPath", js.undefined)
    }
  }
  
  trait Enhancer[TKeys, TState] extends StObject {
    
    def enhancer(next: StoreEnhancerStoreCreator[js.Object, js.Object]): StoreEnhancerStoreCreator[js.Object, js.Object]
    @JSName("enhancer")
    var enhancer_Original: StoreEnhancer[js.Object, js.Object]
    
    var initialDispatch: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    def middleware(api: MiddlewareAPI[Dispatch[AnyAction], Any]): js.Function1[/* next */ Dispatch[AnyAction], js.Function1[/* action */ Any, Any]]
    @JSName("middleware")
    var middleware_Original: Middleware[js.Object, Any, Dispatch[AnyAction]]
    
    def reducer(state: Unit, action: AnyAction): LocationState[TKeys, TState]
    def reducer(state: LocationState[TKeys, TState], action: AnyAction): LocationState[TKeys, TState]
    @JSName("reducer")
    var reducer_Original: Reducer[LocationState[TKeys, TState], AnyAction]
    
    def thunk(store: Store[TState, AnyAction]): js.Promise[Nullable[RouteThunk[TState]]]
  }
  object Enhancer {
    
    inline def apply[TKeys, TState](
      enhancer: /* next */ StoreEnhancerStoreCreator[js.Object, js.Object] => StoreEnhancerStoreCreator[js.Object, js.Object],
      middleware: /* api */ MiddlewareAPI[Dispatch[AnyAction], Any] => js.Function1[/* next */ Dispatch[AnyAction], js.Function1[/* action */ Any, Any]],
      reducer: (/* state */ js.UndefOr[LocationState[TKeys, TState]], AnyAction) => LocationState[TKeys, TState],
      thunk: Store[TState, AnyAction] => js.Promise[Nullable[RouteThunk[TState]]]
    ): Enhancer[TKeys, TState] = {
      val __obj = js.Dynamic.literal(enhancer = js.Any.fromFunction1(enhancer), middleware = js.Any.fromFunction1(middleware), reducer = js.Any.fromFunction2(reducer), thunk = js.Any.fromFunction1(thunk))
      __obj.asInstanceOf[Enhancer[TKeys, TState]]
    }
    
    extension [Self <: Enhancer[?, ?], TKeys, TState](x: Self & (Enhancer[TKeys, TState])) {
      
      inline def setEnhancer(
        value: /* next */ StoreEnhancerStoreCreator[js.Object, js.Object] => StoreEnhancerStoreCreator[js.Object, js.Object]
      ): Self = StObject.set(x, "enhancer", js.Any.fromFunction1(value))
      
      inline def setInitialDispatch(value: () => Unit): Self = StObject.set(x, "initialDispatch", js.Any.fromFunction0(value))
      
      inline def setInitialDispatchUndefined: Self = StObject.set(x, "initialDispatch", js.undefined)
      
      inline def setMiddleware(
        value: /* api */ MiddlewareAPI[Dispatch[AnyAction], Any] => js.Function1[/* next */ Dispatch[AnyAction], js.Function1[/* action */ Any, Any]]
      ): Self = StObject.set(x, "middleware", js.Any.fromFunction1(value))
      
      inline def setReducer(
        value: (/* state */ js.UndefOr[LocationState[TKeys, TState]], AnyAction) => LocationState[TKeys, TState]
      ): Self = StObject.set(x, "reducer", js.Any.fromFunction2(value))
      
      inline def setThunk(value: Store[TState, AnyAction] => js.Promise[Nullable[RouteThunk[TState]]]): Self = StObject.set(x, "thunk", js.Any.fromFunction1(value))
    }
  }
  
  trait NotFoundPath extends StObject {
    
    var notFoundPath: js.UndefOr[String] = js.undefined
    
    var query: js.UndefOr[Query] = js.undefined
    
    var search: js.UndefOr[String] = js.undefined
  }
  object NotFoundPath {
    
    inline def apply(): NotFoundPath = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotFoundPath]
    }
    
    extension [Self <: NotFoundPath](x: Self) {
      
      inline def setNotFoundPath(value: String): Self = StObject.set(x, "notFoundPath", value.asInstanceOf[js.Any])
      
      inline def setNotFoundPathUndefined: Self = StObject.set(x, "notFoundPath", js.undefined)
      
      inline def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    }
  }
  
  trait Params extends StObject {
    
    var params: Nullable[typings.reduxFirstRouter.mod.Params]
    
    var path: Nullable[String]
  }
  object Params {
    
    inline def apply(): Params = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Params]
    }
    
    extension [Self <: Params](x: Self) {
      
      inline def setParams(value: Nullable[typings.reduxFirstRouter.mod.Params]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsNull: Self = StObject.set(x, "params", null)
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setPath(value: Nullable[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathNull: Self = StObject.set(x, "path", null)
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait Pathname extends StObject {
    
    var pathname: String
  }
  object Pathname {
    
    inline def apply(pathname: String): Pathname = {
      val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pathname]
    }
    
    extension [Self <: Pathname](x: Self) {
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    }
  }
}
