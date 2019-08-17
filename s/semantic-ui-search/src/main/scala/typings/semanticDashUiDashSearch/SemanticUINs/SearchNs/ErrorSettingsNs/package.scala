package typings.semanticDashUiDashSearch.SemanticUINs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ErrorSettingsNs {
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.logging
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.maxResults
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.method
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.noResults
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.noTemplate
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.serverError
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.source
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[
    _Impl, 
    source | noResults | logging | noTemplate | serverError | maxResults | method
  ]) with (Partial[
    Pick[
      _Impl, 
      source | noResults | logging | noTemplate | serverError | maxResults | method
    ]
  ])
}
