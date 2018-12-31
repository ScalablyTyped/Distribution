package typings
package semanticDashUiDashSiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("site")
  var site_Original: semanticDashUiDashSiteLib.SemanticUINs.Site = js.native
  def site(): JQuery = js.native
  def site(settings: semanticDashUiDashSiteLib.SemanticUINs.SiteSettings): JQuery = js.native
  @JSName("site")
  def site_destroy(behavior: semanticDashUiDashSiteLib.semanticDashUiDashSiteLibStrings.destroy): JQuery = js.native
  @JSName("site")
  def site_setting(
    behavior: semanticDashUiDashSiteLib.semanticDashUiDashSiteLibStrings.setting,
    value: semanticDashUiDashSiteLib.SemanticUINs.SiteSettings
  ): JQuery = js.native
  @JSName("site")
  def site_setting[K /* <: java.lang.String */](behavior: semanticDashUiDashSiteLib.semanticDashUiDashSiteLibStrings.setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-site.SemanticUI.SiteSettings._Impl[K] */ js.Any = js.native
  @JSName("site")
  def site_setting[K /* <: java.lang.String */](
    behavior: semanticDashUiDashSiteLib.semanticDashUiDashSiteLibStrings.setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-site.SemanticUI.SiteSettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

