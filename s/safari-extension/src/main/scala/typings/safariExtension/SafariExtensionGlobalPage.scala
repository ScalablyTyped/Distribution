package typings.safariExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafariExtensionGlobalPage extends StObject {
  
  var contentWindow: Window = js.native
}
object SafariExtensionGlobalPage {
  
  @scala.inline
  def apply(contentWindow: Window): SafariExtensionGlobalPage = {
    val __obj = js.Dynamic.literal(contentWindow = contentWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafariExtensionGlobalPage]
  }
  
  @scala.inline
  implicit class SafariExtensionGlobalPageMutableBuilder[Self <: SafariExtensionGlobalPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentWindow(value: Window): Self = StObject.set(x, "contentWindow", value.asInstanceOf[js.Any])
  }
}
