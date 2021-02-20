package typings.storybookUi

import typings.react.mod.NamedExoticComponent
import typings.react.mod.global.JSX.Element
import typings.storybookUi.anon.Actions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelStoriesMod {
  
  object default {
    
    @JSImport("@storybook/ui/dist/components/panel/panel.stories", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/panel/panel.stories", "default.component")
    @js.native
    def component: NamedExoticComponent[Actions] = js.native
    @scala.inline
    def component_=(x: NamedExoticComponent[Actions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/panel/panel.stories", "default.title")
    @js.native
    def title: String = js.native
    @scala.inline
    def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/ui/dist/components/panel/panel.stories", "Default")
  @js.native
  def Default_(): Element = js.native
  
  @JSImport("@storybook/ui/dist/components/panel/panel.stories", "NoPanels")
  @js.native
  def NoPanels(): Element = js.native
}
