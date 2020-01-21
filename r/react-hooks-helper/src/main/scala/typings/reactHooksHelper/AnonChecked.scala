package typings.reactHooksHelper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChecked extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var name: String
  var `type`: js.UndefOr[String] = js.undefined
   // object property name or Dot separated when hierarchical
  var value: js.Any
}

object AnonChecked {
  @scala.inline
  def apply(name: String, value: js.Any, checked: js.UndefOr[Boolean] = js.undefined, `type`: String = null): AnonChecked = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChecked]
  }
}

