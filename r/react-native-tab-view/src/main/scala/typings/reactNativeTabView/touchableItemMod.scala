package typings.reactNativeTabView

import typings.react.mod.Component
import typings.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-tab-view/lib/typescript/src/TouchableItem", JSImport.Namespace)
@js.native
object touchableItemMod extends js.Object {
  @js.native
  trait TouchableItem
    extends Component[Props, js.Object, js.Any]
  
  @js.native
  class default () extends TouchableItem
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: AnonPressColor = js.native
  }
  
  type Props = ViewProps with AnonBorderless
}

