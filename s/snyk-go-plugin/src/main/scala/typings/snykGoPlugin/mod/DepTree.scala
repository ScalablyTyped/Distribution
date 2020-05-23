package typings.snykGoPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DepTree extends js.Object {
  var _counts: js.UndefOr[js.Any] = js.undefined
  var _isProjSubpkg: js.UndefOr[Boolean] = js.undefined
  var dependencies: js.UndefOr[DepDict] = js.undefined
  var name: String
  var packageFormatVersion: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object DepTree {
  @scala.inline
  def apply(
    name: String,
    _counts: js.Any = null,
    _isProjSubpkg: js.UndefOr[Boolean] = js.undefined,
    dependencies: DepDict = null,
    packageFormatVersion: String = null,
    version: String = null
  ): DepTree = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (_counts != null) __obj.updateDynamic("_counts")(_counts.asInstanceOf[js.Any])
    if (!js.isUndefined(_isProjSubpkg)) __obj.updateDynamic("_isProjSubpkg")(_isProjSubpkg.get.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (packageFormatVersion != null) __obj.updateDynamic("packageFormatVersion")(packageFormatVersion.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepTree]
  }
}

