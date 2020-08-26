package typings.semanticUiEmbed

import typings.semanticUiEmbed.SemanticUI.Embed
import typings.semanticUiEmbed.SemanticUI.Embed.ClassNameSettings
import typings.semanticUiEmbed.SemanticUI.Embed.ErrorSettings
import typings.semanticUiEmbed.SemanticUI.Embed.MetadataSettings
import typings.semanticUiEmbed.SemanticUI.Embed.ParametersSettings
import typings.semanticUiEmbed.SemanticUI.Embed.SelectorSettings
import typings.semanticUiEmbed.SemanticUI.Embed.TemplatesSettings
import typings.semanticUiEmbed.SemanticUI.EmbedSettings
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
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("embed")
  var embed_Original: Embed = js.native
  def embed(): JQuery = js.native
  def embed(behavior: setting, name: autoplay, value: js.UndefOr[scala.Nothing]): auto | Boolean = js.native
  def embed(behavior: setting, name: autoplay, value: Boolean): JQuery = js.native
  def embed(behavior: setting, name: autoplay, value: auto): JQuery = js.native
  def embed(behavior: setting, name: brandedUI, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def embed(behavior: setting, name: brandedUI, value: Boolean): JQuery = js.native
  def embed(behavior: setting, name: className, value: js.UndefOr[scala.Nothing]): ClassNameSettings = js.native
  def embed(behavior: setting, name: color, value: js.UndefOr[scala.Nothing]): String = js.native
  def embed(behavior: setting, name: color, value: String): JQuery = js.native
  def embed(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def embed(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def embed(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
  def embed(behavior: setting, name: hd, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def embed(behavior: setting, name: hd, value: Boolean): JQuery = js.native
  def embed(behavior: setting, name: icon, value: js.UndefOr[scala.Nothing]): `false` | String = js.native
  def embed(behavior: setting, name: icon, value: String): JQuery = js.native
  def embed(behavior: setting, name: icon, value: `false`): JQuery = js.native
  def embed(behavior: setting, name: id, value: js.UndefOr[scala.Nothing]): `false` | String = js.native
  def embed(behavior: setting, name: id, value: String): JQuery = js.native
  def embed(behavior: setting, name: id, value: `false`): JQuery = js.native
  def embed(behavior: setting, name: metadata, value: MetadataSettings): JQuery = js.native
  def embed(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def embed(behavior: setting, name: namespace, value: String): JQuery = js.native
  def embed(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def embed(behavior: setting, name: name, value: String): JQuery = js.native
  def embed(behavior: setting, name: onCreate, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* url */ String, Unit] = js.native
  def embed(
    behavior: setting,
    name: onCreate,
    value: js.ThisFunction1[/* this */ JQuery, /* url */ String, Unit]
  ): JQuery = js.native
  def embed(behavior: setting, name: onDisplay, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def embed(behavior: setting, name: onDisplay, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def embed(behavior: setting, name: onEmbed, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* parameters */ ParametersSettings, ParametersSettings] = js.native
  def embed(
    behavior: setting,
    name: onEmbed,
    value: js.ThisFunction1[/* this */ JQuery, /* parameters */ ParametersSettings, ParametersSettings]
  ): JQuery = js.native
  def embed(behavior: setting, name: onPlaceholderDisplay, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def embed(behavior: setting, name: onPlaceholderDisplay, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def embed(behavior: setting, name: parameters, value: js.UndefOr[scala.Nothing]): `false` | ParametersSettings = js.native
  def embed(behavior: setting, name: parameters, value: ParametersSettings): JQuery = js.native
  def embed(behavior: setting, name: parameters, value: `false`): JQuery = js.native
  def embed(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def embed(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def embed(behavior: setting, name: selector, value: js.UndefOr[scala.Nothing]): SelectorSettings = js.native
  def embed(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def embed(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def embed(behavior: setting, name: source, value: js.UndefOr[scala.Nothing]): `false` | String = js.native
  def embed(behavior: setting, name: source, value: String): JQuery = js.native
  def embed(behavior: setting, name: source, value: `false`): JQuery = js.native
  def embed(behavior: setting, name: templates, value: js.UndefOr[scala.Nothing]): TemplatesSettings = js.native
  def embed(behavior: setting, name: url, value: js.UndefOr[scala.Nothing]): `false` | String = js.native
  def embed(behavior: setting, name: url, value: String): JQuery = js.native
  def embed(behavior: setting, name: url, value: `false`): JQuery = js.native
  def embed(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def embed(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def embed(settings: EmbedSettings): JQuery = js.native
  @JSName("embed")
  def embed_JQuery(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  @JSName("embed")
  def embed_JQuery(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  @JSName("embed")
  def embed_JQuery(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  @JSName("embed")
  def embed_JQuery(behavior: setting, name: templates, value: TemplatesSettings): JQuery = js.native
  @JSName("embed")
  def embed_MetadataSettings(behavior: setting, name: metadata, value: js.UndefOr[scala.Nothing]): MetadataSettings = js.native
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
  /**
    * Shows embed content
    */
  @JSName("embed")
  def embed_show(behavior: show): JQuery = js.native
}

