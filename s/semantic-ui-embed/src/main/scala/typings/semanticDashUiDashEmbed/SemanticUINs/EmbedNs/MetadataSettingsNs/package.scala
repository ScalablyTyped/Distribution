package typings.semanticDashUiDashEmbed.SemanticUINs.EmbedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MetadataSettingsNs {
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.icon
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.id
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.placeholder
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.source
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.url
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, id | icon | placeholder | source | url]) with (Partial[Pick[_Impl, id | icon | placeholder | source | url]])
}
