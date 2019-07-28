package typings.semanticDashUiDashSite.SemanticUINs

import typings.semanticDashUiDashSite.JQuery
import typings.semanticDashUiDashSite.semanticDashUiDashSiteStrings.destroy
import typings.semanticDashUiDashSite.semanticDashUiDashSiteStrings.setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Site extends js.Object {
  var settings: SiteSettings = js.native
  def apply(): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  def apply(behavior: setting, value: SiteSettings): JQuery = js.native
  def apply(settings: SiteSettings): JQuery = js.native
  def apply[K /* <: String */](behavior: setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-site.SemanticUI.SiteSettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-site.SemanticUI.SiteSettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

