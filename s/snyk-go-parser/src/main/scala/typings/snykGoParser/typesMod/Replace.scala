package typings.snykGoParser.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Replace extends js.Object {
  var newMod: ModuleAndMaybeVersion
  var oldMod: ModuleAndMaybeVersion
}

object Replace {
  @scala.inline
  def apply(newMod: ModuleAndMaybeVersion, oldMod: ModuleAndMaybeVersion): Replace = {
    val __obj = js.Dynamic.literal(newMod = newMod.asInstanceOf[js.Any], oldMod = oldMod.asInstanceOf[js.Any])
    __obj.asInstanceOf[Replace]
  }
}

