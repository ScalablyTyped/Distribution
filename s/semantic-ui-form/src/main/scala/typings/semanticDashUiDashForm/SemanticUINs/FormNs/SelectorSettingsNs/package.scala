package typings.semanticDashUiDashForm.SemanticUINs.FormNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SelectorSettingsNs {
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.field
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.group
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.input
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.message
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.prompt
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.submit
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, message | field | group | input | prompt | submit]) with (Partial[Pick[_Impl, message | field | group | input | prompt | submit]])
}
