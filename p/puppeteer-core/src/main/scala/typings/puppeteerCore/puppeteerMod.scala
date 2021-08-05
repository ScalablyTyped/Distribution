package typings.puppeteerCore

import typings.puppeteerCore.browserConnectorMod.BrowserOptions
import typings.puppeteerCore.browserMod.Browser
import typings.puppeteerCore.connectionTransportMod.ConnectionTransport
import typings.puppeteerCore.deviceDescriptorsMod.DevicesMap_
import typings.puppeteerCore.errorsMod.PuppeteerErrors_
import typings.puppeteerCore.productMod.Product
import typings.puppeteerCore.queryHandlerMod.CustomQueryHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object puppeteerMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/Puppeteer", "Puppeteer")
  @js.native
  class Puppeteer protected () extends StObject {
    /**
      * @internal
      */
    def this(settings: CommonPuppeteerSettings) = this()
    
    /* protected */ var _changedProduct: Boolean = js.native
    
    /* protected */ var _isPuppeteerCore: Boolean = js.native
    
    /**
      * Clears all registered handlers.
      */
    def clearCustomQueryHandlers(): Unit = js.native
    
    /**
      * This method attaches Puppeteer to an existing browser instance.
      *
      * @remarks
      *
      * @param options - Set of configurable options to set on the browser.
      * @returns Promise which resolves to browser instance.
      */
    def connect(options: ConnectOptions): js.Promise[Browser] = js.native
    
    /**
      * @returns a list with the names of all registered custom query handlers.
      */
    def customQueryHandlerNames(): js.Array[String] = js.native
    
    /**
      * @remarks
      * A list of devices to be used with `page.emulate(options)`. Actual list of devices can be found in {@link https://github.com/puppeteer/puppeteer/blob/main/src/common/DeviceDescriptors.ts | src/common/DeviceDescriptors.ts}.
      *
      * @example
      *
      * ```js
      * const puppeteer = require('puppeteer');
      * const iPhone = puppeteer.devices['iPhone 6'];
      *
      * (async () => {
      *   const browser = await puppeteer.launch();
      *   const page = await browser.newPage();
      *   await page.emulate(iPhone);
      *   await page.goto('https://www.google.com');
      *   // other actions...
      *   await browser.close();
      * })();
      * ```
      *
      */
    def devices: DevicesMap_ = js.native
    
    /**
      * @remarks
      *
      * Puppeteer methods might throw errors if they are unable to fulfill a request.
      * For example, `page.waitForSelector(selector[, options])` might fail if
      * the selector doesn't match any nodes during the given timeframe.
      *
      * For certain types of errors Puppeteer uses specific error classes.
      * These classes are available via `puppeteer.errors`.
      *
      * @example
      * An example of handling a timeout error:
      * ```js
      * try {
      *   await page.waitForSelector('.foo');
      * } catch (e) {
      *   if (e instanceof puppeteer.errors.TimeoutError) {
      *     // Do something if this is a timeout.
      *   }
      * }
      * ```
      */
    def errors: PuppeteerErrors_ = js.native
    
    /**
      * Registers a {@link CustomQueryHandler | custom query handler}. After
      * registration, the handler can be used everywhere where a selector is
      * expected by prepending the selection string with `<name>/`. The name is
      * only allowed to consist of lower- and upper case latin letters.
      * @example
      * ```
      * puppeteer.registerCustomQueryHandler('text', { … });
      * const aHandle = await page.$('text/…');
      * ```
      * @param name - The name that the custom query handler will be registered under.
      * @param queryHandler - The {@link CustomQueryHandler | custom query handler} to
      * register.
      */
    def registerCustomQueryHandler(name: String, queryHandler: CustomQueryHandler): Unit = js.native
    
    /**
      * @param name - The name of the query handler to unregistered.
      */
    def unregisterCustomQueryHandler(name: String): Unit = js.native
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
       with BrowserOptions {
    
    var browserURL: js.UndefOr[String] = js.undefined
    
    var browserWSEndpoint: js.UndefOr[String] = js.undefined
    
    var product: js.UndefOr[Product] = js.undefined
    
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
      
      inline def setProduct(value: Product): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
      
      inline def setTransport(value: ConnectionTransport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    }
  }
}
