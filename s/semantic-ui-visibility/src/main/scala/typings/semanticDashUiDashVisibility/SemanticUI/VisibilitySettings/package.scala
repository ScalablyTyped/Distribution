package typings.semanticDashUiDashVisibility.SemanticUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object VisibilitySettings {
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.`type`
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.checkOnRefresh
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.className
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.context
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.continuous
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.debug
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.duration
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.error
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.includeMargin
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.initialCheck
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.name
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.namespace
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.observeChanges
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.offset
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onAllLoaded
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onBottomPassed
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onBottomPassedReverse
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onBottomVisible
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onBottomVisibleReverse
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onFixed
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onLoad
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onOffScreen
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onOnScreen
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onPassing
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onPassingReverse
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onRefresh
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onTopPassed
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onTopPassedReverse
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onTopVisible
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onTopVisibleReverse
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onUnfixed
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onUpdate
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.once
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.performance
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.refreshOnLoad
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.refreshOnResize
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.silent
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.throttle
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.transition
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.verbose
  import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.zIndex
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[
    _Impl, 
    once | continuous | `type` | initialCheck | context | refreshOnLoad | refreshOnResize | checkOnRefresh | zIndex | offset | includeMargin | throttle | observeChanges | transition | duration | onTopVisible | onTopPassed | onBottomVisible | onPassing | onBottomPassed | onTopVisibleReverse | onTopPassedReverse | onBottomVisibleReverse | onPassingReverse | onBottomPassedReverse | onOnScreen | onOffScreen | onLoad | onAllLoaded | onFixed | onUnfixed | onUpdate | onRefresh | className | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      once | continuous | `type` | initialCheck | context | refreshOnLoad | refreshOnResize | checkOnRefresh | zIndex | offset | includeMargin | throttle | observeChanges | transition | duration | className | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}
