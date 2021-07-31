package typings.storybookUi

import typings.react.mod.NamedExoticComponent
import typings.react.mod.global.JSX.Element
import typings.storybookUi.anon.Absolute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelStoriesMod {
  
  @JSImport("@storybook/ui/dist/components/panel/panel.stories", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("@storybook/ui/dist/components/panel/panel.stories", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/panel/panel.stories", "default.component")
    @js.native
    def component: NamedExoticComponent[Absolute] = js.native
    @scala.inline
    def component_=(x: NamedExoticComponent[Absolute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/panel/panel.stories", "default.title")
    @js.native
    def title: String = js.native
    @scala.inline
    def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def Default_(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Default")().asInstanceOf[Element]
  
  @scala.inline
  def NoPanels(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NoPanels")().asInstanceOf[Element]
}
