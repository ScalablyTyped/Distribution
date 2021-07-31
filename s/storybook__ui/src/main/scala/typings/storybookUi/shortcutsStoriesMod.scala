package typings.storybookUi

import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.global.JSX.Element
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookReact.typesMod.StoryFnReactReturnType
import typings.storybookUi.shortcutsMod.ShortcutsScreen
import typings.storybookUi.shortcutsMod.ShortcutsScreenProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shortcutsStoriesMod {
  
  object default {
    
    @JSImport("@storybook/ui/dist/settings/shortcuts.stories", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@storybook/ui/dist/settings/shortcuts.stories", "default.component")
    @js.native
    class component protected () extends ShortcutsScreen {
      def this(props: ShortcutsScreenProps) = this()
    }
    @JSImport("@storybook/ui/dist/settings/shortcuts.stories", "default.component")
    @js.native
    def component: Instantiable1[/* props */ ShortcutsScreenProps, ShortcutsScreen] = js.native
    @scala.inline
    def component_=(x: Instantiable1[/* props */ ShortcutsScreenProps, ShortcutsScreen]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/settings/shortcuts.stories", "default.decorators")
    @js.native
    def decorators: js.Array[DecoratorFunction[StoryFnReactReturnType]] = js.native
    @scala.inline
    def decorators_=(x: js.Array[DecoratorFunction[StoryFnReactReturnType]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorators")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/settings/shortcuts.stories", "default.title")
    @js.native
    def title: String = js.native
    @scala.inline
    def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  object defaults {
    
    @scala.inline
    def apply(): Element = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Element]
    
    @JSImport("@storybook/ui/dist/settings/shortcuts.stories", "defaults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/settings/shortcuts.stories", "defaults.storyName")
    @js.native
    def storyName: String = js.native
    @scala.inline
    def storyName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("storyName")(x.asInstanceOf[js.Any])
  }
}
