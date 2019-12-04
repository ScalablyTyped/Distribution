package typings.reactDashNativeDashDialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashDialogMod {
  import typings.reactDashNativeDashDialog.reactDashNativeDashDialogStrings.isVisible
  import typings.reactDashNativeDashModal.distModalMod.ModalProps
  import typings.std.Exclude
  import typings.std.Partial
  import typings.std.Pick

  type reactNativeModalContainerProps = Partial[Pick[ModalProps, Exclude[String, isVisible]]]
}
