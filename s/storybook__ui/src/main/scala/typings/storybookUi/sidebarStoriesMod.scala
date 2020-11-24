package typings.storybookUi

import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import typings.std.RegExp
import typings.storybookApi.storiesMod.StoriesHash
import typings.storybookUi.anon.Id
import typings.storybookUi.anon.Layout
import typings.storybookUi.sidebarMod.SidebarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/ui/dist/components/sidebar/Sidebar.stories", JSImport.Namespace)
@js.native
object sidebarStoriesMod extends js.Object {
  
  def Empty(): Element = js.native
  
  def Loading(): Element = js.native
  
  def LoadingWithRefs(): Element = js.native
  
  def Simple(): Element = js.native
  
  def WithRefs(): Element = js.native
  
  @js.native
  object default extends js.Object {
    
    var component: FunctionComponent[SidebarProps] = js.native
    
    var decorators: js.Array[js.Function1[/* storyFn */ _, Element]] = js.native
    
    var excludeStories: RegExp = js.native
    
    var parameters: Layout = js.native
    
    var title: String = js.native
  }
  
  @js.native
  object loadingData extends js.Object {
    
    var menu: js.Array[Id] = js.native
  }
  
  @js.native
  object simpleData extends js.Object {
    
    var menu: js.Array[Id] = js.native
    
    var stories: StoriesHash = js.native
    
    var storyId: String = js.native
  }
}
