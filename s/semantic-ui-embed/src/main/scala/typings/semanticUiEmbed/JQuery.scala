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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def embed(): JQuery
  def embed(behavior: setting, name: autoplay, value: Boolean): JQuery
  def embed(behavior: setting, name: autoplay, value: Unit): auto | Boolean
  def embed(behavior: setting, name: autoplay, value: auto): JQuery
  def embed(behavior: setting, name: brandedUI, value: Boolean): JQuery
  def embed(behavior: setting, name: brandedUI, value: Unit): Boolean
  def embed(behavior: setting, name: className, value: Unit): ClassNameSettings
  def embed(behavior: setting, name: className, value: ClassNameSettings): JQuery
  def embed(behavior: setting, name: color, value: String): JQuery
  def embed(behavior: setting, name: color, value: Unit): String
  def embed(behavior: setting, name: debug, value: Boolean): JQuery
  def embed(behavior: setting, name: debug, value: Unit): Boolean
  def embed(behavior: setting, name: error, value: Unit): ErrorSettings
  def embed(behavior: setting, name: error, value: ErrorSettings): JQuery
  def embed(behavior: setting, name: hd, value: Boolean): JQuery
  def embed(behavior: setting, name: hd, value: Unit): Boolean
  def embed(behavior: setting, name: icon, value: String): JQuery
  def embed(behavior: setting, name: icon, value: Unit): `false` | String
  def embed(behavior: setting, name: icon, value: `false`): JQuery
  def embed(behavior: setting, name: id, value: String): JQuery
  def embed(behavior: setting, name: id, value: Unit): `false` | String
  def embed(behavior: setting, name: id, value: `false`): JQuery
  def embed(behavior: setting, name: metadata, value: Unit): MetadataSettings
  def embed(behavior: setting, name: metadata, value: MetadataSettings): JQuery
  def embed(behavior: setting, name: namespace, value: String): JQuery
  def embed(behavior: setting, name: namespace, value: Unit): String
  def embed(behavior: setting, name: name, value: String): JQuery
  def embed(behavior: setting, name: name, value: Unit): String
  def embed(
    behavior: setting,
    name: onCreate,
    value: js.ThisFunction1[/* this */ JQuery, /* url */ String, Unit]
  ): JQuery
  def embed(behavior: setting, name: onCreate, value: Unit): js.ThisFunction1[/* this */ JQuery, /* url */ String, Unit]
  def embed(behavior: setting, name: onDisplay, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def embed(behavior: setting, name: onDisplay, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def embed(
    behavior: setting,
    name: onEmbed,
    value: js.ThisFunction1[/* this */ JQuery, /* parameters */ ParametersSettings, ParametersSettings]
  ): JQuery
  def embed(behavior: setting, name: onEmbed, value: Unit): js.ThisFunction1[/* this */ JQuery, /* parameters */ ParametersSettings, ParametersSettings]
  def embed(behavior: setting, name: onPlaceholderDisplay, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def embed(behavior: setting, name: onPlaceholderDisplay, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def embed(behavior: setting, name: parameters, value: Unit): `false` | ParametersSettings
  def embed(behavior: setting, name: parameters, value: ParametersSettings): JQuery
  def embed(behavior: setting, name: parameters, value: `false`): JQuery
  def embed(behavior: setting, name: performance, value: Boolean): JQuery
  def embed(behavior: setting, name: performance, value: Unit): Boolean
  def embed(behavior: setting, name: selector, value: Unit): SelectorSettings
  def embed(behavior: setting, name: selector, value: SelectorSettings): JQuery
  def embed(behavior: setting, name: silent, value: Boolean): JQuery
  def embed(behavior: setting, name: silent, value: Unit): Boolean
  def embed(behavior: setting, name: source, value: String): JQuery
  def embed(behavior: setting, name: source, value: Unit): `false` | String
  def embed(behavior: setting, name: source, value: `false`): JQuery
  def embed(behavior: setting, name: templates, value: Unit): TemplatesSettings
  def embed(behavior: setting, name: templates, value: TemplatesSettings): JQuery
  def embed(behavior: setting, name: url, value: String): JQuery
  def embed(behavior: setting, name: url, value: Unit): `false` | String
  def embed(behavior: setting, name: url, value: `false`): JQuery
  def embed(behavior: setting, name: verbose, value: Boolean): JQuery
  def embed(behavior: setting, name: verbose, value: Unit): Boolean
  def embed(settings: EmbedSettings): JQuery
  @JSName("embed")
  var embed_Original: Embed
  /**
    * Changes iframe to a new content source
    */
  @JSName("embed")
  def embed_change(behavior: change, source: String, id: String, url: String): JQuery
  /**
    * Destroys instance and removes all events
    */
  @JSName("embed")
  def embed_destroy(behavior: destroy): JQuery
  /**
    * Returns current content id
    */
  @JSName("embed")
  def embed_getid(behavior: `get id`): String
  /**
    * Returns placeholder image url
    */
  @JSName("embed")
  def embed_getplaceholder(behavior: `get placeholder`): String
  /**
    * Returns source name
    */
  @JSName("embed")
  def embed_getsources(behavior: `get sources`): String
  /**
    * Returns source type
    */
  @JSName("embed")
  def embed_gettype(behavior: `get type`): String
  /**
    * Returns URL with all parameters added
    */
  @JSName("embed")
  def embed_geturl(behavior: `get url`): String
  /**
    * Returns whether embed content has placeholder
    */
  @JSName("embed")
  def embed_hasplaceholder(behavior: `has placeholder`): Boolean
  /**
    * Hides embed content and shows placeholder content
    */
  @JSName("embed")
  def embed_hide(behavior: hide): JQuery
  /**
    * Removes embed and shows placeholder content if available
    */
  @JSName("embed")
  def embed_reset(behavior: reset): JQuery
  @JSName("embed")
  def embed_setting(behavior: setting, value: EmbedSettings): JQuery
  /**
    * Shows embed content
    */
  @JSName("embed")
  def embed_show(behavior: show): JQuery
}
object JQuery {
  
  @scala.inline
  def apply(embed: Embed): JQuery = {
    val __obj = js.Dynamic.literal(embed = embed.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit class JQueryMutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmbed(value: Embed): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
  }
}
