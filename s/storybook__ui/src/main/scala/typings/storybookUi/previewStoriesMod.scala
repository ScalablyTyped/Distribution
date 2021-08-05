package typings.storybookUi

import typings.react.mod.NamedExoticComponent
import typings.react.mod.global.JSX.Element
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookReact.typesMod.StoryFnReactReturnType
import typings.storybookUi.typesMod.PreviewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previewStoriesMod {
  
  @JSImport("@storybook/ui/dist/components/preview/preview.stories", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("@storybook/ui/dist/components/preview/preview.stories", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/preview/preview.stories", "default.component")
    @js.native
    def component: NamedExoticComponent[PreviewProps] = js.native
    inline def component_=(x: NamedExoticComponent[PreviewProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/preview/preview.stories", "default.decorators")
    @js.native
    def decorators: js.Array[DecoratorFunction[StoryFnReactReturnType]] = js.native
    inline def decorators_=(x: js.Array[DecoratorFunction[StoryFnReactReturnType]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorators")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/preview/preview.stories", "default.title")
    @js.native
    def title: String = js.native
    inline def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  inline def noTabs(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("noTabs")().asInstanceOf[Element]
  
  inline def withTabs(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("withTabs")().asInstanceOf[Element]
}
