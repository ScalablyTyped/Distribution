package typings.sharepoint.CUI.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownCommandProperties extends js.Object {
  var SelectedItemId: String
  var Value: String
}

object DropDownCommandProperties {
  @scala.inline
  def apply(SelectedItemId: String, Value: String): DropDownCommandProperties = {
    val __obj = js.Dynamic.literal(SelectedItemId = SelectedItemId.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownCommandProperties]
  }
}

