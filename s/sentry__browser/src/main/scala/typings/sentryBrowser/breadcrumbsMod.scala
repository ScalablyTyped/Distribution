package typings.sentryBrowser

import typings.sentryBrowser.anon.PartialBreadcrumbsOptions
import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.eventprocessorMod.EventProcessor
import typings.sentryTypes.hubMod.Hub
import typings.sentryTypes.integrationMod.Integration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbsMod {
  
  @JSImport("@sentry/browser/dist/integrations/breadcrumbs", "Breadcrumbs")
  @js.native
  /**
    * @inheritDoc
    */
  class Breadcrumbs ()
    extends StObject
       with Integration {
    def this(options: PartialBreadcrumbsOptions) = this()
    
    /**
      * Creates breadcrumbs from console API calls
      */
    var _consoleBreadcrumb: js.Any = js.native
    
    /**
      * Creates breadcrumbs from DOM API calls
      */
    var _domBreadcrumb: js.Any = js.native
    
    /**
      * Creates breadcrumbs from fetch API calls
      */
    var _fetchBreadcrumb: js.Any = js.native
    
    /**
      * Creates breadcrumbs from history API calls
      */
    var _historyBreadcrumb: js.Any = js.native
    
    /** JSDoc */
    val _options: js.Any = js.native
    
    /**
      * Creates breadcrumbs from XHR API calls
      */
    var _xhrBreadcrumb: js.Any = js.native
    
    /**
      * Create a breadcrumb of `sentry` from the events themselves
      */
    def addSentryBreadcrumb(event: Event): Unit = js.native
    
    /**
      * Returns {@link IntegrationClass.id}
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Instrument browser built-ins w/ breadcrumb capturing
      *  - Console API
      *  - DOM API (click/typing)
      *  - XMLHttpRequest API
      *  - Fetch API
      *  - History API
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
  object Breadcrumbs {
    
    @JSImport("@sentry/browser/dist/integrations/breadcrumbs", "Breadcrumbs")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser/dist/integrations/breadcrumbs", "Breadcrumbs.id")
    @js.native
    def id: String = js.native
    @scala.inline
    def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  /** JSDoc */
  trait BreadcrumbsOptions extends StObject {
    
    var console: Boolean
    
    var dom: Boolean
    
    var fetch: Boolean
    
    var history: Boolean
    
    var sentry: Boolean
    
    var xhr: Boolean
  }
  object BreadcrumbsOptions {
    
    @scala.inline
    def apply(console: Boolean, dom: Boolean, fetch: Boolean, history: Boolean, sentry: Boolean, xhr: Boolean): BreadcrumbsOptions = {
      val __obj = js.Dynamic.literal(console = console.asInstanceOf[js.Any], dom = dom.asInstanceOf[js.Any], fetch = fetch.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], sentry = sentry.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
      __obj.asInstanceOf[BreadcrumbsOptions]
    }
    
    @scala.inline
    implicit class BreadcrumbsOptionsMutableBuilder[Self <: BreadcrumbsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsole(value: Boolean): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDom(value: Boolean): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetch(value: Boolean): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistory(value: Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSentry(value: Boolean): Self = StObject.set(x, "sentry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXhr(value: Boolean): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    }
  }
}
