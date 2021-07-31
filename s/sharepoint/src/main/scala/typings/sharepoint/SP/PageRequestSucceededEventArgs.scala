package typings.sharepoint.SP

import typings.microsoftAjax.Sys.EventArgs
import typings.microsoftAjax.Sys.Net.WebRequestExecutor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageRequestSucceededEventArgs
  extends StObject
     with EventArgs {
  
  def get_executor(): WebRequestExecutor
}
object PageRequestSucceededEventArgs {
  
  @scala.inline
  def apply(Empty: EventArgs, get_executor: () => WebRequestExecutor): PageRequestSucceededEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_executor = js.Any.fromFunction0(get_executor))
    __obj.asInstanceOf[PageRequestSucceededEventArgs]
  }
  
  @scala.inline
  implicit class PageRequestSucceededEventArgsMutableBuilder[Self <: PageRequestSucceededEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_executor(value: () => WebRequestExecutor): Self = StObject.set(x, "get_executor", js.Any.fromFunction0(value))
  }
}
