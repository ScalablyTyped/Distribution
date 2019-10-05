package typings.semanticDashUiDashTransition.SemanticUI.Transition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ErrorSettings {
  import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.method
  import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.noAnimation
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, noAnimation | method]) with (Partial[Pick[_Impl, noAnimation | method]])
}
