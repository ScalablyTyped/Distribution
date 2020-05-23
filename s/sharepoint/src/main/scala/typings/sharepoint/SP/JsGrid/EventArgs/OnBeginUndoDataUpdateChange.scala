package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBeginUndoDataUpdateChange extends IEventArgs {
  var changeKey: IChangeKey
}

object OnBeginUndoDataUpdateChange {
  @scala.inline
  def apply(changeKey: IChangeKey): OnBeginUndoDataUpdateChange = {
    val __obj = js.Dynamic.literal(changeKey = changeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBeginUndoDataUpdateChange]
  }
}

