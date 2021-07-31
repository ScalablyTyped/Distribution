package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateOverridesOptions extends StObject {
  
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
  def apply(): TemplateOverridesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateOverridesOptions]
  }
  
  @scala.inline
  implicit class TemplateOverridesOptionsMutableBuilder[Self <: TemplateOverridesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseViewID(value: Double | String): Self = StObject.set(x, "BaseViewID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseViewIDUndefined: Self = StObject.set(x, "BaseViewID", js.undefined)
    
    @scala.inline
    def setListTemplateType(value: Double): Self = StObject.set(x, "ListTemplateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListTemplateTypeUndefined: Self = StObject.set(x, "ListTemplateType", js.undefined)
    
    @scala.inline
    def setOnPostRender(value: RenderCallback | js.Array[RenderCallback]): Self = StObject.set(x, "OnPostRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPostRenderFunction1(value: /* ctx */ RenderContext => Unit): Self = StObject.set(x, "OnPostRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPostRenderUndefined: Self = StObject.set(x, "OnPostRender", js.undefined)
    
    @scala.inline
    def setOnPostRenderVarargs(value: RenderCallback*): Self = StObject.set(x, "OnPostRender", js.Array(value :_*))
    
    @scala.inline
    def setOnPreRender(value: RenderCallback | js.Array[RenderCallback]): Self = StObject.set(x, "OnPreRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPreRenderFunction1(value: /* ctx */ RenderContext => Unit): Self = StObject.set(x, "OnPreRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPreRenderUndefined: Self = StObject.set(x, "OnPreRender", js.undefined)
    
    @scala.inline
    def setOnPreRenderVarargs(value: RenderCallback*): Self = StObject.set(x, "OnPreRender", js.Array(value :_*))
    
    @scala.inline
    def setTemplates(value: TemplateOverrides): Self = StObject.set(x, "Templates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplatesUndefined: Self = StObject.set(x, "Templates", js.undefined)
    
    @scala.inline
    def setViewStyle(value: Double): Self = StObject.set(x, "ViewStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewStyleUndefined: Self = StObject.set(x, "ViewStyle", js.undefined)
  }
}
