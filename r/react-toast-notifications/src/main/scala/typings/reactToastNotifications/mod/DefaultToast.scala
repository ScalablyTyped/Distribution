package typings.reactToastNotifications.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-toast-notifications", "DefaultToast")
@js.native
class DefaultToast protected ()
  extends Component[ToastProps, ComponentState, js.Any] {
  def this(props: ToastProps) = this()
  def this(props: ToastProps, context: js.Any) = this()
}

@JSImport("react-toast-notifications", "DefaultToast")
@js.native
object DefaultToast extends TopLevel[ComponentType[ToastProps]]

