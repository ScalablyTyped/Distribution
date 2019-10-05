package typings.semanticDashUiDashPopup.SemanticUI.Popup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DelaySettings {
  import typings.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.hide
  import typings.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.show
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, show | hide]) with (Partial[Pick[_Impl, show | hide]])
}
