package typings.storybookUi

import typings.react.mod.global.JSX.Element
import typings.storybookUi.anon.A11y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelDotstoriesMod {
  
  object default {
    
    @JSImport("@storybook/ui/dist/containers/panel.stories", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/containers/panel.stories", "default.title")
    @js.native
    def title: String = js.native
    @scala.inline
    def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/ui/dist/containers/panel.stories", "AllAddons")
  @js.native
  def AllAddons(): Element = js.native
  
  object FilteredAddons {
    
    @JSImport("@storybook/ui/dist/containers/panel.stories", "FilteredAddons")
    @js.native
    def apply(): Element = js.native
    @JSImport("@storybook/ui/dist/containers/panel.stories", "FilteredAddons")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/containers/panel.stories", "FilteredAddons.parameters")
    @js.native
    def parameters: A11y = js.native
    @scala.inline
    def parameters_=(x: A11y): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parameters")(x.asInstanceOf[js.Any])
  }
}
