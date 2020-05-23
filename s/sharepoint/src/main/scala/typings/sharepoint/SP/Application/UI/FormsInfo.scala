package typings.sharepoint.SP.Application.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormsInfo extends js.Object {
  var ContentTypeName: String
  var DisplayFormUrl: String
  var EditFormUrl: String
  var NewFormUrl: String
}

object FormsInfo {
  @scala.inline
  def apply(ContentTypeName: String, DisplayFormUrl: String, EditFormUrl: String, NewFormUrl: String): FormsInfo = {
    val __obj = js.Dynamic.literal(ContentTypeName = ContentTypeName.asInstanceOf[js.Any], DisplayFormUrl = DisplayFormUrl.asInstanceOf[js.Any], EditFormUrl = EditFormUrl.asInstanceOf[js.Any], NewFormUrl = NewFormUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormsInfo]
  }
}

