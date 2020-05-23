package typings.snykGoParser.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleAndVersion extends js.Object {
  var moduleName: String
  var version: ModuleVersion
}

object ModuleAndVersion {
  @scala.inline
  def apply(moduleName: String, version: ModuleVersion): ModuleAndVersion = {
    val __obj = js.Dynamic.literal(moduleName = moduleName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleAndVersion]
  }
}

