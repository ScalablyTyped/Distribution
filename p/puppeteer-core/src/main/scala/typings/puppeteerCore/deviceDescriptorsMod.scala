package typings.puppeteerCore

import org.scalablytyped.runtime.StringDictionary
import typings.puppeteerCore.anon.DeviceScaleFactor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceDescriptorsMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/DeviceDescriptors", "devicesMap")
  @js.native
  val devicesMap: DevicesMap_ = js.native
  
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
  
  type DevicesMap_ = StringDictionary[Device]
}
