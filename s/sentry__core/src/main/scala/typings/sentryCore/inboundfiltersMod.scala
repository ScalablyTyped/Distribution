package typings.sentryCore

import typings.sentryCore.anon.PartialInboundFiltersOpti
import typings.sentryTypes.eventprocessorMod.EventProcessor
import typings.sentryTypes.hubMod.Hub
import typings.sentryTypes.integrationMod.Integration
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inboundfiltersMod {
  
  @JSImport("@sentry/core/dist/integrations/inboundfilters", "InboundFilters")
  @js.native
  class InboundFilters ()
    extends StObject
       with Integration {
    def this(_options: PartialInboundFiltersOpti) = this()
    
    /** JSDoc */
    /* private */ var _getEventFilterUrl: js.Any = js.native
    
    /** JSDoc */
    /* private */ var _getPossibleEventMessages: js.Any = js.native
    
    /** JSDoc */
    /* private */ var _isAllowedUrl: js.Any = js.native
    
    /** JSDoc */
    /* private */ var _isDeniedUrl: js.Any = js.native
    
    /** JSDoc */
    /* private */ var _isIgnoredError: js.Any = js.native
    
    /** JSDoc */
    /* private */ var _isSentryError: js.Any = js.native
    
    /** JSDoc */
    /* private */ var _mergeOptions: js.Any = js.native
    
    /* private */ val _options: js.Any = js.native
    
    /** JSDoc */
    /* private */ var _shouldDropEvent: js.Any = js.native
    
    /**
      * Returns {@link IntegrationClass.id}
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * @inheritDoc
      */
    def setupOnce(): Unit = js.native
    /**
      * Sets the integration up only once.
      * This takes no options on purpose, options should be passed in the constructor
      */
    /* CompleteClass */
    override def setupOnce(
      addGlobalEventProcessor: js.Function1[/* callback */ EventProcessor, Unit],
      getCurrentHub: js.Function0[Hub]
    ): Unit = js.native
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
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  /** JSDoc */
  trait InboundFiltersOptions extends StObject {
    
    var allowUrls: js.Array[String | RegExp]
    
    /** @deprecated use {@link InboundFiltersOptions.denyUrls} instead. */
    var blacklistUrls: js.Array[String | RegExp]
    
    var denyUrls: js.Array[String | RegExp]
    
    var ignoreErrors: js.Array[String | RegExp]
    
    var ignoreInternal: Boolean
    
    /** @deprecated use {@link InboundFiltersOptions.allowUrls} instead. */
    var whitelistUrls: js.Array[String | RegExp]
  }
  object InboundFiltersOptions {
    
    inline def apply(
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
    
    extension [Self <: InboundFiltersOptions](x: Self) {
      
      inline def setAllowUrls(value: js.Array[String | RegExp]): Self = StObject.set(x, "allowUrls", value.asInstanceOf[js.Any])
      
      inline def setAllowUrlsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "allowUrls", js.Array(value :_*))
      
      inline def setBlacklistUrls(value: js.Array[String | RegExp]): Self = StObject.set(x, "blacklistUrls", value.asInstanceOf[js.Any])
      
      inline def setBlacklistUrlsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "blacklistUrls", js.Array(value :_*))
      
      inline def setDenyUrls(value: js.Array[String | RegExp]): Self = StObject.set(x, "denyUrls", value.asInstanceOf[js.Any])
      
      inline def setDenyUrlsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "denyUrls", js.Array(value :_*))
      
      inline def setIgnoreErrors(value: js.Array[String | RegExp]): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
      
      inline def setIgnoreErrorsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "ignoreErrors", js.Array(value :_*))
      
      inline def setIgnoreInternal(value: Boolean): Self = StObject.set(x, "ignoreInternal", value.asInstanceOf[js.Any])
      
      inline def setWhitelistUrls(value: js.Array[String | RegExp]): Self = StObject.set(x, "whitelistUrls", value.asInstanceOf[js.Any])
      
      inline def setWhitelistUrlsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "whitelistUrls", js.Array(value :_*))
    }
  }
}
