package typings.semverUtils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SemVer extends js.Object {
  var build: js.UndefOr[String] = js.undefined
  var major: js.UndefOr[String] = js.undefined
  var minor: js.UndefOr[String] = js.undefined
  var operator: js.UndefOr[String] = js.undefined
  var patch: js.UndefOr[String] = js.undefined
  var release: js.UndefOr[String] = js.undefined
  var semver: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object SemVer {
  @scala.inline
  def apply(
    build: String = null,
    major: String = null,
    minor: String = null,
    operator: String = null,
    patch: String = null,
    release: String = null,
    semver: String = null,
    version: String = null
  ): SemVer = {
    val __obj = js.Dynamic.literal()
    if (build != null) __obj.updateDynamic("build")(build.asInstanceOf[js.Any])
    if (major != null) __obj.updateDynamic("major")(major.asInstanceOf[js.Any])
    if (minor != null) __obj.updateDynamic("minor")(minor.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (patch != null) __obj.updateDynamic("patch")(patch.asInstanceOf[js.Any])
    if (release != null) __obj.updateDynamic("release")(release.asInstanceOf[js.Any])
    if (semver != null) __obj.updateDynamic("semver")(semver.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemVer]
  }
}

