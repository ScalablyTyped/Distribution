package typings.semanticRelease.mod

import typings.semanticRelease.semanticReleaseStrings.major
import typings.semanticRelease.semanticReleaseStrings.minor
import typings.semanticRelease.semanticReleaseStrings.patch
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

