package typings.semanticDashRelease.semanticDashReleaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalConfig extends js.Object {
  /** The branch on which releases should happen. */
  var branch: String
  /** The full prepare step configuration. */
  var prepare: js.UndefOr[js.Any] = js.undefined
  /** The Git repository URL, in any supported format. */
  var repositoryUrl: String
  /** The Git tag format used by semantic-release to identify releases. */
  var tagFormat: String
}

object GlobalConfig {
  @scala.inline
  def apply(branch: String, repositoryUrl: String, tagFormat: String, prepare: js.Any = null): GlobalConfig = {
    val __obj = js.Dynamic.literal(branch = branch, repositoryUrl = repositoryUrl, tagFormat = tagFormat)
    if (prepare != null) __obj.updateDynamic("prepare")(prepare)
    __obj.asInstanceOf[GlobalConfig]
  }
}

