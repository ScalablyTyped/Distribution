package typings.puppeteerCore

import org.scalablytyped.runtime.StringDictionary
import typings.puppeteerCore.anon.DeviceScaleFactor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceDescriptorsMod {
  
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
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/DeviceDescriptors", "devices")
  @js.native
  val devices: DevicesMap = js.native
  
  trait Device extends StObject {
    
    var name: String
    
    var userAgent: String
    
    var viewport: DeviceScaleFactor
  }
  object Device {
    
    inline def apply(name: String, userAgent: String, viewport: DeviceScaleFactor): Device = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
      __obj.asInstanceOf[Device]
    }
    
    extension [Self <: Device](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setViewport(value: DeviceScaleFactor): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    }
  }
  
  type DevicesMap = StringDictionary[Device]
}
