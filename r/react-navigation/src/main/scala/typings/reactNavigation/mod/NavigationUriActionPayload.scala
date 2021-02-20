package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationUriActionPayload extends StObject {
  
  var uri: String = js.native
}
object NavigationUriActionPayload {
  
  @scala.inline
  def apply(uri: String): NavigationUriActionPayload = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationUriActionPayload]
  }
  
  @scala.inline
  implicit class NavigationUriActionPayloadMutableBuilder[Self <: NavigationUriActionPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
