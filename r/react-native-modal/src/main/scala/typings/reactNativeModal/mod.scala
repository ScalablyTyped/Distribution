package typings.reactNativeModal

import typings.reactNativeModal.modalMod.ModalProps
import typings.reactNativeModal.modalMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-modal", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ReactNativeModal protected ()
    extends typings.reactNativeModal.modalMod.ReactNativeModal {
    def this(props: ModalProps) = this()
  }
  
  @js.native
  class default protected ()
    extends typings.reactNativeModal.modalMod.ReactNativeModal {
    def this(props: ModalProps) = this()
  }
  
  /* static members */
  @js.native
  object ReactNativeModal extends js.Object {
    var defaultProps: AnonAnimationInAnimationInTiming = js.native
    var propTypes: AnonAnimationIn = js.native
    def getDerivedStateFromProps(nextProps: ModalProps, state: State): AnonIsVisible | Null = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: AnonAnimationInAnimationInTiming = js.native
    var propTypes: AnonAnimationIn = js.native
    def getDerivedStateFromProps(nextProps: ModalProps, state: State): AnonIsVisible | Null = js.native
  }
  
}

