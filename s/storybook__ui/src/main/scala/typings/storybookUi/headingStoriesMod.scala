package typings.storybookUi

import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import typings.std.RegExp
import typings.storybookUi.anon.Id
import typings.storybookUi.anon.Layout
import typings.storybookUi.anon.themeThemeundefinedchildr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headingStoriesMod {
  
  object default {
    
    @JSImport("@storybook/ui/dist/components/sidebar/Heading.stories", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/Heading.stories", "default.component")
    @js.native
    def component: FunctionComponent[themeThemeundefinedchildr] = js.native
    @scala.inline
    def component_=(x: FunctionComponent[themeThemeundefinedchildr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Heading.stories", "default.decorators")
    @js.native
    def decorators: js.Array[js.Function1[/* storyFn */ js.Any, Element]] = js.native
    @scala.inline
    def decorators_=(x: js.Array[js.Function1[/* storyFn */ js.Any, Element]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorators")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Heading.stories", "default.excludeStories")
    @js.native
    def excludeStories: RegExp = js.native
    @scala.inline
    def excludeStories_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("excludeStories")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Heading.stories", "default.parameters")
    @js.native
    def parameters: Layout = js.native
    @scala.inline
    def parameters_=(x: Layout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parameters")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Heading.stories", "default.title")
    @js.native
    def title: String = js.native
    @scala.inline
    def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/ui/dist/components/sidebar/Heading.stories", "customBrandImage")
  @js.native
  def customBrandImage(): Element = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Heading.stories", "linkAndText")
  @js.native
  def linkAndText(): Element = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Heading.stories", "longText")
  @js.native
  def longText(): Element = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Heading.stories", "menuHighlighted")
  @js.native
  def menuHighlighted(): Element = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Heading.stories", "onlyText")
  @js.native
  def onlyText(): Element = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Heading.stories", "standard")
  @js.native
  def standard(): Element = js.native
  
  object standardData {
    
    @JSImport("@storybook/ui/dist/components/sidebar/Heading.stories", "standardData")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/Heading.stories", "standardData.menu")
    @js.native
    def menu: js.Array[Id] = js.native
    @scala.inline
    def menu_=(x: js.Array[Id]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("menu")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/ui/dist/components/sidebar/Heading.stories", "standardNoLink")
  @js.native
  def standardNoLink(): Element = js.native
}
