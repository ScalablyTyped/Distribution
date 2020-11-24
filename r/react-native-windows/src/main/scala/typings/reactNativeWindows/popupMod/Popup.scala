package typings.reactNativeWindows.popupMod

import typings.react.mod.Component
import typings.reactNativeWindows.popupPropsMod.IPopupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-windows/Libraries/Components/Popup/Popup", "Popup")
@js.native
class Popup protected ()
  extends Component[IPopupProps, IPopupTargetState, js.Any] {
  def this(props: IPopupProps) = this()
}
/* static members */
@JSImport("react-native-windows/Libraries/Components/Popup/Popup", "Popup")
@js.native
object Popup extends js.Object {
  
  def getDerivedStateFromProps(nextProps: IPopupProps, prevState: IPopupTargetState): IPopupTargetState = js.native
}
