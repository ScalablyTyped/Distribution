package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-elements", "ThemeProvider")
@js.native
class ThemeProvider[T] ()
  extends reactLib.reactMod.Component[ThemeProviderProps[T], js.Object, js.Any] {
  @JSName("updateTheme")
  var updateTheme_Original: UpdateTheme = js.native
  def getTheme(): Theme[T] = js.native
  def updateTheme(updates: RecursivePartial[FullTheme]): scala.Unit = js.native
}

