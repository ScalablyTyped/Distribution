package typings.semanticDashUiDashSearch.SemanticUINs.SearchNs

import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.beginsWith
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.escape
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RegExpSettingsNs {
  type Param = (Pick[_Impl, escape | beginsWith]) with (Partial[Pick[_Impl, escape | beginsWith]])
}
