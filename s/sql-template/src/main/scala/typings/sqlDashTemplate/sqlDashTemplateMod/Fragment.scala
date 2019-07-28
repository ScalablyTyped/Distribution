package typings.sqlDashTemplate.sqlDashTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fragment extends js.Object {
  var raw: String
  var text: String
  var values: js.UndefOr[js.Array[_]] = js.undefined
}

object Fragment {
  @scala.inline
  def apply(raw: String, text: String, values: js.Array[_] = null): Fragment = {
    val __obj = js.Dynamic.literal(raw = raw, text = text)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[Fragment]
  }
}

