package typings.semanticDashUiDashSearch.SemanticUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SearchSettings {
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.`type`
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.apiSettings
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.cache
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.className
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.debug
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.duration
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.easing
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.error
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.fields
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.hideDelay
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.maxResults
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.metadata
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.minCharacters
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.name
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.namespace
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.onResults
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.onResultsAdd
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.onResultsClose
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.onResultsOpen
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.onSearchQuery
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.onSelect
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.performance
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.regExp
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.searchDelay
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.searchFields
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.searchFullText
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.selectFirstResult
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.selector
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.showNoResults
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.silent
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.source
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.templates
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.transition
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.verbose
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[
    _Impl, 
    apiSettings | `type` | minCharacters | transition | duration | maxResults | cache | source | selectFirstResult | showNoResults | searchFullText | fields | searchFields | hideDelay | searchDelay | easing | onSelect | onResultsAdd | onSearchQuery | onResults | onResultsOpen | onResultsClose | templates | regExp | selector | metadata | className | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      `type` | apiSettings | minCharacters | transition | duration | maxResults | cache | source | selectFirstResult | showNoResults | searchFullText | fields | searchFields | hideDelay | searchDelay | easing | templates | regExp | selector | metadata | className | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}
