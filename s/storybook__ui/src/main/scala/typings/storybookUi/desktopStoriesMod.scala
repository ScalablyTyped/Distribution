package typings.storybookUi

import typings.react.mod.global.JSX.Element
import typings.storybookUi.anon.NamedExoticComponentDeskt
import typings.storybookUi.anon.PassArgsFirst
import typings.storybookUi.anon.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object desktopStoriesMod {
  
  @JSImport("@storybook/ui/dist/components/layout/desktop.stories", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  @scala.inline
  def BottomPanel(hasProps: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("BottomPanel")(hasProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def Default_(hasProps: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Default")(hasProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def Fullscreen(hasProps: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Fullscreen")(hasProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def NoAddons(hasProps: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NoAddons")(hasProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def NoPanel(hasProps: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NoPanel")(hasProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def NoPanelNoSidebar(hasProps: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NoPanelNoSidebar")(hasProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def NoSidebar(hasProps: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NoSidebar")(hasProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def Page(hasProps: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Page")(hasProps.asInstanceOf[js.Any]).asInstanceOf[Element]
}
