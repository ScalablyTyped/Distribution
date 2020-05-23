package typings.snykGoParser.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoProjectConfig extends js.Object {
  var ignoredPkgs: js.UndefOr[js.Array[String]] = js.undefined
  var lockedVersions: LockedDeps
  var packageName: js.UndefOr[String] = js.undefined
}

object GoProjectConfig {
  @scala.inline
  def apply(lockedVersions: LockedDeps, ignoredPkgs: js.Array[String] = null, packageName: String = null): GoProjectConfig = {
    val __obj = js.Dynamic.literal(lockedVersions = lockedVersions.asInstanceOf[js.Any])
    if (ignoredPkgs != null) __obj.updateDynamic("ignoredPkgs")(ignoredPkgs.asInstanceOf[js.Any])
    if (packageName != null) __obj.updateDynamic("packageName")(packageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoProjectConfig]
  }
}

