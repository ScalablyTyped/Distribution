package typings.storybookUi

import typings.react.mod.NamedExoticComponent
import typings.react.mod.global.JSX.Element
import typings.storybookUi.anon.ClearLastViewed
import typings.storybookUi.anon.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/ui/dist/components/sidebar/Search.stories", JSImport.Namespace)
@js.native
object searchStoriesMod extends js.Object {
  
  def FilledIn(): Element = js.native
  
  def LastViewed(): Element = js.native
  
  def ShortcutsDisabled(): Element = js.native
  
  def Simple(): Element = js.native
  
  @js.native
  object default extends js.Object {
    
    var component: NamedExoticComponent[ClearLastViewed] = js.native
    
    var decorators: js.Array[js.Function1[/* storyFn */ _, Element]] = js.native
    
    var parameters: Layout = js.native
    
    var title: String = js.native
  }
}
