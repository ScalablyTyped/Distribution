package typings.semanticRelease.mod

import typings.semanticRelease.semanticReleaseStrings.major
import typings.semanticRelease.semanticReleaseStrings.minor
import typings.semanticRelease.semanticReleaseStrings.patch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NextRelease extends LastRelease {
  /**
    * The release notes of the next release.
    */
  var notes: String = js.native
  /**
    * The semver type of the release.
    */
  var `type`: patch | minor | major = js.native
}

object NextRelease {
  @scala.inline
  def apply(gitHead: String, gitTag: String, notes: String, `type`: patch | minor | major, version: String): NextRelease = {
    val __obj = js.Dynamic.literal(gitHead = gitHead.asInstanceOf[js.Any], gitTag = gitTag.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextRelease]
  }
  @scala.inline
  implicit class NextReleaseOps[Self <: NextRelease] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: patch | minor | major): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

