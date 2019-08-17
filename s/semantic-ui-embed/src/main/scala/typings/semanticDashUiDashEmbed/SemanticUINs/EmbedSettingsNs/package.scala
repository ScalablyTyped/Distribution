package typings.semanticDashUiDashEmbed.SemanticUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EmbedSettingsNs {
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.autoplay
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.brandedUI
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.className
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.color
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.debug
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.error
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.hd
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.icon
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.id
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.metadata
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.name
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.namespace
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.onCreate
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.onDisplay
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.onEmbed
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.onPlaceholderDisplay
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.parameters
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.performance
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.selector
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.silent
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.source
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.templates
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.url
  import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.verbose
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[
    _Impl, 
    url | icon | source | id | parameters | autoplay | color | hd | brandedUI | onCreate | onDisplay | onPlaceholderDisplay | onEmbed | selector | metadata | className | templates | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      url | icon | source | id | parameters | autoplay | color | hd | brandedUI | selector | metadata | className | templates | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}
