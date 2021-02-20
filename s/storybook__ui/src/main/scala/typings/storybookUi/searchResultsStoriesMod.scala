package typings.storybookUi

import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import typings.std.RegExp
import typings.storybookUi.anon.EnableShortcuts
import typings.storybookUi.anon.Item
import typings.storybookUi.anon.KeyAny
import typings.storybookUi.anon.Layout
import typings.storybookUi.anon.Matches
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchResultsStoriesMod {
  
  object default {
    
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "default.component")
    @js.native
    def component: FunctionComponent[EnableShortcuts] = js.native
    @scala.inline
    def component_=(x: FunctionComponent[EnableShortcuts]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "default.decorators")
    @js.native
    def decorators: js.Array[js.Function1[/* storyFn */ js.Any, Element]] = js.native
    @scala.inline
    def decorators_=(x: js.Array[js.Function1[/* storyFn */ js.Any, Element]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorators")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "default.includeStories")
    @js.native
    def includeStories: RegExp = js.native
    @scala.inline
    def includeStories_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("includeStories")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "default.parameters")
    @js.native
    def parameters: Layout = js.native
    @scala.inline
    def parameters_=(x: Layout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parameters")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "default.title")
    @js.native
    def title: String = js.native
    @scala.inline
    def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "LastViewed")
  @js.native
  def LastViewed_(): Element = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "NoResults")
  @js.native
  def NoResults_(): Element = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "Searching")
  @js.native
  def Searching_(): Element = js.native
  
  object lastViewed {
    
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "lastViewed")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "lastViewed.closeMenu")
    @js.native
    def closeMenu(): Unit = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "lastViewed.getItemProps")
    @js.native
    def getItemProps(): KeyAny = js.native
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "lastViewed.getItemProps")
    @js.native
    def getItemProps(props: js.Any): KeyAny = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "lastViewed.getMenuProps")
    @js.native
    def getMenuProps(): KeyAny = js.native
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "lastViewed.getMenuProps")
    @js.native
    def getMenuProps(props: js.Any): KeyAny = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "lastViewed.highlightedIndex")
    @js.native
    def highlightedIndex: Double = js.native
    @scala.inline
    def highlightedIndex_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("highlightedIndex")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "lastViewed.query")
    @js.native
    def query: String = js.native
    @scala.inline
    def query_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("query")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "lastViewed.results")
    @js.native
    def results: js.Array[Matches] = js.native
    @scala.inline
    def results_=(x: js.Array[Matches]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("results")(x.asInstanceOf[js.Any])
  }
  
  object noResults {
    
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "noResults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "noResults.closeMenu")
    @js.native
    def closeMenu(): Unit = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "noResults.getItemProps")
    @js.native
    def getItemProps(): KeyAny = js.native
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "noResults.getItemProps")
    @js.native
    def getItemProps(props: js.Any): KeyAny = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "noResults.getMenuProps")
    @js.native
    def getMenuProps(): KeyAny = js.native
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "noResults.getMenuProps")
    @js.native
    def getMenuProps(props: js.Any): KeyAny = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "noResults.highlightedIndex")
    @js.native
    def highlightedIndex: Double = js.native
    @scala.inline
    def highlightedIndex_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("highlightedIndex")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "noResults.query")
    @js.native
    def query: String = js.native
    @scala.inline
    def query_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("query")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "noResults.results")
    @js.native
    def results: js.Any = js.native
    @scala.inline
    def results_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("results")(x.asInstanceOf[js.Any])
  }
  
  object searching {
    
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "searching")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "searching.closeMenu")
    @js.native
    def closeMenu(): Unit = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "searching.getItemProps")
    @js.native
    def getItemProps(): KeyAny = js.native
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "searching.getItemProps")
    @js.native
    def getItemProps(props: js.Any): KeyAny = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "searching.getMenuProps")
    @js.native
    def getMenuProps(): KeyAny = js.native
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "searching.getMenuProps")
    @js.native
    def getMenuProps(props: js.Any): KeyAny = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "searching.highlightedIndex")
    @js.native
    def highlightedIndex: Double = js.native
    @scala.inline
    def highlightedIndex_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("highlightedIndex")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "searching.query")
    @js.native
    def query: String = js.native
    @scala.inline
    def query_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("query")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "searching.results")
    @js.native
    def results: js.Array[Item] = js.native
    @scala.inline
    def results_=(x: js.Array[Item]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("results")(x.asInstanceOf[js.Any])
  }
}
