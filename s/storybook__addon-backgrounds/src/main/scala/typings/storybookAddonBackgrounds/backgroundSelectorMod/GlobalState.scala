package typings.storybookAddonBackgrounds.backgroundSelectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalState extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var selected: js.UndefOr[String] = js.undefined
}

object GlobalState {
  @scala.inline
  def apply(name: String = null, selected: String = null): GlobalState = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalState]
  }
}

