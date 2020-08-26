package typings.semverUtils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SemVer extends js.Object {
  var build: js.UndefOr[String] = js.native
  var major: js.UndefOr[String] = js.native
  var minor: js.UndefOr[String] = js.native
  var operator: js.UndefOr[String] = js.native
  var patch: js.UndefOr[String] = js.native
  var release: js.UndefOr[String] = js.native
  var semver: js.UndefOr[String] = js.native
  var version: js.UndefOr[String] = js.native
}

object SemVer {
  @scala.inline
  def apply(): SemVer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemVer]
  }
  @scala.inline
  implicit class SemVerOps[Self <: SemVer] (val x: Self) extends AnyVal {
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
    def setBuild(value: String): Self = this.set("build", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuild: Self = this.set("build", js.undefined)
    @scala.inline
    def setMajor(value: String): Self = this.set("major", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMajor: Self = this.set("major", js.undefined)
    @scala.inline
    def setMinor(value: String): Self = this.set("minor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinor: Self = this.set("minor", js.undefined)
    @scala.inline
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    @scala.inline
    def setPatch(value: String): Self = this.set("patch", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatch: Self = this.set("patch", js.undefined)
    @scala.inline
    def setRelease(value: String): Self = this.set("release", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelease: Self = this.set("release", js.undefined)
    @scala.inline
    def setSemver(value: String): Self = this.set("semver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSemver: Self = this.set("semver", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

