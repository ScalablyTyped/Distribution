package typings
package atStorybookAddonDashBackgroundsLib.atStorybookAddonDashBackgroundsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Background extends js.Object {
  var default: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
  var value: java.lang.String
}

object Background {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String, default: js.UndefOr[scala.Boolean] = js.undefined): Background = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[Background]
  }
}

