package typings.reactDashNativeDashModal

import typings.react.reactMod.Component
import typings.reactDashNative.reactDashNativeMod.ImageStyle
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableMod.Animation
import typings.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableMod.CustomAnimation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashModalMod {
  type AnimationConfig = Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle])
  type Modal = Component[ModalProps, js.Object, js.Any]
}
