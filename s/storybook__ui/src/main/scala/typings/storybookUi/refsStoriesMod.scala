package typings.storybookUi

import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import typings.std.RegExp
import typings.storybookApi.refsMod.ComposedRef
import typings.storybookApi.storiesMod.StoriesHash
import typings.storybookUi.anon.Id
import typings.storybookUi.anon.Layout
import typings.storybookUi.refsMod.RefProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refsStoriesMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", "default.component")
    @js.native
    def component: FunctionComponent[ComposedRef & RefProps] = js.native
    @scala.inline
    def component_=(x: FunctionComponent[ComposedRef & RefProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", "default.decorators")
    @js.native
    def decorators: js.Array[js.Function1[/* storyFn */ js.Any, Element]] = js.native
    @scala.inline
    def decorators_=(x: js.Array[js.Function1[/* storyFn */ js.Any, Element]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorators")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", "default.excludeStories")
    @js.native
    def excludeStories: RegExp = js.native
    @scala.inline
    def excludeStories_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("excludeStories")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", "default.parameters")
    @js.native
    def parameters: Layout = js.native
    @scala.inline
    def parameters_=(x: Layout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parameters")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", "default.title")
    @js.native
    def title: String = js.native
    @scala.inline
    def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def Auth(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Auth")().asInstanceOf[Element]
  
  @scala.inline
  def Errored(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Errored")().asInstanceOf[Element]
  
  @scala.inline
  def IsEmpty(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("IsEmpty")().asInstanceOf[Element]
  
  @scala.inline
  def Long(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Long")().asInstanceOf[Element]
  
  @scala.inline
  def Optimized(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Optimized")().asInstanceOf[Element]
  
  @scala.inline
  def StartInjectedLoading(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StartInjectedLoading")().asInstanceOf[Element]
  
  @scala.inline
  def StartInjectedReady(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StartInjectedReady")().asInstanceOf[Element]
  
  @scala.inline
  def StartInjectedUnknown(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StartInjectedUnknown")().asInstanceOf[Element]
  
  @scala.inline
  def Versions(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Versions")().asInstanceOf[Element]
  
  @scala.inline
  def VersionsMissingCurrent(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("VersionsMissingCurrent")().asInstanceOf[Element]
  
  object loadingData {
    
    @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", "loadingData")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", "loadingData.menu")
    @js.native
    def menu: js.Array[Id] = js.native
    @scala.inline
    def menu_=(x: js.Array[Id]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("menu")(x.asInstanceOf[js.Any])
  }
  
  object simpleData {
    
    @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", "simpleData")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", "simpleData.menu")
    @js.native
    def menu: js.Array[Id] = js.native
    @scala.inline
    def menu_=(x: js.Array[Id]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("menu")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", "simpleData.stories")
    @js.native
    def stories: StoriesHash = js.native
    @scala.inline
    def stories_=(x: StoriesHash): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stories")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Refs.stories", "simpleData.storyId")
    @js.native
    def storyId: String = js.native
    @scala.inline
    def storyId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("storyId")(x.asInstanceOf[js.Any])
  }
}
