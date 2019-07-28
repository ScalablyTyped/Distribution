package typings.semanticDashUiDashProgress.SemanticUINs.ProgressNs

import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.active
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.error
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.percent
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.ratio
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.success
import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.warning
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TextSettingsNs {
  type Param = (Pick[_Impl, active | error | success | warning | percent | ratio]) with (Partial[Pick[_Impl, active | error | success | warning | percent | ratio]])
}
