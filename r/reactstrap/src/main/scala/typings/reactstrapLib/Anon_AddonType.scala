package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddonType extends js.Object {
  var addonType: js.UndefOr[
    scala.Boolean | reactstrapLib.reactstrapLibStrings.prepend | reactstrapLib.reactstrapLibStrings.append
  ] = js.undefined
  var direction: js.UndefOr[reactstrapLib.libDropdownMod.Direction] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var group: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
}

object Anon_AddonType {
  @scala.inline
  def apply(
    addonType: scala.Boolean | reactstrapLib.reactstrapLibStrings.prepend | reactstrapLib.reactstrapLibStrings.append = null,
    direction: reactstrapLib.libDropdownMod.Direction = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    group: js.UndefOr[scala.Boolean] = js.undefined,
    size: java.lang.String = null,
    tag: reactLib.reactMod.ReactNs.ReactType[_] = null
  ): Anon_AddonType = {
    val __obj = js.Dynamic.literal()
    if (addonType != null) __obj.updateDynamic("addonType")(addonType.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(group)) __obj.updateDynamic("group")(group)
    if (size != null) __obj.updateDynamic("size")(size)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AddonType]
  }
}

