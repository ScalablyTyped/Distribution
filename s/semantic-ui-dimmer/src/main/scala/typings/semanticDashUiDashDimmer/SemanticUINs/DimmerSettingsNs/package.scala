package typings.semanticDashUiDashDimmer.SemanticUINs

import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.className
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.closable
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.debug
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.dimmerName
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.duration
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.error
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.name
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.namespace
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.on
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.onChange
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.onHide
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.onShow
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.opacity
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.performance
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.selector
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.silent
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.template
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.transition
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.useCSS
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.variation
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.verbose
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DimmerSettingsNs {
  type Param = (Pick[
    _Impl, 
    opacity | variation | dimmerName | closable | on | useCSS | duration | transition | onShow | onHide | onChange | selector | template | className | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      opacity | variation | dimmerName | closable | on | useCSS | duration | transition | selector | template | className | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}
