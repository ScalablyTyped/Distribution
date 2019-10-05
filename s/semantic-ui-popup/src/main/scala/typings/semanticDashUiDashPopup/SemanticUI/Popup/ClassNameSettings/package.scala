package typings.semanticDashUiDashPopup.SemanticUI.Popup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ClassNameSettings {
  import typings.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.loading
  import typings.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.popup
  import typings.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.popupVisible
  import typings.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.position
  import typings.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.visible
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, loading | popup | position | visible | popupVisible]) with (Partial[Pick[_Impl, loading | popup | position | visible | popupVisible]])
}
