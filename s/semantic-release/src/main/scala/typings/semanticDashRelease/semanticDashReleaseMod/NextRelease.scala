package typings.semanticDashRelease.semanticDashReleaseMod

import typings.semanticDashRelease.semanticDashReleaseStrings.major
import typings.semanticDashRelease.semanticDashReleaseStrings.minor
import typings.semanticDashRelease.semanticDashReleaseStrings.patch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextRelease extends LastRelease {
  /**
  		 * The release notes of the next release.
  		 */
  var notes: String
  /**
  		 * The semver type of the release.
  		 */
  var `type`: patch | minor | major
}

object NextRelease {
  @scala.inline
  def apply(gitHead: String, gitTag: String, notes: String, `type`: patch | minor | major, version: String): NextRelease = {
    val __obj = js.Dynamic.literal(gitHead = gitHead.asInstanceOf[js.Any], gitTag = gitTag.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextRelease]
  }
}

