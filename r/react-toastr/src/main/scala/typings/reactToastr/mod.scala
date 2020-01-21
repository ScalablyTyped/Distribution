package typings.reactToastr

import typings.react.mod.Component
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-toastr", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ToastContainer ()
    extends Component[AnonClassName, js.Object, js.Any] {
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
  
  val ToastMessageAnimated: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 115 */ js.Any = js.native
  val ToastMessagejQuery: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 115 */ js.Any = js.native
}

