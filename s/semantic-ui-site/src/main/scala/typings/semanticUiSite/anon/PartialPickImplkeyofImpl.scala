package typings.semanticUiSite.anon

import typings.semanticUiSite.SemanticUI.Site.NamespaceStubSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-site.SemanticUI.SiteSettings._Impl, keyof semantic-ui-site.SemanticUI.SiteSettings._Impl>> */
trait PartialPickImplkeyofImpl extends StObject {
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var modules: js.UndefOr[js.Array[String]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var namespace: js.UndefOr[String] = js.undefined
  
  var namespaceStub: js.UndefOr[NamespaceStubSettings] = js.undefined
  
  var performance: js.UndefOr[Boolean] = js.undefined
  
  var silent: js.UndefOr[Boolean] = js.undefined
  
  var siteNamespace: js.UndefOr[String] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object PartialPickImplkeyofImpl {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplMutableBuilder[Self <: PartialPickImplkeyofImpl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setModules(value: js.Array[String]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
    
    @scala.inline
    def setModulesVarargs(value: String*): Self = StObject.set(x, "modules", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceStub(value: NamespaceStubSettings): Self = StObject.set(x, "namespaceStub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceStubUndefined: Self = StObject.set(x, "namespaceStub", js.undefined)
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    @scala.inline
    def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    @scala.inline
    def setSiteNamespace(value: String): Self = StObject.set(x, "siteNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteNamespaceUndefined: Self = StObject.set(x, "siteNamespace", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
