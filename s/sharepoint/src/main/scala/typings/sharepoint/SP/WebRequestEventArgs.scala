package typings.sharepoint.SP

import typings.microsoftAjax.Sys.EventArgs
import typings.microsoftAjax.Sys.Net.WebRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebRequestEventArgs
  extends StObject
     with EventArgs {
  
  def get_webRequest(): WebRequest
}
object WebRequestEventArgs {
  
  inline def apply(Empty: EventArgs, get_webRequest: () => WebRequest): WebRequestEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_webRequest = js.Any.fromFunction0(get_webRequest))
    __obj.asInstanceOf[WebRequestEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebRequestEventArgs] (val x: Self) extends AnyVal {
    
    inline def setGet_webRequest(value: () => WebRequest): Self = StObject.set(x, "get_webRequest", js.Any.fromFunction0(value))
  }
}
