package typings.protonDashNative.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stretchy extends js.Object {
  /**
    * Whether the component should stretch to fill the available space. Defaults to true.
    *
    * Excluded on:
    * - Tabs
    * - Grid children
    * - Combobox/RadioButton Items
    * - MenuBar
    */
  var stretchy: js.UndefOr[Boolean] = js.undefined
}

object Stretchy {
  @scala.inline
  def apply(stretchy: js.UndefOr[Boolean] = js.undefined): Stretchy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stretchy)) __obj.updateDynamic("stretchy")(stretchy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stretchy]
  }
}

