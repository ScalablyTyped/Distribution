package typings.reactDashNativeDashTabDashView

import typings.react.reactMod.Component
import typings.reactDashNative.reactDashNativeMod.ViewProps
import typings.reactDashNativeDashTabDashView.libTypescriptSrcTouchableItemMod.Props
import typings.reactDashNativeDashTabDashView.libTypescriptSrcTouchableItemMod.TouchableItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-tab-view/lib/typescript/src/TouchableItem", JSImport.Namespace)
@js.native
object libTypescriptSrcTouchableItemMod extends js.Object {
  @js.native
  trait TouchableItem
    extends Component[Props, js.Object, js.Any]
  
  @js.native
  class default () extends TouchableItem
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Anon_PressColor = js.native
  }
  
  type Props = ViewProps with Anon_Borderless
}

