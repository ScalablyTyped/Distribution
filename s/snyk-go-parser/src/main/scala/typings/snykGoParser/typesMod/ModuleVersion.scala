package typings.snykGoParser.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.snykGoParser.typesMod.ModuleExactVersion
  - typings.snykGoParser.typesMod.ModulePseudoVersion
*/
trait ModuleVersion extends js.Object

object ModuleVersion {
  @scala.inline
  def ModuleExactVersion(exactVersion: String, incompatible: Boolean): ModuleVersion = {
    val __obj = js.Dynamic.literal(exactVersion = exactVersion.asInstanceOf[js.Any], incompatible = incompatible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleVersion]
  }
  @scala.inline
  def ModulePseudoVersion(baseVersion: String, hash: String, suffix: String, timestamp: String): ModuleVersion = {
    val __obj = js.Dynamic.literal(baseVersion = baseVersion.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleVersion]
  }
}

