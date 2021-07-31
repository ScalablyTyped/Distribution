package typings.sharepoint.global.SP

import typings.microsoftAjax.Sys.EventArgs
import typings.microsoftAjax.Sys.Net.WebRequestExecutor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.PageRequestFailedEventArgs")
@js.native
class PageRequestFailedEventArgs ()
  extends StObject
     with typings.sharepoint.SP.PageRequestFailedEventArgs {
  
  /**
    * An object of type EventArgs that is used as a convenient way to specify an empty EventArgs instance.
    */
  /* CompleteClass */
  var Empty: EventArgs = js.native
  
  /* CompleteClass */
  override def get_errorMessage(): String = js.native
  
  /* CompleteClass */
  override def get_executor(): WebRequestExecutor = js.native
  
  /* CompleteClass */
  override def get_isErrorPage(): Boolean = js.native
}
