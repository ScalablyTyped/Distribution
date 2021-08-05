package typings.sentryCore

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var user: js.UndefOr[Email] = js.undefined
  }
  object Dictkey {
    
    inline def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def setUser(value: Email): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  trait Email extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object Email {
    
    inline def apply(): Email = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Email]
    }
    
    extension [Self <: Email](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@sentry/core.@sentry/core/dist/integrations/inboundfilters.InboundFiltersOptions> */
  trait PartialInboundFiltersOpti extends StObject {
    
    var allowUrls: js.UndefOr[js.Array[String | RegExp]] = js.undefined
    
    var blacklistUrls: js.UndefOr[js.Array[String | RegExp]] = js.undefined
    
    var denyUrls: js.UndefOr[js.Array[String | RegExp]] = js.undefined
    
    var ignoreErrors: js.UndefOr[js.Array[String | RegExp]] = js.undefined
    
    var ignoreInternal: js.UndefOr[Boolean] = js.undefined
    
    var whitelistUrls: js.UndefOr[js.Array[String | RegExp]] = js.undefined
  }
  object PartialInboundFiltersOpti {
    
    inline def apply(): PartialInboundFiltersOpti = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialInboundFiltersOpti]
    }
    
    extension [Self <: PartialInboundFiltersOpti](x: Self) {
      
      inline def setAllowUrls(value: js.Array[String | RegExp]): Self = StObject.set(x, "allowUrls", value.asInstanceOf[js.Any])
      
      inline def setAllowUrlsUndefined: Self = StObject.set(x, "allowUrls", js.undefined)
      
      inline def setAllowUrlsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "allowUrls", js.Array(value :_*))
      
      inline def setBlacklistUrls(value: js.Array[String | RegExp]): Self = StObject.set(x, "blacklistUrls", value.asInstanceOf[js.Any])
      
      inline def setBlacklistUrlsUndefined: Self = StObject.set(x, "blacklistUrls", js.undefined)
      
      inline def setBlacklistUrlsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "blacklistUrls", js.Array(value :_*))
      
      inline def setDenyUrls(value: js.Array[String | RegExp]): Self = StObject.set(x, "denyUrls", value.asInstanceOf[js.Any])
      
      inline def setDenyUrlsUndefined: Self = StObject.set(x, "denyUrls", js.undefined)
      
      inline def setDenyUrlsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "denyUrls", js.Array(value :_*))
      
      inline def setIgnoreErrors(value: js.Array[String | RegExp]): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
      
      inline def setIgnoreErrorsUndefined: Self = StObject.set(x, "ignoreErrors", js.undefined)
      
      inline def setIgnoreErrorsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "ignoreErrors", js.Array(value :_*))
      
      inline def setIgnoreInternal(value: Boolean): Self = StObject.set(x, "ignoreInternal", value.asInstanceOf[js.Any])
      
      inline def setIgnoreInternalUndefined: Self = StObject.set(x, "ignoreInternal", js.undefined)
      
      inline def setWhitelistUrls(value: js.Array[String | RegExp]): Self = StObject.set(x, "whitelistUrls", value.asInstanceOf[js.Any])
      
      inline def setWhitelistUrlsUndefined: Self = StObject.set(x, "whitelistUrls", js.undefined)
      
      inline def setWhitelistUrlsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "whitelistUrls", js.Array(value :_*))
    }
  }
}
