package typings.snykGoParser.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModulePseudoVersion extends ModuleVersion {
  var baseVersion: String
  var hash: String
  var suffix: String
  var timestamp: String
}

object ModulePseudoVersion {
  @scala.inline
  def apply(baseVersion: String, hash: String, suffix: String, timestamp: String): ModulePseudoVersion = {
    val __obj = js.Dynamic.literal(baseVersion = baseVersion.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModulePseudoVersion]
  }
}

