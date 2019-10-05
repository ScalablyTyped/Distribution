package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.VacateChange")
@js.native
class VacateChange protected () extends IEventArgs {
  def this(changeKey: IChangeKey) = this()
  var changeKey: IChangeKey = js.native
}

