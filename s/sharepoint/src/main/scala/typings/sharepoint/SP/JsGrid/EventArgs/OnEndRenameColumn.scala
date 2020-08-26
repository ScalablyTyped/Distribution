package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnEndRenameColumn extends IEventArgs {
  var columnKey: String = js.native
  var newColumnTitle: String = js.native
  var originalColumnTitle: String = js.native
}

object OnEndRenameColumn {
  @scala.inline
  def apply(columnKey: String, newColumnTitle: String, originalColumnTitle: String): OnEndRenameColumn = {
    val __obj = js.Dynamic.literal(columnKey = columnKey.asInstanceOf[js.Any], newColumnTitle = newColumnTitle.asInstanceOf[js.Any], originalColumnTitle = originalColumnTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnEndRenameColumn]
  }
  @scala.inline
  implicit class OnEndRenameColumnOps[Self <: OnEndRenameColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColumnKey(value: String): Self = this.set("columnKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewColumnTitle(value: String): Self = this.set("newColumnTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalColumnTitle(value: String): Self = this.set("originalColumnTitle", value.asInstanceOf[js.Any])
  }
  
}

