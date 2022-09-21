package typings.puppeteerCore.mod

import typings.puppeteerCore.anon.ReadonlySlow3GNetworkCondSlow3G
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core", "Puppeteer")
@js.native
open class Puppeteer () extends StObject {
  
  /**
    * @deprecated Import directly puppeteer.
    * @example
    *
    * ```ts
    * import {clearCustomQueryHandlers} from 'puppeteer';
    * ```
    */
  def clearCustomQueryHandlers(): Unit = js.native
  
  /* Excluded from this release type: _isPuppeteerCore */
  /* Excluded from this release type: _changedProduct */
  /* Excluded from this release type: __constructor */
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
  def networkConditions: ReadonlySlow3GNetworkCondSlow3G = js.native
  
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
