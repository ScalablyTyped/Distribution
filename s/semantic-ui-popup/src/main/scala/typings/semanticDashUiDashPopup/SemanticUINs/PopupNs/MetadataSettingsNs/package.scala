package typings.semanticDashUiDashPopup.SemanticUINs.PopupNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MetadataSettingsNs {
  import typings.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.content
  import typings.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.html
  import typings.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.offset
  import typings.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.position
  import typings.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.title
  import typings.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.variation
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, content | html | offset | position | title | variation]) with (Partial[Pick[_Impl, content | html | offset | position | title | variation]])
}
