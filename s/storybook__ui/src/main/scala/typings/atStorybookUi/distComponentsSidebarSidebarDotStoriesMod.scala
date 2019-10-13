package typings.atStorybookUi

import typings.atStorybookUi.distComponentsSidebarSidebarMod.SidebarProps
import typings.react.reactMod._Global_.JSX.Element
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/ui/dist/components/sidebar/Sidebar.stories", JSImport.Namespace)
@js.native
object distComponentsSidebarSidebarDotStoriesMod extends js.Object {
  def loading(): Element = js.native
  def simple(): Element = js.native
  @js.native
  object default extends js.Object {
    var excludeStories: RegExp = js.native
    var title: String = js.native
    def component(hasStoryIdStoriesMenuMenuHighlightedLoading: SidebarProps): Element = js.native
  }
  
  @js.native
  object loadingData extends js.Object {
    var menu: js.Array[Anon_Id] = js.native
  }
  
  @js.native
  object simpleData extends js.Object {
    var menu: js.Array[Anon_Id] = js.native
    var stories: js.Any = js.native
    var storyId: String = js.native
  }
  
}

