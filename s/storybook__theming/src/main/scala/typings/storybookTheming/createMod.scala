package typings.storybookTheming

import org.scalablytyped.runtime.StringDictionary
import typings.storybookTheming.typesMod.ThemeVars
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createMod {
  
  @JSImport("@storybook/theming/dist/create", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(): ThemeVars = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ThemeVars]
  @scala.inline
  def create(vars: Unit, rest: Rest): ThemeVars = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(vars.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[ThemeVars]
  @scala.inline
  def create(vars: ThemeVars): ThemeVars = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(vars.asInstanceOf[js.Any]).asInstanceOf[ThemeVars]
  @scala.inline
  def create(vars: ThemeVars, rest: Rest): ThemeVars = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(vars.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[ThemeVars]
  
  object themes {
    
    @JSImport("@storybook/theming/dist/create", "themes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/theming/dist/create", "themes.dark")
    @js.native
    def dark: ThemeVars = js.native
    @scala.inline
    def dark_=(x: ThemeVars): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dark")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming/dist/create", "themes.light")
    @js.native
    def light: ThemeVars = js.native
    @scala.inline
    def light_=(x: ThemeVars): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("light")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/theming/dist/create", "themes.normal")
    @js.native
    def normal: ThemeVars = js.native
    @scala.inline
    def normal_=(x: ThemeVars): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normal")(x.asInstanceOf[js.Any])
  }
  
  type Rest = StringDictionary[js.Any]
}
