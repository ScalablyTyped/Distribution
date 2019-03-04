package typings
package sqlDashTemplateLib.sqlDashTemplateMod.SQLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fragment extends js.Object {
  var raw: java.lang.String
  var text: java.lang.String
  var values: js.UndefOr[js.Array[_]] = js.undefined
}

object Fragment {
  @scala.inline
  def apply(raw: java.lang.String, text: java.lang.String, values: js.Array[_] = null): Fragment = {
    val __obj = js.Dynamic.literal(raw = raw, text = text)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[Fragment]
  }
}

