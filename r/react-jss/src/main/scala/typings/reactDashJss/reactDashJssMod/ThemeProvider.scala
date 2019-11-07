package typings.reactDashJss.reactDashJssMod

import org.scalablytyped.runtime.TopLevel
import typings.theming.themingMod.DefaultTheme
import typings.theming.themingMod.ThemeProviderFactory
import typings.theming.themingMod.ThemeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jss", "ThemeProvider")
@js.native
class ThemeProvider protected ()
  extends typings.theming.themingMod.ThemeProvider {
  def this(props: ThemeProviderProps[DefaultTheme]) = this()
  def this(props: ThemeProviderProps[DefaultTheme], context: js.Any) = this()
}

@JSImport("react-jss", "ThemeProvider")
@js.native
object ThemeProvider extends TopLevel[ThemeProviderFactory[DefaultTheme]]

