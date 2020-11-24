package typings.primereact.toastMod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("primereact/components/toast/Toast", "Toast")
@js.native
class Toast ()
  extends Component[ToastProps, js.Any, js.Any] {
  
  def clear(): Unit = js.native
  
  def show(message: js.Array[ToastMessage]): Unit = js.native
  def show(message: ToastMessage): Unit = js.native
}
