package typings.semanticUiEmbed

import typings.semanticUiEmbed.SemanticUI.Embed
import typings.semanticUiEmbed.SemanticUI.EmbedSettings
import typings.semanticUiEmbed.semanticUiEmbedStrings.`get id`
import typings.semanticUiEmbed.semanticUiEmbedStrings.`get placeholder`
import typings.semanticUiEmbed.semanticUiEmbedStrings.`get sources`
import typings.semanticUiEmbed.semanticUiEmbedStrings.`get type`
import typings.semanticUiEmbed.semanticUiEmbedStrings.`get url`
import typings.semanticUiEmbed.semanticUiEmbedStrings.`has placeholder`
import typings.semanticUiEmbed.semanticUiEmbedStrings.change
import typings.semanticUiEmbed.semanticUiEmbedStrings.destroy
import typings.semanticUiEmbed.semanticUiEmbedStrings.hide
import typings.semanticUiEmbed.semanticUiEmbedStrings.reset
import typings.semanticUiEmbed.semanticUiEmbedStrings.setting
import typings.semanticUiEmbed.semanticUiEmbedStrings.show
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
  def embed_setting[K /* <: String */](behavior: setting, name: K): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-embed.SemanticUI.EmbedSettings._Impl[K] */ js.Any = js.native
  @JSName("embed")
  def embed_setting[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-embed.SemanticUI.EmbedSettings._Impl[K] */ js.Any
  ): JQuery = js.native
  /**
    * Shows embed content
    */
  @JSName("embed")
  def embed_show(behavior: show): JQuery = js.native
}

