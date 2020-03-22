package typings.rcPicker.interfaceMod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Components extends js.Object {
  var button: js.UndefOr[ComponentType[js.Object] | String] = js.undefined
  var rangeItem: js.UndefOr[ComponentType[js.Object] | String] = js.undefined
}

object Components {
  @scala.inline
  def apply(
    button: ComponentType[js.Object] | String = null,
    rangeItem: ComponentType[js.Object] | String = null
  ): Components = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (rangeItem != null) __obj.updateDynamic("rangeItem")(rangeItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Components]
  }
}

