package typings.sharepoint.SP.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebPartComponentInitInfo extends js.Object {
  var allowWebPartAdder: Boolean
  var editable: Boolean
  var isEditMode: Boolean
}

object WebPartComponentInitInfo {
  @scala.inline
  def apply(allowWebPartAdder: Boolean, editable: Boolean, isEditMode: Boolean): WebPartComponentInitInfo = {
    val __obj = js.Dynamic.literal(allowWebPartAdder = allowWebPartAdder.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], isEditMode = isEditMode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebPartComponentInitInfo]
  }
}

