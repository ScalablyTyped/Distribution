package typings.snykGoParser.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoMod extends js.Object {
  var excludes: js.Array[ModuleAndVersion]
  var golangVersion: js.UndefOr[String] = js.undefined
  var moduleName: String
  var replaces: js.Array[Replace]
  var requires: js.Array[Require]
}

object GoMod {
  @scala.inline
  def apply(
    excludes: js.Array[ModuleAndVersion],
    moduleName: String,
    replaces: js.Array[Replace],
    requires: js.Array[Require],
    golangVersion: String = null
  ): GoMod = {
    val __obj = js.Dynamic.literal(excludes = excludes.asInstanceOf[js.Any], moduleName = moduleName.asInstanceOf[js.Any], replaces = replaces.asInstanceOf[js.Any], requires = requires.asInstanceOf[js.Any])
    if (golangVersion != null) __obj.updateDynamic("golangVersion")(golangVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoMod]
  }
}

