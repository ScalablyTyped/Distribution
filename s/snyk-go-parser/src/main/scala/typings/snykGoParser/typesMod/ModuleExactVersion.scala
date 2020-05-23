package typings.snykGoParser.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleExactVersion extends ModuleVersion {
  var exactVersion: String
  var incompatible: Boolean
}

object ModuleExactVersion {
  @scala.inline
  def apply(exactVersion: String, incompatible: Boolean): ModuleExactVersion = {
    val __obj = js.Dynamic.literal(exactVersion = exactVersion.asInstanceOf[js.Any], incompatible = incompatible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleExactVersion]
  }
}

