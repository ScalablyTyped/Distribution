package typings.puppeteer

import typings.puppeteer.anon.ReadonlySlow3GNetworkCond
import typings.puppeteer.browserConnectorMod.BrowserConnectOptions
import typings.puppeteer.browserMod.Browser
import typings.puppeteer.connectionTransportMod.ConnectionTransport
import typings.puppeteer.deviceDescriptorsMod.DevicesMap
import typings.puppeteer.errorsMod.PuppeteerErrors
import typings.puppeteer.queryHandlerMod.CustomQueryHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object puppeteerMod {
  
  @JSImport("puppeteer/lib/cjs/puppeteer/common/Puppeteer", "Puppeteer")
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
    /* protected */ var _isPuppeteerCore: Boolean = js.native
    
    /**
      * @deprecated Import directly puppeteer.
      * @example
      *
      * ```ts
      * import {clearCustomQueryHandlers} from 'puppeteer';
      * ```
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
      * @deprecated Import directly puppeteer.
      * @example
      *
      * ```ts
      * import {customQueryHandlerNames} from 'puppeteer';
      * ```
      */
    def customQueryHandlerNames(): js.Array[String] = js.native
    
    /**
      * @deprecated Import directly puppeteer.
      * @example
      *
      * ```ts
      * import {devices} from 'puppeteer';
      * ```
      */
    def devices: DevicesMap = js.native
    
    /**
      * @deprecated Import directly puppeteer.
      * @example
      *
      * ```ts
      * import {errors} from 'puppeteer';
      * ```
      */
    def errors: PuppeteerErrors = js.native
    
    /**
      * @deprecated Import directly puppeteer.
      * @example
      *
      * ```ts
      * import {networkConditions} from 'puppeteer';
      * ```
      */
    def networkConditions: ReadonlySlow3GNetworkCond = js.native
    
    /**
      * @deprecated Import directly puppeteer.
      * @example
      *
      * ```ts
      * import {registerCustomQueryHandler} from 'puppeteer';
      * ```
      */
    def registerCustomQueryHandler(name: String, queryHandler: CustomQueryHandler): Unit = js.native
    
    /**
      * @deprecated Import directly puppeteer.
      * @example
      *
      * ```ts
      * import {unregisterCustomQueryHandler} from 'puppeteer';
      * ```
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
