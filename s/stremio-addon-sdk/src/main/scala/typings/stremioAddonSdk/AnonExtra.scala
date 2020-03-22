package typings.stremioAddonSdk

import typings.stremioAddonSdk.mod.ContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtra extends js.Object {
  var extra: AnonVideoHash
  var id: String
  var `type`: ContentType
}

object AnonExtra {
  @scala.inline
  def apply(extra: AnonVideoHash, id: String, `type`: ContentType): AnonExtra = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtra]
  }
}

