package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IEventArgs
import typings.sharepoint.SP.Utilities.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordChecked extends IEventArgs {
  var bChecked: Boolean
  var recordKeySet: Set
}

object RecordChecked {
  @scala.inline
  def apply(bChecked: Boolean, recordKeySet: Set): RecordChecked = {
    val __obj = js.Dynamic.literal(bChecked = bChecked.asInstanceOf[js.Any], recordKeySet = recordKeySet.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordChecked]
  }
}

