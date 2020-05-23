package typings.stremioAddonSdk.mod

import typings.stremioAddonSdk.anon.Genre
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Args extends js.Object {
  var extra: Genre
  var id: String
  var `type`: ContentType
}

object Args {
  @scala.inline
  def apply(extra: Genre, id: String, `type`: ContentType): Args = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
}

