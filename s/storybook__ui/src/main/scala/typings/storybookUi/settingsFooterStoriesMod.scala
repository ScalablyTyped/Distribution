package typings.storybookUi

import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookReact.typesMod.StoryFnReactReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingsFooterStoriesMod {
  
  object default {
    
    @JSImport("@storybook/ui/dist/settings/SettingsFooter.stories", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/settings/SettingsFooter.stories", "default.component")
    @js.native
    def component: FunctionComponent[js.Any] = js.native
    @scala.inline
    def component_=(x: FunctionComponent[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/settings/SettingsFooter.stories", "default.decorators")
    @js.native
    def decorators: js.Array[DecoratorFunction[StoryFnReactReturnType]] = js.native
    @scala.inline
    def decorators_=(x: js.Array[DecoratorFunction[StoryFnReactReturnType]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorators")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/settings/SettingsFooter.stories", "default.title")
    @js.native
    def title: String = js.native
    @scala.inline
    def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/ui/dist/settings/SettingsFooter.stories", "basic")
  @js.native
  def basic(): Element = js.native
}
