package typings.rest

import typings.rest.mod.Interceptor
import typings.rest.mod.Meta
import typings.rest.mod.Request
import typings.rest.mod.Response
import typings.when.When.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interceptorMod {
  
  inline def apply[T, U](config: Config[T, U]): Interceptor[T] = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[Interceptor[T]]
  
  @JSImport("rest/interceptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Config[T, U] extends StObject {
    
    var error: js.UndefOr[
        js.Function3[/* response */ Response, /* config */ U, /* meta */ Meta, Response | Promise[Response]]
      ] = js.undefined
    
    var init: js.UndefOr[js.Function1[/* config */ T, U]] = js.undefined
    
    var request: js.UndefOr[
        js.Function3[/* request */ Request, /* config */ U, /* meta */ Meta, Request | Promise[Request]]
      ] = js.undefined
    
    var response: js.UndefOr[
        js.Function3[/* response */ Response, /* config */ U, /* meta */ Meta, Response | Promise[Response]]
      ] = js.undefined
    
    var success: js.UndefOr[
        js.Function3[/* response */ Response, /* config */ U, /* meta */ Meta, Response | Promise[Response]]
      ] = js.undefined
  }
  object Config {
    
    inline def apply[T, U](): Config[T, U] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config[T, U]]
    }
    
    extension [Self <: Config[?, ?], T, U](x: Self & (Config[T, U])) {
      
      inline def setError(value: (/* response */ Response, /* config */ U, /* meta */ Meta) => Response | Promise[Response]): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setInit(value: /* config */ T => U): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setRequest(value: (/* request */ Request, /* config */ U, /* meta */ Meta) => Request | Promise[Request]): Self = StObject.set(x, "request", js.Any.fromFunction3(value))
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setResponse(value: (/* response */ Response, /* config */ U, /* meta */ Meta) => Response | Promise[Response]): Self = StObject.set(x, "response", js.Any.fromFunction3(value))
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
      
      inline def setSuccess(value: (/* response */ Response, /* config */ U, /* meta */ Meta) => Response | Promise[Response]): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
}
