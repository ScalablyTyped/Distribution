package typings.sharepoint.global.SP

import typings.microsoftAjax.Sys.EventArgs
import typings.microsoftAjax.Sys.Net.WebRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.WebRequestEventArgs")
@js.native
class WebRequestEventArgs protected ()
  extends typings.sharepoint.SP.WebRequestEventArgs {
  def this(webRequest: WebRequest) = this()
  /**
    * An object of type EventArgs that is used as a convenient way to specify an empty EventArgs instance.
    */
  /* CompleteClass */
  override var Empty: EventArgs = js.native
  /* CompleteClass */
  override def get_webRequest(): WebRequest = js.native
}

