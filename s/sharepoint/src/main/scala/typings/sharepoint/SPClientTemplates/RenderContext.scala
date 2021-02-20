package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderContext extends StObject {
  
  var BaseViewID: js.UndefOr[Double] = js.native
  
  var ControlMode: js.UndefOr[ClientControlMode] = js.native
  
  var CurrentCultureName: js.UndefOr[String] = js.native
  
  var CurrentLanguage: js.UndefOr[Double] = js.native
  
  var CurrentSelectedItems: js.UndefOr[js.Any] = js.native
  
  var CurrentUICultureName: js.UndefOr[String] = js.native
  
  var ListTemplateType: js.UndefOr[Double] = js.native
  
  var OnPostRender: js.UndefOr[RenderCallback | js.Array[RenderCallback]] = js.native
  
  var OnPreRender: js.UndefOr[RenderCallback | js.Array[RenderCallback]] = js.native
  
  var RenderBody: js.UndefOr[js.Function1[/* renderContext */ this.type, String]] = js.native
  
  var RenderFieldByName: js.UndefOr[js.Function2[/* renderContext */ this.type, /* fieldName */ String, String]] = js.native
  
  var RenderFields: js.UndefOr[js.Function1[/* renderContext */ this.type, String]] = js.native
  
  var RenderFooter: js.UndefOr[js.Function1[/* renderContext */ this.type, String]] = js.native
  
  var RenderGroups: js.UndefOr[js.Function1[/* renderContext */ this.type, String]] = js.native
  
  var RenderHeader: js.UndefOr[js.Function1[/* renderContext */ this.type, String]] = js.native
  
  var RenderItems: js.UndefOr[js.Function1[/* renderContext */ this.type, String]] = js.native
  
  var RenderView: js.UndefOr[js.Function1[/* renderContext */ this.type, String]] = js.native
  
  var SiteClientTag: js.UndefOr[String] = js.native
  
  var Templates: js.UndefOr[typings.sharepoint.SPClientTemplates.Templates] = js.native
  
  var onRefreshFailed: js.UndefOr[js.Any] = js.native
}
object RenderContext {
  
  @scala.inline
  def apply(): RenderContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderContext]
  }
  
  @scala.inline
  implicit class RenderContextMutableBuilder[Self <: RenderContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseViewID(value: Double): Self = StObject.set(x, "BaseViewID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseViewIDUndefined: Self = StObject.set(x, "BaseViewID", js.undefined)
    
    @scala.inline
    def setControlMode(value: ClientControlMode): Self = StObject.set(x, "ControlMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlModeUndefined: Self = StObject.set(x, "ControlMode", js.undefined)
    
    @scala.inline
    def setCurrentCultureName(value: String): Self = StObject.set(x, "CurrentCultureName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentCultureNameUndefined: Self = StObject.set(x, "CurrentCultureName", js.undefined)
    
    @scala.inline
    def setCurrentLanguage(value: Double): Self = StObject.set(x, "CurrentLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentLanguageUndefined: Self = StObject.set(x, "CurrentLanguage", js.undefined)
    
    @scala.inline
    def setCurrentSelectedItems(value: js.Any): Self = StObject.set(x, "CurrentSelectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentSelectedItemsUndefined: Self = StObject.set(x, "CurrentSelectedItems", js.undefined)
    
    @scala.inline
    def setCurrentUICultureName(value: String): Self = StObject.set(x, "CurrentUICultureName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUICultureNameUndefined: Self = StObject.set(x, "CurrentUICultureName", js.undefined)
    
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
    def setOnRefreshFailed(value: js.Any): Self = StObject.set(x, "onRefreshFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRefreshFailedUndefined: Self = StObject.set(x, "onRefreshFailed", js.undefined)
    
    @scala.inline
    def setRenderBody(value: RenderContext => String): Self = StObject.set(x, "RenderBody", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderBodyUndefined: Self = StObject.set(x, "RenderBody", js.undefined)
    
    @scala.inline
    def setRenderFieldByName(value: (RenderContext, /* fieldName */ String) => String): Self = StObject.set(x, "RenderFieldByName", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenderFieldByNameUndefined: Self = StObject.set(x, "RenderFieldByName", js.undefined)
    
    @scala.inline
    def setRenderFields(value: RenderContext => String): Self = StObject.set(x, "RenderFields", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderFieldsUndefined: Self = StObject.set(x, "RenderFields", js.undefined)
    
    @scala.inline
    def setRenderFooter(value: RenderContext => String): Self = StObject.set(x, "RenderFooter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderFooterUndefined: Self = StObject.set(x, "RenderFooter", js.undefined)
    
    @scala.inline
    def setRenderGroups(value: RenderContext => String): Self = StObject.set(x, "RenderGroups", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderGroupsUndefined: Self = StObject.set(x, "RenderGroups", js.undefined)
    
    @scala.inline
    def setRenderHeader(value: RenderContext => String): Self = StObject.set(x, "RenderHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderHeaderUndefined: Self = StObject.set(x, "RenderHeader", js.undefined)
    
    @scala.inline
    def setRenderItems(value: RenderContext => String): Self = StObject.set(x, "RenderItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderItemsUndefined: Self = StObject.set(x, "RenderItems", js.undefined)
    
    @scala.inline
    def setRenderView(value: RenderContext => String): Self = StObject.set(x, "RenderView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderViewUndefined: Self = StObject.set(x, "RenderView", js.undefined)
    
    @scala.inline
    def setSiteClientTag(value: String): Self = StObject.set(x, "SiteClientTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteClientTagUndefined: Self = StObject.set(x, "SiteClientTag", js.undefined)
    
    @scala.inline
    def setTemplates(value: Templates): Self = StObject.set(x, "Templates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplatesUndefined: Self = StObject.set(x, "Templates", js.undefined)
  }
}
