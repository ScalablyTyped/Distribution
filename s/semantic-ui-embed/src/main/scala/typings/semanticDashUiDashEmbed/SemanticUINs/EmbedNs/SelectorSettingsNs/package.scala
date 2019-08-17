package typings.semanticDashUiDashEmbed.SemanticUINs.EmbedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SelectorSettingsNs {
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.embed
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.placeholder
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.play
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, embed | placeholder | play]) with (Partial[Pick[_Impl, embed | placeholder | play]])
}
