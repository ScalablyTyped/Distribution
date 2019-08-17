package typings.semanticDashUiDashNag.SemanticUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object NagSettingsNs {
  import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.animation
  import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.className
  import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.context
  import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.debug
  import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.detachable
  import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.displayTime
  import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.domain
  import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.easing
  import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.error
  import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.expires
  import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.key
  import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.name
  import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.namespace
  import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.onHide
  import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.path
  import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.performance
  import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.persist
  import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.selector
  import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.silent
  import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.speed
  import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.storageMethod
  import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.value
  import typings.semanticDashUiDashNag.semanticDashUiDashNagStrings.verbose
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[
    _Impl, 
    persist | displayTime | animation | context | detachable | expires | domain | path | storageMethod | key | value | speed | easing | onHide | className | selector | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      persist | displayTime | animation | context | detachable | expires | domain | path | storageMethod | key | value | speed | easing | className | selector | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}
