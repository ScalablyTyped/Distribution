package typings.storybookUi

import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import typings.storybookUi.menuMod.ListItemIconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuStoriesMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/Menu.stories", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("@storybook/ui/dist/components/sidebar/Menu.stories", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def component(hasIconImgSrc: ListItemIconProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("component")(hasIconImgSrc.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@storybook/ui/dist/components/sidebar/Menu.stories", "default.decorators")
    @js.native
    def decorators: js.Array[js.Function1[/* StoryFn */ FunctionComponent[js.Object], Element]] = js.native
    inline def decorators_=(x: js.Array[js.Function1[/* StoryFn */ FunctionComponent[js.Object], Element]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorators")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Menu.stories", "default.title")
    @js.native
    def title: String = js.native
    inline def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  inline def Expanded(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Expanded")().asInstanceOf[Element]
  
  inline def ExpandedWithoutReleaseNotes(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ExpandedWithoutReleaseNotes")().asInstanceOf[Element]
  
  inline def Items(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Items")().asInstanceOf[Element]
  
  inline def Real(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Real")().asInstanceOf[Element]
}
