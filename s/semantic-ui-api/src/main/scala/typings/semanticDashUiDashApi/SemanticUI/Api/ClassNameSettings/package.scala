package typings.semanticDashUiDashApi.SemanticUI.Api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ClassNameSettings {
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.error
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.loading
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, loading | error]) with (Partial[Pick[_Impl, loading | error]])
}
