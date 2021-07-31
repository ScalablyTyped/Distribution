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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchResultsStoriesMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  @scala.inline
  def LastViewed_(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("LastViewed")().asInstanceOf[Element]
  
  @scala.inline
  def NoResults_(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NoResults")().asInstanceOf[Element]
  
  @scala.inline
  def Searching_(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Searching")().asInstanceOf[Element]
  
  object lastViewed {
    
    @JSImport("@storybook/ui/dist/components/sidebar/SearchResults.stories", "lastViewed")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def closeMenu(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeMenu")().asInstanceOf[Unit]
    
    @scala.inline
    def getItemProps(): KeyAny = ^.asInstanceOf[js.Dynamic].applyDynamic("getItemProps")().asInstanceOf[KeyAny]
    @scala.inline
    def getItemProps(props: js.Any): KeyAny = ^.asInstanceOf[js.Dynamic].applyDynamic("getItemProps")(props.asInstanceOf[js.Any]).asInstanceOf[KeyAny]
    
    @scala.inline
    def getMenuProps(): KeyAny = ^.asInstanceOf[js.Dynamic].applyDynamic("getMenuProps")().asInstanceOf[KeyAny]
    @scala.inline
    def getMenuProps(props: js.Any): KeyAny = ^.asInstanceOf[js.Dynamic].applyDynamic("getMenuProps")(props.asInstanceOf[js.Any]).asInstanceOf[KeyAny]
    
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
    
    @scala.inline
    def closeMenu(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeMenu")().asInstanceOf[Unit]
    
    @scala.inline
    def getItemProps(): KeyAny = ^.asInstanceOf[js.Dynamic].applyDynamic("getItemProps")().asInstanceOf[KeyAny]
    @scala.inline
    def getItemProps(props: js.Any): KeyAny = ^.asInstanceOf[js.Dynamic].applyDynamic("getItemProps")(props.asInstanceOf[js.Any]).asInstanceOf[KeyAny]
    
    @scala.inline
    def getMenuProps(): KeyAny = ^.asInstanceOf[js.Dynamic].applyDynamic("getMenuProps")().asInstanceOf[KeyAny]
    @scala.inline
    def getMenuProps(props: js.Any): KeyAny = ^.asInstanceOf[js.Dynamic].applyDynamic("getMenuProps")(props.asInstanceOf[js.Any]).asInstanceOf[KeyAny]
    
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
    
    @scala.inline
    def closeMenu(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeMenu")().asInstanceOf[Unit]
    
    @scala.inline
    def getItemProps(): KeyAny = ^.asInstanceOf[js.Dynamic].applyDynamic("getItemProps")().asInstanceOf[KeyAny]
    @scala.inline
    def getItemProps(props: js.Any): KeyAny = ^.asInstanceOf[js.Dynamic].applyDynamic("getItemProps")(props.asInstanceOf[js.Any]).asInstanceOf[KeyAny]
    
    @scala.inline
    def getMenuProps(): KeyAny = ^.asInstanceOf[js.Dynamic].applyDynamic("getMenuProps")().asInstanceOf[KeyAny]
    @scala.inline
    def getMenuProps(props: js.Any): KeyAny = ^.asInstanceOf[js.Dynamic].applyDynamic("getMenuProps")(props.asInstanceOf[js.Any]).asInstanceOf[KeyAny]
    
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
