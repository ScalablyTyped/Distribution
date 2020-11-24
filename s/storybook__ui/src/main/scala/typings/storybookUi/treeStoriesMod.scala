package typings.storybookUi

import typings.react.mod.NamedExoticComponent
import typings.react.mod.global.JSX.Element
import typings.std.RegExp
import typings.storybookUi.anon.HighlightedRef
import typings.storybookUi.anon.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/ui/dist/components/sidebar/Tree.stories", JSImport.Namespace)
@js.native
object treeStoriesMod extends js.Object {
  
  def Full(): Element = js.native
  
  def SingleStoryComponents(): Element = js.native
  
  @js.native
  object default extends js.Object {
    
    var component: NamedExoticComponent[HighlightedRef] = js.native
    
    var decorators: js.Array[js.Function1[/* storyFn */ _, Element]] = js.native
    
    var excludeStories: RegExp = js.native
    
    var parameters: Layout = js.native
    
    var title: String = js.native
  }
}
