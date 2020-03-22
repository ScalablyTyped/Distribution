package typings.reactJss.mod

import org.scalablytyped.runtime.TopLevel
import typings.theming.mod.ThemeProviderFactory
import typings.theming.mod.ThemeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jss", "ThemeProvider")
@js.native
class ThemeProvider protected ()
  extends typings.theming.mod.ThemeProvider {
  def this(props: ThemeProviderProps[typings.theming.mod.DefaultTheme]) = this()
  def this(props: ThemeProviderProps[typings.theming.mod.DefaultTheme], context: js.Any) = this()
}

@JSImport("react-jss", "ThemeProvider")
@js.native
object ThemeProvider
  extends TopLevel[ThemeProviderFactory[typings.theming.mod.DefaultTheme]]

