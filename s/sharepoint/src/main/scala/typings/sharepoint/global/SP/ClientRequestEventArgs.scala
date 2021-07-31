package typings.sharepoint.global.SP

import typings.microsoftAjax.Sys.EventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.ClientRequestEventArgs")
@js.native
class ClientRequestEventArgs ()
  extends StObject
     with typings.sharepoint.SP.ClientRequestEventArgs {
  
  /**
    * An object of type EventArgs that is used as a convenient way to specify an empty EventArgs instance.
    */
  /* CompleteClass */
  var Empty: EventArgs = js.native
  
  /* CompleteClass */
  override def get_request(): typings.sharepoint.SP.ClientRequest = js.native
}
