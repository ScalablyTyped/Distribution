package typings.semanticRelease.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LastRelease extends js.Object {
  /**
    * The Git checksum of the last commit of the release.
    */
  var gitHead: String = js.native
  /**
    * The Git tag of the release.
    */
  var gitTag: String = js.native
  /**
    * The version name of the release.
    */
  var version: String = js.native
}

object LastRelease {
  @scala.inline
  def apply(gitHead: String, gitTag: String, version: String): LastRelease = {
    val __obj = js.Dynamic.literal(gitHead = gitHead.asInstanceOf[js.Any], gitTag = gitTag.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastRelease]
  }
  @scala.inline
  implicit class LastReleaseOps[Self <: LastRelease] (val x: Self) extends AnyVal {
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
    def setGitHead(value: String): Self = this.set("gitHead", value.asInstanceOf[js.Any])
    @scala.inline
    def setGitTag(value: String): Self = this.set("gitTag", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

