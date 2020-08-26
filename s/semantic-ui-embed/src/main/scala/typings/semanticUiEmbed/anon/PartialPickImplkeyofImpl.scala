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
@js.native
trait PartialPickImplkeyofImpl extends js.Object {
  var autoplay: js.UndefOr[auto | Boolean] = js.native
  var brandedUI: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[ClassNameSettings] = js.native
  var color: js.UndefOr[String] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var error: js.UndefOr[ErrorSettings] = js.native
  var hd: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[`false` | String] = js.native
  var id: js.UndefOr[`false` | String] = js.native
  var metadata: js.UndefOr[MetadataSettings] = js.native
  var name: js.UndefOr[String] = js.native
  var namespace: js.UndefOr[String] = js.native
  var onCreate: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* url */ String, Unit]] = js.native
  var onDisplay: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onEmbed: js.UndefOr[
    js.ThisFunction1[/* this */ JQuery, /* parameters */ ParametersSettings, ParametersSettings]
  ] = js.native
  var onPlaceholderDisplay: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var parameters: js.UndefOr[`false` | ParametersSettings] = js.native
  var performance: js.UndefOr[Boolean] = js.native
  var selector: js.UndefOr[SelectorSettings] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var source: js.UndefOr[`false` | String] = js.native
  var templates: js.UndefOr[TemplatesSettings] = js.native
  var url: js.UndefOr[`false` | String] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object PartialPickImplkeyofImpl {
  @scala.inline
  def apply(): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplOps[Self <: PartialPickImplkeyofImpl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoplay(value: auto | Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    @scala.inline
    def setBrandedUI(value: Boolean): Self = this.set("brandedUI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrandedUI: Self = this.set("brandedUI", js.undefined)
    @scala.inline
    def setClassName(value: ClassNameSettings): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setError(value: ErrorSettings): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setHd(value: Boolean): Self = this.set("hd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHd: Self = this.set("hd", js.undefined)
    @scala.inline
    def setIcon(value: `false` | String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setId(value: `false` | String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMetadata(value: MetadataSettings): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    @scala.inline
    def setOnCreate(value: js.ThisFunction1[/* this */ JQuery, /* url */ String, Unit]): Self = this.set("onCreate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCreate: Self = this.set("onCreate", js.undefined)
    @scala.inline
    def setOnDisplay(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDisplay: Self = this.set("onDisplay", js.undefined)
    @scala.inline
    def setOnEmbed(
      value: js.ThisFunction1[/* this */ JQuery, /* parameters */ ParametersSettings, ParametersSettings]
    ): Self = this.set("onEmbed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEmbed: Self = this.set("onEmbed", js.undefined)
    @scala.inline
    def setOnPlaceholderDisplay(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onPlaceholderDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPlaceholderDisplay: Self = this.set("onPlaceholderDisplay", js.undefined)
    @scala.inline
    def setParameters(value: `false` | ParametersSettings): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerformance: Self = this.set("performance", js.undefined)
    @scala.inline
    def setSelector(value: SelectorSettings): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setSource(value: `false` | String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setTemplates(value: TemplatesSettings): Self = this.set("templates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplates: Self = this.set("templates", js.undefined)
    @scala.inline
    def setUrl(value: `false` | String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

