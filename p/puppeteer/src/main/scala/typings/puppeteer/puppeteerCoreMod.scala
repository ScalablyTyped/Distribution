package typings.puppeteer

import org.scalablytyped.runtime.Shortcut
import typings.puppeteer.anon.QueryHandler
import typings.puppeteer.deviceDescriptorsMod.DevicesMap
import typings.puppeteer.errorsMod.PuppeteerErrors
import typings.puppeteer.networkManagerMod.NetworkConditions
import typings.puppeteer.puppeteerMod.ConnectOptions
import typings.puppeteer.puppeteerTypesMod.Browser
import typings.puppeteer.puppeteerTypesMod.PuppeteerNode
import typings.puppeteer.queryHandlerMod.CustomQueryHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object puppeteerCoreMod {
  
  @JSImport("puppeteer/lib/cjs/puppeteer/puppeteer-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("puppeteer/lib/cjs/puppeteer/puppeteer-core", JSImport.Default)
  @js.native
  val default: PuppeteerNode = js.native
  
  @JSImport("puppeteer/lib/cjs/puppeteer/puppeteer-core", "CustomError")
  @js.native
  open class CustomError ()
    extends typings.puppeteer.errorsMod.CustomError {
    def this(message: String) = this()
  }
  
  @JSImport("puppeteer/lib/cjs/puppeteer/puppeteer-core", "ProtocolError")
  @js.native
  open class ProtocolError ()
    extends typings.puppeteer.errorsMod.ProtocolError {
    def this(message: String) = this()
  }
  
  @JSImport("puppeteer/lib/cjs/puppeteer/puppeteer-core", "TimeoutError")
  @js.native
  open class TimeoutError ()
    extends typings.puppeteer.errorsMod.TimeoutError {
    def this(message: String) = this()
  }
  
  inline def clearCustomQueryHandlers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCustomQueryHandlers")().asInstanceOf[Unit]
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(createBrowserFetcher, defaultArgs, executablePath, launch) */ inline def connect(options: ConnectOptions): js.Promise[Browser] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Browser]]
  
  inline def customQueryHandlerNames(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("customQueryHandlerNames")().asInstanceOf[js.Array[String]]
  
  /**
    * A list of devices to be used with `page.emulate(options)`. Actual list of devices can be found in {@link https://github.com/puppeteer/puppeteer/blob/main/src/common/DeviceDescriptors.ts | src/common/DeviceDescriptors.ts}.
    *
    * @example
    *
    * ```ts
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
    * @public
    */
  @JSImport("puppeteer/lib/cjs/puppeteer/puppeteer-core", "devices")
  @js.native
  val devices: DevicesMap = js.native
  
  object errors extends Shortcut {
    
    @JSImport("puppeteer/lib/cjs/puppeteer/puppeteer-core", "errors")
    @js.native
    val ^ : PuppeteerErrors = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("puppeteer/lib/cjs/puppeteer/puppeteer-core", "errors.ProtocolError")
    @js.native
    open class ProtocolErrorCls ()
      extends typings.puppeteer.errorsMod.ProtocolError
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("puppeteer/lib/cjs/puppeteer/puppeteer-core", "errors.TimeoutError")
    @js.native
    open class TimeoutErrorCls ()
      extends typings.puppeteer.errorsMod.TimeoutError
    
    type _To = PuppeteerErrors
    
    /* This means you don't have to write `^`, but can instead just say `errors.foo` */
    override def _to: PuppeteerErrors = ^
  }
  
  inline def getQueryHandlerAndSelector(selector: String): QueryHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueryHandlerAndSelector")(selector.asInstanceOf[js.Any]).asInstanceOf[QueryHandler]
  
  /* Inlined std.Readonly<{  Slow 3G :puppeteer.puppeteer/lib/cjs/puppeteer/common/NetworkManager.NetworkConditions,   Fast 3G :puppeteer.puppeteer/lib/cjs/puppeteer/common/NetworkManager.NetworkConditions}> */
  object networkConditions {
    
    @JSImport("puppeteer/lib/cjs/puppeteer/puppeteer-core", "networkConditions.Fast 3G")
    @js.native
    val Fast3G: NetworkConditions = js.native
    
    @JSImport("puppeteer/lib/cjs/puppeteer/puppeteer-core", "networkConditions.Slow 3G")
    @js.native
    val Slow3G: NetworkConditions = js.native
  }
  
  inline def registerCustomQueryHandler(name: String, handler: CustomQueryHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomQueryHandler")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unregisterCustomQueryHandler(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterCustomQueryHandler")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
