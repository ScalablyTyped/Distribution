package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnEndRenameColumn extends IEventArgs {
  var columnKey: String
  var newColumnTitle: String
  var originalColumnTitle: String
}

object OnEndRenameColumn {
  @scala.inline
  def apply(columnKey: String, newColumnTitle: String, originalColumnTitle: String): OnEndRenameColumn = {
    val __obj = js.Dynamic.literal(columnKey = columnKey.asInstanceOf[js.Any], newColumnTitle = newColumnTitle.asInstanceOf[js.Any], originalColumnTitle = originalColumnTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnEndRenameColumn]
  }
}

