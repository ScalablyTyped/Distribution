package typings.semanticUiSite.SemanticUI.SiteSettings

import typings.semanticUiSite.SemanticUI.Site.NamespaceStubSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
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

object Impl {
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
  ): Impl = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], namespaceStub = namespaceStub.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], siteNamespace = siteNamespace.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
}

