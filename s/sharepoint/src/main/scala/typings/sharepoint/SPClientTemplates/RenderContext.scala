package typings.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderContext extends js.Object {
  
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
  implicit class RenderContextOps[Self <: RenderContext] (val x: Self) extends AnyVal {
    
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
    def setBaseViewID(value: Double): Self = this.set("BaseViewID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseViewID: Self = this.set("BaseViewID", js.undefined)
    
    @scala.inline
    def setControlMode(value: ClientControlMode): Self = this.set("ControlMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControlMode: Self = this.set("ControlMode", js.undefined)
    
    @scala.inline
    def setCurrentCultureName(value: String): Self = this.set("CurrentCultureName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentCultureName: Self = this.set("CurrentCultureName", js.undefined)
    
    @scala.inline
    def setCurrentLanguage(value: Double): Self = this.set("CurrentLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentLanguage: Self = this.set("CurrentLanguage", js.undefined)
    
    @scala.inline
    def setCurrentSelectedItems(value: js.Any): Self = this.set("CurrentSelectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentSelectedItems: Self = this.set("CurrentSelectedItems", js.undefined)
    
    @scala.inline
    def setCurrentUICultureName(value: String): Self = this.set("CurrentUICultureName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentUICultureName: Self = this.set("CurrentUICultureName", js.undefined)
    
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
    def setRenderBody(value: RenderContext => String): Self = this.set("RenderBody", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderBody: Self = this.set("RenderBody", js.undefined)
    
    @scala.inline
    def setRenderFieldByName(value: (RenderContext, /* fieldName */ String) => String): Self = this.set("RenderFieldByName", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRenderFieldByName: Self = this.set("RenderFieldByName", js.undefined)
    
    @scala.inline
    def setRenderFields(value: RenderContext => String): Self = this.set("RenderFields", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderFields: Self = this.set("RenderFields", js.undefined)
    
    @scala.inline
    def setRenderFooter(value: RenderContext => String): Self = this.set("RenderFooter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderFooter: Self = this.set("RenderFooter", js.undefined)
    
    @scala.inline
    def setRenderGroups(value: RenderContext => String): Self = this.set("RenderGroups", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderGroups: Self = this.set("RenderGroups", js.undefined)
    
    @scala.inline
    def setRenderHeader(value: RenderContext => String): Self = this.set("RenderHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderHeader: Self = this.set("RenderHeader", js.undefined)
    
    @scala.inline
    def setRenderItems(value: RenderContext => String): Self = this.set("RenderItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderItems: Self = this.set("RenderItems", js.undefined)
    
    @scala.inline
    def setRenderView(value: RenderContext => String): Self = this.set("RenderView", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderView: Self = this.set("RenderView", js.undefined)
    
    @scala.inline
    def setSiteClientTag(value: String): Self = this.set("SiteClientTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteClientTag: Self = this.set("SiteClientTag", js.undefined)
    
    @scala.inline
    def setTemplates(value: Templates): Self = this.set("Templates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplates: Self = this.set("Templates", js.undefined)
    
    @scala.inline
    def setOnRefreshFailed(value: js.Any): Self = this.set("onRefreshFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnRefreshFailed: Self = this.set("onRefreshFailed", js.undefined)
  }
}
