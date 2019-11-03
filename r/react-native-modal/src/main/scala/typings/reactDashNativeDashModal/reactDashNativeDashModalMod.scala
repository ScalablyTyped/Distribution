package typings.reactDashNativeDashModal

import typings.reactDashNativeDashModal.distModalMod.ModalProps
import typings.reactDashNativeDashModal.distModalMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-modal", JSImport.Namespace)
@js.native
object reactDashNativeDashModalMod extends js.Object {
  @js.native
  class ReactNativeModal protected ()
    extends typings.reactDashNativeDashModal.distModalMod.ReactNativeModal {
    def this(props: ModalProps) = this()
  }
  
  @js.native
  class default protected ()
    extends typings.reactDashNativeDashModal.distModalMod.ReactNativeModal {
    def this(props: ModalProps) = this()
  }
  
  /* static members */
  @js.native
  object ReactNativeModal extends js.Object {
    var defaultProps: Anon_AnimationInAnimationInTiming = js.native
    var propTypes: Anon_AnimationIn = js.native
    def getDerivedStateFromProps(nextProps: ModalProps, state: State): Anon_IsVisible | Null = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Anon_AnimationInAnimationInTiming = js.native
    var propTypes: Anon_AnimationIn = js.native
    def getDerivedStateFromProps(nextProps: ModalProps, state: State): Anon_IsVisible | Null = js.native
  }
  
}

