package typings
package semanticDashUiDashSiteLib.SemanticUINs.SiteSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait _Impl extends js.Object {
  /**
               * Debug output to console
               */
  var debug: scala.Boolean
  var modules: js.Array[java.lang.String]
  // endregion
  // region Debug Settings
  /**
               * Name used in log statements
               */
  var name: java.lang.String
  // region Component Settings
  // region DOM Settings
  /**
               * Event namespace. Makes sure module teardown does not effect other events attached to an element.
               */
  var namespace: java.lang.String
  var namespaceStub: semanticDashUiDashSiteLib.SemanticUINs.SiteNs.NamespaceStubSettings
  /**
               * Show console.table output with performance metrics
               */
  var performance: scala.Boolean
  /**
               * Silences all console output including error messages, regardless of other debug settings.
               */
  var silent: scala.Boolean
  var siteNamespace: java.lang.String
  /**
               * Debug output includes all internal behaviors
               */
  var verbose: scala.Boolean
}

