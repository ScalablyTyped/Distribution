package typings.storybookUi

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.react.mod.global.JSX.Element
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookReact.typesMod.StoryFnReactReturnType
import typings.storybookUi.shortcutsMod.ShortcutsScreen
import typings.storybookUi.shortcutsMod.ShortcutsScreenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/ui/dist/settings/shortcuts.stories", JSImport.Namespace)
@js.native
object shortcutsStoriesMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    var decorators: js.Array[DecoratorFunction[StoryFnReactReturnType]] = js.native
    
    var title: String = js.native
    
    @js.native
    class component protected () extends ShortcutsScreen {
      def this(props: ShortcutsScreenProps) = this()
    }
    @js.native
    object component extends TopLevel[Instantiable1[/* props */ ShortcutsScreenProps, ShortcutsScreen]]
  }
  
  @js.native
  object defaults extends js.Object {
    
    def apply(): Element = js.native
    
    var storyName: String = js.native
  }
}
