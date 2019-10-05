package typings.semanticDashUiDashNag.SemanticUI.Nag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ClassNameSettings {
  import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.bottom
  import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.fixed
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, bottom | fixed]) with (Partial[Pick[_Impl, bottom | fixed]])
}
