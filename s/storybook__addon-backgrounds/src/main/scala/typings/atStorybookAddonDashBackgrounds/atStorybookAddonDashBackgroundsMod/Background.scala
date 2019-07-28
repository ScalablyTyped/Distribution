package typings.atStorybookAddonDashBackgrounds.atStorybookAddonDashBackgroundsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Background extends js.Object {
  var default: js.UndefOr[Boolean] = js.undefined
  var name: String
  var value: String
}

object Background {
  @scala.inline
  def apply(name: String, value: String, default: js.UndefOr[Boolean] = js.undefined): Background = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[Background]
  }
}

