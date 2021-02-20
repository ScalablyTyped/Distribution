package typings.storybookUi

import typings.react.mod.global.JSX.Element
import typings.storybookUi.anon.NamedExoticComponentDeskt
import typings.storybookUi.anon.PassArgsFirst
import typings.storybookUi.anon.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object desktopStoriesMod {
  
  object default {
    
    @JSImport("@storybook/ui/dist/components/layout/desktop.stories", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/layout/desktop.stories", "default.component")
    @js.native
    def component: NamedExoticComponentDeskt = js.native
    @scala.inline
    def component_=(x: NamedExoticComponentDeskt): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/layout/desktop.stories", "default.decorators")
    @js.native
    def decorators: js.Array[js.Function1[/* args */ js.Any, js.Any]] = js.native
    @scala.inline
    def decorators_=(x: js.Array[js.Function1[/* args */ js.Any, js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorators")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/layout/desktop.stories", "default.parameters")
    @js.native
    def parameters: PassArgsFirst = js.native
    @scala.inline
    def parameters_=(x: PassArgsFirst): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parameters")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/layout/desktop.stories", "default.title")
    @js.native
    def title: String = js.native
    @scala.inline
    def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/ui/dist/components/layout/desktop.stories", "BottomPanel")
  @js.native
  def BottomPanel(hasProps: Props): Element = js.native
  
  @JSImport("@storybook/ui/dist/components/layout/desktop.stories", "Default")
  @js.native
  def Default_(hasProps: Props): Element = js.native
  
  @JSImport("@storybook/ui/dist/components/layout/desktop.stories", "Fullscreen")
  @js.native
  def Fullscreen(hasProps: Props): Element = js.native
  
  @JSImport("@storybook/ui/dist/components/layout/desktop.stories", "NoAddons")
  @js.native
  def NoAddons(hasProps: Props): Element = js.native
  
  @JSImport("@storybook/ui/dist/components/layout/desktop.stories", "NoPanel")
  @js.native
  def NoPanel(hasProps: Props): Element = js.native
  
  @JSImport("@storybook/ui/dist/components/layout/desktop.stories", "NoPanelNoSidebar")
  @js.native
  def NoPanelNoSidebar(hasProps: Props): Element = js.native
  
  @JSImport("@storybook/ui/dist/components/layout/desktop.stories", "NoSidebar")
  @js.native
  def NoSidebar(hasProps: Props): Element = js.native
  
  @JSImport("@storybook/ui/dist/components/layout/desktop.stories", "Page")
  @js.native
  def Page(hasProps: Props): Element = js.native
}
