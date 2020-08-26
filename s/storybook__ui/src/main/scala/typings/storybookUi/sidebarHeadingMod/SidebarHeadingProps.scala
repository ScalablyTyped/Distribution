package typings.storybookUi.sidebarHeadingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SidebarHeadingProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var menu: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react.react.FunctionComponent<@storybook/components.@storybook/components/dist/tooltip/TooltipLinkList.TooltipLinkListProps>>['links'] */ js.Any = js.native
  var menuHighlighted: js.UndefOr[Boolean] = js.native
}

object SidebarHeadingProps {
  @scala.inline
  def apply(
    menu: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react.react.FunctionComponent<@storybook/components.@storybook/components/dist/tooltip/TooltipLinkList.TooltipLinkListProps>>['links'] */ js.Any
  ): SidebarHeadingProps = {
    val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any])
    __obj.asInstanceOf[SidebarHeadingProps]
  }
  @scala.inline
  implicit class SidebarHeadingPropsOps[Self <: SidebarHeadingProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMenu(
      value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react.react.FunctionComponent<@storybook/components.@storybook/components/dist/tooltip/TooltipLinkList.TooltipLinkListProps>>['links'] */ js.Any
    ): Self = this.set("menu", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setMenuHighlighted(value: Boolean): Self = this.set("menuHighlighted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuHighlighted: Self = this.set("menuHighlighted", js.undefined)
  }
  
}

