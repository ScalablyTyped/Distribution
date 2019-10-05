package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.GridErrorStateChanged")
@js.native
class GridErrorStateChanged protected () extends IEventArgs {
  def this(bAnyErrors: Boolean) = this()
  var bAnyErrors: Boolean = js.native
}

