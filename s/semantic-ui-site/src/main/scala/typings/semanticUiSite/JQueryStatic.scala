package typings.semanticUiSite

import typings.semanticUiSite.SemanticUI.Site
import typings.semanticUiSite.SemanticUI.Site.NamespaceStubSettings
import typings.semanticUiSite.SemanticUI.SiteSettings
import typings.semanticUiSite.semanticUiSiteStrings.debug
import typings.semanticUiSite.semanticUiSiteStrings.destroy
import typings.semanticUiSite.semanticUiSiteStrings.modules
import typings.semanticUiSite.semanticUiSiteStrings.name
import typings.semanticUiSite.semanticUiSiteStrings.namespace
import typings.semanticUiSite.semanticUiSiteStrings.namespaceStub
import typings.semanticUiSite.semanticUiSiteStrings.performance
import typings.semanticUiSite.semanticUiSiteStrings.setting
import typings.semanticUiSite.semanticUiSiteStrings.silent
import typings.semanticUiSite.semanticUiSiteStrings.siteNamespace
import typings.semanticUiSite.semanticUiSiteStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  def site(): JQuery
  def site(behavior: setting, name: debug, value: Boolean): JQuery
  def site(behavior: setting, name: debug, value: Unit): Boolean
  def site(behavior: setting, name: modules, value: js.Array[String]): JQuery
  def site(behavior: setting, name: modules, value: Unit): js.Array[String]
  def site(behavior: setting, name: namespaceStub, value: Unit): NamespaceStubSettings
  def site(behavior: setting, name: namespaceStub, value: NamespaceStubSettings): JQuery
  def site(behavior: setting, name: namespace, value: String): JQuery
  def site(behavior: setting, name: namespace, value: Unit): String
  def site(behavior: setting, name: name, value: String): JQuery
  def site(behavior: setting, name: name, value: Unit): String
  def site(behavior: setting, name: performance, value: Boolean): JQuery
  def site(behavior: setting, name: performance, value: Unit): Boolean
  def site(behavior: setting, name: silent, value: Boolean): JQuery
  def site(behavior: setting, name: silent, value: Unit): Boolean
  def site(behavior: setting, name: siteNamespace, value: String): JQuery
  def site(behavior: setting, name: siteNamespace, value: Unit): String
  def site(behavior: setting, name: verbose, value: Boolean): JQuery
  def site(behavior: setting, name: verbose, value: Unit): Boolean
  def site(settings: SiteSettings): JQuery
  @JSName("site")
  var site_Original: Site
  @JSName("site")
  def site_destroy(behavior: destroy): JQuery
  @JSName("site")
  def site_setting(behavior: setting, value: SiteSettings): JQuery
}
object JQueryStatic {
  
  inline def apply(site: Site): JQueryStatic = {
    val __obj = js.Dynamic.literal(site = site.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setSite(value: Site): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
  }
}
