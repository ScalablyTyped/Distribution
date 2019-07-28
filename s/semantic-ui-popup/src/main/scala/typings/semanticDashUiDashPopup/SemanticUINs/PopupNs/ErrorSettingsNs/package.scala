package typings.semanticDashUiDashPopup.SemanticUINs.PopupNs

import typings.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.cannotPlace
import typings.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.invalidPosition
import typings.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.method
import typings.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.noTransition
import typings.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.notFound
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ErrorSettingsNs {
  type Param = (Pick[_Impl, invalidPosition | cannotPlace | method | noTransition | notFound]) with (Partial[Pick[_Impl, invalidPosition | cannotPlace | method | noTransition | notFound]])
}
