package typings.sharepoint.SP

import typings.microsoftAjax.Sys.EventArgs
import typings.microsoftAjax.Sys.Net.WebRequestExecutor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageRequestFailedEventArgs
  extends StObject
     with EventArgs {
  
  def get_errorMessage(): String
  
  def get_executor(): WebRequestExecutor
  
  def get_isErrorPage(): Boolean
}
object PageRequestFailedEventArgs {
  
  inline def apply(
    Empty: EventArgs,
    get_errorMessage: () => String,
    get_executor: () => WebRequestExecutor,
    get_isErrorPage: () => Boolean
  ): PageRequestFailedEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_errorMessage = js.Any.fromFunction0(get_errorMessage), get_executor = js.Any.fromFunction0(get_executor), get_isErrorPage = js.Any.fromFunction0(get_isErrorPage))
    __obj.asInstanceOf[PageRequestFailedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageRequestFailedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setGet_errorMessage(value: () => String): Self = StObject.set(x, "get_errorMessage", js.Any.fromFunction0(value))
    
    inline def setGet_executor(value: () => WebRequestExecutor): Self = StObject.set(x, "get_executor", js.Any.fromFunction0(value))
    
    inline def setGet_isErrorPage(value: () => Boolean): Self = StObject.set(x, "get_isErrorPage", js.Any.fromFunction0(value))
  }
}
