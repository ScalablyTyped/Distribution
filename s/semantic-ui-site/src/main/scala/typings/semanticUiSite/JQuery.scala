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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def site(): JQuery = js.native
  def site(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def site(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def site(behavior: setting, name: modules, value: js.UndefOr[scala.Nothing]): js.Array[String] = js.native
  def site(behavior: setting, name: modules, value: js.Array[String]): JQuery = js.native
  def site(behavior: setting, name: namespaceStub, value: NamespaceStubSettings): JQuery = js.native
  def site(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def site(behavior: setting, name: namespace, value: String): JQuery = js.native
  def site(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def site(behavior: setting, name: name, value: String): JQuery = js.native
  def site(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def site(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def site(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def site(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def site(behavior: setting, name: siteNamespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def site(behavior: setting, name: siteNamespace, value: String): JQuery = js.native
  def site(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def site(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def site(settings: SiteSettings): JQuery = js.native
  @JSName("site")
  def site_NamespaceStubSettings(behavior: setting, name: namespaceStub, value: js.UndefOr[scala.Nothing]): NamespaceStubSettings = js.native
  @JSName("site")
  var site_Original: Site = js.native
  @JSName("site")
  def site_destroy(behavior: destroy): JQuery = js.native
  @JSName("site")
  def site_setting(behavior: setting, value: SiteSettings): JQuery = js.native
}
