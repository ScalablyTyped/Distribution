package typings.semanticDashUiDashNag.SemanticUI.Nag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AnimationSettings {
  import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.hide
  import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.show
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, show | hide]) with (Partial[Pick[_Impl, show | hide]])
}
