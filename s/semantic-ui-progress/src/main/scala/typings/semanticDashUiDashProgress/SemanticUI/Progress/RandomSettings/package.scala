package typings.semanticDashUiDashProgress.SemanticUI.Progress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RandomSettings {
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.max
  import typings.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.min
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, min | max]) with (Partial[Pick[_Impl, min | max]])
}
