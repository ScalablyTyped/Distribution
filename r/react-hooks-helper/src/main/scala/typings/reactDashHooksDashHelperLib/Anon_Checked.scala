package typings
package reactDashHooksDashHelperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Checked extends js.Object {
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
  var `type`: js.UndefOr[java.lang.String] = js.undefined
   // object property name or Dot separated when hierarchical
  var value: js.Any
}

object Anon_Checked {
  @scala.inline
  def apply(
    name: java.lang.String,
    value: js.Any,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null
  ): Anon_Checked = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Checked]
  }
}

