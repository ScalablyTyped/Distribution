package typings.semanticUiEmbed.SemanticUI

import typings.semanticUiEmbed.JQuery
import typings.semanticUiEmbed.SemanticUI.Embed.ClassNameSettings
import typings.semanticUiEmbed.SemanticUI.Embed.ErrorSettings
import typings.semanticUiEmbed.SemanticUI.Embed.MetadataSettings
import typings.semanticUiEmbed.SemanticUI.Embed.ParametersSettings
import typings.semanticUiEmbed.SemanticUI.Embed.SelectorSettings
import typings.semanticUiEmbed.SemanticUI.Embed.TemplatesSettings
import typings.semanticUiEmbed.semanticUiEmbedBooleans.`false`
import typings.semanticUiEmbed.semanticUiEmbedStrings.`get id`
import typings.semanticUiEmbed.semanticUiEmbedStrings.`get placeholder`
import typings.semanticUiEmbed.semanticUiEmbedStrings.`get sources`
import typings.semanticUiEmbed.semanticUiEmbedStrings.`get type`
import typings.semanticUiEmbed.semanticUiEmbedStrings.`get url`
import typings.semanticUiEmbed.semanticUiEmbedStrings.`has placeholder`
import typings.semanticUiEmbed.semanticUiEmbedStrings.auto
import typings.semanticUiEmbed.semanticUiEmbedStrings.autoplay
import typings.semanticUiEmbed.semanticUiEmbedStrings.brandedUI
import typings.semanticUiEmbed.semanticUiEmbedStrings.change
import typings.semanticUiEmbed.semanticUiEmbedStrings.className
import typings.semanticUiEmbed.semanticUiEmbedStrings.color
import typings.semanticUiEmbed.semanticUiEmbedStrings.debug
import typings.semanticUiEmbed.semanticUiEmbedStrings.destroy
import typings.semanticUiEmbed.semanticUiEmbedStrings.error
import typings.semanticUiEmbed.semanticUiEmbedStrings.hd
import typings.semanticUiEmbed.semanticUiEmbedStrings.hide
import typings.semanticUiEmbed.semanticUiEmbedStrings.icon
import typings.semanticUiEmbed.semanticUiEmbedStrings.id
import typings.semanticUiEmbed.semanticUiEmbedStrings.metadata
import typings.semanticUiEmbed.semanticUiEmbedStrings.name
import typings.semanticUiEmbed.semanticUiEmbedStrings.namespace
import typings.semanticUiEmbed.semanticUiEmbedStrings.onCreate
import typings.semanticUiEmbed.semanticUiEmbedStrings.onDisplay
import typings.semanticUiEmbed.semanticUiEmbedStrings.onEmbed
import typings.semanticUiEmbed.semanticUiEmbedStrings.onPlaceholderDisplay
import typings.semanticUiEmbed.semanticUiEmbedStrings.parameters
import typings.semanticUiEmbed.semanticUiEmbedStrings.performance
import typings.semanticUiEmbed.semanticUiEmbedStrings.reset
import typings.semanticUiEmbed.semanticUiEmbedStrings.selector
import typings.semanticUiEmbed.semanticUiEmbedStrings.setting
import typings.semanticUiEmbed.semanticUiEmbedStrings.show
import typings.semanticUiEmbed.semanticUiEmbedStrings.silent
import typings.semanticUiEmbed.semanticUiEmbedStrings.source
import typings.semanticUiEmbed.semanticUiEmbedStrings.templates
import typings.semanticUiEmbed.semanticUiEmbedStrings.url
import typings.semanticUiEmbed.semanticUiEmbedStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Embed_ extends js.Object {
  
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
  def apply(behavior: setting, name: autoplay, value: js.UndefOr[scala.Nothing]): auto | Boolean = js.native
  def apply(behavior: setting, name: autoplay, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: autoplay, value: auto): JQuery = js.native
  def apply(behavior: setting, name: brandedUI, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: brandedUI, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: className, value: js.UndefOr[scala.Nothing]): ClassNameSettings = js.native
  def apply(behavior: setting, name: color, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: color, value: String): JQuery = js.native
  def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
  def apply(behavior: setting, name: hd, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: hd, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: icon, value: js.UndefOr[scala.Nothing]): `false` | String = js.native
  def apply(behavior: setting, name: icon, value: String): JQuery = js.native
  def apply(behavior: setting, name: icon, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: id, value: js.UndefOr[scala.Nothing]): `false` | String = js.native
  def apply(behavior: setting, name: id, value: String): JQuery = js.native
  def apply(behavior: setting, name: id, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: metadata, value: MetadataSettings): JQuery = js.native
  def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: onCreate, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* url */ String, Unit] = js.native
  def apply(
    behavior: setting,
    name: onCreate,
    value: js.ThisFunction1[/* this */ JQuery, /* url */ String, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onDisplay, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onDisplay, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onEmbed, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* parameters */ ParametersSettings, ParametersSettings] = js.native
  def apply(
    behavior: setting,
    name: onEmbed,
    value: js.ThisFunction1[/* this */ JQuery, /* parameters */ ParametersSettings, ParametersSettings]
  ): JQuery = js.native
  def apply(behavior: setting, name: onPlaceholderDisplay, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onPlaceholderDisplay, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: parameters, value: js.UndefOr[scala.Nothing]): `false` | ParametersSettings = js.native
  def apply(behavior: setting, name: parameters, value: ParametersSettings): JQuery = js.native
  def apply(behavior: setting, name: parameters, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: selector, value: js.UndefOr[scala.Nothing]): SelectorSettings = js.native
  def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: source, value: js.UndefOr[scala.Nothing]): `false` | String = js.native
  def apply(behavior: setting, name: source, value: String): JQuery = js.native
  def apply(behavior: setting, name: source, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: templates, value: js.UndefOr[scala.Nothing]): TemplatesSettings = js.native
  def apply(behavior: setting, name: url, value: js.UndefOr[scala.Nothing]): `false` | String = js.native
  def apply(behavior: setting, name: url, value: String): JQuery = js.native
  def apply(behavior: setting, name: url, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, value: EmbedSettings): JQuery = js.native
  /**
    * Shows embed content
    */
  def apply(behavior: show): JQuery = js.native
  def apply(settings: EmbedSettings): JQuery = js.native
  
  var settings: EmbedSettings = js.native
}
