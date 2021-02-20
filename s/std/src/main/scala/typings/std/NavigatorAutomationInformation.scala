package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigatorAutomationInformation extends StObject {
  
  val webdriver: scala.Boolean = js.native
}
object NavigatorAutomationInformation {
  
  @scala.inline
  def apply(webdriver: scala.Boolean): NavigatorAutomationInformation = {
    val __obj = js.Dynamic.literal(webdriver = webdriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorAutomationInformation]
  }
  
  @scala.inline
  implicit class NavigatorAutomationInformationMutableBuilder[Self <: NavigatorAutomationInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWebdriver(value: scala.Boolean): Self = StObject.set(x, "webdriver", value.asInstanceOf[js.Any])
  }
}
