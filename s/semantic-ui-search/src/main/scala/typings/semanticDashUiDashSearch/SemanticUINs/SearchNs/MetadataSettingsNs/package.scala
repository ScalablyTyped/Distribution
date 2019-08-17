package typings.semanticDashUiDashSearch.SemanticUINs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MetadataSettingsNs {
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.cache
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.results
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, cache | results]) with (Partial[Pick[_Impl, cache | results]])
}
