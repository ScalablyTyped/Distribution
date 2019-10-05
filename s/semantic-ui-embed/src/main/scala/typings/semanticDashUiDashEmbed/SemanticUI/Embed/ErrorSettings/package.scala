package typings.semanticDashUiDashEmbed.SemanticUI.Embed

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ErrorSettings {
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.method
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.noURL
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, noURL | method]) with (Partial[Pick[_Impl, noURL | method]])
}
