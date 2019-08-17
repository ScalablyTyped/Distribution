package typings.semanticDashUiDashSite.SemanticUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SiteSettingsNs {
  import typings.semanticDashUiDashSite.semanticDashUiDashSiteStrings.debug
  import typings.semanticDashUiDashSite.semanticDashUiDashSiteStrings.modules
  import typings.semanticDashUiDashSite.semanticDashUiDashSiteStrings.name
  import typings.semanticDashUiDashSite.semanticDashUiDashSiteStrings.namespace
  import typings.semanticDashUiDashSite.semanticDashUiDashSiteStrings.namespaceStub
  import typings.semanticDashUiDashSite.semanticDashUiDashSiteStrings.performance
  import typings.semanticDashUiDashSite.semanticDashUiDashSiteStrings.silent
  import typings.semanticDashUiDashSite.semanticDashUiDashSiteStrings.siteNamespace
  import typings.semanticDashUiDashSite.semanticDashUiDashSiteStrings.verbose
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[
    _Impl, 
    modules | siteNamespace | namespaceStub | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      modules | siteNamespace | namespaceStub | namespace | name | silent | debug | performance | verbose
    ]
  ])
}
