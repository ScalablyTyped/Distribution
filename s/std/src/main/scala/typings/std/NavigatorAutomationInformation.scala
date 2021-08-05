package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigatorAutomationInformation extends StObject {
  
  val webdriver: scala.Boolean
}
object NavigatorAutomationInformation {
  
  inline def apply(webdriver: scala.Boolean): NavigatorAutomationInformation = {
    val __obj = js.Dynamic.literal(webdriver = webdriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorAutomationInformation]
  }
  
  extension [Self <: NavigatorAutomationInformation](x: Self) {
    
    inline def setWebdriver(value: scala.Boolean): Self = StObject.set(x, "webdriver", value.asInstanceOf[js.Any])
  }
}
