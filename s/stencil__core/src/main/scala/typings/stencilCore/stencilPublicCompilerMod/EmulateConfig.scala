package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmulateConfig extends StObject {
  
  /**
    * Predefined device descriptor name, such as "iPhone X" or "Nexus 10".
    * For a complete list please see: https://github.com/puppeteer/puppeteer/blob/main/src/common/DeviceDescriptors.ts
    */
  var device: js.UndefOr[String] = js.undefined
  
  /**
    * User-Agent to be used. Defaults to the user-agent of the installed Puppeteer version.
    */
  var userAgent: js.UndefOr[String] = js.undefined
  
  var viewport: js.UndefOr[EmulateViewport] = js.undefined
}
object EmulateConfig {
  
  inline def apply(): EmulateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmulateConfig]
  }
  
  extension [Self <: EmulateConfig](x: Self) {
    
    inline def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    
    inline def setViewport(value: EmulateViewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
  }
}
