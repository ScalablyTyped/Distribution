package typings.recurlyRecurlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientAuthorization extends StObject {
  
  var clientAuthorization: String
}
object ClientAuthorization {
  
  inline def apply(clientAuthorization: String): ClientAuthorization = {
    val __obj = js.Dynamic.literal(clientAuthorization = clientAuthorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientAuthorization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientAuthorization] (val x: Self) extends AnyVal {
    
    inline def setClientAuthorization(value: String): Self = StObject.set(x, "clientAuthorization", value.asInstanceOf[js.Any])
  }
}
