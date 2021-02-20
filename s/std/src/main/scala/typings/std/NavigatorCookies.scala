package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigatorCookies extends StObject {
  
  val cookieEnabled: scala.Boolean = js.native
}
object NavigatorCookies {
  
  @scala.inline
  def apply(cookieEnabled: scala.Boolean): NavigatorCookies = {
    val __obj = js.Dynamic.literal(cookieEnabled = cookieEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorCookies]
  }
  
  @scala.inline
  implicit class NavigatorCookiesMutableBuilder[Self <: NavigatorCookies] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCookieEnabled(value: scala.Boolean): Self = StObject.set(x, "cookieEnabled", value.asInstanceOf[js.Any])
  }
}
