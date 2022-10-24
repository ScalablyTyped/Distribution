package typings.puppeteerCore

import typings.puppeteerCore.libCjsPuppeteerApiBrowserMod.Browser
import typings.puppeteerCore.libCjsPuppeteerCommonBrowserConnectorMod.BrowserConnectOptions
import typings.puppeteerCore.libCjsPuppeteerCommonConnectionTransportMod.ConnectionTransport
import typings.puppeteerCore.libCjsPuppeteerCommonQueryHandlerMod.CustomQueryHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsPuppeteerCommonPuppeteerMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/Puppeteer", "Puppeteer")
  @js.native
  open class Puppeteer protected () extends StObject {
    /**
      * @internal
      */
    def this(settings: CommonPuppeteerSettings) = this()
    
    /**
      * @internal
      */
    /* protected */ var _changedProduct: Boolean = js.native
    
    /**
      * @internal
      */
    var _isPuppeteerCore: Boolean = js.native
    
    /**
      * This method attaches Puppeteer to an existing browser instance.
      *
      * @remarks
      *
      * @param options - Set of configurable options to set on the browser.
      * @returns Promise which resolves to browser instance.
      */
    def connect(options: ConnectOptions): js.Promise[Browser] = js.native
  }
  /* static members */
  object Puppeteer {
    
    @JSImport("puppeteer-core/lib/cjs/puppeteer/common/Puppeteer", "Puppeteer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Unregisters all custom query handlers.
      */
    inline def clearCustomQueryHandlers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCustomQueryHandlers")().asInstanceOf[Unit]
    
    /**
      * Gets the names of all custom query handlers.
      */
    inline def customQueryHandlerNames(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("customQueryHandlerNames")().asInstanceOf[js.Array[String]]
    
    /**
      * Registers a {@link CustomQueryHandler | custom query handler}.
      *
      * @remarks
      * After registration, the handler can be used everywhere where a selector is
      * expected by prepending the selection string with `<name>/`. The name is only
      * allowed to consist of lower- and upper case latin letters.
      *
      * @example
      *
      * ```
      * puppeteer.registerCustomQueryHandler('text', { … });
      * const aHandle = await page.$('text/…');
      * ```
      *
      * @param name - The name that the custom query handler will be registered
      * under.
      * @param queryHandler - The {@link CustomQueryHandler | custom query handler}
      * to register.
      *
      * @public
      */
    inline def registerCustomQueryHandler(name: String, queryHandler: CustomQueryHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomQueryHandler")(name.asInstanceOf[js.Any], queryHandler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Unregisters a custom query handler for a given name.
      */
    inline def unregisterCustomQueryHandler(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterCustomQueryHandler")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  trait CommonPuppeteerSettings extends StObject {
    
    var isPuppeteerCore: Boolean
  }
  object CommonPuppeteerSettings {
    
    inline def apply(isPuppeteerCore: Boolean): CommonPuppeteerSettings = {
      val __obj = js.Dynamic.literal(isPuppeteerCore = isPuppeteerCore.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonPuppeteerSettings]
    }
    
    extension [Self <: CommonPuppeteerSettings](x: Self) {
      
      inline def setIsPuppeteerCore(value: Boolean): Self = StObject.set(x, "isPuppeteerCore", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConnectOptions
    extends StObject
       with BrowserConnectOptions {
    
    var browserURL: js.UndefOr[String] = js.undefined
    
    var browserWSEndpoint: js.UndefOr[String] = js.undefined
    
    var transport: js.UndefOr[ConnectionTransport] = js.undefined
  }
  object ConnectOptions {
    
    inline def apply(): ConnectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectOptions]
    }
    
    extension [Self <: ConnectOptions](x: Self) {
      
      inline def setBrowserURL(value: String): Self = StObject.set(x, "browserURL", value.asInstanceOf[js.Any])
      
      inline def setBrowserURLUndefined: Self = StObject.set(x, "browserURL", js.undefined)
      
      inline def setBrowserWSEndpoint(value: String): Self = StObject.set(x, "browserWSEndpoint", value.asInstanceOf[js.Any])
      
      inline def setBrowserWSEndpointUndefined: Self = StObject.set(x, "browserWSEndpoint", js.undefined)
      
      inline def setTransport(value: ConnectionTransport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    }
  }
}
