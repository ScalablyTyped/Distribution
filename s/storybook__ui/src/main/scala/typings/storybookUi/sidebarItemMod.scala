package typings.storybookUi

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.ComponentProps
import typings.react.mod.FunctionComponent
import typings.react.mod._Global_.JSX.Element
import typings.std.Pick
import typings.storybookComponents.iconMod.IconsProps
import typings.storybookTheming.typesMod.Theme
import typings.storybookUi.storybookUiStrings.span
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/ui/dist/components/sidebar/SidebarItem", JSImport.Namespace)
@js.native
object sidebarItemMod extends js.Object {
  val Item: StyledComponent[js.Any, Pick[js.Any, String | Double | js.Symbol], Theme] = js.native
  def default(hasNameIsComponentIsLeafIsExpandedIsSelectedProps: js.Any): Element = js.native
  type ExpanderProps = ComponentProps[span] with AnonIsExpandable
  type IconProps = ComponentProps[FunctionComponent[IconsProps]] with AnonClassName
}

