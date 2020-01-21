package typings.storybookUi

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.ComponentProps
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.storybookTheming.typesMod.Theme
import typings.storybookUi.storybookUiStrings.div
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/ui/dist/components/sidebar/SidebarSubheading", JSImport.Namespace)
@js.native
object sidebarSubheadingMod extends js.Object {
  val default: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    Theme
  ] = js.native
  type SubheadingProps = ComponentProps[div]
}

