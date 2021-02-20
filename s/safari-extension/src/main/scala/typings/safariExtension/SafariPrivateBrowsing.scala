package typings.safariExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafariPrivateBrowsing extends StObject {
  
  var enabled: Boolean = js.native
}
object SafariPrivateBrowsing {
  
  @scala.inline
  def apply(enabled: Boolean): SafariPrivateBrowsing = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafariPrivateBrowsing]
  }
  
  @scala.inline
  implicit class SafariPrivateBrowsingMutableBuilder[Self <: SafariPrivateBrowsing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
