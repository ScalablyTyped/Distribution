package typings.semanticUiEmbed.anon

import typings.semanticUiEmbed.JQuery
import typings.semanticUiEmbed.SemanticUI.Embed.ClassNameSettings
import typings.semanticUiEmbed.SemanticUI.Embed.ErrorSettings
import typings.semanticUiEmbed.SemanticUI.Embed.MetadataSettings
import typings.semanticUiEmbed.SemanticUI.Embed.ParametersSettings
import typings.semanticUiEmbed.SemanticUI.Embed.SelectorSettings
import typings.semanticUiEmbed.SemanticUI.Embed.TemplatesSettings
import typings.semanticUiEmbed.semanticUiEmbedBooleans.`false`
import typings.semanticUiEmbed.semanticUiEmbedStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-embed.SemanticUI.EmbedSettings._Impl, keyof semantic-ui-embed.SemanticUI.EmbedSettings._Impl>> */
trait PartialPickImplkeyofImpl extends js.Object {
  var autoplay: js.UndefOr[auto | Boolean] = js.undefined
  var brandedUI: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[ClassNameSettings] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[ErrorSettings] = js.undefined
  var hd: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[`false` | String] = js.undefined
  var id: js.UndefOr[`false` | String] = js.undefined
  var metadata: js.UndefOr[MetadataSettings] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
  var onCreate: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* url */ String, Unit]] = js.undefined
  var onDisplay: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onEmbed: js.UndefOr[
    js.ThisFunction1[/* this */ JQuery, /* parameters */ ParametersSettings, ParametersSettings]
  ] = js.undefined
  var onPlaceholderDisplay: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var parameters: js.UndefOr[`false` | ParametersSettings] = js.undefined
  var performance: js.UndefOr[Boolean] = js.undefined
  var selector: js.UndefOr[SelectorSettings] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var source: js.UndefOr[`false` | String] = js.undefined
  var templates: js.UndefOr[TemplatesSettings] = js.undefined
  var url: js.UndefOr[`false` | String] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object PartialPickImplkeyofImpl {
  @scala.inline
  def apply(
    autoplay: auto | Boolean = null,
    brandedUI: js.UndefOr[Boolean] = js.undefined,
    className: ClassNameSettings = null,
    color: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    error: ErrorSettings = null,
    hd: js.UndefOr[Boolean] = js.undefined,
    icon: `false` | String = null,
    id: `false` | String = null,
    metadata: MetadataSettings = null,
    name: String = null,
    namespace: String = null,
    onCreate: js.ThisFunction1[/* this */ JQuery, /* url */ String, Unit] = null,
    onDisplay: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onEmbed: js.ThisFunction1[/* this */ JQuery, /* parameters */ ParametersSettings, ParametersSettings] = null,
    onPlaceholderDisplay: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    parameters: `false` | ParametersSettings = null,
    performance: js.UndefOr[Boolean] = js.undefined,
    selector: SelectorSettings = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    source: `false` | String = null,
    templates: TemplatesSettings = null,
    url: `false` | String = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    if (autoplay != null) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (!js.isUndefined(brandedUI)) __obj.updateDynamic("brandedUI")(brandedUI.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(hd)) __obj.updateDynamic("hd")(hd.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (onCreate != null) __obj.updateDynamic("onCreate")(onCreate.asInstanceOf[js.Any])
    if (onDisplay != null) __obj.updateDynamic("onDisplay")(onDisplay.asInstanceOf[js.Any])
    if (onEmbed != null) __obj.updateDynamic("onEmbed")(onEmbed.asInstanceOf[js.Any])
    if (onPlaceholderDisplay != null) __obj.updateDynamic("onPlaceholderDisplay")(onPlaceholderDisplay.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (!js.isUndefined(performance)) __obj.updateDynamic("performance")(performance.get.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (templates != null) __obj.updateDynamic("templates")(templates.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
}

