package typings.storybookUi

import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import typings.std.RegExp
import typings.storybookUi.anon.EnableShortcuts
import typings.storybookUi.anon.Item
import typings.storybookUi.anon.KeyAny
import typings.storybookUi.anon.Layout
import typings.storybookUi.anon.Matches
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", JSImport.Namespace)
@js.native
object searchResultsStoriesMod extends js.Object {
  
  @JSName("LastViewed")
  def LastViewed_(): Element = js.native
  
  @JSName("NoResults")
  def NoResults_(): Element = js.native
  
  @JSName("Searching")
  def Searching_(): Element = js.native
  
  @js.native
  object default extends js.Object {
    
    var component: FunctionComponent[EnableShortcuts] = js.native
    
    var decorators: js.Array[js.Function1[/* storyFn */ _, Element]] = js.native
    
    var includeStories: RegExp = js.native
    
    var parameters: Layout = js.native
    
    var title: String = js.native
  }
  
  @js.native
  object lastViewed extends js.Object {
    
    def closeMenu(): Unit = js.native
    
    def getItemProps(): KeyAny = js.native
    def getItemProps(props: js.Any): KeyAny = js.native
    
    def getMenuProps(): KeyAny = js.native
    def getMenuProps(props: js.Any): KeyAny = js.native
    
    var highlightedIndex: Double = js.native
    
    var query: String = js.native
    
    var results: js.Array[Matches] = js.native
  }
  
  @js.native
  object noResults extends js.Object {
    
    def closeMenu(): Unit = js.native
    
    def getItemProps(): KeyAny = js.native
    def getItemProps(props: js.Any): KeyAny = js.native
    
    def getMenuProps(): KeyAny = js.native
    def getMenuProps(props: js.Any): KeyAny = js.native
    
    var highlightedIndex: Double = js.native
    
    var query: String = js.native
    
    var results: js.Any = js.native
  }
  
  @js.native
  object searching extends js.Object {
    
    def closeMenu(): Unit = js.native
    
    def getItemProps(): KeyAny = js.native
    def getItemProps(props: js.Any): KeyAny = js.native
    
    def getMenuProps(): KeyAny = js.native
    def getMenuProps(props: js.Any): KeyAny = js.native
    
    var highlightedIndex: Double = js.native
    
    var query: String = js.native
    
    var results: js.Array[Item] = js.native
  }
}
