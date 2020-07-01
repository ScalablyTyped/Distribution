package typings.reactNativeNavigation

import typings.react.mod.FunctionComponent
import typings.reactNativeNavigation.navigationComponentPropsMod.NavigationComponentProps
import typings.reactNativeNavigation.optionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/interfaces/NavigationFunctionComponent", JSImport.Namespace)
@js.native
object navigationFunctionComponentMod extends js.Object {
  @js.native
  trait NavigationFunctionComponent[Props] extends FunctionComponent[Props with NavigationComponentProps] {
    var options: js.UndefOr[(js.Function1[/* props */ Props, Options]) | Options] = js.native
  }
  
}

