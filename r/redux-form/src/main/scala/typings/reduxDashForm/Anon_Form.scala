package typings.reduxDashForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Form extends js.Object {
  var form: String
  var sectionPrefix: js.UndefOr[String] = js.undefined
}

object Anon_Form {
  @scala.inline
  def apply(form: String, sectionPrefix: String = null): Anon_Form = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any])
    if (sectionPrefix != null) __obj.updateDynamic("sectionPrefix")(sectionPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Form]
  }
}

