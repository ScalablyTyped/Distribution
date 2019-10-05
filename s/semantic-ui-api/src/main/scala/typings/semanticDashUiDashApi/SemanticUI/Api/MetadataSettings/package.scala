package typings.semanticDashUiDashApi.SemanticUI.Api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MetadataSettings {
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.action
  import typings.semanticDashUiDashApi.semanticDashUiDashApiStrings.url
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, action | url]) with (Partial[Pick[_Impl, action | url]])
}
