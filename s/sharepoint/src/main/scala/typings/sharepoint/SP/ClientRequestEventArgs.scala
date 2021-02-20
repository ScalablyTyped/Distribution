package typings.sharepoint.SP

import typings.microsoftAjax.Sys.EventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientRequestEventArgs extends EventArgs {
  
  def get_request(): ClientRequest = js.native
}
object ClientRequestEventArgs {
  
  @scala.inline
  def apply(Empty: EventArgs, get_request: () => ClientRequest): ClientRequestEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_request = js.Any.fromFunction0(get_request))
    __obj.asInstanceOf[ClientRequestEventArgs]
  }
  
  @scala.inline
  implicit class ClientRequestEventArgsMutableBuilder[Self <: ClientRequestEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_request(value: () => ClientRequest): Self = StObject.set(x, "get_request", js.Any.fromFunction0(value))
  }
}
