package typings.sentryCore

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Dictkey
    extends /* key */ StringDictionary[js.Any] {
    
    var user: js.UndefOr[Email] = js.native
  }
  object Dictkey {
    
    @scala.inline
    def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUser(value: Email): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  @js.native
  trait Email extends StObject {
    
    var email: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
  }
  object Email {
    
    @scala.inline
    def apply(): Email = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Email]
    }
    
    @scala.inline
    implicit class EmailMutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@sentry/core.@sentry/core/dist/integrations/inboundfilters.InboundFiltersOptions> */
  @js.native
  trait PartialInboundFiltersOpti extends StObject {
    
    var allowUrls: js.UndefOr[js.Array[String | RegExp]] = js.native
    
    var blacklistUrls: js.UndefOr[js.Array[String | RegExp]] = js.native
    
    var denyUrls: js.UndefOr[js.Array[String | RegExp]] = js.native
    
    var ignoreErrors: js.UndefOr[js.Array[String | RegExp]] = js.native
    
    var ignoreInternal: js.UndefOr[Boolean] = js.native
    
    var whitelistUrls: js.UndefOr[js.Array[String | RegExp]] = js.native
  }
  object PartialInboundFiltersOpti {
    
    @scala.inline
    def apply(): PartialInboundFiltersOpti = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialInboundFiltersOpti]
    }
    
    @scala.inline
    implicit class PartialInboundFiltersOptiMutableBuilder[Self <: PartialInboundFiltersOpti] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowUrls(value: js.Array[String | RegExp]): Self = StObject.set(x, "allowUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUrlsUndefined: Self = StObject.set(x, "allowUrls", js.undefined)
      
      @scala.inline
      def setAllowUrlsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "allowUrls", js.Array(value :_*))
      
      @scala.inline
      def setBlacklistUrls(value: js.Array[String | RegExp]): Self = StObject.set(x, "blacklistUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlacklistUrlsUndefined: Self = StObject.set(x, "blacklistUrls", js.undefined)
      
      @scala.inline
      def setBlacklistUrlsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "blacklistUrls", js.Array(value :_*))
      
      @scala.inline
      def setDenyUrls(value: js.Array[String | RegExp]): Self = StObject.set(x, "denyUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDenyUrlsUndefined: Self = StObject.set(x, "denyUrls", js.undefined)
      
      @scala.inline
      def setDenyUrlsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "denyUrls", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreErrors(value: js.Array[String | RegExp]): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreErrorsUndefined: Self = StObject.set(x, "ignoreErrors", js.undefined)
      
      @scala.inline
      def setIgnoreErrorsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "ignoreErrors", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreInternal(value: Boolean): Self = StObject.set(x, "ignoreInternal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreInternalUndefined: Self = StObject.set(x, "ignoreInternal", js.undefined)
      
      @scala.inline
      def setWhitelistUrls(value: js.Array[String | RegExp]): Self = StObject.set(x, "whitelistUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhitelistUrlsUndefined: Self = StObject.set(x, "whitelistUrls", js.undefined)
      
      @scala.inline
      def setWhitelistUrlsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "whitelistUrls", js.Array(value :_*))
    }
  }
}
