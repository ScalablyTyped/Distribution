package typings.semanticDashUiDashForm.SemanticUINs.FormNs

import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.error
import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.prompt
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TemplatesSettingsNs {
  type Param = (Pick[_Impl, error | prompt]) with (Partial[Pick[_Impl, String]])
}
