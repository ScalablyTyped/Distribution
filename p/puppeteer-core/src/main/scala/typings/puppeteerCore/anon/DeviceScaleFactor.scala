package typings.puppeteerCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceScaleFactor extends StObject {
  
  var deviceScaleFactor: Double
  
  var hasTouch: Boolean
  
  var height: Double
  
  var isLandscape: Boolean
  
  var isMobile: Boolean
  
  var width: Double
}
object DeviceScaleFactor {
  
  @scala.inline
  def apply(
    deviceScaleFactor: Double,
    hasTouch: Boolean,
    height: Double,
    isLandscape: Boolean,
    isMobile: Boolean,
    width: Double
  ): DeviceScaleFactor = {
    val __obj = js.Dynamic.literal(deviceScaleFactor = deviceScaleFactor.asInstanceOf[js.Any], hasTouch = hasTouch.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isLandscape = isLandscape.asInstanceOf[js.Any], isMobile = isMobile.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceScaleFactor]
  }
  
  @scala.inline
  implicit class DeviceScaleFactorMutableBuilder[Self <: DeviceScaleFactor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceScaleFactor(value: Double): Self = StObject.set(x, "deviceScaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasTouch(value: Boolean): Self = StObject.set(x, "hasTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLandscape(value: Boolean): Self = StObject.set(x, "isLandscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
