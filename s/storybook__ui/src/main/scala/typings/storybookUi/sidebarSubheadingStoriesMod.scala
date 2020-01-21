package typings.storybookUi

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.HTMLAttributes
import typings.react.mod._Global_.JSX.Element
import typings.std.HTMLDivElement
import typings.storybookTheming.typesMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/ui/dist/components/sidebar/SidebarSubheading.stories", JSImport.Namespace)
@js.native
object sidebarSubheadingStoriesMod extends js.Object {
  def simple(): Element = js.native
  @js.native
  object default extends js.Object {
    var component: StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
        DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
        Theme
      ] = js.native
    var title: String = js.native
  }
  
}

