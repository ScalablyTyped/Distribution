package typings.reactDashNativeDashElements.reactDashNativeDashElementsMod

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-elements", "ThemeProvider")
@js.native
class ThemeProvider[T] ()
  extends Component[ThemeProviderProps[T], js.Object, js.Any] {
  var replaceTheme: ReplaceTheme = js.native
  var updateTheme: UpdateTheme = js.native
  def getTheme(): Theme[T] = js.native
}

