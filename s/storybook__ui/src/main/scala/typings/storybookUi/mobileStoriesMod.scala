package typings.storybookUi

import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.global.JSX.Element
import typings.storybookUi.anon.PassArgsFirst
import typings.storybookUi.anon.PropsMobileProps
import typings.storybookUi.mobileMod.Mobile
import typings.storybookUi.mobileMod.MobileProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mobileStoriesMod {
  
  @JSImport("@storybook/ui/dist/components/layout/mobile.stories", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("@storybook/ui/dist/components/layout/mobile.stories", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@storybook/ui/dist/components/layout/mobile.stories", "default.component")
    @js.native
    class component protected () extends Mobile {
      def this(props: MobileProps) = this()
    }
    @JSImport("@storybook/ui/dist/components/layout/mobile.stories", "default.component")
    @js.native
    def component: Instantiable1[/* props */ MobileProps, Mobile] = js.native
    inline def component_=(x: Instantiable1[/* props */ MobileProps, Mobile]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/layout/mobile.stories", "default.decorators")
    @js.native
    def decorators: js.Array[js.Function1[/* args */ js.Any, js.Any]] = js.native
    inline def decorators_=(x: js.Array[js.Function1[/* args */ js.Any, js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorators")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/layout/mobile.stories", "default.parameters")
    @js.native
    def parameters: PassArgsFirst = js.native
    inline def parameters_=(x: PassArgsFirst): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parameters")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/layout/mobile.stories", "default.title")
    @js.native
    def title: String = js.native
    inline def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  inline def InitialAddons(hasProps: PropsMobileProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InitialAddons")(hasProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InitialCanvas(hasProps: PropsMobileProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InitialCanvas")(hasProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InitialSidebar(hasProps: PropsMobileProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InitialSidebar")(hasProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Page(hasProps: PropsMobileProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Page")(hasProps.asInstanceOf[js.Any]).asInstanceOf[Element]
}
