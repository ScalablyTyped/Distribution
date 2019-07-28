package typings.reactDashToastr.reactDashToastrMod

import typings.react.reactMod.Component
import typings.react.reactMod.ReactNode
import typings.reactDashToastr.Anon_ClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-toastr", "ToastContainer")
@js.native
class ToastContainer ()
  extends Component[Anon_ClassName, js.Object, js.Any] {
  def clear(): Unit = js.native
  def error(message: ReactNode, title: ReactNode): Unit = js.native
  def error(message: ReactNode, title: ReactNode, optionsOverride: js.Object): Unit = js.native
  def info(message: ReactNode, title: ReactNode): Unit = js.native
  def info(message: ReactNode, title: ReactNode, optionsOverride: js.Object): Unit = js.native
  def success(message: ReactNode, title: ReactNode): Unit = js.native
  def success(message: ReactNode, title: ReactNode, optionsOverride: js.Object): Unit = js.native
  def warning(message: ReactNode, title: ReactNode): Unit = js.native
  def warning(message: ReactNode, title: ReactNode, optionsOverride: js.Object): Unit = js.native
}

