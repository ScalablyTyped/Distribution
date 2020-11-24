package typings.reactNativeModals.mod

import typings.react.mod.Component
import typings.reactNativeModals.anon.Width
import typings.reactNativeModals.reactNativeModalsStrings.auto
import typings.reactNativeModals.reactNativeModalsStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Modal
  extends Component[ModalProps, js.Object, js.Any] {
  
  def dismiss(): Unit = js.native
  
  var modalSize: Width = js.native
  
  var pointerEvents: auto | none = js.native
  
  def show(): Unit = js.native
}
