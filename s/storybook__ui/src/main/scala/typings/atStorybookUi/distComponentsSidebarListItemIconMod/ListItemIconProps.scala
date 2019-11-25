package typings.atStorybookUi.distComponentsSidebarListItemIconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemIconProps extends js.Object {
  var icon: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react.react.FunctionComponent<@storybook/components.@storybook/components/dist/icon/icon.IconsProps>>['icon'] */ js.Any
  ] = js.undefined
  var imgSrc: js.UndefOr[String] = js.undefined
}

object ListItemIconProps {
  @scala.inline
  def apply(
    icon: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<react.react.FunctionComponent<@storybook/components.@storybook/components/dist/icon/icon.IconsProps>>['icon'] */ js.Any = null,
    imgSrc: String = null
  ): ListItemIconProps = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (imgSrc != null) __obj.updateDynamic("imgSrc")(imgSrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemIconProps]
  }
}

