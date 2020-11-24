package typings.reactNativeElements.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-elements", "ThemeProvider")
@js.native
class ThemeProvider[T] ()
  extends Component[ThemeProviderProps[T], js.Object, js.Any] {
  
  def getTheme(): Theme[T] = js.native
  
  var replaceTheme: ReplaceTheme = js.native
  
  var updateTheme: UpdateTheme = js.native
}
