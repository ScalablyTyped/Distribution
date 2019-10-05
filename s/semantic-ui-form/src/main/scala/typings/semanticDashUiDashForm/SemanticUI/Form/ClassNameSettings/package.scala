package typings.semanticDashUiDashForm.SemanticUI.Form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ClassNameSettings {
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.active
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.disabled
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.placeholder
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.visible
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, active | placeholder | disabled | visible]) with (Partial[Pick[_Impl, active | placeholder | disabled | visible]])
}
