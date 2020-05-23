package typings.snykGoParser.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Require extends ModuleAndVersion {
  var indirect: Boolean
}

object Require {
  @scala.inline
  def apply(indirect: Boolean, moduleName: String, version: ModuleVersion): Require = {
    val __obj = js.Dynamic.literal(indirect = indirect.asInstanceOf[js.Any], moduleName = moduleName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Require]
  }
}

