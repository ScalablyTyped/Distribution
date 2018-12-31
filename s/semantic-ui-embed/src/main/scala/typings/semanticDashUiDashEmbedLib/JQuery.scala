package typings
package semanticDashUiDashEmbedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("embed")
  var embed_Original: semanticDashUiDashEmbedLib.SemanticUINs.Embed = js.native
  def embed(): JQuery = js.native
  def embed(settings: semanticDashUiDashEmbedLib.SemanticUINs.EmbedSettings): JQuery = js.native
  /**
    * Changes iframe to a new content source
    */
  @JSName("embed")
  def embed_change(
    behavior: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibStrings.change,
    source: java.lang.String,
    id: java.lang.String,
    url: java.lang.String
  ): JQuery = js.native
  /**
    * Destroys instance and removes all events
    */
  @JSName("embed")
  def embed_destroy(behavior: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibStrings.destroy): JQuery = js.native
  /**
    * Returns current content id
    */
  @JSName("embed")
  def `embed_get id`(behavior: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibStrings.`get id`): java.lang.String = js.native
  /**
    * Returns placeholder image url
    */
  @JSName("embed")
  def `embed_get placeholder`(behavior: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibStrings.`get placeholder`): java.lang.String = js.native
  /**
    * Returns source name
    */
  @JSName("embed")
  def `embed_get sources`(behavior: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibStrings.`get sources`): java.lang.String = js.native
  /**
    * Returns source type
    */
  @JSName("embed")
  def `embed_get type`(behavior: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibStrings.`get type`): java.lang.String = js.native
  /**
    * Returns URL with all parameters added
    */
  @JSName("embed")
  def `embed_get url`(behavior: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibStrings.`get url`): java.lang.String = js.native
  /**
    * Returns whether embed content has placeholder
    */
  @JSName("embed")
  def `embed_has placeholder`(behavior: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibStrings.`has placeholder`): scala.Boolean = js.native
  /**
    * Hides embed content and shows placeholder content
    */
  @JSName("embed")
  def embed_hide(behavior: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibStrings.hide): JQuery = js.native
  /**
    * Removes embed and shows placeholder content if available
    */
  @JSName("embed")
  def embed_reset(behavior: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibStrings.reset): JQuery = js.native
  @JSName("embed")
  def embed_setting(
    behavior: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibStrings.setting,
    value: semanticDashUiDashEmbedLib.SemanticUINs.EmbedSettings
  ): JQuery = js.native
  @JSName("embed")
  def embed_setting[K /* <: java.lang.String */](behavior: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibStrings.setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-embed.SemanticUI.EmbedSettings._Impl[K] */ js.Any = js.native
  @JSName("embed")
  def embed_setting[K /* <: java.lang.String */](
    behavior: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibStrings.setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-embed.SemanticUI.EmbedSettings._Impl[K] */ js.Any
  ): JQuery = js.native
  /**
    * Shows embed content
    */
  @JSName("embed")
  def embed_show(behavior: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibStrings.show): JQuery = js.native
}

