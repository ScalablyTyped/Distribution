package typings.sharepoint.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateOverridesOptions extends js.Object {
  /** Base view ID (SPView.BaseViewID) for which the template should be applied.
    If not defined, the templates will be applied to all views. */
  var BaseViewID: js.UndefOr[Double | String] = js.undefined
  /** List template type (SPList.BaseTemplate) for which the template should be applied.
    If not defined, the templates will be applied to all lists. */
  var ListTemplateType: js.UndefOr[Double] = js.undefined
  /** Callbacks called after rendered html inserted into DOM. Can be function (ctx: RenderContext) => void or array of functions.*/
  var OnPostRender: js.UndefOr[RenderCallback | js.Array[RenderCallback]] = js.undefined
  /** Callbacks called before rendering starts. Can be function (ctx: RenderContext) => void or array of functions.*/
  var OnPreRender: js.UndefOr[RenderCallback | js.Array[RenderCallback]] = js.undefined
  /** Template overrides */
  var Templates: js.UndefOr[TemplateOverrides] = js.undefined
  /** View style (SPView.StyleID) for which the templates should be applied.
    If not defined, the templates will be applied only to default view style. */
  var ViewStyle: js.UndefOr[Double] = js.undefined
}

object TemplateOverridesOptions {
  @scala.inline
  def apply(
    BaseViewID: Double | String = null,
    ListTemplateType: Int | Double = null,
    OnPostRender: RenderCallback | js.Array[RenderCallback] = null,
    OnPreRender: RenderCallback | js.Array[RenderCallback] = null,
    Templates: TemplateOverrides = null,
    ViewStyle: Int | Double = null
  ): TemplateOverridesOptions = {
    val __obj = js.Dynamic.literal()
    if (BaseViewID != null) __obj.updateDynamic("BaseViewID")(BaseViewID.asInstanceOf[js.Any])
    if (ListTemplateType != null) __obj.updateDynamic("ListTemplateType")(ListTemplateType.asInstanceOf[js.Any])
    if (OnPostRender != null) __obj.updateDynamic("OnPostRender")(OnPostRender.asInstanceOf[js.Any])
    if (OnPreRender != null) __obj.updateDynamic("OnPreRender")(OnPreRender.asInstanceOf[js.Any])
    if (Templates != null) __obj.updateDynamic("Templates")(Templates)
    if (ViewStyle != null) __obj.updateDynamic("ViewStyle")(ViewStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateOverridesOptions]
  }
}

