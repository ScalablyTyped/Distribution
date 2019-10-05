package typings.semanticDashUiDashSearch.SemanticUI.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TemplatesSettings {
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.category
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.escape
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.message
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.standard
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, escape | message | category | standard]) with (Partial[Pick[_Impl, String]])
}
