package typings.sharepoint.global.CUI

import typings.microsoftAjax.Sys.EventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CUI.CommandEventArgs")
@js.native
class CommandEventArgs protected () extends EventArgs {
  def this(id: js.Any, `type`: typings.sharepoint.CUI.CommandType, source: js.Any, pars: js.Any) = this()
  /**
    * An object of type EventArgs that is used as a convenient way to specify an empty EventArgs instance.
    */
  /* CompleteClass */
  override var Empty: EventArgs = js.native
}

