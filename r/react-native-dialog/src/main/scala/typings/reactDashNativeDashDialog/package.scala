package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashDialog {
  import typings.reactDashNativeDashDialog.reactDashNativeDashDialogStrings.isVisible
  import typings.std.Exclude
  import typings.std.Pick

  type reactNativeModalContainerProps = Pick[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify reactNativeModal.ModalProps */ js.Any, 
    Exclude[String, isVisible]
  ]
}
