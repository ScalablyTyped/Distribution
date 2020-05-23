package typings.storybookUi

import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import typings.std.RegExp
import typings.storybookUi.anon.Id
import typings.storybookUi.sidebarMod.SidebarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/ui/dist/components/sidebar/Sidebar.stories", JSImport.Namespace)
@js.native
object sidebarStoriesMod extends js.Object {
  def loading(): Element = js.native
  def simple(): Element = js.native
  @js.native
  object default extends js.Object {
    var component: FunctionComponent[SidebarProps] = js.native
    var excludeStories: RegExp = js.native
    var title: String = js.native
  }
  
  @js.native
  object loadingData extends js.Object {
    var menu: js.Array[Id] = js.native
  }
  
  @js.native
  object simpleData extends js.Object {
    var menu: js.Array[Id] = js.native
    var stories: js.Any = js.native
    var storyId: String = js.native
  }
  
}

