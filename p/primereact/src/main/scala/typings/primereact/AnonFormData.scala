package typings.primereact

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormData extends js.Object {
  var formData: js.Any
  var xhr: XMLHttpRequest
}

object AnonFormData {
  @scala.inline
  def apply(formData: js.Any, xhr: XMLHttpRequest): AnonFormData = {
    val __obj = js.Dynamic.literal(formData = formData.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormData]
  }
}

