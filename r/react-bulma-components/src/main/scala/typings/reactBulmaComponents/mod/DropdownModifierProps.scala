package typings.reactBulmaComponents.mod

import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.ReactNode
import typings.reactBulmaComponents.reactBulmaComponentsStrings.div
import typings.reactBulmaComponents.reactBulmaComponentsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*** Dropdown ***/
// https://github.com/couds/react-bulma-components/blob/master/src/components/dropdown/dropdown.js
trait DropdownModifierProps extends js.Object {
  var align: js.UndefOr[right] = js.undefined
  var color: js.UndefOr[Color] = js.undefined
  var hoverable: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[ReactNode] = js.undefined
  var onChange: js.UndefOr[ChangeEventHandler[div]] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object DropdownModifierProps {
  @scala.inline
  def apply(
    align: right = null,
    color: Color = null,
    hoverable: js.UndefOr[Boolean] = js.undefined,
    label: ReactNode = null,
    onChange: ChangeEvent[div] => Unit = null,
    value: js.Any = null
  ): DropdownModifierProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverable)) __obj.updateDynamic("hoverable")(hoverable.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownModifierProps]
  }
}

