package typings.reactNativeElements.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-elements", "ThemeProvider")
@js.native
class ThemeProvider[T] protected ()
  extends Component[ThemeProviderProps[T], js.Object, js.Any] {
  def this(props: ThemeProviderProps[T]) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: ThemeProviderProps[T], context: js.Any) = this()
  
  def getTheme(): Theme[T] = js.native
  
  var replaceTheme: ReplaceTheme = js.native
  
  var updateTheme: UpdateTheme = js.native
}
