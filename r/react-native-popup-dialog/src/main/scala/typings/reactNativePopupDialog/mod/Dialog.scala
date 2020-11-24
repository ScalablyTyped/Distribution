package typings.reactNativePopupDialog.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dialog
  extends Component[DialogProps, js.Any, js.Any] {
  
  def dismiss(): Unit = js.native
  def dismiss(onDismissed: js.Function0[Unit]): Unit = js.native
  
  def show(): Unit = js.native
  def show(onShown: js.Function0[Unit]): Unit = js.native
}
