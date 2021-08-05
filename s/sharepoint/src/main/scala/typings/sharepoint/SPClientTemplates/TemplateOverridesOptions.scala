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
  
  inline def apply(): TemplateOverridesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateOverridesOptions]
  }
  
  extension [Self <: TemplateOverridesOptions](x: Self) {
    
    inline def setBaseViewID(value: Double | String): Self = StObject.set(x, "BaseViewID", value.asInstanceOf[js.Any])
    
    inline def setBaseViewIDUndefined: Self = StObject.set(x, "BaseViewID", js.undefined)
    
    inline def setListTemplateType(value: Double): Self = StObject.set(x, "ListTemplateType", value.asInstanceOf[js.Any])
    
    inline def setListTemplateTypeUndefined: Self = StObject.set(x, "ListTemplateType", js.undefined)
    
    inline def setOnPostRender(value: RenderCallback | js.Array[RenderCallback]): Self = StObject.set(x, "OnPostRender", value.asInstanceOf[js.Any])
    
    inline def setOnPostRenderFunction1(value: /* ctx */ RenderContext => Unit): Self = StObject.set(x, "OnPostRender", js.Any.fromFunction1(value))
    
    inline def setOnPostRenderUndefined: Self = StObject.set(x, "OnPostRender", js.undefined)
    
    inline def setOnPostRenderVarargs(value: RenderCallback*): Self = StObject.set(x, "OnPostRender", js.Array(value :_*))
    
    inline def setOnPreRender(value: RenderCallback | js.Array[RenderCallback]): Self = StObject.set(x, "OnPreRender", value.asInstanceOf[js.Any])
    
    inline def setOnPreRenderFunction1(value: /* ctx */ RenderContext => Unit): Self = StObject.set(x, "OnPreRender", js.Any.fromFunction1(value))
    
    inline def setOnPreRenderUndefined: Self = StObject.set(x, "OnPreRender", js.undefined)
    
    inline def setOnPreRenderVarargs(value: RenderCallback*): Self = StObject.set(x, "OnPreRender", js.Array(value :_*))
    
    inline def setTemplates(value: TemplateOverrides): Self = StObject.set(x, "Templates", value.asInstanceOf[js.Any])
    
    inline def setTemplatesUndefined: Self = StObject.set(x, "Templates", js.undefined)
    
    inline def setViewStyle(value: Double): Self = StObject.set(x, "ViewStyle", value.asInstanceOf[js.Any])
    
    inline def setViewStyleUndefined: Self = StObject.set(x, "ViewStyle", js.undefined)
  }
}
