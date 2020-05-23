package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridErrorStateChanged extends IEventArgs {
  var bAnyErrors: Boolean
}

object GridErrorStateChanged {
  @scala.inline
  def apply(bAnyErrors: Boolean): GridErrorStateChanged = {
    val __obj = js.Dynamic.literal(bAnyErrors = bAnyErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridErrorStateChanged]
  }
}

