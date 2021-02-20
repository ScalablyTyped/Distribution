package typings.reduxPromiseListener

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.redux.mod.MiddlewareAPI
import typings.reduxPromiseListener.mod.ReduxPromiseListener.PromiseListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-promise-listener", JSImport.Default)
  @js.native
  def default(): PromiseListener = js.native
  
  object ReduxPromiseListener {
    
    type ActionMatcher = js.Function1[/* action */ AnyAction, Boolean]
    
    @js.native
    trait AsyncFunction[TReturn] extends StObject {
      
      def asyncFunction(): js.Promise[TReturn] = js.native
      def asyncFunction(payload: js.Any): js.Promise[TReturn] = js.native
      
      def unsubscribe(): Unit = js.native
    }
    
    @js.native
    trait Config[StartAction /* <: AnyAction */, ResolveAction /* <: AnyAction */, RejectAction /* <: AnyAction */, TReturn] extends StObject {
      
      var getError: js.UndefOr[js.Function1[/* action */ RejectAction, _]] = js.native
      
      var getPayload: js.UndefOr[js.Function1[/* action */ ResolveAction, TReturn]] = js.native
      
      var reject: String | ActionMatcher = js.native
      
      var resolve: String | ActionMatcher = js.native
      
      var setPayload: js.UndefOr[js.Function2[/* action */ StartAction, /* payload */ js.Any, AnyAction]] = js.native
      
      var start: String = js.native
    }
    object Config {
      
      @scala.inline
      def apply[StartAction /* <: AnyAction */, ResolveAction /* <: AnyAction */, RejectAction /* <: AnyAction */, TReturn](reject: String | ActionMatcher, resolve: String | ActionMatcher, start: String): Config[StartAction, ResolveAction, RejectAction, TReturn] = {
        val __obj = js.Dynamic.literal(reject = reject.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
        __obj.asInstanceOf[Config[StartAction, ResolveAction, RejectAction, TReturn]]
      }
      
      @scala.inline
      implicit class ConfigMutableBuilder[Self <: Config[_, _, _, _], StartAction /* <: AnyAction */, ResolveAction /* <: AnyAction */, RejectAction /* <: AnyAction */, TReturn] (val x: Self with (Config[StartAction, ResolveAction, RejectAction, TReturn])) extends AnyVal {
        
        @scala.inline
        def setGetError(value: /* action */ RejectAction => _): Self = StObject.set(x, "getError", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetErrorUndefined: Self = StObject.set(x, "getError", js.undefined)
        
        @scala.inline
        def setGetPayload(value: /* action */ ResolveAction => TReturn): Self = StObject.set(x, "getPayload", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetPayloadUndefined: Self = StObject.set(x, "getPayload", js.undefined)
        
        @scala.inline
        def setReject(value: String | ActionMatcher): Self = StObject.set(x, "reject", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRejectFunction1(value: /* action */ AnyAction => Boolean): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
        
        @scala.inline
        def setResolve(value: String | ActionMatcher): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResolveFunction1(value: /* action */ AnyAction => Boolean): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetPayload(value: (/* action */ StartAction, /* payload */ js.Any) => AnyAction): Self = StObject.set(x, "setPayload", js.Any.fromFunction2(value))
        
        @scala.inline
        def setSetPayloadUndefined: Self = StObject.set(x, "setPayload", js.undefined)
        
        @scala.inline
        def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait PromiseListener extends StObject {
      
      def createAsyncFunction[StartAction /* <: AnyAction */, ResolveAction /* <: AnyAction */, RejectAction /* <: AnyAction */, TReturn](
        // tslint:disable-next-line no-unnecessary-generics
      config: Config[StartAction, ResolveAction, RejectAction, TReturn]
      ): AsyncFunction[TReturn] = js.native
      
      def middleware(api: MiddlewareAPI[Dispatch[AnyAction], AnyAction]): js.Function1[/* next */ Dispatch[AnyAction], js.Function1[/* action */ _, _]] = js.native
      @JSName("middleware")
      var middleware_Original: Middleware[js.Object, AnyAction, Dispatch[AnyAction]] = js.native
    }
  }
}
