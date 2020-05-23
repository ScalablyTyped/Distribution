package typings.reduxForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Form extends js.Object {
  var form: String
  var sectionPrefix: js.UndefOr[String] = js.undefined
}

object Form {
  @scala.inline
  def apply(form: String, sectionPrefix: String = null): Form = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any])
    if (sectionPrefix != null) __obj.updateDynamic("sectionPrefix")(sectionPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Form]
  }
}

