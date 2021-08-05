package typings.restifyCookies

import typings.restifyCookies.restifyCookiesStrings.lax
import typings.restifyCookies.restifyCookiesStrings.none
import typings.restifyCookies.restifyCookiesStrings.strict
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("restify-cookies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[js.Any]
  
  /* augmented module */
  object restifyAugmentingMod {
    
    trait CookieOptions extends StObject {
      
      var domain: js.UndefOr[String] = js.undefined
      
      var encode: js.UndefOr[js.Function1[/* input */ String, String]] = js.undefined
      
      var expires: js.UndefOr[Date] = js.undefined
      
      var httpOnly: js.UndefOr[Boolean] = js.undefined
      
      var maxAge: js.UndefOr[Double] = js.undefined
      
      var path: js.UndefOr[String] = js.undefined
      
      var sameSite: js.UndefOr[Boolean | lax | strict | none] = js.undefined
      
      var secure: js.UndefOr[Boolean] = js.undefined
    }
    object CookieOptions {
      
      inline def apply(): CookieOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CookieOptions]
      }
      
      extension [Self <: CookieOptions](x: Self) {
        
        inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
        
        inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
        
        inline def setEncode(value: /* input */ String => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
        
        inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
        
        inline def setExpires(value: Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
        
        inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
        
        inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
        
        inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
        
        inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
        
        inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setSameSite(value: Boolean | lax | strict | none): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
        
        inline def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
        
        inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
        
        inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      }
    }
    
    trait Request extends StObject {
      
      var cookies: js.Any
    }
    object Request {
      
      inline def apply(cookies: js.Any): Request = {
        val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any])
        __obj.asInstanceOf[Request]
      }
      
      extension [Self <: Request](x: Self) {
        
        inline def setCookies(value: js.Any): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Response extends StObject {
      
      def setCookie(key: String, `val`: String): Unit = js.native
      def setCookie(key: String, `val`: String, options: CookieOptions): Unit = js.native
    }
  }
}
