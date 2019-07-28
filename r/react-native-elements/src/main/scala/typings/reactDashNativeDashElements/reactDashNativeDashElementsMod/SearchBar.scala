package typings.reactDashNativeDashElements.reactDashNativeDashElementsMod

import typings.react.reactMod.Component
import typings.reactDashNative.reactDashNativeMod.TextInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-elements", "SearchBar")
@js.native
class SearchBar ()
  extends Component[SearchBarProps, js.Any, js.Any] {
  /**
    * Only available for Android and IOS
    * call blur on the TextInput
    * call cancel passed from Props
    */
  var cancel: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Holds reference to the stored input.
    */
  var input: TextInput = js.native
  /**
    * Call blur on the TextInput
    */
  def blur(): Unit = js.native
  /**
    * Call clear on the TextInput
    */
  def clear(): Unit = js.native
  /**
    * Call focus on the TextInput
    */
  def focus(): Unit = js.native
}

