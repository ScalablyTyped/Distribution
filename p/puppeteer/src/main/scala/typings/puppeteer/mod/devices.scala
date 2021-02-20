package typings.puppeteer.mod

import typings.puppeteer.anon.DeviceScaleFactor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devices {
  
  @js.native
  trait Device extends StObject {
    
    var name: String = js.native
    
    var userAgent: String = js.native
    
    var viewport: DeviceScaleFactor = js.native
  }
  object Device {
    
    @scala.inline
    def apply(name: String, userAgent: String, viewport: DeviceScaleFactor): Device = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
      __obj.asInstanceOf[Device]
    }
    
    @scala.inline
    implicit class DeviceMutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewport(value: DeviceScaleFactor): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    }
  }
}
