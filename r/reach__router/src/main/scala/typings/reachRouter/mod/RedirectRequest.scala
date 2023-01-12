package typings.reachRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedirectRequest extends StObject {
  
  var uri: String
}
object RedirectRequest {
  
  inline def apply(uri: String): RedirectRequest = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RedirectRequest] (val x: Self) extends AnyVal {
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
