package typings.storybookUi.sidebarHeadingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidebarHeadingProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var menu: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react.react.FunctionComponent<@storybook/components.@storybook/components/dist/tooltip/TooltipLinkList.TooltipLinkListProps>>['links'] */ js.Any
  var menuHighlighted: js.UndefOr[Boolean] = js.undefined
}

object SidebarHeadingProps {
  @scala.inline
  def apply(
    menu: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react.react.FunctionComponent<@storybook/components.@storybook/components/dist/tooltip/TooltipLinkList.TooltipLinkListProps>>['links'] */ js.Any,
    className: String = null,
    menuHighlighted: js.UndefOr[Boolean] = js.undefined
  ): SidebarHeadingProps = {
    val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(menuHighlighted)) __obj.updateDynamic("menuHighlighted")(menuHighlighted.asInstanceOf[js.Any])
    __obj.asInstanceOf[SidebarHeadingProps]
  }
}

