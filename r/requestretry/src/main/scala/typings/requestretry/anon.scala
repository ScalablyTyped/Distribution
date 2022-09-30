package typings.requestretry

import typings.node.httpMod.IncomingMessage
import typings.requestretry.mod.RetryStrategy
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
    def apply[TResult1, TResult2](onfulfilled: js.Function1[/* value */ Any, TResult1 | PromiseLike[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
    def apply[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ Any, TResult1 | PromiseLike[TResult1]],
      onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def apply[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
    def apply[TResult1, TResult2](onfulfilled: Unit, onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
  }
  
  @js.native
  trait FnCallOnrejected extends StObject {
    
    def apply[TResult](): js.Promise[Any | TResult] = js.native
    def apply[TResult](onrejected: js.Function1[/* reason */ Any, TResult | PromiseLike[TResult]]): js.Promise[Any | TResult] = js.native
  }
  
  trait HTTPOrNetworkError extends StObject {
    
    def HTTPOrNetworkError(err: js.Error, response: IncomingMessage, body: Any): Boolean
    @JSName("HTTPOrNetworkError")
    var HTTPOrNetworkError_Original: RetryStrategy
    
    def HttpError(err: js.Error, response: IncomingMessage, body: Any): Boolean
    @JSName("HttpError")
    var HttpError_Original: RetryStrategy
    
    def NetworkError(err: js.Error, response: IncomingMessage, body: Any): Boolean
    @JSName("NetworkError")
    var NetworkError_Original: RetryStrategy
  }
  object HTTPOrNetworkError {
    
    inline def apply(
      HTTPOrNetworkError: (/* err */ js.Error, /* response */ IncomingMessage, /* body */ Any) => Boolean,
      HttpError: (/* err */ js.Error, /* response */ IncomingMessage, /* body */ Any) => Boolean,
      NetworkError: (/* err */ js.Error, /* response */ IncomingMessage, /* body */ Any) => Boolean
    ): HTTPOrNetworkError = {
      val __obj = js.Dynamic.literal(HTTPOrNetworkError = js.Any.fromFunction3(HTTPOrNetworkError), HttpError = js.Any.fromFunction3(HttpError), NetworkError = js.Any.fromFunction3(NetworkError))
      __obj.asInstanceOf[HTTPOrNetworkError]
    }
    
    extension [Self <: HTTPOrNetworkError](x: Self) {
      
      inline def setHTTPOrNetworkError(value: (/* err */ js.Error, /* response */ IncomingMessage, /* body */ Any) => Boolean): Self = StObject.set(x, "HTTPOrNetworkError", js.Any.fromFunction3(value))
      
      inline def setHttpError(value: (/* err */ js.Error, /* response */ IncomingMessage, /* body */ Any) => Boolean): Self = StObject.set(x, "HttpError", js.Any.fromFunction3(value))
      
      inline def setNetworkError(value: (/* err */ js.Error, /* response */ IncomingMessage, /* body */ Any) => Boolean): Self = StObject.set(x, "NetworkError", js.Any.fromFunction3(value))
    }
  }
}
