package typings.semanticDashUiDashSearch.SemanticUINs.SearchNs

import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.category
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.prompt
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.result
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.results
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.searchButton
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SelectorSettingsNs {
  type Param = (Pick[_Impl, prompt | searchButton | results | category | result]) with (Partial[Pick[_Impl, prompt | searchButton | results | category | result]])
}
