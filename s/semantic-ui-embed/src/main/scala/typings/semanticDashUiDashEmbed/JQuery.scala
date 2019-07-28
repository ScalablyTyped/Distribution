package typings.semanticDashUiDashEmbed

import typings.semanticDashUiDashEmbed.SemanticUINs.Embed
import typings.semanticDashUiDashEmbed.SemanticUINs.EmbedSettings
import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.`get id`
import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.`get placeholder`
import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.`get sources`
import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.`get type`
import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.`get url`
import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.`has placeholder`
import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.change
import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.destroy
import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.hide
import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.reset
import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.setting
import typings.semanticDashUiDashEmbed.semanticDashUiDashEmbedStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("embed")
  var embed_Original: Embed = js.native
  def embed(): JQuery = js.native
  def embed(settings: EmbedSettings): JQuery = js.native
  /**
    * Changes iframe to a new content source
    */
  @JSName("embed")
  def embed_change(behavior: change, source: String, id: String, url: String): JQuery = js.native
  /**
    * Destroys instance and removes all events
    */
  @JSName("embed")
  def embed_destroy(behavior: destroy): JQuery = js.native
  /**
    * Returns current content id
    */
  @JSName("embed")
  def embed_getid(behavior: `get id`): String = js.native
  /**
    * Returns placeholder image url
    */
  @JSName("embed")
  def embed_getplaceholder(behavior: `get placeholder`): String = js.native
  /**
    * Returns source name
    */
  @JSName("embed")
  def embed_getsources(behavior: `get sources`): String = js.native
  /**
    * Returns source type
    */
  @JSName("embed")
  def embed_gettype(behavior: `get type`): String = js.native
  /**
    * Returns URL with all parameters added
    */
  @JSName("embed")
  def embed_geturl(behavior: `get url`): String = js.native
  /**
    * Returns whether embed content has placeholder
    */
  @JSName("embed")
  def embed_hasplaceholder(behavior: `has placeholder`): Boolean = js.native
  /**
    * Hides embed content and shows placeholder content
    */
  @JSName("embed")
  def embed_hide(behavior: hide): JQuery = js.native
  /**
    * Removes embed and shows placeholder content if available
    */
  @JSName("embed")
  def embed_reset(behavior: reset): JQuery = js.native
  @JSName("embed")
  def embed_setting(behavior: setting, value: EmbedSettings): JQuery = js.native
  @JSName("embed")
  def embed_setting[K /* <: String */](behavior: setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-embed.SemanticUI.EmbedSettings._Impl[K] */ js.Any = js.native
  @JSName("embed")
  def embed_setting[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-embed.SemanticUI.EmbedSettings._Impl[K] */ js.Any
  ): JQuery = js.native
  /**
    * Shows embed content
    */
  @JSName("embed")
  def embed_show(behavior: show): JQuery = js.native
}

