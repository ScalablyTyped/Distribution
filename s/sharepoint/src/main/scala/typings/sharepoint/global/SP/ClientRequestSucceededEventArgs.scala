package typings.sharepoint.global.SP

import typings.microsoftAjax.Sys.EventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ClientRequestSucceededEventArgs")
@js.native
class ClientRequestSucceededEventArgs ()
  extends typings.sharepoint.SP.ClientRequestEventArgs {
  /**
    * An object of type EventArgs that is used as a convenient way to specify an empty EventArgs instance.
    */
  /* CompleteClass */
  override var Empty: EventArgs = js.native
  /* CompleteClass */
  override def get_request(): typings.sharepoint.SP.ClientRequest = js.native
}

