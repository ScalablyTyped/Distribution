package typings.storybookUi

import typings.react.mod.global.JSX.Element
import typings.storybookUi.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/ui/dist/components/sidebar/SidebarItem.stories", JSImport.Namespace)
@js.native
object sidebarItemStoriesMod extends js.Object {
  def component(): Element = js.native
  def componentExpanded(): Element = js.native
  def group(): Element = js.native
  def loading(): Element = js.native
  def nestedDepths(): Element = js.native
  def story(): Element = js.native
  def storySelected(): Element = js.native
  @js.native
  object default extends js.Object {
    var decorators: js.Array[js.Function1[/* storyFn */ _, Element]] = js.native
    var title: String = js.native
    def component(hasNameIsComponentIsLeafIsExpandedIsSelectedProps: js.Any): Element = js.native
  }
  
  @js.native
  object longName extends js.Object {
    var story: Name = js.native
    def apply(): Element = js.native
  }
  
}

