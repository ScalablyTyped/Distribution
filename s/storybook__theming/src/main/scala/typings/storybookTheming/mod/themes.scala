package typings.storybookTheming.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themes {
  
  @JSImport("@storybook/theming", "themes")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/theming", "themes.dark")
  @js.native
  def dark: ThemeVars = js.native
  inline def dark_=(x: ThemeVars): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dark")(x.asInstanceOf[js.Any])
  
  @JSImport("@storybook/theming", "themes.light")
  @js.native
  def light: ThemeVars = js.native
  inline def light_=(x: ThemeVars): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("light")(x.asInstanceOf[js.Any])
  
  @JSImport("@storybook/theming", "themes.normal")
  @js.native
  def normal: ThemeVars = js.native
  inline def normal_=(x: ThemeVars): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normal")(x.asInstanceOf[js.Any])
}
