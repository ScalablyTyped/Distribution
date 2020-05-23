package typings.reactOnsenui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifiersNumber extends js.Object {
  var default: js.UndefOr[Double] = js.undefined
  var material: js.UndefOr[Double] = js.undefined
}

object ModifiersNumber {
  @scala.inline
  def apply(default: js.UndefOr[Double] = js.undefined, material: js.UndefOr[Double] = js.undefined): ModifiersNumber = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.get.asInstanceOf[js.Any])
    if (!js.isUndefined(material)) __obj.updateDynamic("material")(material.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifiersNumber]
  }
}

