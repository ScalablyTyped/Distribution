package typings.storybookUi

import typings.react.mod.NamedExoticComponent
import typings.react.mod.global.JSX.Element
import typings.std.RegExp
import typings.storybookUi.anon.HighlightedRef
import typings.storybookUi.anon.Layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeStoriesMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/Tree.stories", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("@storybook/ui/dist/components/sidebar/Tree.stories", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/Tree.stories", "default.component")
    @js.native
    def component: NamedExoticComponent[HighlightedRef] = js.native
    @scala.inline
    def component_=(x: NamedExoticComponent[HighlightedRef]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Tree.stories", "default.decorators")
    @js.native
    def decorators: js.Array[js.Function1[/* storyFn */ js.Any, Element]] = js.native
    @scala.inline
    def decorators_=(x: js.Array[js.Function1[/* storyFn */ js.Any, Element]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorators")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Tree.stories", "default.excludeStories")
    @js.native
    def excludeStories: RegExp = js.native
    @scala.inline
    def excludeStories_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("excludeStories")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Tree.stories", "default.parameters")
    @js.native
    def parameters: Layout = js.native
    @scala.inline
    def parameters_=(x: Layout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parameters")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Tree.stories", "default.title")
    @js.native
    def title: String = js.native
    @scala.inline
    def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def Full(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Full")().asInstanceOf[Element]
  
  @scala.inline
  def SingleStoryComponents(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SingleStoryComponents")().asInstanceOf[Element]
}
