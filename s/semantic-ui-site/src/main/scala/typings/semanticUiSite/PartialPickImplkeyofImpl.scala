package typings.semanticUiSite

import typings.semanticUiSite.SemanticUI.Site.NamespaceStubSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-site.SemanticUI.SiteSettings._Impl, keyof semantic-ui-site.SemanticUI.SiteSettings._Impl>> */
trait PartialPickImplkeyofImpl extends js.Object {
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
  def apply(
    debug: js.UndefOr[Boolean] = js.undefined,
    modules: js.Array[String] = null,
    name: String = null,
    namespace: String = null,
    namespaceStub: NamespaceStubSettings = null,
    performance: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    siteNamespace: String = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (namespaceStub != null) __obj.updateDynamic("namespaceStub")(namespaceStub.asInstanceOf[js.Any])
    if (!js.isUndefined(performance)) __obj.updateDynamic("performance")(performance.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (siteNamespace != null) __obj.updateDynamic("siteNamespace")(siteNamespace.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
}

