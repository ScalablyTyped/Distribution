package typings.storybookUi

import typings.react.mod.global.JSX.Element
import typings.storybookUi.anon.A11y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelDotstoriesMod {
  
  @JSImport("@storybook/ui/dist/containers/panel.stories", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("@storybook/ui/dist/containers/panel.stories", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/containers/panel.stories", "default.title")
    @js.native
    def title: String = js.native
    inline def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  inline def AllAddons(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("AllAddons")().asInstanceOf[Element]
  
  object FilteredAddons {
    
    inline def apply(): Element = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Element]
    
    @JSImport("@storybook/ui/dist/containers/panel.stories", "FilteredAddons")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/containers/panel.stories", "FilteredAddons.parameters")
    @js.native
    def parameters: A11y = js.native
    inline def parameters_=(x: A11y): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parameters")(x.asInstanceOf[js.Any])
  }
}
