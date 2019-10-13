package typings.atStorybookUi

import typings.atEmotionStyledDashBase.atEmotionStyledDashBaseMod.StyledComponent
import typings.atStorybookComponents.distIconIconMod.IconsProps
import typings.atStorybookTheming.distTypesMod.Theme
import typings.atStorybookUi.atStorybookUiStrings.span
import typings.react.reactMod.ComponentProps
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod._Global_.JSX.Element
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/ui/dist/components/sidebar/SidebarItem", JSImport.Namespace)
@js.native
object distComponentsSidebarSidebarItemMod extends js.Object {
  val Item: StyledComponent[js.Any, (Pick[_, String | Double | js.Symbol]) with Anon_Theme, Theme] = js.native
  def default(hasNameIsComponentIsLeafIsExpandedIsSelectedProps: js.Any): Element = js.native
  type ExpanderProps = ComponentProps[span] with Anon_IsExpandable
  type IconProps = ComponentProps[FunctionComponent[IconsProps]] with Anon_ClassName
}

