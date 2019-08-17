package typings.semanticDashUiDashEmbed.SemanticUINs.EmbedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TemplatesSettingsNs {
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.iframe
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.placeholder
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, iframe | placeholder]) with (Partial[Pick[_Impl, String]])
}
