package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashDialog {
  import typings.reactDashNativeDashDialog.reactDashNativeDashDialogStrings.isVisible
  import typings.std.Exclude
  import typings.std.Partial
  import typings.std.Pick

  type reactNativeModalContainerProps = Partial[
    Pick[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify reactNativeModal.ModalProps */ js.Any, 
      Exclude[String, isVisible]
    ]
  ]
}
