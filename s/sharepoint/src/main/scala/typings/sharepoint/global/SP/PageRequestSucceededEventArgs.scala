package typings.sharepoint.global.SP

import typings.microsoftAjax.Sys.EventArgs
import typings.microsoftAjax.Sys.Net.WebRequestExecutor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.PageRequestSucceededEventArgs")
@js.native
class PageRequestSucceededEventArgs ()
  extends typings.sharepoint.SP.PageRequestSucceededEventArgs {
  /**
    * An object of type EventArgs that is used as a convenient way to specify an empty EventArgs instance.
    */
  /* CompleteClass */
  override var Empty: EventArgs = js.native
  /* CompleteClass */
  override def get_executor(): WebRequestExecutor = js.native
}

