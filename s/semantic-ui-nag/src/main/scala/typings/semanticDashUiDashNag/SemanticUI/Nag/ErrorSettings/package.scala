package typings.semanticDashUiDashNag.SemanticUI.Nag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ErrorSettings {
  import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.method
  import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.noCookieStorage
  import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.noStorage
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, noCookieStorage | noStorage | method]) with (Partial[Pick[_Impl, noCookieStorage | noStorage | method]])
}
