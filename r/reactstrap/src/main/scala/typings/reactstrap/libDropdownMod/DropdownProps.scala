package typings.reactstrap.libDropdownMod

import typings.react.reactMod.ReactType
import typings.reactstrap.reactstrapStrings.append
import typings.reactstrap.reactstrapStrings.prepend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownProps extends UncontrolledDropdownProps {
  var addonType: js.UndefOr[Boolean | prepend | append] = js.undefined
  var direction: js.UndefOr[Direction] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var group: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var tag: js.UndefOr[ReactType[_]] = js.undefined
}

object DropdownProps {
  @scala.inline
  def apply(
    UncontrolledDropdownProps: UncontrolledDropdownProps = null,
    addonType: Boolean | prepend | append = null,
    direction: Direction = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    group: js.UndefOr[Boolean] = js.undefined,
    size: String = null,
    tag: ReactType[_] = null
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

