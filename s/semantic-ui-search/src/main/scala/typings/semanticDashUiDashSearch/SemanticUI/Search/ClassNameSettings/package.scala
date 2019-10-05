package typings.semanticDashUiDashSearch.SemanticUI.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ClassNameSettings {
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.active
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.empty
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.focus
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.loading
  import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.pressed
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, active | empty | focus | loading | pressed]) with (Partial[Pick[_Impl, active | empty | focus | loading | pressed]])
}
