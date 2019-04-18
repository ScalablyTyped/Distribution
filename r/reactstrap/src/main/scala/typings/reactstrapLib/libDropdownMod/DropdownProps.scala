package typings
package reactstrapLib.libDropdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownProps extends UncontrolledDropdownProps {
  var addonType: js.UndefOr[
    scala.Boolean | reactstrapLib.reactstrapLibStrings.prepend | reactstrapLib.reactstrapLibStrings.append
  ] = js.undefined
  var direction: js.UndefOr[Direction] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var group: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
}

object DropdownProps {
  @scala.inline
  def apply(
    UncontrolledDropdownProps: UncontrolledDropdownProps = null,
    addonType: scala.Boolean | reactstrapLib.reactstrapLibStrings.prepend | reactstrapLib.reactstrapLibStrings.append = null,
    direction: Direction = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    group: js.UndefOr[scala.Boolean] = js.undefined,
    size: java.lang.String = null,
    tag: reactLib.reactMod.ReactType[_] = null
  ): DropdownProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, UncontrolledDropdownProps)
    if (addonType != null) __obj.updateDynamic("addonType")(addonType.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(group)) __obj.updateDynamic("group")(group)
    if (size != null) __obj.updateDynamic("size")(size)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownProps]
  }
}

