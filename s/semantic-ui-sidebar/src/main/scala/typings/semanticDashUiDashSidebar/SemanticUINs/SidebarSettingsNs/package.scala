package typings.semanticDashUiDashSidebar.SemanticUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SidebarSettingsNs {
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.className
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.closable
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.context
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.debug
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.defaultTransition
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.delaySetup
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.dimPage
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.duration
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.easing
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.error
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.exclusive
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.mobileTransition
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.name
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.namespace
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.onChange
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.onHidden
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.onHide
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.onShow
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.onVisible
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.performance
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.regExp
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.returnScroll
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.scrollLock
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.selector
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.silent
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.transition
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.useLegacy
  import typings.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.verbose
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[
    _Impl, 
    context | exclusive | closable | dimPage | scrollLock | returnScroll | delaySetup | transition | mobileTransition | defaultTransition | useLegacy | duration | easing | onVisible | onShow | onChange | onHide | onHidden | className | regExp | selector | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      context | exclusive | closable | dimPage | scrollLock | returnScroll | delaySetup | transition | mobileTransition | defaultTransition | useLegacy | duration | easing | className | regExp | selector | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}
