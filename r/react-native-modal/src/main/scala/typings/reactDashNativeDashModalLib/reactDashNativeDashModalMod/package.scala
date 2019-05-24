package typings
package reactDashNativeDashModalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashModalMod {
  type AnimationConfig = reactDashNativeDashAnimatableLib.reactDashNativeDashAnimatableMod.Animation | (reactDashNativeDashAnimatableLib.reactDashNativeDashAnimatableMod.CustomAnimation[
    reactDashNativeLib.reactDashNativeMod.TextStyle with reactDashNativeLib.reactDashNativeMod.ViewStyle with reactDashNativeLib.reactDashNativeMod.ImageStyle
  ])
  type Modal = reactLib.reactMod.Component[ModalProps, js.Object, js.Any]
}
