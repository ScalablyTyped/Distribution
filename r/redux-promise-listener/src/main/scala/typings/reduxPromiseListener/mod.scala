package typings.reduxPromiseListener

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.redux.mod.MiddlewareAPI
import typings.reduxPromiseListener.mod.ReduxPromiseListener.PromiseListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-promise-listener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): PromiseListener = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[PromiseListener]
  
  object ReduxPromiseListener {
    
    type ActionMatcher = js.Function1[/* action */ AnyAction, Boolean]
    
    @js.native
    trait AsyncFunction[TReturn] extends StObject {
      
      def asyncFunction(): js.Promise[TReturn] = js.native
      def asyncFunction(payload: js.Any): js.Promise[TReturn] = js.native
      
      def unsubscribe(): Unit = js.native
    }
    
    trait Config[StartAction /* <: AnyAction */, ResolveAction /* <: AnyAction */, RejectAction /* <: AnyAction */, TReturn] extends StObject {
      
      var getError: js.UndefOr[js.Function1[/* action */ RejectAction, js.Any]] = js.undefined
      
      var getPayload: js.UndefOr[js.Function1[/* action */ ResolveAction, TReturn]] = js.undefined
      
      var reject: String | ActionMatcher
      
      var resolve: String | ActionMatcher
      
      var setPayload: js.UndefOr[js.Function2[/* action */ StartAction, /* payload */ js.Any, AnyAction]] = js.undefined
      
      var start: String
    }
    object Config {
      
      inline def apply[StartAction /* <: AnyAction */, ResolveAction /* <: AnyAction */, RejectAction /* <: AnyAction */, TReturn](reject: String | ActionMatcher, resolve: String | ActionMatcher, start: String): Config[StartAction, ResolveAction, RejectAction, TReturn] = {
        val __obj = js.Dynamic.literal(reject = reject.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
        __obj.asInstanceOf[Config[StartAction, ResolveAction, RejectAction, TReturn]]
      }
      
      extension [Self <: Config[?, ?, ?, ?], StartAction /* <: AnyAction */, ResolveAction /* <: AnyAction */, RejectAction /* <: AnyAction */, TReturn](x: Self & (Config[StartAction, ResolveAction, RejectAction, TReturn])) {
        
        inline def setGetError(value: /* action */ RejectAction => js.Any): Self = StObject.set(x, "getError", js.Any.fromFunction1(value))
        
        inline def setGetErrorUndefined: Self = StObject.set(x, "getError", js.undefined)
        
        inline def setGetPayload(value: /* action */ ResolveAction => TReturn): Self = StObject.set(x, "getPayload", js.Any.fromFunction1(value))
        
        inline def setGetPayloadUndefined: Self = StObject.set(x, "getPayload", js.undefined)
        
        inline def setReject(value: String | ActionMatcher): Self = StObject.set(x, "reject", value.asInstanceOf[js.Any])
        
        inline def setRejectFunction1(value: /* action */ AnyAction => Boolean): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
        
        inline def setResolve(value: String | ActionMatcher): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
        
        inline def setResolveFunction1(value: /* action */ AnyAction => Boolean): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
        
        inline def setSetPayload(value: (/* action */ StartAction, /* payload */ js.Any) => AnyAction): Self = StObject.set(x, "setPayload", js.Any.fromFunction2(value))
        
        inline def setSetPayloadUndefined: Self = StObject.set(x, "setPayload", js.undefined)
        
        inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      }
    }
    
    trait PromiseListener extends StObject {
      
      def createAsyncFunction[StartAction /* <: AnyAction */, ResolveAction /* <: AnyAction */, RejectAction /* <: AnyAction */, TReturn](
        // tslint:disable-next-line no-unnecessary-generics
      config: Config[StartAction, ResolveAction, RejectAction, TReturn]
      ): AsyncFunction[TReturn]
      
      def middleware(api: MiddlewareAPI[Dispatch[AnyAction], AnyAction]): js.Function1[/* next */ Dispatch[AnyAction], js.Function1[/* action */ js.Any, js.Any]]
      @JSName("middleware")
      var middleware_Original: Middleware[js.Object, AnyAction, Dispatch[AnyAction]]
    }
    object PromiseListener {
      
      inline def apply(
        createAsyncFunction: Config[js.Any, js.Any, js.Any, js.Any] => AsyncFunction[js.Any],
        middleware: /* api */ MiddlewareAPI[Dispatch[AnyAction], AnyAction] => js.Function1[/* next */ Dispatch[AnyAction], js.Function1[/* action */ js.Any, js.Any]]
      ): PromiseListener = {
        val __obj = js.Dynamic.literal(createAsyncFunction = js.Any.fromFunction1(createAsyncFunction), middleware = js.Any.fromFunction1(middleware))
        __obj.asInstanceOf[PromiseListener]
      }
      
      extension [Self <: PromiseListener](x: Self) {
        
        inline def setCreateAsyncFunction(value: Config[js.Any, js.Any, js.Any, js.Any] => AsyncFunction[js.Any]): Self = StObject.set(x, "createAsyncFunction", js.Any.fromFunction1(value))
        
        inline def setMiddleware(
          value: /* api */ MiddlewareAPI[Dispatch[AnyAction], AnyAction] => js.Function1[/* next */ Dispatch[AnyAction], js.Function1[/* action */ js.Any, js.Any]]
        ): Self = StObject.set(x, "middleware", js.Any.fromFunction1(value))
      }
    }
  }
}
