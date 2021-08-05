package typings.sentryBrowser

import typings.sentryCore.mod.BaseBackend
import typings.sentryTypes.optionsMod.Options
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backendMod {
  
  @JSImport("@sentry/browser/dist/backend", "BrowserBackend")
  @js.native
  class BrowserBackend protected () extends BaseBackend[BrowserOptions] {
    /** Creates a new backend instance. */
    def this(options: BrowserOptions) = this()
  }
  
  trait BrowserOptions
    extends StObject
       with Options {
    
    /**
      * A pattern for error URLs which should exclusively be sent to Sentry.
      * This is the opposite of {@link Options.denyUrls}.
      * By default, all errors will be sent.
      */
    var allowUrls: js.UndefOr[js.Array[String | RegExp]] = js.undefined
    
    /**
      * A flag enabling Sessions Tracking feature.
      * By default Sessions Tracking is disabled.
      */
    var autoSessionTracking: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated use {@link Options.denyUrls} instead. */
    var blacklistUrls: js.UndefOr[js.Array[String | RegExp]] = js.undefined
    
    /**
      * A pattern for error URLs which should not be sent to Sentry.
      * To allow certain errors instead, use {@link Options.allowUrls}.
      * By default, all errors will be sent.
      */
    var denyUrls: js.UndefOr[js.Array[String | RegExp]] = js.undefined
    
    /** @deprecated use {@link Options.allowUrls} instead. */
    var whitelistUrls: js.UndefOr[js.Array[String | RegExp]] = js.undefined
  }
  object BrowserOptions {
    
    inline def apply(): BrowserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserOptions]
    }
    
    extension [Self <: BrowserOptions](x: Self) {
      
      inline def setAllowUrls(value: js.Array[String | RegExp]): Self = StObject.set(x, "allowUrls", value.asInstanceOf[js.Any])
      
      inline def setAllowUrlsUndefined: Self = StObject.set(x, "allowUrls", js.undefined)
      
      inline def setAllowUrlsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "allowUrls", js.Array(value :_*))
      
      inline def setAutoSessionTracking(value: Boolean): Self = StObject.set(x, "autoSessionTracking", value.asInstanceOf[js.Any])
      
      inline def setAutoSessionTrackingUndefined: Self = StObject.set(x, "autoSessionTracking", js.undefined)
      
      inline def setBlacklistUrls(value: js.Array[String | RegExp]): Self = StObject.set(x, "blacklistUrls", value.asInstanceOf[js.Any])
      
      inline def setBlacklistUrlsUndefined: Self = StObject.set(x, "blacklistUrls", js.undefined)
      
      inline def setBlacklistUrlsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "blacklistUrls", js.Array(value :_*))
      
      inline def setDenyUrls(value: js.Array[String | RegExp]): Self = StObject.set(x, "denyUrls", value.asInstanceOf[js.Any])
      
      inline def setDenyUrlsUndefined: Self = StObject.set(x, "denyUrls", js.undefined)
      
      inline def setDenyUrlsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "denyUrls", js.Array(value :_*))
      
      inline def setWhitelistUrls(value: js.Array[String | RegExp]): Self = StObject.set(x, "whitelistUrls", value.asInstanceOf[js.Any])
      
      inline def setWhitelistUrlsUndefined: Self = StObject.set(x, "whitelistUrls", js.undefined)
      
      inline def setWhitelistUrlsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "whitelistUrls", js.Array(value :_*))
    }
  }
}
