package typings.reactDashHooksDashHelper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Checked extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var name: String
  var `type`: js.UndefOr[String] = js.undefined
   // object property name or Dot separated when hierarchical
  var value: js.Any
}

object Anon_Checked {
  @scala.inline
  def apply(name: String, value: js.Any, checked: js.UndefOr[Boolean] = js.undefined, `type`: String = null): Anon_Checked = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Checked]
  }
}

