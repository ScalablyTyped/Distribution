package typings.reactNativeDialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type reactNativeModalContainerProps = typings.std.Partial[
    typings.std.Pick[
      typings.reactNativeModal.modalMod.ModalProps, 
      typings.std.Exclude[java.lang.String, typings.reactNativeDialog.reactNativeDialogStrings.isVisible]
    ]
  ]
}
