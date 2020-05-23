package typings.reactNativeModal.modalMod

import typings.reactNativeModal.anon.AnimationIn
import typings.reactNativeModal.anon.AnimationInTiming
import typings.reactNativeModal.anon.IsVisible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-modal/dist/modal", JSImport.Default)
@js.native
class default protected () extends ReactNativeModal {
  def this(props: ModalProps) = this()
}

/* static members */
@JSImport("react-native-modal/dist/modal", JSImport.Default)
@js.native
object default extends js.Object {
  var defaultProps: AnimationInTiming = js.native
  var propTypes: AnimationIn = js.native
  def getDerivedStateFromProps(nextProps: ModalProps, state: State): IsVisible | Null = js.native
}

