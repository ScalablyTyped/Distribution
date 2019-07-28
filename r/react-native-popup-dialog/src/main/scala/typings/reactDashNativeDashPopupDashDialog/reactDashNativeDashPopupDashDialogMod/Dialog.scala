package typings.reactDashNativeDashPopupDashDialog.reactDashNativeDashPopupDashDialogMod

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dialog
  extends Component[DialogProps, js.Any, js.Any] {
  def dismiss(): Unit = js.native
  def dismiss(onDismissed: js.Function0[Unit]): Unit = js.native
  def show(): Unit = js.native
  def show(onShown: js.Function0[Unit]): Unit = js.native
}

