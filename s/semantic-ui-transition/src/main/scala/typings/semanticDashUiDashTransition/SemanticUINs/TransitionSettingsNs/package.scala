package typings.semanticDashUiDashTransition.SemanticUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TransitionSettingsNs {
  import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.allowRepeats
  import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.animation
  import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.className
  import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.debug
  import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.displayType
  import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.duration
  import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.error
  import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.interval
  import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.name
  import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.namespace
  import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.onComplete
  import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.onHide
  import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.onShow
  import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.onStart
  import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.performance
  import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.queue
  import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.reverse
  import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.silent
  import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.useFailSafe
  import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.verbose
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[
    _Impl, 
    animation | interval | reverse | displayType | duration | useFailSafe | allowRepeats | queue | onShow | onHide | onStart | onComplete | className | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      animation | interval | reverse | displayType | duration | useFailSafe | allowRepeats | queue | className | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}
