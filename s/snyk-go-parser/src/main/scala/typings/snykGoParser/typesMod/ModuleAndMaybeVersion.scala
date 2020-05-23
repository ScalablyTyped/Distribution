package typings.snykGoParser.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleAndMaybeVersion extends js.Object {
  var moduleName: String
  var version: js.UndefOr[ModuleVersion] = js.undefined
}

object ModuleAndMaybeVersion {
  @scala.inline
  def apply(moduleName: String, version: ModuleVersion = null): ModuleAndMaybeVersion = {
    val __obj = js.Dynamic.literal(moduleName = moduleName.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleAndMaybeVersion]
  }
}

