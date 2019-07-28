package typings.semanticDashUiDashDimmer.SemanticUINs.DimmerNs

import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.content
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.dimmable
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.dimmer
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SelectorSettingsNs {
  type Param = (Pick[_Impl, dimmable | dimmer | content]) with (Partial[Pick[_Impl, dimmable | dimmer | content]])
}
