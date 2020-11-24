package typings.reactNativeModalbox.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Modal
  extends Component[ModalProps, js.Object, js.Any] {
  
  /**
    * Close the modal
    *
    *
    */
  def close(): Unit = js.native
  
  /**
    * Open the modal
    *
    *
    */
  def open(): Unit = js.native
}
