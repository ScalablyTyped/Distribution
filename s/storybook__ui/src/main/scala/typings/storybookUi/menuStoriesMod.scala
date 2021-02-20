package typings.storybookUi

import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import typings.storybookUi.menuMod.ListItemIconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuStoriesMod {
  
  object default {
    
    @JSImport("@storybook/ui/dist/components/sidebar/Menu.stories", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/Menu.stories", "default.component")
    @js.native
    def component(hasIconImgSrc: ListItemIconProps): Element = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/Menu.stories", "default.decorators")
    @js.native
    def decorators: js.Array[js.Function1[/* StoryFn */ FunctionComponent[js.Object], Element]] = js.native
    @scala.inline
    def decorators_=(x: js.Array[js.Function1[/* StoryFn */ FunctionComponent[js.Object], Element]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorators")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Menu.stories", "default.title")
    @js.native
    def title: String = js.native
    @scala.inline
    def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/ui/dist/components/sidebar/Menu.stories", "Expanded")
  @js.native
  def Expanded(): Element = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Menu.stories", "ExpandedWithoutReleaseNotes")
  @js.native
  def ExpandedWithoutReleaseNotes(): Element = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Menu.stories", "Items")
  @js.native
  def Items(): Element = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Menu.stories", "Real")
  @js.native
  def Real(): Element = js.native
}
