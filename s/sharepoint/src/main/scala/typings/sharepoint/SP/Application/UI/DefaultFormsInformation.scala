package typings.sharepoint.SP.Application.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultFormsInformation extends js.Object {
  var DefaultForms: FormsInfo
  var OtherForms: js.Any
}

object DefaultFormsInformation {
  @scala.inline
  def apply(DefaultForms: FormsInfo, OtherForms: js.Any): DefaultFormsInformation = {
    val __obj = js.Dynamic.literal(DefaultForms = DefaultForms.asInstanceOf[js.Any], OtherForms = OtherForms.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultFormsInformation]
  }
}

