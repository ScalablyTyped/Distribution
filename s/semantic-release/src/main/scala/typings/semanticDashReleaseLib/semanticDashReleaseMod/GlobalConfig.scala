package typings
package semanticDashReleaseLib.semanticDashReleaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalConfig extends js.Object {
  /** The branch on which releases should happen. */
  var branch: java.lang.String
  /** The full prepare step configuration. */
  var prepare: js.UndefOr[js.Any] = js.undefined
  /** The Git repository URL, in any supported format. */
  var repositoryUrl: java.lang.String
  /** The Git tag format used by semantic-release to identify releases. */
  var tagFormat: java.lang.String
}

