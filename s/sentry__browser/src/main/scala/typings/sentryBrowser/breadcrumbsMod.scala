package typings.sentryBrowser

import typings.sentryBrowser.anon.PartialBreadcrumbsOptions
import typings.sentryBrowser.anon.ReadonlyBreadcrumbsOption
import typings.sentryBrowser.anon.SerializeAttribute
import typings.sentryTypes.eventprocessorMod.EventProcessor
import typings.sentryTypes.hubMod.Hub
import typings.sentryTypes.integrationMod.Integration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbsMod {
  
  @JSImport("@sentry/browser/types/integrations/breadcrumbs", "BREADCRUMB_INTEGRATION_ID")
  @js.native
  val BREADCRUMB_INTEGRATION_ID: /* "Breadcrumbs" */ String = js.native
  
  @JSImport("@sentry/browser/types/integrations/breadcrumbs", "Breadcrumbs")
  @js.native
  /**
    * @inheritDoc
    */
  open class Breadcrumbs ()
    extends StObject
       with Integration {
    def this(options: PartialBreadcrumbsOptions) = this()
    
    /**
      * Returns {@link IntegrationClass.id}
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Options of the breadcrumbs integration.
      */
    val options: ReadonlyBreadcrumbsOption = js.native
    
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
    
    @JSImport("@sentry/browser/types/integrations/breadcrumbs", "Breadcrumbs")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser/types/integrations/breadcrumbs", "Breadcrumbs.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  /** JSDoc */
  trait BreadcrumbsOptions extends StObject {
    
    var console: Boolean
    
    var dom: Boolean | SerializeAttribute
    
    var fetch: Boolean
    
    var history: Boolean
    
    var sentry: Boolean
    
    var xhr: Boolean
  }
  object BreadcrumbsOptions {
    
    inline def apply(
      console: Boolean,
      dom: Boolean | SerializeAttribute,
      fetch: Boolean,
      history: Boolean,
      sentry: Boolean,
      xhr: Boolean
    ): BreadcrumbsOptions = {
      val __obj = js.Dynamic.literal(console = console.asInstanceOf[js.Any], dom = dom.asInstanceOf[js.Any], fetch = fetch.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], sentry = sentry.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
      __obj.asInstanceOf[BreadcrumbsOptions]
    }
    
    extension [Self <: BreadcrumbsOptions](x: Self) {
      
      inline def setConsole(value: Boolean): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      inline def setDom(value: Boolean | SerializeAttribute): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      inline def setFetch(value: Boolean): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      inline def setHistory(value: Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setSentry(value: Boolean): Self = StObject.set(x, "sentry", value.asInstanceOf[js.Any])
      
      inline def setXhr(value: Boolean): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    }
  }
}
