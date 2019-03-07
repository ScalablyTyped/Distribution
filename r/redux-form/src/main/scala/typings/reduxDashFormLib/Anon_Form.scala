package typings
package reduxDashFormLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Form extends js.Object {
  var form: java.lang.String
  var sectionPrefix: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Form {
  @scala.inline
  def apply(form: java.lang.String, sectionPrefix: java.lang.String = null): Anon_Form = {
    val __obj = js.Dynamic.literal(form = form)
    if (sectionPrefix != null) __obj.updateDynamic("sectionPrefix")(sectionPrefix)
    __obj.asInstanceOf[Anon_Form]
  }
}

