package typings.puppeteerCore

import org.scalablytyped.runtime.Shortcut
import typings.puppeteerCore.anon.QueryHandler
import typings.puppeteerCore.deviceDescriptorsMod.DevicesMap
import typings.puppeteerCore.errorsMod.PuppeteerErrors
import typings.puppeteerCore.networkManagerMod.NetworkConditions
import typings.puppeteerCore.puppeteerMod.ConnectOptions
import typings.puppeteerCore.puppeteerTypesMod.Browser
import typings.puppeteerCore.puppeteerTypesMod.PuppeteerNode
import typings.puppeteerCore.queryHandlerMod.CustomQueryHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object puppeteerPuppeteerMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/puppeteer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @public
    */
  @JSImport("puppeteer-core/lib/cjs/puppeteer/puppeteer", JSImport.Default)
  @js.native
  val default: PuppeteerNode = js.native
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/puppeteer", "CustomError")
  @js.native
  open class CustomError ()
    extends typings.puppeteerCore.errorsMod.CustomError {
    def this(message: String) = this()
  }
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/puppeteer", "ProtocolError")
  @js.native
  open class ProtocolError ()
    extends typings.puppeteerCore.errorsMod.ProtocolError {
    def this(message: String) = this()
  }
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/puppeteer", "TimeoutError")
  @js.native
  open class TimeoutError ()
    extends typings.puppeteerCore.errorsMod.TimeoutError {
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
  @JSImport("puppeteer-core/lib/cjs/puppeteer/puppeteer", "devices")
  @js.native
  val devices: DevicesMap = js.native
  
  object errors extends Shortcut {
    
    @JSImport("puppeteer-core/lib/cjs/puppeteer/puppeteer", "errors")
    @js.native
    val ^ : PuppeteerErrors = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("puppeteer-core/lib/cjs/puppeteer/puppeteer", "errors.ProtocolError")
    @js.native
    open class ProtocolErrorCls ()
      extends typings.puppeteerCore.errorsMod.ProtocolError
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("puppeteer-core/lib/cjs/puppeteer/puppeteer", "errors.TimeoutError")
    @js.native
    open class TimeoutErrorCls ()
      extends typings.puppeteerCore.errorsMod.TimeoutError
    
    type _To = PuppeteerErrors
    
    /* This means you don't have to write `^`, but can instead just say `errors.foo` */
    override def _to: PuppeteerErrors = ^
  }
  
  inline def getQueryHandlerAndSelector(selector: String): QueryHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueryHandlerAndSelector")(selector.asInstanceOf[js.Any]).asInstanceOf[QueryHandler]
  
  /* Inlined std.Readonly<{  Slow 3G :puppeteer-core.puppeteer-core/lib/cjs/puppeteer/common/NetworkManager.NetworkConditions,   Fast 3G :puppeteer-core.puppeteer-core/lib/cjs/puppeteer/common/NetworkManager.NetworkConditions}> */
  object networkConditions {
    
    @JSImport("puppeteer-core/lib/cjs/puppeteer/puppeteer", "networkConditions.Fast 3G")
    @js.native
    val Fast3G: NetworkConditions = js.native
    
    @JSImport("puppeteer-core/lib/cjs/puppeteer/puppeteer", "networkConditions.Slow 3G")
    @js.native
    val Slow3G: NetworkConditions = js.native
  }
  
  inline def registerCustomQueryHandler(name: String, handler: CustomQueryHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomQueryHandler")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unregisterCustomQueryHandler(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterCustomQueryHandler")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
