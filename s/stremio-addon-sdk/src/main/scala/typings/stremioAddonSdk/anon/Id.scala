package typings.stremioAddonSdk.anon

import typings.stremioAddonSdk.mod.ContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var id: String
  var `type`: ContentType
}

object Id {
  @scala.inline
  def apply(id: String, `type`: ContentType): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

