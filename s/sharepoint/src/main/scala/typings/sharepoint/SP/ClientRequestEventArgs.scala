package typings.sharepoint.SP

import typings.microsoftAjax.Sys.EventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ClientRequestEventArgs")
@js.native
class ClientRequestEventArgs () extends EventArgs {
  def get_request(): ClientRequest = js.native
}

