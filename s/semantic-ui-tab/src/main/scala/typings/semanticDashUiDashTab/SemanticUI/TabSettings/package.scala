package typings.semanticDashUiDashTab.SemanticUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TabSettings {
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.alwaysRefresh
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.apiSettings
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.auto
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.cache
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.cacheType
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.childrenOnly
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.className
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.context
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.deactivate
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.debug
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.error
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.evaluateScripts
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.history
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.historyType
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.ignoreFirstLoad
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.loadOnce
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.maxDepth
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.metadata
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.name
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.namespace
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.onFirstLoad
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.onLoad
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.onRequest
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.onVisible
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.path
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.performance
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.selector
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.silent
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.templates
  import typings.semanticDashUiDashTab.semanticDashUiDashTabStrings.verbose
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[
    _Impl, 
    auto | deactivate | history | ignoreFirstLoad | evaluateScripts | alwaysRefresh | cacheType | cache | apiSettings | historyType | path | context | childrenOnly | maxDepth | loadOnce | onFirstLoad | onLoad | onRequest | onVisible | templates | selector | metadata | className | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      auto | deactivate | history | ignoreFirstLoad | evaluateScripts | alwaysRefresh | cacheType | cache | apiSettings | historyType | path | context | childrenOnly | maxDepth | loadOnce | templates | selector | metadata | className | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}
