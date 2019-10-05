package typings.semanticDashUiDashApi.SemanticUI.Api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SelectorSettings {
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.disabled
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.form
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, disabled | form]) with (Partial[Pick[_Impl, disabled | form]])
}
