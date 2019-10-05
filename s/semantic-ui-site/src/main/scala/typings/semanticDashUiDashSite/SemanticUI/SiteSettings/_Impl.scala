package typings.semanticDashUiDashSite.SemanticUI.SiteSettings

import typings.semanticDashUiDashSite.SemanticUI.Site.NamespaceStubSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * Debug output to console
    */
  var debug: Boolean
  var modules: js.Array[String]
  // endregion
  // region Debug Settings
  /**
    * Name used in log statements
    */
  var name: String
  // region Component Settings
  // region DOM Settings
  /**
    * Event namespace. Makes sure module teardown does not effect other events attached to an element.
    */
  var namespace: String
  var namespaceStub: NamespaceStubSettings
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean
  var siteNamespace: String
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean
}

object _Impl {
  @scala.inline
  def apply(
    debug: Boolean,
    modules: js.Array[String],
    name: String,
    namespace: String,
    namespaceStub: NamespaceStubSettings,
    performance: Boolean,
    silent: Boolean,
    siteNamespace: String,
    verbose: Boolean
  ): _Impl = {
    val __obj = js.Dynamic.literal(debug = debug, modules = modules, name = name, namespace = namespace, namespaceStub = namespaceStub, performance = performance, silent = silent, siteNamespace = siteNamespace, verbose = verbose)
  
    __obj.asInstanceOf[_Impl]
  }
}

