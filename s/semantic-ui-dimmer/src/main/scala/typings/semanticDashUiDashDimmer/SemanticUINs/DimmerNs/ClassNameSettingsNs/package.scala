package typings.semanticDashUiDashDimmer.SemanticUINs.DimmerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ClassNameSettingsNs {
  import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.active
  import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.dimmable
  import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.dimmed
  import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.disabled
  import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.hide
  import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.pageDimmer
  import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.show
  import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.transition
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[
    _Impl, 
    active | dimmable | dimmed | disabled | pageDimmer | hide | show | transition
  ]) with (Partial[
    Pick[
      _Impl, 
      active | dimmable | dimmed | disabled | pageDimmer | hide | show | transition
    ]
  ])
}
