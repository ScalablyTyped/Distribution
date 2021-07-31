package typings.rcMenu.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blackberry extends StObject {
  
  var blackberry: js.Any
  
  var blackberry10: js.Any
  
  var chrome: js.Any
  
  var device: js.Any
  
  var firefox: js.Any
  
  var opera: js.Any
}
object Blackberry {
  
  @scala.inline
  def apply(
    blackberry: js.Any,
    blackberry10: js.Any,
    chrome: js.Any,
    device: js.Any,
    firefox: js.Any,
    opera: js.Any
  ): Blackberry = {
    val __obj = js.Dynamic.literal(blackberry = blackberry.asInstanceOf[js.Any], blackberry10 = blackberry10.asInstanceOf[js.Any], chrome = chrome.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], firefox = firefox.asInstanceOf[js.Any], opera = opera.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blackberry]
  }
  
  @scala.inline
  implicit class BlackberryMutableBuilder[Self <: Blackberry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlackberry(value: js.Any): Self = StObject.set(x, "blackberry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlackberry10(value: js.Any): Self = StObject.set(x, "blackberry10", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChrome(value: js.Any): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice(value: js.Any): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirefox(value: js.Any): Self = StObject.set(x, "firefox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpera(value: js.Any): Self = StObject.set(x, "opera", value.asInstanceOf[js.Any])
  }
}
