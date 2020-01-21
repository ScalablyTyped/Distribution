package typings.semanticUiEmbed.SemanticUI

import typings.semanticUiEmbed.JQuery
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
trait Embed_ extends js.Object {
  var settings: EmbedSettings = js.native
  def apply(): JQuery = js.native
  /**
    * Returns current content id
    */
  def apply(behavior: `get id`): String = js.native
  /**
    * Returns placeholder image url
    */
  def apply(behavior: `get placeholder`): String = js.native
  /**
    * Returns source name
    */
  def apply(behavior: `get sources`): String = js.native
  /**
    * Returns source type
    */
  def apply(behavior: `get type`): String = js.native
  /**
    * Returns URL with all parameters added
    */
  def apply(behavior: `get url`): String = js.native
  /**
    * Returns whether embed content has placeholder
    */
  def apply(behavior: `has placeholder`): Boolean = js.native
  /**
    * Changes iframe to a new content source
    */
  def apply(behavior: change, source: String, id: String, url: String): JQuery = js.native
  /**
    * Destroys instance and removes all events
    */
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Hides embed content and shows placeholder content
    */
  def apply(behavior: hide): JQuery = js.native
  /**
    * Removes embed and shows placeholder content if available
    */
  def apply(behavior: reset): JQuery = js.native
  def apply(behavior: setting, value: EmbedSettings): JQuery = js.native
  /**
    * Shows embed content
    */
  def apply(behavior: show): JQuery = js.native
  def apply(settings: EmbedSettings): JQuery = js.native
  def apply[K /* <: String */](behavior: setting, name: K): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-embed.SemanticUI.EmbedSettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-embed.SemanticUI.EmbedSettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

