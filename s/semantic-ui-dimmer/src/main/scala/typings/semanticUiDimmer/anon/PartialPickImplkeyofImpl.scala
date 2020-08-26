package typings.semanticUiDimmer.anon

import typings.semanticUiDimmer.JQuery
import typings.semanticUiDimmer.SemanticUI.Dimmer.ClassNameSettings
import typings.semanticUiDimmer.SemanticUI.Dimmer.DurationSettings
import typings.semanticUiDimmer.SemanticUI.Dimmer.ErrorSettings
import typings.semanticUiDimmer.SemanticUI.Dimmer.SelectorSettings
import typings.semanticUiDimmer.SemanticUI.Dimmer.TemplateSettings
import typings.semanticUiDimmer.semanticUiDimmerBooleans.`false`
import typings.semanticUiDimmer.semanticUiDimmerStrings.auto
import typings.semanticUiDimmer.semanticUiDimmerStrings.click
import typings.semanticUiDimmer.semanticUiDimmerStrings.hover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-dimmer.SemanticUI.DimmerSettings._Impl, keyof semantic-ui-dimmer.SemanticUI.DimmerSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImpl extends js.Object {
  var className: js.UndefOr[ClassNameSettings] = js.native
  var closable: js.UndefOr[auto | Boolean] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var dimmerName: js.UndefOr[`false` | String] = js.native
  var duration: js.UndefOr[Double | DurationSettings] = js.native
  var error: js.UndefOr[ErrorSettings] = js.native
  var name: js.UndefOr[String] = js.native
  var namespace: js.UndefOr[String] = js.native
  var on: js.UndefOr[`false` | hover | click] = js.native
  var onChange: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onHide: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onShow: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var opacity: js.UndefOr[auto | Double] = js.native
  var performance: js.UndefOr[Boolean] = js.native
  var selector: js.UndefOr[SelectorSettings] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var template: js.UndefOr[TemplateSettings] = js.native
  var transition: js.UndefOr[String] = js.native
  var useCSS: js.UndefOr[Boolean] = js.native
  var variation: js.UndefOr[`false` | String] = js.native
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
    def setClassName(value: ClassNameSettings): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClosable(value: auto | Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosable: Self = this.set("closable", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDimmerName(value: `false` | String): Self = this.set("dimmerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimmerName: Self = this.set("dimmerName", js.undefined)
    @scala.inline
    def setDuration(value: Double | DurationSettings): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setError(value: ErrorSettings): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    @scala.inline
    def setOn(value: `false` | hover | click): Self = this.set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    @scala.inline
    def setOnChange(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnHide(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    @scala.inline
    def setOnShow(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    @scala.inline
    def setOpacity(value: auto | Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
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
    def setTemplate(value: TemplateSettings): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTransition(value: String): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    @scala.inline
    def setUseCSS(value: Boolean): Self = this.set("useCSS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseCSS: Self = this.set("useCSS", js.undefined)
    @scala.inline
    def setVariation(value: `false` | String): Self = this.set("variation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariation: Self = this.set("variation", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

