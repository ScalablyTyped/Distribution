package typings.semanticDashUiDashDimmer.SemanticUINs.DimmerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DurationSettingsNs {
  import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.hide
  import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.show
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, show | hide]) with (Partial[Pick[_Impl, show | hide]])
}
