package typings.restifyCorsMiddleware

import typings.restify.mod.Next
import typings.restify.mod.Request
import typings.restify.mod.RequestHandler
import typings.restify.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Options): CorsMiddleware = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[CorsMiddleware]
  
  @JSImport("restify-cors-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CorsMiddleware extends StObject {
    
    def actual(req: Request, res: Response, next: Next): Any
    @JSName("actual")
    var actual_Original: RequestHandler
    
    def preflight(req: Request, res: Response, next: Next): Any
    @JSName("preflight")
    var preflight_Original: RequestHandler
  }
  object CorsMiddleware {
    
    inline def apply(
      actual: (/* req */ Request, /* res */ Response, /* next */ Next) => Any,
      preflight: (/* req */ Request, /* res */ Response, /* next */ Next) => Any
    ): CorsMiddleware = {
      val __obj = js.Dynamic.literal(actual = js.Any.fromFunction3(actual), preflight = js.Any.fromFunction3(preflight))
      __obj.asInstanceOf[CorsMiddleware]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CorsMiddleware] (val x: Self) extends AnyVal {
      
      inline def setActual(value: (/* req */ Request, /* res */ Response, /* next */ Next) => Any): Self = StObject.set(x, "actual", js.Any.fromFunction3(value))
      
      inline def setPreflight(value: (/* req */ Request, /* res */ Response, /* next */ Next) => Any): Self = StObject.set(x, "preflight", js.Any.fromFunction3(value))
    }
  }
  
  trait Options extends StObject {
    
    /** user defined headers to allow */
    var allowHeaders: js.Array[String]
    
    /** if true, uses creds */
    var credentials: js.UndefOr[Boolean] = js.undefined
    
    /** user defined headers to expose */
    var exposeHeaders: js.Array[String]
    
    /**
      * an array of whitelisted origins
      * can be both strings and regular expressions
      */
    var origins: js.Array[String | js.RegExp]
    
    /** ms to cache preflight requests */
    var preflightMaxAge: js.UndefOr[Double] = js.undefined
    
    /** customize preflight request handling */
    var preflightStrategy: js.UndefOr[Any] = js.undefined
  }
  object Options {
    
    inline def apply(
      allowHeaders: js.Array[String],
      exposeHeaders: js.Array[String],
      origins: js.Array[String | js.RegExp]
    ): Options = {
      val __obj = js.Dynamic.literal(allowHeaders = allowHeaders.asInstanceOf[js.Any], exposeHeaders = exposeHeaders.asInstanceOf[js.Any], origins = origins.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAllowHeaders(value: js.Array[String]): Self = StObject.set(x, "allowHeaders", value.asInstanceOf[js.Any])
      
      inline def setAllowHeadersVarargs(value: String*): Self = StObject.set(x, "allowHeaders", js.Array(value*))
      
      inline def setCredentials(value: Boolean): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setExposeHeaders(value: js.Array[String]): Self = StObject.set(x, "exposeHeaders", value.asInstanceOf[js.Any])
      
      inline def setExposeHeadersVarargs(value: String*): Self = StObject.set(x, "exposeHeaders", js.Array(value*))
      
      inline def setOrigins(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
      
      inline def setOriginsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "origins", js.Array(value*))
      
      inline def setPreflightMaxAge(value: Double): Self = StObject.set(x, "preflightMaxAge", value.asInstanceOf[js.Any])
      
      inline def setPreflightMaxAgeUndefined: Self = StObject.set(x, "preflightMaxAge", js.undefined)
      
      inline def setPreflightStrategy(value: Any): Self = StObject.set(x, "preflightStrategy", value.asInstanceOf[js.Any])
      
      inline def setPreflightStrategyUndefined: Self = StObject.set(x, "preflightStrategy", js.undefined)
    }
  }
}
