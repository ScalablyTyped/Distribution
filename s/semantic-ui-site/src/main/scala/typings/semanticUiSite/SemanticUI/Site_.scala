package typings.semanticUiSite.SemanticUI

import typings.semanticUiSite.JQuery
import typings.semanticUiSite.SemanticUI.Site.NamespaceStubSettings
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Site_ extends js.Object {
  var settings: SiteSettings = js.native
  def apply(): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  def apply(behavior: setting, name: debug): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: modules): js.Array[String] = js.native
  def apply(behavior: setting, name: modules, value: js.Array[String]): JQuery = js.native
  def apply(behavior: setting, name: name): String = js.native
  def apply(behavior: setting, name: namespace): String = js.native
  def apply(behavior: setting, name: namespaceStub): NamespaceStubSettings = js.native
  def apply(behavior: setting, name: namespaceStub, value: NamespaceStubSettings): JQuery = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: performance): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: silent): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: siteNamespace): String = js.native
  def apply(behavior: setting, name: siteNamespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: verbose): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, value: SiteSettings): JQuery = js.native
  def apply(settings: SiteSettings): JQuery = js.native
}

