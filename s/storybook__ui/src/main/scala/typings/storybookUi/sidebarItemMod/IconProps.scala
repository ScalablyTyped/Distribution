package typings.storybookUi.sidebarItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.ComponentProps<react.react.FunctionComponent<@storybook/components.@storybook/components/dist/icon/icon.IconsProps>> & {  className  :string,   isSelected ? :boolean} */
trait IconProps extends js.Object {
  var className: String
  var isSelected: js.UndefOr[Boolean] = js.undefined
}

object IconProps {
  @scala.inline
  def apply(className: String, isSelected: js.UndefOr[Boolean] = js.undefined): IconProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProps]
  }
}

