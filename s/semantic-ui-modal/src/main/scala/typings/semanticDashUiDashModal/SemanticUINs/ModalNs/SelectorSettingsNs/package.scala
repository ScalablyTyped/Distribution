package typings.semanticDashUiDashModal.SemanticUINs.ModalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SelectorSettingsNs {
  import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.approve
  import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.close
  import typings.semanticDashUiDashModal.semanticDashUiDashModalStrings.deny
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, close | approve | deny]) with (Partial[Pick[_Impl, close | approve | deny]])
}
