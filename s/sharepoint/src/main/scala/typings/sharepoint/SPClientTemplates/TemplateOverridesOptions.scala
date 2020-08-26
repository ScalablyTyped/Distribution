package typings.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateOverridesOptions extends js.Object {
  /** Base view ID (SPView.BaseViewID) for which the template should be applied.
    If not defined, the templates will be applied to all views. */
  var BaseViewID: js.UndefOr[Double | String] = js.native
  /** List template type (SPList.BaseTemplate) for which the template should be applied.
    If not defined, the templates will be applied to all lists. */
  var ListTemplateType: js.UndefOr[Double] = js.native
  /** Callbacks called after rendered html inserted into DOM. Can be function (ctx: RenderContext) => void or array of functions.*/
  var OnPostRender: js.UndefOr[RenderCallback | js.Array[RenderCallback]] = js.native
  /** Callbacks called before rendering starts. Can be function (ctx: RenderContext) => void or array of functions.*/
  var OnPreRender: js.UndefOr[RenderCallback | js.Array[RenderCallback]] = js.native
  /** Template overrides */
  var Templates: js.UndefOr[TemplateOverrides] = js.native
  /** View style (SPView.StyleID) for which the templates should be applied.
    If not defined, the templates will be applied only to default view style. */
  var ViewStyle: js.UndefOr[Double] = js.native
}

object TemplateOverridesOptions {
  @scala.inline
  def apply(): TemplateOverridesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateOverridesOptions]
  }
  @scala.inline
  implicit class TemplateOverridesOptionsOps[Self <: TemplateOverridesOptions] (val x: Self) extends AnyVal {
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
    def setBaseViewID(value: Double | String): Self = this.set("BaseViewID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseViewID: Self = this.set("BaseViewID", js.undefined)
    @scala.inline
    def setListTemplateType(value: Double): Self = this.set("ListTemplateType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListTemplateType: Self = this.set("ListTemplateType", js.undefined)
    @scala.inline
    def setOnPostRenderVarargs(value: RenderCallback*): Self = this.set("OnPostRender", js.Array(value :_*))
    @scala.inline
    def setOnPostRenderFunction1(value: /* ctx */ RenderContext => Unit): Self = this.set("OnPostRender", js.Any.fromFunction1(value))
    @scala.inline
    def setOnPostRender(value: RenderCallback | js.Array[RenderCallback]): Self = this.set("OnPostRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPostRender: Self = this.set("OnPostRender", js.undefined)
    @scala.inline
    def setOnPreRenderVarargs(value: RenderCallback*): Self = this.set("OnPreRender", js.Array(value :_*))
    @scala.inline
    def setOnPreRenderFunction1(value: /* ctx */ RenderContext => Unit): Self = this.set("OnPreRender", js.Any.fromFunction1(value))
    @scala.inline
    def setOnPreRender(value: RenderCallback | js.Array[RenderCallback]): Self = this.set("OnPreRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPreRender: Self = this.set("OnPreRender", js.undefined)
    @scala.inline
    def setTemplates(value: TemplateOverrides): Self = this.set("Templates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplates: Self = this.set("Templates", js.undefined)
    @scala.inline
    def setViewStyle(value: Double): Self = this.set("ViewStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewStyle: Self = this.set("ViewStyle", js.undefined)
  }
  
}

