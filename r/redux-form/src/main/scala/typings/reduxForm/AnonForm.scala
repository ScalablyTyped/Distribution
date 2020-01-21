package typings.reduxForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForm extends js.Object {
  var form: String
  var sectionPrefix: js.UndefOr[String] = js.undefined
}

object AnonForm {
  @scala.inline
  def apply(form: String, sectionPrefix: String = null): AnonForm = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any])
    if (sectionPrefix != null) __obj.updateDynamic("sectionPrefix")(sectionPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForm]
  }
}

