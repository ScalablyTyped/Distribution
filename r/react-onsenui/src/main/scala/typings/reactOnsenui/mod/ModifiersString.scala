package typings.reactOnsenui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifiersString extends js.Object {
  var default: js.UndefOr[String] = js.undefined
  var material: js.UndefOr[String] = js.undefined
}

object ModifiersString {
  @scala.inline
  def apply(default: String = null, material: String = null): ModifiersString = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifiersString]
  }
}

