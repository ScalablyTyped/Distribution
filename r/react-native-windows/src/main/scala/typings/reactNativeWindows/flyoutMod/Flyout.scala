package typings.reactNativeWindows.flyoutMod

import typings.react.mod.Component
import typings.reactNativeWindows.flyoutPropsMod.IFlyoutProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-windows/Libraries/Components/Flyout/Flyout", "Flyout")
@js.native
class Flyout protected ()
  extends Component[IFlyoutProps, IFlyoutTargetState, js.Any] {
  def this(props: IFlyoutProps) = this()
}
/* static members */
@JSImport("react-native-windows/Libraries/Components/Flyout/Flyout", "Flyout")
@js.native
object Flyout extends js.Object {
  
  def getDerivedStateFromProps(nextProps: IFlyoutProps, prevState: IFlyoutTargetState): IFlyoutTargetState = js.native
}
