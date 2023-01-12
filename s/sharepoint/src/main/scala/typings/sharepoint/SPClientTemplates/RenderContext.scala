package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderContext extends StObject {
  
  var BaseViewID: js.UndefOr[Double] = js.undefined
  
  var ControlMode: js.UndefOr[ClientControlMode] = js.undefined
  
  var CurrentCultureName: js.UndefOr[String] = js.undefined
  
  var CurrentLanguage: js.UndefOr[Double] = js.undefined
  
  var CurrentSelectedItems: js.UndefOr[Any] = js.undefined
  
  var CurrentUICultureName: js.UndefOr[String] = js.undefined
  
  var ListTemplateType: js.UndefOr[Double] = js.undefined
  
  var OnPostRender: js.UndefOr[RenderCallback | js.Array[RenderCallback]] = js.undefined
  
  var OnPreRender: js.UndefOr[RenderCallback | js.Array[RenderCallback]] = js.undefined
  
  var RenderBody: js.UndefOr[js.Function1[/* renderContext */ this.type, String]] = js.undefined
  
  var RenderFieldByName: js.UndefOr[js.Function2[/* renderContext */ this.type, /* fieldName */ String, String]] = js.undefined
  
  var RenderFields: js.UndefOr[js.Function1[/* renderContext */ this.type, String]] = js.undefined
  
  var RenderFooter: js.UndefOr[js.Function1[/* renderContext */ this.type, String]] = js.undefined
  
  var RenderGroups: js.UndefOr[js.Function1[/* renderContext */ this.type, String]] = js.undefined
  
  var RenderHeader: js.UndefOr[js.Function1[/* renderContext */ this.type, String]] = js.undefined
  
  var RenderItems: js.UndefOr[js.Function1[/* renderContext */ this.type, String]] = js.undefined
  
  var RenderView: js.UndefOr[js.Function1[/* renderContext */ this.type, String]] = js.undefined
  
  var SiteClientTag: js.UndefOr[String] = js.undefined
  
  var Templates: js.UndefOr[typings.sharepoint.SPClientTemplates.Templates] = js.undefined
  
  var onRefreshFailed: js.UndefOr[Any] = js.undefined
}
object RenderContext {
  
  inline def apply(): RenderContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenderContext] (val x: Self) extends AnyVal {
    
    inline def setBaseViewID(value: Double): Self = StObject.set(x, "BaseViewID", value.asInstanceOf[js.Any])
    
    inline def setBaseViewIDUndefined: Self = StObject.set(x, "BaseViewID", js.undefined)
    
    inline def setControlMode(value: ClientControlMode): Self = StObject.set(x, "ControlMode", value.asInstanceOf[js.Any])
    
    inline def setControlModeUndefined: Self = StObject.set(x, "ControlMode", js.undefined)
    
    inline def setCurrentCultureName(value: String): Self = StObject.set(x, "CurrentCultureName", value.asInstanceOf[js.Any])
    
    inline def setCurrentCultureNameUndefined: Self = StObject.set(x, "CurrentCultureName", js.undefined)
    
    inline def setCurrentLanguage(value: Double): Self = StObject.set(x, "CurrentLanguage", value.asInstanceOf[js.Any])
    
    inline def setCurrentLanguageUndefined: Self = StObject.set(x, "CurrentLanguage", js.undefined)
    
    inline def setCurrentSelectedItems(value: Any): Self = StObject.set(x, "CurrentSelectedItems", value.asInstanceOf[js.Any])
    
    inline def setCurrentSelectedItemsUndefined: Self = StObject.set(x, "CurrentSelectedItems", js.undefined)
    
    inline def setCurrentUICultureName(value: String): Self = StObject.set(x, "CurrentUICultureName", value.asInstanceOf[js.Any])
    
    inline def setCurrentUICultureNameUndefined: Self = StObject.set(x, "CurrentUICultureName", js.undefined)
    
    inline def setListTemplateType(value: Double): Self = StObject.set(x, "ListTemplateType", value.asInstanceOf[js.Any])
    
    inline def setListTemplateTypeUndefined: Self = StObject.set(x, "ListTemplateType", js.undefined)
    
    inline def setOnPostRender(value: RenderCallback | js.Array[RenderCallback]): Self = StObject.set(x, "OnPostRender", value.asInstanceOf[js.Any])
    
    inline def setOnPostRenderFunction1(value: /* ctx */ RenderContext => Unit): Self = StObject.set(x, "OnPostRender", js.Any.fromFunction1(value))
    
    inline def setOnPostRenderUndefined: Self = StObject.set(x, "OnPostRender", js.undefined)
    
    inline def setOnPostRenderVarargs(value: RenderCallback*): Self = StObject.set(x, "OnPostRender", js.Array(value*))
    
    inline def setOnPreRender(value: RenderCallback | js.Array[RenderCallback]): Self = StObject.set(x, "OnPreRender", value.asInstanceOf[js.Any])
    
    inline def setOnPreRenderFunction1(value: /* ctx */ RenderContext => Unit): Self = StObject.set(x, "OnPreRender", js.Any.fromFunction1(value))
    
    inline def setOnPreRenderUndefined: Self = StObject.set(x, "OnPreRender", js.undefined)
    
    inline def setOnPreRenderVarargs(value: RenderCallback*): Self = StObject.set(x, "OnPreRender", js.Array(value*))
    
    inline def setOnRefreshFailed(value: Any): Self = StObject.set(x, "onRefreshFailed", value.asInstanceOf[js.Any])
    
    inline def setOnRefreshFailedUndefined: Self = StObject.set(x, "onRefreshFailed", js.undefined)
    
    inline def setRenderBody(value: RenderContext => String): Self = StObject.set(x, "RenderBody", js.Any.fromFunction1(value))
    
    inline def setRenderBodyUndefined: Self = StObject.set(x, "RenderBody", js.undefined)
    
    inline def setRenderFieldByName(value: (RenderContext, /* fieldName */ String) => String): Self = StObject.set(x, "RenderFieldByName", js.Any.fromFunction2(value))
    
    inline def setRenderFieldByNameUndefined: Self = StObject.set(x, "RenderFieldByName", js.undefined)
    
    inline def setRenderFields(value: RenderContext => String): Self = StObject.set(x, "RenderFields", js.Any.fromFunction1(value))
    
    inline def setRenderFieldsUndefined: Self = StObject.set(x, "RenderFields", js.undefined)
    
    inline def setRenderFooter(value: RenderContext => String): Self = StObject.set(x, "RenderFooter", js.Any.fromFunction1(value))
    
    inline def setRenderFooterUndefined: Self = StObject.set(x, "RenderFooter", js.undefined)
    
    inline def setRenderGroups(value: RenderContext => String): Self = StObject.set(x, "RenderGroups", js.Any.fromFunction1(value))
    
    inline def setRenderGroupsUndefined: Self = StObject.set(x, "RenderGroups", js.undefined)
    
    inline def setRenderHeader(value: RenderContext => String): Self = StObject.set(x, "RenderHeader", js.Any.fromFunction1(value))
    
    inline def setRenderHeaderUndefined: Self = StObject.set(x, "RenderHeader", js.undefined)
    
    inline def setRenderItems(value: RenderContext => String): Self = StObject.set(x, "RenderItems", js.Any.fromFunction1(value))
    
    inline def setRenderItemsUndefined: Self = StObject.set(x, "RenderItems", js.undefined)
    
    inline def setRenderView(value: RenderContext => String): Self = StObject.set(x, "RenderView", js.Any.fromFunction1(value))
    
    inline def setRenderViewUndefined: Self = StObject.set(x, "RenderView", js.undefined)
    
    inline def setSiteClientTag(value: String): Self = StObject.set(x, "SiteClientTag", value.asInstanceOf[js.Any])
    
    inline def setSiteClientTagUndefined: Self = StObject.set(x, "SiteClientTag", js.undefined)
    
    inline def setTemplates(value: Templates): Self = StObject.set(x, "Templates", value.asInstanceOf[js.Any])
    
    inline def setTemplatesUndefined: Self = StObject.set(x, "Templates", js.undefined)
  }
}
