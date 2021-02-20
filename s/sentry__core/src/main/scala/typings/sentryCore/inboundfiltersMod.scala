package typings.sentryCore

import typings.sentryCore.anon.PartialInboundFiltersOpti
import typings.sentryTypes.integrationMod.Integration
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inboundfiltersMod {
  
  @JSImport("@sentry/core/dist/integrations/inboundfilters", "InboundFilters")
  @js.native
  class InboundFilters () extends Integration {
    def this(_options: PartialInboundFiltersOpti) = this()
    
    /** JSDoc */
    var _getEventFilterUrl: js.Any = js.native
    
    /** JSDoc */
    var _getPossibleEventMessages: js.Any = js.native
    
    /** JSDoc */
    var _isAllowedUrl: js.Any = js.native
    
    /** JSDoc */
    var _isDeniedUrl: js.Any = js.native
    
    /** JSDoc */
    var _isIgnoredError: js.Any = js.native
    
    /** JSDoc */
    var _isSentryError: js.Any = js.native
    
    /** JSDoc */
    var _mergeOptions: js.Any = js.native
    
    val _options: js.Any = js.native
    
    /** JSDoc */
    var _shouldDropEvent: js.Any = js.native
    
    /**
      * @inheritDoc
      */
    def setupOnce(): Unit = js.native
  }
  /* static members */
  object InboundFilters {
    
    @JSImport("@sentry/core/dist/integrations/inboundfilters", "InboundFilters")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/core/dist/integrations/inboundfilters", "InboundFilters.id")
    @js.native
    def id: String = js.native
    @scala.inline
    def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  /** JSDoc */
  @js.native
  trait InboundFiltersOptions extends StObject {
    
    var allowUrls: js.Array[String | RegExp] = js.native
    
    /** @deprecated use {@link InboundFiltersOptions.denyUrls} instead. */
    var blacklistUrls: js.Array[String | RegExp] = js.native
    
    var denyUrls: js.Array[String | RegExp] = js.native
    
    var ignoreErrors: js.Array[String | RegExp] = js.native
    
    var ignoreInternal: Boolean = js.native
    
    /** @deprecated use {@link InboundFiltersOptions.allowUrls} instead. */
    var whitelistUrls: js.Array[String | RegExp] = js.native
  }
  object InboundFiltersOptions {
    
    @scala.inline
    def apply(
      allowUrls: js.Array[String | RegExp],
      blacklistUrls: js.Array[String | RegExp],
      denyUrls: js.Array[String | RegExp],
      ignoreErrors: js.Array[String | RegExp],
      ignoreInternal: Boolean,
      whitelistUrls: js.Array[String | RegExp]
    ): InboundFiltersOptions = {
      val __obj = js.Dynamic.literal(allowUrls = allowUrls.asInstanceOf[js.Any], blacklistUrls = blacklistUrls.asInstanceOf[js.Any], denyUrls = denyUrls.asInstanceOf[js.Any], ignoreErrors = ignoreErrors.asInstanceOf[js.Any], ignoreInternal = ignoreInternal.asInstanceOf[js.Any], whitelistUrls = whitelistUrls.asInstanceOf[js.Any])
      __obj.asInstanceOf[InboundFiltersOptions]
    }
    
    @scala.inline
    implicit class InboundFiltersOptionsMutableBuilder[Self <: InboundFiltersOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowUrls(value: js.Array[String | RegExp]): Self = StObject.set(x, "allowUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUrlsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "allowUrls", js.Array(value :_*))
      
      @scala.inline
      def setBlacklistUrls(value: js.Array[String | RegExp]): Self = StObject.set(x, "blacklistUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlacklistUrlsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "blacklistUrls", js.Array(value :_*))
      
      @scala.inline
      def setDenyUrls(value: js.Array[String | RegExp]): Self = StObject.set(x, "denyUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDenyUrlsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "denyUrls", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreErrors(value: js.Array[String | RegExp]): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreErrorsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "ignoreErrors", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreInternal(value: Boolean): Self = StObject.set(x, "ignoreInternal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhitelistUrls(value: js.Array[String | RegExp]): Self = StObject.set(x, "whitelistUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhitelistUrlsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "whitelistUrls", js.Array(value :_*))
    }
  }
}
