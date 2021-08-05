package typings.sharepoint.SP

import typings.microsoftAjax.Sys.EventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientRequestEventArgs
  extends StObject
     with EventArgs {
  
  def get_request(): ClientRequest
}
object ClientRequestEventArgs {
  
  inline def apply(Empty: EventArgs, get_request: () => ClientRequest): ClientRequestEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_request = js.Any.fromFunction0(get_request))
    __obj.asInstanceOf[ClientRequestEventArgs]
  }
  
  extension [Self <: ClientRequestEventArgs](x: Self) {
    
    inline def setGet_request(value: () => ClientRequest): Self = StObject.set(x, "get_request", js.Any.fromFunction0(value))
  }
}
