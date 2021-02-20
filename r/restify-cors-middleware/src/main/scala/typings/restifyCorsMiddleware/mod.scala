package typings.restifyCorsMiddleware

import typings.restify.mod.Next
import typings.restify.mod.Request
import typings.restify.mod.RequestHandler
import typings.restify.mod.Response
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("restify-cors-middleware", JSImport.Namespace)
  @js.native
  def apply(options: Options): CorsMiddleware = js.native
  
  @js.native
  trait CorsMiddleware extends StObject {
    
    def actual(req: Request, res: Response, next: Next): js.Any = js.native
    @JSName("actual")
    var actual_Original: RequestHandler = js.native
    
    def preflight(req: Request, res: Response, next: Next): js.Any = js.native
    @JSName("preflight")
    var preflight_Original: RequestHandler = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    /** user defined headers to allow */
    var allowHeaders: js.Array[String] = js.native
    
    /** if true, uses creds */
    var credentials: js.UndefOr[Boolean] = js.native
    
    /** user defined headers to expose */
    var exposeHeaders: js.Array[String] = js.native
    
    /**
      * an array of whitelisted origins
      * can be both strings and regular expressions
      */
    var origins: js.Array[String | RegExp] = js.native
    
    /** ms to cache preflight requests */
    var preflightMaxAge: js.UndefOr[Double] = js.native
    
    /** customize preflight request handling */
    var preflightStrategy: js.UndefOr[js.Any] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(
      allowHeaders: js.Array[String],
      exposeHeaders: js.Array[String],
      origins: js.Array[String | RegExp]
    ): Options = {
      val __obj = js.Dynamic.literal(allowHeaders = allowHeaders.asInstanceOf[js.Any], exposeHeaders = exposeHeaders.asInstanceOf[js.Any], origins = origins.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowHeaders(value: js.Array[String]): Self = StObject.set(x, "allowHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowHeadersVarargs(value: String*): Self = StObject.set(x, "allowHeaders", js.Array(value :_*))
      
      @scala.inline
      def setCredentials(value: Boolean): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      @scala.inline
      def setExposeHeaders(value: js.Array[String]): Self = StObject.set(x, "exposeHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExposeHeadersVarargs(value: String*): Self = StObject.set(x, "exposeHeaders", js.Array(value :_*))
      
      @scala.inline
      def setOrigins(value: js.Array[String | RegExp]): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "origins", js.Array(value :_*))
      
      @scala.inline
      def setPreflightMaxAge(value: Double): Self = StObject.set(x, "preflightMaxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreflightMaxAgeUndefined: Self = StObject.set(x, "preflightMaxAge", js.undefined)
      
      @scala.inline
      def setPreflightStrategy(value: js.Any): Self = StObject.set(x, "preflightStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreflightStrategyUndefined: Self = StObject.set(x, "preflightStrategy", js.undefined)
    }
  }
}
