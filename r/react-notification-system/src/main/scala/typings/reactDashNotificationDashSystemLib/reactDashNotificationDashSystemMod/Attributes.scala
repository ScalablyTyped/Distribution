package typings
package reactDashNotificationDashSystemLib.reactDashNotificationDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes
  extends reactLib.reactMod.ClassAttributes[System] {
  var allowHTML: js.UndefOr[scala.Boolean] = js.undefined
  var noAnimation: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[Style | scala.Boolean] = js.undefined
}

object Attributes {
  @scala.inline
  def apply(
    allowHTML: js.UndefOr[scala.Boolean] = js.undefined,
    key: reactLib.reactMod.Key = null,
    noAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    ref: reactLib.reactMod.LegacyRef[System] = null,
    style: Style | scala.Boolean = null
  ): Attributes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHTML)) __obj.updateDynamic("allowHTML")(allowHTML)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(noAnimation)) __obj.updateDynamic("noAnimation")(noAnimation)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
}

