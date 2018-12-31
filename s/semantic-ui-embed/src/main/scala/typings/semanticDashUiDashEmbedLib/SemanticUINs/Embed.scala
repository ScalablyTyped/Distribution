package typings
package semanticDashUiDashEmbedLib.SemanticUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Embed extends js.Object {
  var settings: EmbedSettings = js.native
  def apply(): semanticDashUiDashEmbedLib.JQuery = js.native
  /**
    * Returns current content id
    */
  def apply(behavior: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibStrings.`get id`): java.lang.String = js.native
  /**
    * Returns placeholder image url
    */
  def apply(behavior: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibStrings.`get placeholder`): java.lang.String = js.native
  /**
    * Returns source name
    */
  def apply(behavior: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibStrings.`get sources`): java.lang.String = js.native
  /**
    * Returns source type
    */
  def apply(behavior: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibStrings.`get type`): java.lang.String = js.native
  /**
    * Returns URL with all parameters added
    */
  def apply(behavior: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibStrings.`get url`): java.lang.String = js.native
  /**
    * Returns whether embed content has placeholder
    */
  def apply(behavior: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibStrings.`has placeholder`): scala.Boolean = js.native
  /**
    * Changes iframe to a new content source
    */
  def apply(
    behavior: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibStrings.change,
    source: java.lang.String,
    id: java.lang.String,
    url: java.lang.String
  ): semanticDashUiDashEmbedLib.JQuery = js.native
  /**
    * Destroys instance and removes all events
    */
  def apply(behavior: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibStrings.destroy): semanticDashUiDashEmbedLib.JQuery = js.native
  /**
    * Hides embed content and shows placeholder content
    */
  def apply(behavior: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibStrings.hide): semanticDashUiDashEmbedLib.JQuery = js.native
  /**
    * Removes embed and shows placeholder content if available
    */
  def apply(behavior: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibStrings.reset): semanticDashUiDashEmbedLib.JQuery = js.native
  def apply(
    behavior: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibStrings.setting,
    value: EmbedSettings
  ): semanticDashUiDashEmbedLib.JQuery = js.native
  /**
    * Shows embed content
    */
  def apply(behavior: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibStrings.show): semanticDashUiDashEmbedLib.JQuery = js.native
  def apply(settings: EmbedSettings): semanticDashUiDashEmbedLib.JQuery = js.native
  def apply[K /* <: java.lang.String */](behavior: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibStrings.setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-embed.SemanticUI.EmbedSettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: java.lang.String */](
    behavior: semanticDashUiDashEmbedLib.semanticDashUiDashEmbedLibStrings.setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-embed.SemanticUI.EmbedSettings._Impl[K] */ js.Any
  ): semanticDashUiDashEmbedLib.JQuery = js.native
}

