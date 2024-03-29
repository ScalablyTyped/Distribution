package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationUriActionPayload extends StObject {
  
  var uri: String
}
object NavigationUriActionPayload {
  
  inline def apply(uri: String): NavigationUriActionPayload = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationUriActionPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationUriActionPayload] (val x: Self) extends AnyVal {
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
