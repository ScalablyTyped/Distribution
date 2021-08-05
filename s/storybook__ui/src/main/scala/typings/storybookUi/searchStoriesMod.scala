package typings.storybookUi

import typings.react.mod.NamedExoticComponent
import typings.react.mod.global.JSX.Element
import typings.storybookUi.anon.ClearLastViewed
import typings.storybookUi.anon.Layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchStoriesMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/Search.stories", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("@storybook/ui/dist/components/sidebar/Search.stories", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/sidebar/Search.stories", "default.component")
    @js.native
    def component: NamedExoticComponent[ClearLastViewed] = js.native
    inline def component_=(x: NamedExoticComponent[ClearLastViewed]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Search.stories", "default.decorators")
    @js.native
    def decorators: js.Array[js.Function1[/* storyFn */ js.Any, Element]] = js.native
    inline def decorators_=(x: js.Array[js.Function1[/* storyFn */ js.Any, Element]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorators")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Search.stories", "default.parameters")
    @js.native
    def parameters: Layout = js.native
    inline def parameters_=(x: Layout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parameters")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/sidebar/Search.stories", "default.title")
    @js.native
    def title: String = js.native
    inline def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  inline def FilledIn(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FilledIn")().asInstanceOf[Element]
  
  inline def LastViewed(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("LastViewed")().asInstanceOf[Element]
  
  inline def ShortcutsDisabled(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ShortcutsDisabled")().asInstanceOf[Element]
  
  inline def Simple(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Simple")().asInstanceOf[Element]
}
